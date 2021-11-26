package Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Account {
    private long id;
    private Date birthday;
    private String email;
    private boolean gender;
    private Timestamp lastUpdate;
    private String passwordHash;
    private String phone;
    private boolean role;
    private String shopName;
    private String username;
    private String avatar;

    public Account(String username, String mail, String avatar) {
        this.username = username;
        this.email=mail;
        this.avatar = avatar;
    }

    public Account() {

    }

    public Account(String email, String password) {
        this.email = email;
        this.passwordHash = password;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "lastUpdate")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
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
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "shopName")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && gender == account.gender && role == account.role && Objects.equals(birthday, account.birthday) && Objects.equals(email, account.email) && Objects.equals(lastUpdate, account.lastUpdate) && Objects.equals(passwordHash, account.passwordHash) && Objects.equals(phone, account.phone) && Objects.equals(shopName, account.shopName) && Objects.equals(username, account.username) && Objects.equals(avatar, account.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, birthday, email, gender, lastUpdate, passwordHash, phone, role, shopName, username, avatar);
    }
}
