package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_address", schema = "dhs")
public class UserAddressEntity {
    private Long accountId;
    private Long addressId;
    private AccountEntity accountByAccountId;
    private AddressEntity addressByAddressId;

    @Basic
    @Column(name = "accountId")
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "addressId")
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAddressEntity that = (UserAddressEntity) o;
        return Objects.equals(accountId, that.accountId) && Objects.equals(addressId, that.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, addressId);
    }

    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    public AccountEntity getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(AccountEntity accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    @ManyToOne
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    public AddressEntity getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressEntity addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }
}
