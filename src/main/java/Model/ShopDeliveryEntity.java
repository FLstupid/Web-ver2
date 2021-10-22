package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "shop_delivery", schema = "dhs")
public class ShopDeliveryEntity {
    private Long id;
    private Long shopId;
    private Long deliveryId;
    private ShopEntity shopByShopId;
    private DeliveryEntity deliveryByDeliveryId;

    @Basic
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "shopId")
    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "deliveryId")
    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopDeliveryEntity that = (ShopDeliveryEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(shopId, that.shopId) && Objects.equals(deliveryId, that.deliveryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shopId, deliveryId);
    }

    @ManyToOne
    @JoinColumn(name = "shopId", referencedColumnName = "id")
    public ShopEntity getShopByShopId() {
        return shopByShopId;
    }

    public void setShopByShopId(ShopEntity shopByShopId) {
        this.shopByShopId = shopByShopId;
    }

    @ManyToOne
    @JoinColumn(name = "deliveryId", referencedColumnName = "id")
    public DeliveryEntity getDeliveryByDeliveryId() {
        return deliveryByDeliveryId;
    }

    public void setDeliveryByDeliveryId(DeliveryEntity deliveryByDeliveryId) {
        this.deliveryByDeliveryId = deliveryByDeliveryId;
    }
}
