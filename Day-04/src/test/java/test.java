import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import string_builder.remove_duplicates.RemoveDuplicate;
import string_builder.reverse_a_string.ReverseString;
import string_buffer.concatenate_strings.ConcatenateStrings;
import FileReader.count_occurance_of_word.CountOccurrence;
public class test {
    @Test
    public void TestDuplicate(){
        assertEquals(RemoveDuplicate.removeDuplicate("Hello"),"Helo");
    }

    @Test
    public void ReverseString(){
        assertEquals(ReverseString.reverseString("Hello"),"olleH");
    }
    @Test
    public void ConcatenateString(){
        String[] arr={"Nancy"," ","Mehra"};
        assertEquals(ConcatenateStrings.concatenateStrings(arr),"Nancy Mehra");
    }
    @Test
    public void CountOccurence(){
        String fileName="Engineering.txt";
        assertEquals(CountOccurrence.countWordOccurrences(fileName,"Engineering"),1);
    }
}
