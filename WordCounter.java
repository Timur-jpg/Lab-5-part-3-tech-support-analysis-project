import java.util.HashMap;
import java.util.HashSet;

/**
 * The WordCounter class keeps track of how many times each word 
 * has been entered by users in the TechSupport system.
 * It allows adding words and printing usage counts.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class WordCounter
{
    /** Stores each word along with its count */
    private final HashMap<String, Integer> counts;

    /**
     * Constructs a new WordCounter object.
     */
    public WordCounter()
    {
        counts = new HashMap<>();
    }
    
    /**
     * Updates the usage count of all words in the given set.
     * If a word is already present, its count is incremented.
     * 
     * @param input A set of words entered by the user
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            int counter = counts.getOrDefault(word, 0);
            counts.put(word, counter + 1);
        }
    }

    /**
     * Prints the usage count of all words tracked by this WordCounter.
     */
    public void printWordCounts()
    {
        System.out.println("Word usage counts:");
        for (String word : counts.keySet()) {
            System.out.println(word + ": " + counts.get(word));
        }
    }

    /**
     * Prints the counts of words that are NOT keys in the given Responder's responseMap.
     * 
     * @param responder The Responder instance to check against
     */
    public void printCountsNotInResponder(Responder responder)
    {
        HashMap<String, String> responses = responder.getResponseMap();
        System.out.println("Counts for words not in responseMap:");
        for (String word : counts.keySet()) {
            if (!responses.containsKey(word)) {
                System.out.println(word + ": " + counts.get(word));
            }
        }
    }
}
