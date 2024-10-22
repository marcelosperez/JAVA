import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProgramTwo {

  public static void main (String[] args) {

    List<ProductTwo> list = new ArrayList<>();

    list.add(new ProductTwo ("TV", 900.00) );
    list.add(new ProductTwo ("Notebook", 1200.00) );
    list.add(new ProductTwo ("Tablet", 450.00) );
    list.add(new ProductTwo ("Smartphone Apple", 10000.00) );
    list.add(new ProductTwo ("Smartphone Samsung", 6000.00) );    
 
    Collections.sort(new MyComparable());

    for (ProductTwo p : list){
        System.out.println(p);
    }

  }







}