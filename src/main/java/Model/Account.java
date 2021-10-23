package Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Account {
    private long id;
    private String username;
    private String passwordHash;
    private int phone;
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

    @Id
    @Column(name = "id")
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
        return id == account.id && phone == account.phone && role == account.role && Objects.equals(username, account.username) && Objects.equals(passwordHash, account.passwordHash) && Objects.equals(email, account.email) && Objects.equals(shopName, account.shopName) && Objects.equals(birthday, account.birthday) && Objects.equals(lastUpdate, account.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, passwordHash, phone, email, shopName, birthday, role, lastUpdate);
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
