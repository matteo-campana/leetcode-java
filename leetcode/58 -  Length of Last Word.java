class Solution {
    public int lengthOfLastWord(String s) {
        boolean encounteredFirstBlankSpace = false;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!encounteredFirstBlankSpace && s.charAt(i) == ' ')
                continue;
            if (!encounteredFirstBlankSpace && s.charAt(i) != ' ')
                encounteredFirstBlankSpace = true;
            if (encounteredFirstBlankSpace && s.charAt(i) == ' ')
                break;
            count++;
        }

        return count;

    }
}