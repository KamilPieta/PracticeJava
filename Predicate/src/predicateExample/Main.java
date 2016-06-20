package predicateExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  static predicateExample.PredicateFurniture.*;



public class Main {
   private static final String TAG="kamil";

    public static void main(String[] args) {


        List<Furniture> furnitures= new ArrayList<>();

        furnitures.addAll(Arrays.asList(
                new Furniture(123,"black"),
                new Furniture(431,"red"),
                new Furniture(126,"green"),
                new Furniture(1,"black")));


        System.out.println(PredicateFurniture.fillterFurniture(furnitures,PredicateFurniture.fillterByPrice(125)));   //filltering using predicate expression
        System.out.println(PredicateFurniture.fillterFurniture(furnitures,PredicateFurniture.fillterByColor("black")));   //filltering using predicate expression
        furnitures.sort((f1, f2)-> f1.getPrice() - (f2.getPrice()) );             //sort using lambda
        System.out.println(furnitures);
    }

/// Dont do that ! Using The predicat it more efficient way and we can easily testing it!
/*    public static List<Furniture> filterByBlackColor (List<Furniture> furnitures){
        List<Furniture> resoult= new ArrayList<>();
        for(Furniture f: furnitures)
        {
            if("black".equals(f.getColor()))
                resoult.add(f);
        }
        return resoult;
    }
    public static List<Furniture> filterByColor (List<Furniture> furnitures,String color){
        List<Furniture> resoult= new ArrayList<>();
        for(Furniture f: furnitures)
        {
            if(color.equals(f.getColor()))
                resoult.add(f);
        }
        return resoult;
    }
    public static List<Furniture> filterByPrice (List<Furniture> furnitures,int price){
        List<Furniture> resoult= new ArrayList<>();
        for(Furniture f: furnitures)
        {
            if(price>(f.getPrice()))
                resoult.add(f);
        }
        return resoult;
    }*/


}
