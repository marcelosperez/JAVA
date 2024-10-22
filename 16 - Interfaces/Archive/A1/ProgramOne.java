import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramOne {

  public static void main (String[] args) {

    List<ProductOld> list = new ArrayList<>();

    list.add(new ProductOld ("TV", 900.00) );
    list.add(new ProductOld ("Notebook", 1200.00) );
    list.add(new ProductOld ("Tablet", 450.00) );
    list.add(new ProductOld ("Smartphone Apple", 10000.00) );
    list.add(new ProductOld ("Smartphone Samsung", 6000.00) );    
 
    Collections.sort(list);

    for (ProductOld p : list){
        System.out.println(p);
    }

  }







}