/**
 * Created by jihun on 2018. 5. 21..
 */

import java.util.ArrayList;

public class MyArrayList<E> {
    private int size = 0;
    private Object[] elementData;

    public MyArrayList() {
        elementData = new Object[10];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    private void ensureCapacity() {
        if(size == elementData.length) {
            Object[] newElementData = new Object[size*2];
            System.arraycopy(elementData, 0, newElementData, 0, size);
            this.elementData = newElementData;
        }
    }

    public boolean add(E element) {
        ensureCapacity();
        elementData[size++] = element;

        return true;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i=0; i<size; i++) {
            str += elementData[i];
            if (i < size-1)
                str += ", ";
        }
        str += "]";

        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("word1");
        words.add("word2");
        words.add("word4");
        words.add(2, "word3");

        System.out.println(words);

        MyArrayList<String> my_words = new MyArrayList<String>(1);
        for (int i=0; i<100; i++) {
            my_words.add("word" + i);
        }

        System.out.println(my_words);
    }
}
