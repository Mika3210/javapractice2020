package ru.Mika3210.javapractice2020.pr15;

public class ArrayList_2<T> {
    private final int max = 8;
    private final int min = 2;
    private Object[] obj = new Object[max];
    private int count = 0;

    public void add(T key) {
        if(count == obj.length-1)
            resize(obj.length*2);
        obj[count++] = key;
    }

    public T get(int index) {
        return (T) obj[index];
    }

    public void remove(int index) {
        for (int i = index; i<count; i++)
            obj[i] = obj[i+1];
        obj[count] = null;
        count--;
        if (obj.length > max && count < obj.length / min)
            resize(obj.length/2);
    }

    public int size() {
        return count;
    }

    private void resize(int newLength) {
        Object[] obj2 = new Object[newLength];
        System.arraycopy(obj, 0, obj2, 0, count);
        obj = obj2;
    }
}