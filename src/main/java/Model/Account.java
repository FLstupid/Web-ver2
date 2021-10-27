package Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

@Entity
public class Account {

    private long id;
    private String username;
    private String passwordHash;
    private int phone;
    private boolean gender;
    private String email;
    private String shopName;
    private Date birthday;
    private boolean role;
    private Timestamp lastUpdate;
    private Collection<Cart> cartsById;
    private Collection<Review> reviewsById;
    private Collection<Shop> shopsById;
    private Collection<Trans> transById;
    private Collection<Transistion> transistionsById;
    private Collection<UserAddress> userAddressesById;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Address> addressList;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "passwordHash")
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Basic
    @Column(name = "phone")
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "gender")
    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "shop_name")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "role")
    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
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

        Account account = (Account) o;

        if (id != account.id) return false;
        if (phone != account.phone) return false;
        if (gender != account.gender) return false;
        if (role != account.role) return false;
        if (username != null ? !username.equals(account.username) : account.username != null) return false;
        if (passwordHash != null ? !passwordHash.equals(account.passwordHash) : account.passwordHash != null)
            return false;
        if (email != null ? !email.equals(account.email) : account.email != null) return false;
        if (shopName != null ? !shopName.equals(account.shopName) : account.shopName != null) return false;
        if (birthday != null ? !birthday.equals(account.birthday) : account.birthday != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(account.lastUpdate) : account.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (passwordHash != null ? passwordHash.hashCode() : 0);
        result = 31 * result + phone;
        result = 31 * result + (gender ? 1 : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (role ? 1 : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<Cart> getCartsById() {
        return cartsById;
    }

    public void setCartsById(Collection<Cart> cartsById) {
        this.cartsById = cartsById;
    }

    @OneToMany(mappedBy = "accountByUserId")
    public Collection<Review> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<Review> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<Shop> getShopsById() {
        return shopsById;
    }

    public void setShopsById(Collection<Shop> shopsById) {
        this.shopsById = shopsById;
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<Trans> getTransById() {
        return transById;
    }

    public void setTransById(Collection<Trans> transById) {
        this.transById = transById;
    }

    @OneToMany(mappedBy = "accountByCustomerId")
    public Collection<Transistion> getTransistionsById() {
        return transistionsById;
    }

    public void setTransistionsById(Collection<Transistion> transistionsById) {
        this.transistionsById = transistionsById;
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<UserAddress> getUserAddressesById() {
        return userAddressesById;
    }

    public void setUserAddressesById(Collection<UserAddress> userAddressesById) {
        this.userAddressesById = userAddressesById;
    }
}
