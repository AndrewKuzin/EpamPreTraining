public class BCDAndSCM {
    public static String getDCSAndSCM(int a, int b) {
        int biggestCommonDivider = 1, smallestCommonMult = 1, biggestNumber = 0;
        if (a == 0 || b == 0) {
            return "wrong input";
        } else if (a > b) {
            if (a % b == 0) {
                biggestCommonDivider = b;
                smallestCommonMult = a;
            } else {
                biggestNumber = a;
            }
        } else if (b % a == 0) {
            biggestCommonDivider = a;
            smallestCommonMult = b;
        } else {
            biggestNumber = b;
        }
        int i = biggestNumber / 2;
        while (i > 1) {
            if (a % i == 0 && b % i == 0) {
                biggestCommonDivider = i;
                break;
            } else {
                biggestCommonDivider = 1;
                i--;
            }
        }
        i = biggestNumber + 1;
        while (i < a * b - 1) {
            if (i % a == 0 && i % b == 0) {
                smallestCommonMult = i;
                break;
            } else {
                smallestCommonMult = a * b;
                i++;
            }
        }
        return "biggestCommonDivider = " + biggestCommonDivider + " smallestCommonMult = " + smallestCommonMult;
    }
}
