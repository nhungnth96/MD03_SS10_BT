package BT12;
public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList() {
    }
    public MyList(int capacity) {
        this.elements = new Object[capacity];
        this.size = 0;
    }
    public void add(int index, E item) {
        add(index,item);
    }
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E removedElement = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        return removedElement;
    }
    public int size() {
        return size;
    }
    public MyList<E> clone() {
        MyList<E> cloneList = new MyList<>();
        cloneList.size = this.size;
        System.arraycopy(this.elements, 0, cloneList.elements, 0, this.size);
        return cloneList;
    }
    public boolean contains(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return true;
        return false;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return i;
        return -1;
    }
    public boolean add(E e){
        if (size == elements.length) {
            ensureCapacity(10);
        }
        elements[size++] = e;
        return true;
    };
    public  void ensureCapacity(int minCapacity){
        if (elements.length < minCapacity) {
            Object[] newElements = new Object[minCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }
    public void clear(){
            elements = (E[])new Object[DEFAULT_CAPACITY];
            size = 0;
    }
}



