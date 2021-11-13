package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_address", schema = "dhs", catalog = "")
public class UserAddress {
    private long id;
    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    private Account accountByAccountId;
    @ManyToOne
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    private Address addressByAddressId;

    public UserAddress(Account accountid, Address addressid) {
        this.accountByAccountId = accountid;
        this.addressByAddressId = addressid;
    }
    public UserAddress() {

    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAddress that = (UserAddress) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Account getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(Account accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    public Address getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(Address addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }
}
