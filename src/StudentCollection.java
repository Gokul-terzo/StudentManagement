import java.util.Iterator;

public class StudentCollection <T> implements Iterable<T>{
    private T[] items=(T[]) new Object[100];
        private int count;


    public void setItems(T items) {
            this.items[count++]=items;
        }
        public T getItems(int index) {
            return items[index];
        }

    @Override
    public Iterator<T> iterator() {
        return new IterableClass(this);
    }
    private class IterableClass implements Iterator<T>{
        private StudentCollection<T> list;
        private int count;
        public IterableClass(StudentCollection<T> list){
            this.list=list;
        }
        @Override
        public boolean hasNext() {
            return count<list.count;
        }

        @Override
        public T next() {
            return list.items[count++];
        }
    }
}
