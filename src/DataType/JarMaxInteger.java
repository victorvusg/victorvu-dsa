package DataType;

/**
 * The type Jvm max integer.
 */
public class JarMaxInteger {

    private int value;

    /**
     * Main.
     *
     * @param args the args
     */
    public void main(String[] args) {

    }

    /**
     * Instantiates a new Jvm max integer.
     *
     * @param value the value
     */
    public JarMaxInteger(int value) {
        this.value = value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(int value) {
        if (value < this.value) {
            this.value = value;
        }
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
