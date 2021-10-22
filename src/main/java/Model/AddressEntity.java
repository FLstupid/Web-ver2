package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "dhs")
public class AddressEntity {
    private long id;
    private int phone;
    private String streetName;
    private String city;
    private String district;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return id == that.id && phone == that.phone && Objects.equals(streetName, that.streetName) && Objects.equals(city, that.city) && Objects.equals(district, that.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phone, streetName, city, district);
    }

    @OneToMany(mappedBy = "addressByAddressId")
    public Collection<UserAddressEntity> getUserAddressesById() {
        return userAddressesById;
    }

    public void setUserAddressesById(Collection<UserAddressEntity> userAddressesById) {
        this.userAddressesById = userAddressesById;
    }
}
