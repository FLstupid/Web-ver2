package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cart_item", schema = "dhs", catalog = "")
public class CartItem {
    private long id;
    private Long cartId;
    private Long productId;
    private short quality;
    private double price;
    private double discount;
    private int amount;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String content;
    private Cart cartByCartId;
    private Product productByProductId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cartId")
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "productId")
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "quality")
    public short getQuality() {
        return quality;
    }

    public void setQuality(short quality) {
        this.quality = quality;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "discount")
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "amount")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "createdAt")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updatedAt")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return id == cartItem.id && quality == cartItem.quality && Double.compare(cartItem.price, price) == 0 && Double.compare(cartItem.discount, discount) == 0 && amount == cartItem.amount && Objects.equals(cartId, cartItem.cartId) && Objects.equals(productId, cartItem.productId) && Objects.equals(createdAt, cartItem.createdAt) && Objects.equals(updatedAt, cartItem.updatedAt) && Objects.equals(content, cartItem.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cartId, productId, quality, price, discount, amount, createdAt, updatedAt, content);
    }

    @ManyToOne
    @JoinColumn(name = "cartId", referencedColumnName = "id")
    public Cart getCartByCartId() {
        return cartByCartId;
    }

    public void setCartByCartId(Cart cartByCartId) {
        this.cartByCartId = cartByCartId;
    }

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }
}
