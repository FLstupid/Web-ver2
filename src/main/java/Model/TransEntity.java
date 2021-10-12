package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trans", schema = "dhs")
public class TransEntity {
    private long id;
    private Long accountId;
    private Long orderId;
    private AccountEntity accountByAccountId;
    private OrderDetailEntity orderDetailByOrderId;

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
        TransEntity that = (TransEntity) o;
        return id == that.id && Objects.equals(accountId, that.accountId) && Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, orderId);
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
    @JoinColumn(name = "orderId", referencedColumnName = "id")
    public OrderDetailEntity getOrderDetailByOrderId() {
        return orderDetailByOrderId;
    }

    public void setOrderDetailByOrderId(OrderDetailEntity orderDetailByOrderId) {
        this.orderDetailByOrderId = orderDetailByOrderId;
    }
}
