package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Transistion {
    private long id;
    private Long customerId;
    private Long orderId;
    private Integer states;
    private String detailstates;
    private String payment;
    private String detailpayment;
    private Timestamp updatedAt;
    private Account accountByCustomerId;
    private OrderDetail orderDetailByOrderId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customerId")
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "orderId")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "states")
    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    @Basic
    @Column(name = "detailstates")
    public String getDetailstates() {
        return detailstates;
    }

    public void setDetailstates(String detailstates) {
        this.detailstates = detailstates;
    }

    @Basic
    @Column(name = "payment")
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "detailpayment")
    public String getDetailpayment() {
        return detailpayment;
    }

    public void setDetailpayment(String detailpayment) {
        this.detailpayment = detailpayment;
    }

    @Basic
    @Column(name = "updatedAt")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transistion that = (Transistion) o;
        return id == that.id && Objects.equals(customerId, that.customerId) && Objects.equals(orderId, that.orderId) && Objects.equals(states, that.states) && Objects.equals(detailstates, that.detailstates) && Objects.equals(payment, that.payment) && Objects.equals(detailpayment, that.detailpayment) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, orderId, states, detailstates, payment, detailpayment, updatedAt);
    }

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    public Account getAccountByCustomerId() {
        return accountByCustomerId;
    }

    public void setAccountByCustomerId(Account accountByCustomerId) {
        this.accountByCustomerId = accountByCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id")
    public OrderDetail getOrderDetailByOrderId() {
        return orderDetailByOrderId;
    }

    public void setOrderDetailByOrderId(OrderDetail orderDetailByOrderId) {
        this.orderDetailByOrderId = orderDetailByOrderId;
    }
}
