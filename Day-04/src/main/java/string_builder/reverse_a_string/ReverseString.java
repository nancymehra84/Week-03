package string_builder.reverse_a_string;

public class ReverseString {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        //reverse() method of StringBuilder to reverse the string
        sb.reverse();
        //Convert the StringBuilder back to a string and return it
        return sb.toString();
    }

    //main method
    public static void main(String[] args){
        String input="Hello";
        String reversed=reverseString(input);
        System.out.print("Reversed String:"+ reversed);
    }
}
