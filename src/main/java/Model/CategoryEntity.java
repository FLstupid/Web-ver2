package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "dhs")
public class CategoryEntity {
    private long id;
    private String categoryName;
    private Collection<CategoryProductEntity> categoryProductsById;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return id == that.id && Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName);
    }

    @OneToMany(mappedBy = "categoryByCategoryId")
    public Collection<CategoryProductEntity> getCategoryProductsById() {
        return categoryProductsById;
    }

    public void setCategoryProductsById(Collection<CategoryProductEntity> categoryProductsById) {
        this.categoryProductsById = categoryProductsById;
    }
}
