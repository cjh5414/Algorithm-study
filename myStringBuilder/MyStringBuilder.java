import java.util.ArrayList;
import java.util.Arrays;

class MyStringBuilder {
    int size = 0;
    char[] value;

    public MyStringBuilder(String string) {
        value = new char[string.length() + 16];
        string.getChars(0, string.length(), value, 0);
        size = string.length();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public void append(String string) {
        int oldSize = size;
        size = oldSize + string.length();
        if(size > value.length)
            value = Arrays.copyOf(value, value.length * 2);
        string.getChars(0, string.length(), value, oldSize);
    }

    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;

        String string = new String("abc");
        StringBuilder stringBuilder = new StringBuilder("abc");
        MyStringBuilder myStringBuilder = new MyStringBuilder("abc");

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            string += "abc" + i;
        }
        endTime = System.nanoTime();

        System.out.println("String 실행 시간          : " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            stringBuilder.append("abc");
        }
        endTime = System.nanoTime();

        System.out.println("StringBuilder 실행 시간   : " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            myStringBuilder.append("abc");
        }
        endTime = System.nanoTime();

        System.out.println("MyStringBuilder 실행 시간 : " + (endTime - startTime));
    }
}