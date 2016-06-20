package predicateExample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by k on 20.06.2016.
 */
public class PredicateFurniture {

    public static Predicate<Furniture> fillterByPrice(int price){
        return  p -> p.getPrice() > price;
    }

    public static Predicate<Furniture> fillterByColor(String color){
        return  p -> p.getColor().equals(color);
    }


    public static List<Furniture> fillterFurniture (List<Furniture>  furnitures, Predicate<Furniture> predicate) {
        return furnitures.stream().filter( predicate ).collect(Collectors.<Furniture>toList());
    }
}
