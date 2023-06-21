package BT12;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    void add(int index, E element){
        if (index<0||index>size){
            throw new  IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }else {
            if (size==elements.length){
                // tăng kích thước mảng lên
                Object[] newElements = new Object[size+1];
                for (int i = 0; i < elements.length; i++) {
                    newElements[i] = elements[i];
                }
                elements = newElements;
            }
            for (int i = elements.length-1; i >=0; i--) {
                if(i>index){
                    elements[i] = elements[i-1];
                }
                if (i==index){
                    elements[i] = element;
                }
            }
            size++;
        }
    }
    E remove(int index){
        if (index<0||index>size){
            throw new  IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }else {
            Object temp = elements[index];
            for (int i = 0; i < elements.length-1; i++) {
                if(i>=index){
                    elements[i] = elements[i+1];
                }
            }
            elements[elements.length-1]=null;
            size--;
            return (E) temp;
        }
    }
    int size(){
        return size;
    }

    Object cloneList(){
        return elements;
    }
    boolean contains(E e){
        for (Object o : elements) {
            if(o !=null && o.equals(e)){
                return true;
            }
        }
        return  false;
    }
    int indexOf(E o){
        for (int i = 0; i < elements.length-1; i++) {
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    boolean add(E e){
        if (size==elements.length){
            // tăng kích thước mảng lên
            Object[] newElements = new Object[size+1];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        // thêm vàocuối
        elements[size] = e;
        size++;
        return true;
    }
    void ensureCapacity(int minCapacity){
        if (minCapacity > elements.length){
            Object[] newElements = new Object[minCapacity];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }
    E get(int index){
        if (index<0||index>size){
            throw new  IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        for (int i = 0; i < elements.length-1; i++) {
            if(i==index){
                return (E) elements[i];
            }
        }
        return null;
    }
    void clear(){
        elements = new Object[0];
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
