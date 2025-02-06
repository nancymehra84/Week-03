package string_builder.remove_duplicates;

import java.util.HashSet;

public class RemoveDuplicate {
    //method to remove duplicate value from string
    public static String removeDuplicate(String str){
       //Initializing String Builder and HashSet
        StringBuilder sb =new StringBuilder();
        HashSet<Character> seen=new HashSet<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!seen.contains(c)){
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    //main method
    public static void main(String[] args){
        String input = "nancy";
        String result= removeDuplicate(input);
        System.out.print("String after removing duplicate:"+result);
    }
}
