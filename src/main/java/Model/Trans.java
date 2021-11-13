package Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Trans {
    @Id
    private long id;
    private Integer states;
    private String detailstates;
    private String payment;
    private String detailpayment;
    private Timestamp updatedAt;

    @ManyToOne
    private Account accountByAccountId;

    @ManyToOne
    private OrderDetail orderDetailByOrderId;

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

        Trans trans = (Trans) o;

        return id == trans.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @ManyToOne
    public Account getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(Account accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    @ManyToOne
    public OrderDetail getOrderDetailByOrderId() {
        return orderDetailByOrderId;
    }

    public void setOrderDetailByOrderId(OrderDetail orderDetailByOrderId) {
        this.orderDetailByOrderId = orderDetailByOrderId;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public String getDetailstates() {
        return detailstates;
    }

    public void setDetailstates(String detailstates) {
        this.detailstates = detailstates;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDetailpayment() {
        return detailpayment;
    }

    public void setDetailpayment(String detailpayment) {
        this.detailpayment = detailpayment;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
