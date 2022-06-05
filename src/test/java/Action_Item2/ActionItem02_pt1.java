package Action_Item2;

public class ActionItem02_pt1 {

    public static void main(String[] args) {
        //when grade range is 90 to 100 print grade as A
        //when grade range is 80 to 89 print grade as B
        //when grade range is 70 to 79 print grade as C
        //when grade range is 60 to 69 print grade as D
        //when grade range is less than 60 print grade as F
        int grade = 89;
        if(grade >=90 && grade <=100) {
            System.out.println("when grade range is 90 to 100 print grade as A");
        } else if(grade >=80 && grade <90){
            System.out.println("when grade range is 80 to 89 print grade as B");
        } else if(grade >=70 && grade <80){
            System.out.println("when grade range is 70 to 79 print grade as C");
        } else if(grade >=60 && grade <70){
            System.out.println("when grade range is 60 to 69 print grade as D ");
        } else {
           System.out.println("when grade range is less than 60 print grade as F");
        }//end of conditions
    }//end of main
}//end of java class
