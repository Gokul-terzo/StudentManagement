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

    }
