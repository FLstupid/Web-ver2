package Model;

import javax.persistence.*;
import java.sql.Timestamp;

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

        if (id != that.id) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (states != null ? !states.equals(that.states) : that.states != null) return false;
        if (detailstates != null ? !detailstates.equals(that.detailstates) : that.detailstates != null) return false;
        if (payment != null ? !payment.equals(that.payment) : that.payment != null) return false;
        if (detailpayment != null ? !detailpayment.equals(that.detailpayment) : that.detailpayment != null)
            return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (states != null ? states.hashCode() : 0);
        result = 31 * result + (detailstates != null ? detailstates.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (detailpayment != null ? detailpayment.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
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
