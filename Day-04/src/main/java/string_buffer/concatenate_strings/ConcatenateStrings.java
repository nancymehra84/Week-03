package string_buffer.concatenate_strings;

public class ConcatenateStrings {
    public static String concatenateStrings(String[] strings){
        StringBuffer sb=new StringBuffer();

        for(String str:strings){
            //append each string to string builder
            sb.append(str);
        }

        //return stringBuilder to string
        return sb.toString();
    }
    public static void main(String[] args){
        String[] input={"Hello!"," ","My"," ","name"," ","is"," ","Nancy."};
        String result=concatenateStrings(input);
        System.out.print(result);
    }
}
