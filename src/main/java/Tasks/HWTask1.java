package Tasks;

import Address.Address;
import Orders.Order;
import Products.Apple;
import Products.Orange;
import Products.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HWTask1 {
    public static void main(String[] args) throws IOException {
        Apple apple = new Apple(300, "apple", 100, "red");
        Orange orange = new Orange(500, "orange", 100, false);
        List<Product> products = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        products.add(apple);
        products.add(orange);
        for (int i = 0; i < 100; i++) {
            Address address = new Address("Russia","Moscow","Arbat",12,1+i,10+i);
            Order order = new Order(i,products, address);
            orders.add(order);
        }
        ObjectMapper mapper = new ObjectMapper();
        FileWriter fileWriter = new FileWriter("src/orders.json");
        mapper.writeValue(fileWriter,orders);
        FileReader fileReader = new FileReader("src/orders.json");
        orders = mapper.readValue(fileReader, List.class);
        System.out.println(orders.toString());
    }
}
