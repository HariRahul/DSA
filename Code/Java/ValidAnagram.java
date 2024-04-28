package Code.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ValidAnagram {
    /*Two methods. 
    Keep track of char count using hashmap and compare both hashmaps.*/

    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashMap = new HashMap();

        for (int i=0;i<s.length();i++){
            if (hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            else
                hashMap.put(s.charAt(i),1);
        }

        for (int i=0;i<t.length();i++){
            if (hashMap.containsKey(t.charAt(i)))
                hashMap.put(t.charAt(i),hashMap.get(t.charAt(i))-1);
            else
                return false;
        }

        int sum = 0;
        for (char c : hashMap.keySet())
            if (hashMap.get(c)!=0)
                return false;

        return true;
    }

    // Sort and compare two strings.
    public boolean isAnagram2(String s, String t) {

        ArrayList<Character> sc = new ArrayList();
        ArrayList<Character> tc = new ArrayList();

        for (int i=0;i<s.length();i++)
            sc.add(s.charAt(i));

        for (int i=0;i<t.length();i++)
            tc.add(t.charAt(i));
        
        Collections.sort(sc);
        Collections.sort(tc);
        
        return sc.equals(tc);
    }
}
