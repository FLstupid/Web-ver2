package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

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

        if (id != shop.id) return false;
        if (accountId != shop.accountId) return false;
        if (bankId != shop.bankId) return false;
        if (activeDay != shop.activeDay) return false;
        if (numberProduct != shop.numberProduct) return false;
        if (status != shop.status) return false;
        if (streetName != null ? !streetName.equals(shop.streetName) : shop.streetName != null) return false;
        if (city != null ? !city.equals(shop.city) : shop.city != null) return false;
        if (district != null ? !district.equals(shop.district) : shop.district != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(shop.lastUpdate) : shop.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (accountId ^ (accountId >>> 32));
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + bankId;
        result = 31 * result + activeDay;
        result = 31 * result + (int) (numberProduct ^ (numberProduct >>> 32));
        result = 31 * result + (int) status;
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
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
