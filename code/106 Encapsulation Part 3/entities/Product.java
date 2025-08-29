package entities;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Não possuirá um produto como argumento (Product p)
    // Pois é um método não estático, ou seja,
    // irá trabalhar com o próprio produto onde está
    // o método não estático é um método da instância
    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    }

    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.0;
    }


    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }





}
