
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStringACToLength {
    class mycompare implements Comparator<String> {

        @Override
        public int compare(String s, String t1) {
            if (s.length() < t1.length()) {
                return -1;
            } else if (s.length() > t1.length()) {
                return 1;
            } else if (s.compareTo(t1) < 0) {
                return -1;
            } else if (s.compareTo(t1) > 0) {
                return 1;
            } else return 0;
        }
    }

    static void sort(String[] s, int n) {
        for (int i = 1; i < n; i++) {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length()) {
                s[j + 1] = s[j];
                j--;
            }
            s[j + 1] = temp;
        }
    }

    // Function to print the sorted array of string
    static void printArraystring(String str[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }

    // Driver function
    public void main(String args[]) {
        String[] arr = {"GeeksforGeeks", "I", "from", "am"};
        int n = arr.length;
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        Collections.sort(al, new mycompare());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(al.get(i) + " ");
        }

    }
}