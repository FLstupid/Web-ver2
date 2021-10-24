package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Trans {
    private long id;
    private Long accountId;
    private Long orderId;
    private Account accountByAccountId;
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
    @Column(name = "accountId")
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
        return id == trans.id && Objects.equals(accountId, trans.accountId) && Objects.equals(orderId, trans.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, orderId);
    }

    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    public Account getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(Account accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
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