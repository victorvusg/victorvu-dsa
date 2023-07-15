package DataStructure.Linear.Static;

import Common.Constants;
import Common.SortOrder;

/**
 * The type Array class.
 */
public class ArrayClass extends BaseArrayClass implements ArrayInterface {
    /**
     * Instantiates a new Array class.
     *
     * @param length the length
     */
    public ArrayClass(int length) {
        this.value = new Object[length];
        this.length = length;
    }

    @Override
    public int findIndex(Object searchValue) {
        int foundIndex = -1;
        for (int i = 0; i <= this.length; i++) {
            if (this.value[i] == searchValue) {
                foundIndex = i;
            }
        }
        return foundIndex;
    }

    @Override
    public void set(int index, Object value) {
        try {
            this.value[index] = value;
        } catch (Exception e) {
            System.out.println(Constants.ANSI_RED + e.getMessage() + Constants.ANSI_RED);
        }
    }

    @Override
    public Object get (int index) {
        return this.value[index];
    }

    /**
     * Sort.
     *
     * @param sortOrder the sort order
     */
    public void sort (SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASC) {
        // Increase
        } else {
        // Decrease
        }
    }

    @Override
    public void push(Object value) {
        Object[] newArray = new Object[this.length + 1];
        System.arraycopy(this.value, 0, newArray, 0, this.length);
        newArray[length] = value;

        // Reassign value and length
        this.value = newArray;
        this.length++;
    }

    @Override
    public void pop() {
        Object[] newArray = new Object[this.length - 1];
        System.arraycopy(this.value, 0, newArray, 0, this.length - 1);

        // Reassign value and length
        this.value = newArray;
        this.length--;
    }

    @Override
    public Object insert(int index, Object value) {
        return null;
    }

    @Override
    public void merge(ArrayClass data) {
        Object[] newArray = new Object[this.length + data.length];

        System.arraycopy(this.value, 0, newArray, 0, this.length);

        System.arraycopy(data.value, 0, newArray, this.length, this.length + data.length);

        //
        this.value = newArray;
        this.length += data.length;
    }
}
