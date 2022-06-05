package Day2_042322;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //create an ArrayList for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA"); //this is index 0
        countries.add("Bangladesh"); //this is index i
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");

        //I want to print 4th value from the list
        System.out.println("My last country is " + countries.get(4) + " and my third country is " + countries.get(2));

    }//end of main
}//end of java class
