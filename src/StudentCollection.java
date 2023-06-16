import java.util.Arrays;
import java.util.Iterator;

public class StudentCollection <T>{
    private T[] items=(T[]) new Object[100];
        private int count;

    public int getCount() {
        return count;
    }

    public void setItems(T items) {
            this.items[count++]=items;
        }
        public T getItems(int index) {
            return items[index];
        }
    public Iterator<T> iterator() {
        return new InterableClass(this);
    }
    private class InterableClass implements Iterator<T>{
        private StudentCollection<T> list;
        private int count;
        public InterableClass(StudentCollection<T> list)
        {
            this.list=list;
        }
        public boolean hasNext(){
            return count< list.count;
        }
        public T next(){
            return list.items[count++];
        }
    }
    }
