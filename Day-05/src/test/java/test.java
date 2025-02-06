import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import linear_search_problem.first_negative_number.FirstNegativeNumber;
import linear_search_problem.specific_word.WordSearch;
import binary_search.rotation_point.RotationPointBinarySearch;
import binary_search.peak_element.PeakElementBinarySearch;
import binary_search.search_2d_matrix.Search2DMatrix;
import binary_search.first_and_last_occurence.FirstAndLastOccurrence;

public class test {
    @Test
    public void TestFirstNegative(){
        int[] arr = {1,8,9,-2,-3};
        assertEquals(FirstNegativeNumber.findFirstNegative(arr),3);
    }

    @Test
    public void TestWordSearch(){
        String[] sentences = {
                "My name is Nancy.",
                "Java is my favourite Language.",
                "My Friend name is Muskan.",
        };
        assertEquals(WordSearch.findSentenceWithWord(sentences,"Nancy"),"My name is Nancy.");
    }
    @Test
    public void TestRotationPoint(){
        int[] arr = { 5, 6, 7, 0, 1};
        assertEquals(RotationPointBinarySearch.findRotationPoint(arr),3);
    }
    @Test
    public void TestPeakElement(){
        int[] arr = {1, 3, 20, 4, 1, 0};
        assertEquals(PeakElementBinarySearch.findPeakElement(arr),2);
    }
    @Test
    public void Test2DMatrix(){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertEquals(Search2DMatrix.searchMatrix(matrix,3),true);
    }
    @Test
    public void TestFirstAndLastOccurence(){
        int[] arr = {2, 4, 4, 4, 6, 7, 8, 8, 10};
        int[] result={1,3};
        int[] expected=FirstAndLastOccurrence.searchRange(arr,4);
        assertEquals(expected[0],result[0]);
        assertEquals(expected[1],result[1]);
    }
}
