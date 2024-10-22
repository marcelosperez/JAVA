public class MyComparable implements Comparable<ProductTwo> {

    @Override
    public int compareTo(ProductTwo p) {
        return p.getName().toUpperCase().compareTo(p.getName().toUpperCase());
    }  
    
}
