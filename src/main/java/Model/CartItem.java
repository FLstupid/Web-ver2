package Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;

@Entity
public class CartItem {
    @Id
    private long id;
    private short quality;
    private double price = sumPrice();
    private double discount;
    private int amount;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String content;

    @ManyToOne
    private Cart cartByCartId;

    @ManyToOne
    private Product productByProductId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getQuality() {
        return quality;
    }

    public void setQuality(short quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
//        price = sumPrice();
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartItem cartItem = (CartItem) o;

        if (id != cartItem.id) return false;
        if (quality != cartItem.quality) return false;
        if (Double.compare(cartItem.price, price) != 0) return false;
        if (Double.compare(cartItem.discount, discount) != 0) return false;
        if (amount != cartItem.amount) return false;
        if (!Objects.equals(createdAt, cartItem.createdAt)) return false;
        if (!Objects.equals(updatedAt, cartItem.updatedAt)) return false;
        return Objects.equals(content, cartItem.content);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) quality;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + amount;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
    public double sumPrice(){
        return  amount*price;
    }
    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }
    public Product getProducts() {
        return productByProductId;
    }
    public String getTotalCurrencyFormat()
    {       Locale localeVN = new Locale("vi", "VN");
            NumberFormat vn = NumberFormat.getInstance(localeVN);
            return vn.format(this.sumPrice());
    }
}
