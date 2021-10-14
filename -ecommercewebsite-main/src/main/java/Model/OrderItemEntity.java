package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order_item", schema = "dhs")
public class OrderItemEntity {
    private long id;
    private Long orderId;
    private Long productId;
    private short quality;
    private double price;
    private double discount;
    private int amount;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String content;
    private OrderDetailEntity orderDetailByOrderId;
    private ProductEntity productByProductId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderId")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
        OrderItemEntity that = (OrderItemEntity) o;
        return id == that.id && quality == that.quality && Double.compare(that.price, price) == 0 && Double.compare(that.discount, discount) == 0 && amount == that.amount && Objects.equals(orderId, that.orderId) && Objects.equals(productId, that.productId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, productId, quality, price, discount, amount, createdAt, updatedAt, content);
    }

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id")
    public OrderDetailEntity getOrderDetailByOrderId() {
        return orderDetailByOrderId;
    }

    public void setOrderDetailByOrderId(OrderDetailEntity orderDetailByOrderId) {
        this.orderDetailByOrderId = orderDetailByOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    public ProductEntity getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(ProductEntity productByProductId) {
        this.productByProductId = productByProductId;
    }
}
