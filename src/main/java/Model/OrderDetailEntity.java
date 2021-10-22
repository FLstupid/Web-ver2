package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "order_detail", schema = "dhs")
public class OrderDetailEntity {
    private long id;
    private int phone;
    private String streetName;
    private String city;
    private String district;
    private String delivery;
    private Timestamp createdAt;
    private double shipPrice;
    private double totalPrice;
    private Timestamp updatedAt;
    private String note;
    private Collection<OrderItemEntity> orderItemsById;
    private Collection<TransEntity> transById;
    private Collection<TransistionEntity> transistionsById;

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
    @Column(name = "shipPrice")
    public double getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(double shipPrice) {
        this.shipPrice = shipPrice;
    }

    @Basic
    @Column(name = "totalPrice")
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailEntity that = (OrderDetailEntity) o;
        return id == that.id && phone == that.phone && Double.compare(that.shipPrice, shipPrice) == 0 && Double.compare(that.totalPrice, totalPrice) == 0 && Objects.equals(streetName, that.streetName) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(delivery, that.delivery) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phone, streetName, city, district, delivery, createdAt, shipPrice, totalPrice, updatedAt, note);
    }

    @OneToMany(mappedBy = "orderDetailByOrderId")
    public Collection<OrderItemEntity> getOrderItemsById() {
        return orderItemsById;
    }

    public void setOrderItemsById(Collection<OrderItemEntity> orderItemsById) {
        this.orderItemsById = orderItemsById;
    }

    @OneToMany(mappedBy = "orderDetailByOrderId")
    public Collection<TransEntity> getTransById() {
        return transById;
    }

    public void setTransById(Collection<TransEntity> transById) {
        this.transById = transById;
    }

    @OneToMany(mappedBy = "orderDetailByOrderId")
    public Collection<TransistionEntity> getTransistionsById() {
        return transistionsById;
    }

    public void setTransistionsById(Collection<TransistionEntity> transistionsById) {
        this.transistionsById = transistionsById;
    }
}
