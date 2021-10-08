package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 3 (dnm)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        StringBuilder temp = new StringBuilder();
        int maxLength = -1;
        if (checkString.isEmpty()) {
            return 0;
        } else if (checkString.length() == 1) {
            return 1;
        }
        for (char character : checkString.toCharArray()) {
            String current = String.valueOf(character);
            if (temp.toString().contains(current)) {
                temp = new StringBuilder(temp.substring(temp.indexOf(current) + 1));
            }
            temp.append(character);
            maxLength = Math.max(temp.length(), maxLength);
        }
        return maxLength;
    }
}