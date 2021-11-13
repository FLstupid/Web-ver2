package Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Trans {
    private long id;
    private Long accountId;
    private Long orderId;
    private Integer states;
    private String detailstates;
    private String payment;
    private String detailpayment;
    private Timestamp updatedAt;

    @ManyToOne
    private Account AccountId;

    @ManyToOne
    private OrderDetail OrderId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AccountId")
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "orderId")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trans trans = (Trans) o;

        if (id != trans.id) return false;
        if (accountId != null ? !accountId.equals(trans.accountId) : trans.accountId != null) return false;
        return orderId != null ? orderId.equals(trans.orderId) : trans.orderId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "AccountId", referencedColumnName = "id")
    public Account getAccountByAccountId() {
        return AccountId;
    }

    public void setAccountByAccountId(Account accountByAccountId) {
        this.AccountId = accountByAccountId;
    }

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id")
    public OrderDetail getOrderDetailByOrderId() {
        return OrderId;
    }

    public void setOrderDetailByOrderId(OrderDetail orderDetailByOrderId) {
        this.OrderId = orderDetailByOrderId;
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
}
