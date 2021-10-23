package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
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
    private Collection<CartItem> cartItemsById;
    private Collection<CategoryProduct> categoryProductsById;
    private Collection<OrderItem> orderItemsById;
    private Shop shopByShopId;
    private Collection<Review> reviewsById;
    private Collection<TagProduct> tagProductsById;

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
        Product product = (Product) o;
        return id == product.id && shopId == product.shopId && quality == product.quality && Double.compare(product.price, price) == 0 && Double.compare(product.discount, discount) == 0 && Objects.equals(status, product.status) && Objects.equals(title, product.title) && Objects.equals(metalTitle, product.metalTitle) && Objects.equals(startAt, product.startAt) && Objects.equals(endsAt, product.endsAt) && Objects.equals(decription, product.decription) && Objects.equals(content, product.content) && Objects.equals(updatedAt, product.updatedAt) && Objects.equals(createdAt, product.createdAt) && Objects.equals(publishedAt, product.publishedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, shopId, title, metalTitle, quality, price, discount, startAt, endsAt, decription, content, updatedAt, createdAt, publishedAt);
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<CartItem> getCartItemsById() {
        return cartItemsById;
    }

    public void setCartItemsById(Collection<CartItem> cartItemsById) {
        this.cartItemsById = cartItemsById;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<CategoryProduct> getCategoryProductsById() {
        return categoryProductsById;
    }

    public void setCategoryProductsById(Collection<CategoryProduct> categoryProductsById) {
        this.categoryProductsById = categoryProductsById;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<OrderItem> getOrderItemsById() {
        return orderItemsById;
    }

    public void setOrderItemsById(Collection<OrderItem> orderItemsById) {
        this.orderItemsById = orderItemsById;
    }

    @ManyToOne
    @JoinColumn(name = "shopId", referencedColumnName = "id", nullable = false)
    public Shop getShopByShopId() {
        return shopByShopId;
    }

    public void setShopByShopId(Shop shopByShopId) {
        this.shopByShopId = shopByShopId;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<Review> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<Review> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<TagProduct> getTagProductsById() {
        return tagProductsById;
    }

    public void setTagProductsById(Collection<TagProduct> tagProductsById) {
        this.tagProductsById = tagProductsById;
    }
}
