package Action_Item2;

import java.util.ArrayList;

public class ActionItem02_pt2 {
    public static void main(String[] args) {
        //create an array with cities and print only when cities are Brooklyn or manhattan
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Manhattan");
        cities.add("New jersey");
        cities.add("Bronx");
        for (int i = 0; i < cities.size(); i++){
            //with if condition and else if condition
            if (cities.get(i) == "Brooklyn") {
                System.out.println("My city is " + cities.get(i));
            } else if(cities.get(i) == "Manhattan"){
                System.out.println("My city is " + cities.get(i));
            }

            //with or operator both conditions has to be true for me to print Brooklyn or Manhattan

            if(cities.get(i) == "Brooklyn" || cities.get(i) == "Manhattan"){
                System.out.println("My city is " + cities.get(i));
            }
        }//end for loop
    }//end of main
}//end of java class
