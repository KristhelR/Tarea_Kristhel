import java.util.HashMap;
import java.util.Map;
import java.util.Iterator; //paqueteria de iterador
import java.util.Set;
public class Main {

    public static void main(String args[]) { //hago una clase public

        HashMap<Integer, String> hmap = new HashMap<Integer, String>(); //declaro el HashMap

        //elementos agregados al hashmap
        hmap.put(2, "perro");
        hmap.put(4, "gato");
        hmap.put(6, "conejo");
        hmap.put(8, "tortuga");
        hmap.put(9, "hamster");

        //hago un iterador para que recorra el hashmap y me de los valores de llave y valor
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) { //hago el iterador con while
            Map.Entry mentry = (Map.Entry)iterator.next(); //mentry = map entry
            System.out.print("La llave es: "+ mentry.getKey() + "\n" + "Y el valor es: " );
            System.out.println(mentry.getValue() + "\n" ) ;
        }

    }
}