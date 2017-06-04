package com.aconsuegra.algorithms;

/**
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        char lastChar = 'I';
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
            case 'M':
                result += 1000;
                break;
            case 'D':
                result += 500;
                break;
            case 'C':
                result += (lastChar == 'M' || lastChar == 'D') ? -100 : 100;
                break;
            case 'L':
                result += 50;
                break;
            case 'X':
                result += (lastChar == 'C' || lastChar == 'L') ? -10 : 10;
                break;
            case 'V':
                result += 5;
                break;
            case 'I':
                result += (lastChar == 'X' || lastChar == 'V') ? -1 : 1;
                break;
            default:
                throw new IllegalStateException("Invalid roman number");
            }
            lastChar = s.charAt(i);
        }

        return result;
    }

}
