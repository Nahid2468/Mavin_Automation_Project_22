package Action_Item;

public class ActionItem01_pt2 {
    public static void main(String[] args) {
        //create string array for regions and areaCodes
        String[] region = new String[]{"California ","Brooklyn ","New jersey ","Manhattan ","Bronx "};
        int[]areaCode = new int[]{255, 386, 464, 546, 678};

        //initialize your starting point before calling while loop
        int i = 0;
        //Define the endpoint for while loop
        while (i < region.length){
            System.out.println("My region is " + region[i] + " and my areaCode " + areaCode[i]);

            //incrementing
            i = i +1;
        }//end of while loop
    }//end of main
}//end of java class
