public class BitVector {
    public static boolean isUniqueCharsWithArray(String str) {
        boolean[] alphabet_set = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if (alphabet_set[val])
                return false;
            alphabet_set[val] = true;
        }
        return true;
    }

    public static boolean isUniqueCharsWithBitVector(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String [] agrs) {
        System.out.println("abc : " + isUniqueCharsWithArray("abc"));
        System.out.println("aaa : " + isUniqueCharsWithArray("aaa"));
        System.out.println("abcdefboiu : " + isUniqueCharsWithArray("abcdefboiu"));
        System.out.println("abcdefzoiu : " + isUniqueCharsWithArray("abcdefzoiu"));

        System.out.println("abc : " + isUniqueCharsWithBitVector("abc"));
        System.out.println("aaa : " + isUniqueCharsWithBitVector("aaa"));
        System.out.println("abcdefboiu : " + isUniqueCharsWithBitVector("abcdefboiu"));
        System.out.println("abcdefzoiu : " + isUniqueCharsWithBitVector("abcdefzoiu"));
    }
}