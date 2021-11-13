package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Tag {
    private long id;
    private String tagName;

    @OneToMany(mappedBy = "tagByTagId")
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
    @Column(name = "tagName")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tag tag = (Tag) o;

        if (id != tag.id) return false;
        return tagName != null ? tagName.equals(tag.tagName) : tag.tagName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        return result;
    }

    public Collection<TagProduct> getTagProductsById() {
        return tagProductsById;
    }

    public void setTagProductsById(Collection<TagProduct> tagProductsById) {
        this.tagProductsById = tagProductsById;
    }
}
