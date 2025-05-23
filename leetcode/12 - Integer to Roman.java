class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int thousands = num / 1000;
        int hundreds = num % 1000 / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;

        sb.append("M".repeat(thousands));

        if (hundreds < 4)
            sb.append("C".repeat(hundreds));
        else if (hundreds == 4)
            sb.append("CD");
        else if (hundreds == 5)
            sb.append("D");
        else if (hundreds > 5 && hundreds < 9)
            sb.append("D" + "C".repeat(hundreds - 5));
        else if (hundreds == 9)
            sb.append("CM");

        if (tens < 4)
            sb.append("X".repeat(tens));
        else if (tens == 4)
            sb.append("XL");
        else if (tens == 5)
            sb.append("L");
        else if (tens > 5 && tens < 9)
            sb.append("L" + "X".repeat(tens - 5));
        else if (tens == 9)
            sb.append("XC");

        if (ones < 4)
            sb.append("I".repeat(ones));
        else if (ones == 4)
            sb.append("IV");
        else if (ones == 5)
            sb.append("V");
        else if (ones > 5 && ones < 9)
            sb.append("V" + "I".repeat(ones - 5));
        else if (ones == 9)
            sb.append("IX");

        return sb.toString();
    }
}