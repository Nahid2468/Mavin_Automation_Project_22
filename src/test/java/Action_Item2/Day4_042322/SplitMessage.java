package Action_Item2.Day4_042322;

public class SplitMessage {
    public static void main(String[] args) {
        //declare string variable
        String SplitMessage = "My Name Is John";
        //declare an array of string to store the string split
        String[] splitMessageArray = SplitMessage.split(" ");
        //print out John to the console
        System.out.println("My first name is " + splitMessageArray[3]);
    }
}
