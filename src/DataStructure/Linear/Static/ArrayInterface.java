package DataStructure.Linear.Static;

public interface ArrayInterface {
    public default void traverse() {

    }
    public int findIndex(Object searchValue);

    public void set(int index, Object value);

    public Object get(int index);

    public void push(Object value);

    public void pop();

    public Object insert(int index, Object value);

    public void merge(ArrayClass value);
}
