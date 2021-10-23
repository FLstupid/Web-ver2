package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tag_product", schema = "dhs", catalog = "")
public class TagProduct {
    private long id;
    private Long productId;
    private Long tagId;
    private Product productByProductId;
    private Tag tagByTagId;

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
    @Column(name = "tagId")
    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagProduct that = (TagProduct) o;
        return id == that.id && Objects.equals(productId, that.productId) && Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, tagId);
    }

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }

    @ManyToOne
    @JoinColumn(name = "tagId", referencedColumnName = "id")
    public Tag getTagByTagId() {
        return tagByTagId;
    }

    public void setTagByTagId(Tag tagByTagId) {
        this.tagByTagId = tagByTagId;
    }
}
