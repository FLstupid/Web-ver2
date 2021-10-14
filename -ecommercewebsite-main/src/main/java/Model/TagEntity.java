package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tag", schema = "dhs")
public class TagEntity {
    private long id;
    private String tagName;
    private Collection<TagProductEntity> tagProductsById;

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
        TagEntity tagEntity = (TagEntity) o;
        return id == tagEntity.id && Objects.equals(tagName, tagEntity.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagName);
    }

    @OneToMany(mappedBy = "tagByTagId")
    public Collection<TagProductEntity> getTagProductsById() {
        return tagProductsById;
    }

    public void setTagProductsById(Collection<TagProductEntity> tagProductsById) {
        this.tagProductsById = tagProductsById;
    }
}
