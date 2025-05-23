class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int outs = 0;
        int roman[] = new int[128];
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        for (int i = 0; i + 1 < length; ++i) {
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) {
                outs -= roman[s.charAt(i)];
            } else {
                outs += roman[s.charAt(i)];
            }
        }
        return outs + roman[s.charAt(length - 1)];
    }
}