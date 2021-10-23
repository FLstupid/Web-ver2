package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Shop {
    private long id;
    private long accountId;
    private String streetName;
    private String city;
    private String district;
    private int bankId;
    private int activeDay;
    private long numberProduct;
    private short status;
    private Timestamp lastUpdate;
    private Collection<Product> productsById;
    private Account accountByAccountId;
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
    @Column(name = "accountId")
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
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
    @Column(name = "status")
    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
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
        Shop shop = (Shop) o;
        return id == shop.id && accountId == shop.accountId && bankId == shop.bankId && activeDay == shop.activeDay && numberProduct == shop.numberProduct && status == shop.status && Objects.equals(streetName, shop.streetName) && Objects.equals(city, shop.city) && Objects.equals(district, shop.district) && Objects.equals(lastUpdate, shop.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, streetName, city, district, bankId, activeDay, numberProduct, status, lastUpdate);
    }

    @OneToMany(mappedBy = "shopByShopId")
    public Collection<Product> getProductsById() {
        return productsById;
    }

    public void setProductsById(Collection<Product> productsById) {
        this.productsById = productsById;
    }

    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "id", nullable = false)
    public Account getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(Account accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    @OneToMany(mappedBy = "shopByShopId")
    public Collection<ShopDelivery> getShopDeliveriesById() {
        return shopDeliveriesById;
    }

    public void setShopDeliveriesById(Collection<ShopDelivery> shopDeliveriesById) {
        this.shopDeliveriesById = shopDeliveriesById;
    }
}
