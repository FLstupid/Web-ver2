package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category_product", schema = "dhs")
public class CategoryProductEntity {
    private Long id;
    private Long productId;
    private Long categoryId;
    private ProductEntity productByProductId;
    private CategoryEntity categoryByCategoryId;

    @Basic
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    @Column(name = "categoryId")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryProductEntity that = (CategoryProductEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(productId, that.productId) && Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, categoryId);
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
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    public CategoryEntity getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(CategoryEntity categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }
}
