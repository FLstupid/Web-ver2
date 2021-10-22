package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cart", schema = "dhs")
public class CartEntity {
    private long id;
    private String sessionId;
    private String tokenId;
    private Short status;
    private Long accountId;
    private int phone;
    private String streetName;
    private String city;
    private String district;
    private String delivery;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String content;
    private AccountEntity accountByAccountId;
    private Collection<CartItemEntity> cartItemsById;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sessionId")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "tokenId")
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "accountId")
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
    @Column(name = "delivery")
    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @Basic
    @Column(name = "createdAt")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updatedAt")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartEntity that = (CartEntity) o;
        return id == that.id && phone == that.phone && Objects.equals(sessionId, that.sessionId) && Objects.equals(tokenId, that.tokenId) && Objects.equals(status, that.status) && Objects.equals(accountId, that.accountId) && Objects.equals(streetName, that.streetName) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(delivery, that.delivery) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sessionId, tokenId, status, accountId, phone, streetName, city, district, delivery, createdAt, updatedAt, content);
    }

    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    public AccountEntity getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(AccountEntity accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    @OneToMany(mappedBy = "cartByCartId")
    public Collection<CartItemEntity> getCartItemsById() {
        return cartItemsById;
    }

    public void setCartItemsById(Collection<CartItemEntity> cartItemsById) {
        this.cartItemsById = cartItemsById;
    }
}
