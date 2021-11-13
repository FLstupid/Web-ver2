package Model;

import javax.persistence.*;

@Entity
@Table(name = "tag_product", schema = "dhs", catalog = "")
public class TagProduct {
    private long id;

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product productByProductId;
    @ManyToOne
    @JoinColumn(name = "tagId", referencedColumnName = "id")
    private Tag tagByTagId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagProduct that = (TagProduct) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }

    public Tag getTagByTagId() {
        return tagByTagId;
    }

    public void setTagByTagId(Tag tagByTagId) {
        this.tagByTagId = tagByTagId;
    }
}
