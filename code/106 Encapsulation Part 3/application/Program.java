
package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String args[]) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Nessa variação, a variável min
        // poderia ser digitada pelo usuário
        double min = 100.0;
        //  Predicate<Product> pred = p -> p.getPrice() >= min;

        // Expressão Lambda inline
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
