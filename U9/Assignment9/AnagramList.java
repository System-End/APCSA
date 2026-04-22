import java.util.ArrayList;

public class AnagramList {

    private final ArrayList<String> anagrams;

    public AnagramList(String word) {
        anagrams = new ArrayList<String>();
        completeAnagrams("", word);
        sortAnagrams();
    }

    private void completeAnagrams(String start, String end) {
        // Base case: no characters left to arrange, add completed string
        if (end.length() == 0) {
            if (!anagrams.contains(start)) anagrams.add(start);
            return;
        }

        // Try placing each character in 'end' as the next character
        for (int i = 0; i < end.length(); i++) {
            String nextChar = end.substring(i, i + 1);
            String remaining = end.substring(0, i) + end.substring(i + 1);
            completeAnagrams(start + nextChar, remaining);
        }
    }

    private void sortAnagrams() {
        // Insertion sort alphabetically
        for (int i = 1; i < anagrams.size(); i++) {
            String key = anagrams.get(i);
            int j = i - 1;
            while (j >= 0 && anagrams.get(j).compareTo(key) > 0) {
                anagrams.set(j + 1, anagrams.get(j));
                j--;
            }
            anagrams.set(j + 1, key);
        }
    }

    public int searchAnagrams(String target) {
        // Binary search (list is sorted)
        int start = 0;
        int end = anagrams.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int cmp = anagrams.get(mid).compareTo(target);

            if (cmp == 0) return mid;
            else if (cmp < 0) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    // Used to get list of anagrams externally, do not remove
    public ArrayList<String> getAnagrams() {
        return anagrams;
    }
}
