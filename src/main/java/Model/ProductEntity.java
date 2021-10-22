package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "dhs")
public class ProductEntity {
    private long id;
    private Short status;
    private long shopId;
    private String title;
    private String metalTitle;
    private short quality;
    private double price;
    private double discount;
    private Timestamp startAt;
    private Timestamp endsAt;
    private Object decription;
    private String content;
    private Timestamp updatedAt;
    private Timestamp createdAt;
    private Timestamp publishedAt;
    private Collection<CartItemEntity> cartItemsById;
    private Collection<CategoryProductEntity> categoryProductsById;
    private Collection<OrderItemEntity> orderItemsById;
    private ShopEntity shopByShopId;
    private Collection<ReviewEntity> reviewsById;
    private Collection<TagProductEntity> tagProductsById;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "shopId")
    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "metalTitle")
    public String getMetalTitle() {
        return metalTitle;
    }

    public void setMetalTitle(String metalTitle) {
        this.metalTitle = metalTitle;
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
    @Column(name = "startAt")
    public Timestamp getStartAt() {
        return startAt;
    }

    public void setStartAt(Timestamp startAt) {
        this.startAt = startAt;
    }

    @Basic
    @Column(name = "endsAt")
    public Timestamp getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Timestamp endsAt) {
        this.endsAt = endsAt;
    }

    @Basic
    @Column(name = "decription")
    public Object getDecription() {
        return decription;
    }

    public void setDecription(Object decription) {
        this.decription = decription;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "createdAt")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "publishedAt")
    public Timestamp getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id == that.id && shopId == that.shopId && quality == that.quality && Double.compare(that.price, price) == 0 && Double.compare(that.discount, discount) == 0 && Objects.equals(status, that.status) && Objects.equals(title, that.title) && Objects.equals(metalTitle, that.metalTitle) && Objects.equals(startAt, that.startAt) && Objects.equals(endsAt, that.endsAt) && Objects.equals(decription, that.decription) && Objects.equals(content, that.content) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(createdAt, that.createdAt) && Objects.equals(publishedAt, that.publishedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, shopId, title, metalTitle, quality, price, discount, startAt, endsAt, decription, content, updatedAt, createdAt, publishedAt);
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<CartItemEntity> getCartItemsById() {
        return cartItemsById;
    }

    public void setCartItemsById(Collection<CartItemEntity> cartItemsById) {
        this.cartItemsById = cartItemsById;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<CategoryProductEntity> getCategoryProductsById() {
        return categoryProductsById;
    }

    public void setCategoryProductsById(Collection<CategoryProductEntity> categoryProductsById) {
        this.categoryProductsById = categoryProductsById;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<OrderItemEntity> getOrderItemsById() {
        return orderItemsById;
    }

    public void setOrderItemsById(Collection<OrderItemEntity> orderItemsById) {
        this.orderItemsById = orderItemsById;
    }

    @ManyToOne
    @JoinColumn(name = "shopId", referencedColumnName = "id", nullable = false)
    public ShopEntity getShopByShopId() {
        return shopByShopId;
    }

    public void setShopByShopId(ShopEntity shopByShopId) {
        this.shopByShopId = shopByShopId;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<ReviewEntity> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<ReviewEntity> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<TagProductEntity> getTagProductsById() {
        return tagProductsById;
    }

    public void setTagProductsById(Collection<TagProductEntity> tagProductsById) {
        this.tagProductsById = tagProductsById;
    }
}
