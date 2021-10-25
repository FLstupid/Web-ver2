package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Category {
    private long id;
    private String categoryName;
    private Collection<CategoryProduct> categoryProductsById;

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

        Category category = (Category) o;

        if (id != category.id) return false;
        if (categoryName != null ? !categoryName.equals(category.categoryName) : category.categoryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoryByCategoryId")
    public Collection<CategoryProduct> getCategoryProductsById() {
        return categoryProductsById;
    }

    public void setCategoryProductsById(Collection<CategoryProduct> categoryProductsById) {
        this.categoryProductsById = categoryProductsById;
    }
}
