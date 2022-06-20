package Orders;

import Address.Address;
import Products.Product;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.List;

@JsonAutoDetect
public class Order {
    public int id;
    public List<Product> productList;
    public Address address;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productList=" + productList +
                ", address=" + address +
                '}';
    }

    public Order(List<Product> productList) {
        this.productList = productList;
    }

    public Order(int id, List<Product> productList, Address address) {
        this.id = id;
        this.productList = productList;
        this.address = address;
    }

}
