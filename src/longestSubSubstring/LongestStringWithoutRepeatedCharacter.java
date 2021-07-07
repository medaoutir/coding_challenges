package longestSubSubstring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringWithoutRepeatedCharacter {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s))
            return 0;
        else if (s.length() == 1)
            return 1;
        else {
            List<String> substrings = new ArrayList<>();
            StringBuilder lswrc = new StringBuilder();
            for (int i = 0; i < s.length(); i ++) {
                for (int j = i; j < s.length(); j++) {
                    char current = s.charAt(j);
                    lswrc.append(current);
                    if (lswrc.substring(0, j - i).indexOf(lswrc.charAt(lswrc.length() - 1)) != -1 && lswrc.length() > 1) {
                        lswrc.deleteCharAt(j - i);
                        break;
                    }
                }
                substrings.add(lswrc.toString());
                lswrc = new StringBuilder();
            }
            Optional<Integer> maxLenght = substrings.stream().map(substring -> substring.length()).max(Comparator.comparing(Integer::valueOf));
            return maxLenght.get();
        }
    }
}
