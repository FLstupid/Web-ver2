package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "delivery", schema = "dhs")
public class DeliveryEntity {
    private long id;
    private String methodName;
    private Integer price;
    private Collection<ShopDeliveryEntity> shopDeliveriesById;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "methodName")
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryEntity that = (DeliveryEntity) o;
        return id == that.id && Objects.equals(methodName, that.methodName) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, methodName, price);
    }

    @OneToMany(mappedBy = "deliveryByDeliveryId")
    public Collection<ShopDeliveryEntity> getShopDeliveriesById() {
        return shopDeliveriesById;
    }

    public void setShopDeliveriesById(Collection<ShopDeliveryEntity> shopDeliveriesById) {
        this.shopDeliveriesById = shopDeliveriesById;
    }
}
