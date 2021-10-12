package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tag_product", schema = "dhs")
public class TagProductEntity {
    private Long productId;
    private Long tagId;
    private ProductEntity productByProductId;
    private TagEntity tagByTagId;

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
        TagProductEntity that = (TagProductEntity) o;
        return Objects.equals(productId, that.productId) && Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, tagId);
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
    @JoinColumn(name = "tagId", referencedColumnName = "id")
    public TagEntity getTagByTagId() {
        return tagByTagId;
    }

    public void setTagByTagId(TagEntity tagByTagId) {
        this.tagByTagId = tagByTagId;
    }
}
