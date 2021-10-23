package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Tag {
    private long id;
    private String tagName;
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
        return id == tag.id && Objects.equals(tagName, tag.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagName);
    }

    @OneToMany(mappedBy = "tagByTagId")
    public Collection<TagProduct> getTagProductsById() {
        return tagProductsById;
    }

    public void setTagProductsById(Collection<TagProduct> tagProductsById) {
        this.tagProductsById = tagProductsById;
    }
}
