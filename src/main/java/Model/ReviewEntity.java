package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "review", schema = "dhs")
public class ReviewEntity {
    private long id;
    private Long productId;
    private Long userId;
    private String title;
    private short rating;
    private Timestamp publishedAt;
    private Timestamp createdAt;
    private String content;
    private ProductEntity productByProductId;
    private AccountEntity accountByUserId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "userId")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
    @Column(name = "rating")
    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "publishedAt")
    public Timestamp getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
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
        ReviewEntity that = (ReviewEntity) o;
        return id == that.id && rating == that.rating && Objects.equals(productId, that.productId) && Objects.equals(userId, that.userId) && Objects.equals(title, that.title) && Objects.equals(publishedAt, that.publishedAt) && Objects.equals(createdAt, that.createdAt) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, userId, title, rating, publishedAt, createdAt, content);
    }

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    public ProductEntity getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(ProductEntity productByProductId) {
        this.productByProductId = productByProductId;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    public AccountEntity getAccountByUserId() {
        return accountByUserId;
    }

    public void setAccountByUserId(AccountEntity accountByUserId) {
        this.accountByUserId = accountByUserId;
    }
}
