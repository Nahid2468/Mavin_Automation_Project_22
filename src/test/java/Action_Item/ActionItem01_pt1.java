package Action_Item;

import java.util.ArrayList;

public class ActionItem01_pt1 {
    public static void main(String[] args) {
        //create an ArrayList for countries and iterate through the data and print out the result
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("india");
        countries.add("uk");
        countries.add("canada");

        //Declare int as country code in ArrayList
        ArrayList<Integer> countrycode = new ArrayList<>();
        countrycode.add(1234);
        countrycode.add(2345);
        countrycode.add(3456);
        countrycode.add(4567);
        countrycode.add(5678);

        for (int i =0; i < countries.size() ; i++){
        System.out.println("my country is " + countries.get(i) + " and my countrycode is " + countrycode.get(i));
        }//end of for loop
    }//end of main
}//end of java class

