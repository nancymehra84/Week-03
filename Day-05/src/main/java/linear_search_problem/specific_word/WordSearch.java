package linear_search_problem.specific_word;

public class WordSearch {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "My name is Nancy.",
                "Java is my favourite Language.",
                "My Friend name is Muskan.",
        };

        // Word to search for
        String word = "Nancy";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence containing the word: " + result);
    }
}

