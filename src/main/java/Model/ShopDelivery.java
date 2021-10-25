package Model;

import javax.persistence.*;

@Entity
@Table(name = "shop_delivery", schema = "dhs", catalog = "")
public class ShopDelivery {
    private long id;
    private Long shopId;
    private Long deliveryId;
    private Shop shopByShopId;
    private Delivery deliveryByDeliveryId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

        ShopDelivery that = (ShopDelivery) o;

        if (id != that.id) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (deliveryId != null ? !deliveryId.equals(that.deliveryId) : that.deliveryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (deliveryId != null ? deliveryId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "shopId", referencedColumnName = "id")
    public Shop getShopByShopId() {
        return shopByShopId;
    }

    public void setShopByShopId(Shop shopByShopId) {
        this.shopByShopId = shopByShopId;
    }

    @ManyToOne
    @JoinColumn(name = "deliveryId", referencedColumnName = "id")
    public Delivery getDeliveryByDeliveryId() {
        return deliveryByDeliveryId;
    }

    public void setDeliveryByDeliveryId(Delivery deliveryByDeliveryId) {
        this.deliveryByDeliveryId = deliveryByDeliveryId;
    }
}
