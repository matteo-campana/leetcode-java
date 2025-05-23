class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[strs.length - 1].length() - 1 < i)
                break;
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
                sb.append(strs[0].charAt(i));
            else
                break;
        }

        return sb.toString();
    }
}