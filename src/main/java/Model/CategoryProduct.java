package Model;

import javax.persistence.*;

@Entity
@Table(name = "category_product", schema = "dhs", catalog = "")
public class CategoryProduct {
    private long id;

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product productByProductId;

    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    private Category categoryByCategoryId;

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

        CategoryProduct that = (CategoryProduct) o;

        return  id != that.id;
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

    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }
}
