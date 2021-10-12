package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "shop", schema = "dhs")
public class ShopEntity {
    private long id;
    private String streetName;
    private String city;
    private String district;
    private int bankId;
    private int activeDay;
    private long numberProduct;
    private Timestamp lastUpdate;
    private Collection<ProductEntity> productsById;
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
    @Column(name = "street_name")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "bank_id")
    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Basic
    @Column(name = "active_day")
    public int getActiveDay() {
        return activeDay;
    }

    public void setActiveDay(int activeDay) {
        this.activeDay = activeDay;
    }

    @Basic
    @Column(name = "number_product")
    public long getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(long numberProduct) {
        this.numberProduct = numberProduct;
    }

    @Basic
    @Column(name = "LAST_UPDATE")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopEntity that = (ShopEntity) o;
        return id == that.id && bankId == that.bankId && activeDay == that.activeDay && numberProduct == that.numberProduct && Objects.equals(streetName, that.streetName) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, streetName, city, district, bankId, activeDay, numberProduct, lastUpdate);
    }

    @OneToMany(mappedBy = "shopByShopId")
    public Collection<ProductEntity> getProductsById() {
        return productsById;
    }

    public void setProductsById(Collection<ProductEntity> productsById) {
        this.productsById = productsById;
    }

    @OneToMany(mappedBy = "shopByShopId")
    public Collection<ShopDeliveryEntity> getShopDeliveriesById() {
        return shopDeliveriesById;
    }

    public void setShopDeliveriesById(Collection<ShopDeliveryEntity> shopDeliveriesById) {
        this.shopDeliveriesById = shopDeliveriesById;
    }
}
