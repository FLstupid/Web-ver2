package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Delivery {
    private long id;
    private String methodName;
    private Integer price;
    private Collection<ShopDelivery> shopDeliveriesById;

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
        Delivery delivery = (Delivery) o;
        return id == delivery.id && Objects.equals(methodName, delivery.methodName) && Objects.equals(price, delivery.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, methodName, price);
    }

    @OneToMany(mappedBy = "deliveryByDeliveryId")
    public Collection<ShopDelivery> getShopDeliveriesById() {
        return shopDeliveriesById;
    }

    public void setShopDeliveriesById(Collection<ShopDelivery> shopDeliveriesById) {
        this.shopDeliveriesById = shopDeliveriesById;
    }
}
