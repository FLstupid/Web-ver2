package Model;

import javax.persistence.*;
import java.sql.Timestamp;

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

        if (id != cartItem.id) return false;
        if (quality != cartItem.quality) return false;
        if (Double.compare(cartItem.price, price) != 0) return false;
        if (Double.compare(cartItem.discount, discount) != 0) return false;
        if (amount != cartItem.amount) return false;
        if (cartId != null ? !cartId.equals(cartItem.cartId) : cartItem.cartId != null) return false;
        if (productId != null ? !productId.equals(cartItem.productId) : cartItem.productId != null) return false;
        if (createdAt != null ? !createdAt.equals(cartItem.createdAt) : cartItem.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(cartItem.updatedAt) : cartItem.updatedAt != null) return false;
        if (content != null ? !content.equals(cartItem.content) : cartItem.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (cartId != null ? cartId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (int) quality;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + amount;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
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
