package Day2_042322;

public class WhileLoop {
    public static void main(String[] args) {
        //iterate through zipcode and its streetNumber using linear array and while loop
        String[] zipcodes = new String[]{"11218", "11219","11232","10001"};
        int[] houseNumber = new int[]{133,233,344,455};

        //initialize your starting point before calling while loop
        int i = 0;
        //define the end point in while loop
        while (i < houseNumber.length){
            System.out.println("My zip code is " + zipcodes[i] + " house number " + houseNumber[i]);

            //incrementing
            i = i +1;
        }//end of while loop
    }//end of main
}//end of java class
