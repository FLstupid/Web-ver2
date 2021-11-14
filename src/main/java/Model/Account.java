package Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String passwordHash;
    private String phone;
    private boolean gender;
    private String email;
    private String shopName;
    private Date birthday;
    private boolean role;
    private Timestamp lastUpdate;

    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Cart> cartsById;

    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Review> reviewsById;

    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Shop> shopsById;

    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Trans> transById;



    public Account(String username, String password, String phone, Boolean gender, String email, String sa, Date birhday, Boolean c, Timestamp lastUpdate) {
        this.username = username;
        this.passwordHash = password;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.shopName = sa;
        this.birthday = birhday;
        this.role = c;
        this.lastUpdate = lastUpdate;
    }
    public Account() {

    }

    public Account(String email, String password) {
        this.email = email;
        this.passwordHash = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean getGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean getRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

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
        if (!Objects.equals(phone, account.phone)) return false;
        if (gender != account.gender) return false;
        if (role != account.role) return false;
        if (!Objects.equals(username, account.username)) return false;
        if (!Objects.equals(passwordHash, account.passwordHash))
            return false;
        if (!Objects.equals(email, account.email)) return false;
        if (!Objects.equals(shopName, account.shopName)) return false;
        if (!Objects.equals(birthday, account.birthday)) return false;
        return Objects.equals(lastUpdate, account.lastUpdate);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (passwordHash != null ? passwordHash.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (gender ? 1 : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (role ? 1 : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
    public Collection<Cart> getCartsById() {
        return cartsById;
    }

    public void setCartsById(Collection<Cart> cartsById) {
        this.cartsById = cartsById;
    }

    public Collection<Trans> getTransById() {
        return transById;
    }

    public void setTransById(Collection<Trans> transById) {
        this.transById = transById;
    }

//    public Collection<UserAddress> getUserAccountById() {
//        return userAccountById;
//    }
//
//    public void setUserAccountById(Collection<UserAddress> userAccountById) {
//        this.userAccountById = userAccountById;
//    }
}
