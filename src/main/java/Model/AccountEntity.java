package Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "dhs")
public class AccountEntity {
    private long id;
    private String username;
    private String passwordHash;
    private int phone;
    private String email;
    private String shopName;
    private Date birthday;
    private boolean role;
    private Timestamp lastUpdate;
    private Collection<CartEntity> cartsById;
    private Collection<ReviewEntity> reviewsById;
    private Collection<TransEntity> transById;
    private Collection<TransistionEntity> transistionsById;
    private Collection<UserAddressEntity> userAddressesById;

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
        AccountEntity that = (AccountEntity) o;
        return id == that.id && phone == that.phone && role == that.role && Objects.equals(username, that.username) && Objects.equals(passwordHash, that.passwordHash) && Objects.equals(email, that.email) && Objects.equals(shopName, that.shopName) && Objects.equals(birthday, that.birthday) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, passwordHash, phone, email, shopName, birthday, role, lastUpdate);
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<CartEntity> getCartsById() {
        return cartsById;
    }

    public void setCartsById(Collection<CartEntity> cartsById) {
        this.cartsById = cartsById;
    }

    @OneToMany(mappedBy = "accountByUserId")
    public Collection<ReviewEntity> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<ReviewEntity> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<TransEntity> getTransById() {
        return transById;
    }

    public void setTransById(Collection<TransEntity> transById) {
        this.transById = transById;
    }

    @OneToMany(mappedBy = "accountByCustomerId")
    public Collection<TransistionEntity> getTransistionsById() {
        return transistionsById;
    }

    public void setTransistionsById(Collection<TransistionEntity> transistionsById) {
        this.transistionsById = transistionsById;
    }

    @OneToMany(mappedBy = "accountByAccountId")
    public Collection<UserAddressEntity> getUserAddressesById() {
        return userAddressesById;
    }

    public void setUserAddressesById(Collection<UserAddressEntity> userAddressesById) {
        this.userAddressesById = userAddressesById;
    }
}
