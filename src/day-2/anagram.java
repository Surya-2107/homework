package Leet1;

import java.util.HashMap;
import java.util.Iterator;

public class anagram {
    public static boolean anagramOfString(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        char i;
        char j;
        for (i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for (j=0; j<t.length(); j++){
            if(!map.containsKey(t.charAt(j))){
                return false;
            }
            map.put(t.charAt(j),map.get(t.charAt(j))-1);
        }
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            int count = iterator.next();
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        if (anagramOfString(s, t)) {
            System.out.println(s + " and " + t + " are anagrams.");
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        }
    }
}



