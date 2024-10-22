public class ProductOld implements Comparable<ProductOld> {

    private String name;
    private double price;
   
    public ProductOld() {
    }

    public ProductOld(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(ProductOld p) {
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }   
    
}
