import java.util.*;
public class longest {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,size=Integer.MIN_VALUE;
        HashSet<Character> window = new HashSet<>();

        for(int r=0;r<s.length();r++) {
            char right_char = s.charAt(r);
            while(window.contains(right_char)) {
                window.remove(s.charAt(l));
                l++;
            }
            size = Math.max(size,r-l+1);
            window.add(right_char);
        }
        return (size == Integer.MIN_VALUE)?0:size;
    }

}
