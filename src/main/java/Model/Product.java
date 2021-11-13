package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Short status;
    private String title;
    private short quality;
    private double price;
    private double discount;
    private Timestamp startAt;
    private Timestamp endsAt;
    private String decription;
    private String content;
    private Timestamp updatedAt;
    private Timestamp createdAt;
    private Timestamp publishedAt;

    @OneToMany(mappedBy = "productByProductId")
    private Collection<CartItem> cartItemsById;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<CategoryProduct> categoryProductsById;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<OrderItem> orderItemsById;
    @ManyToOne
    private Shop shopByShopId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<Review> reviewsById;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<TagProduct> tagProductsById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getQuality() {
        return quality;
    }

    public void setQuality(short quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Timestamp getStartAt() {
        return startAt;
    }

    public void setStartAt(Timestamp startAt) {
        this.startAt = startAt;
    }

    public Timestamp getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Timestamp endsAt) {
        this.endsAt = endsAt;
    }

    public String getDecription() {
        return decription;
    }


    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

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

        if (id != product.id) return false;
        if (quality != product.quality) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (Double.compare(product.discount, discount) != 0) return false;
        if (!Objects.equals(status, product.status)) return false;
        if (!Objects.equals(title, product.title)) return false;
        if (!Objects.equals(startAt, product.startAt)) return false;
        if (!Objects.equals(endsAt, product.endsAt)) return false;
        if (!Objects.equals(decription, product.decription)) return false;
        if (!Objects.equals(content, product.content)) return false;
        if (!Objects.equals(updatedAt, product.updatedAt)) return false;
        if (!Objects.equals(createdAt, product.createdAt)) return false;
        return Objects.equals(publishedAt, product.publishedAt);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (int) quality;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (endsAt != null ? endsAt.hashCode() : 0);
        result = 31 * result + (decription != null ? decription.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (publishedAt != null ? publishedAt.hashCode() : 0);
        return result;
    }

    public Collection<CartItem> getCartItemsById() {
        return cartItemsById;
    }

    public void setCartItemsById(Collection<CartItem> cartItemsById) {
        this.cartItemsById = cartItemsById;
    }

    public Collection<CategoryProduct> getCategoryProductsById() {
        return categoryProductsById;
    }

    public void setCategoryProductsById(Collection<CategoryProduct> categoryProductsById) {
        this.categoryProductsById = categoryProductsById;
    }

    public Collection<OrderItem> getOrderItemsById() {
        return orderItemsById;
    }

    public void setOrderItemsById(Collection<OrderItem> orderItemsById) {
        this.orderItemsById = orderItemsById;
    }

    public Shop getShopByShopId() {
        return shopByShopId;
    }

    public void setShopByShopId(Shop shopByShopId) {
        this.shopByShopId = shopByShopId;
    }

    public Collection<Review> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<Review> reviewsById) {
        this.reviewsById = reviewsById;
    }


    public Collection<TagProduct> getTagProductsById() {
        return tagProductsById;
    }

    public void setTagProductsById(Collection<TagProduct> tagProductsById) {
        this.tagProductsById = tagProductsById;
    }
}
