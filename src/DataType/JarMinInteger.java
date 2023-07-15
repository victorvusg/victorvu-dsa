package DataType;

/**
 * The type Jvm min integer.
 */
public class JarMinInteger {

    private int value;

    /**
     * Main.
     *
     * @param args the args
     */
    public void main (String[] args) {
    }

    /**
     * Instantiates a new Jvm min integer.
     *
     * @param value the value
     */
    public JarMinInteger(int value) {
        this.value = value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue (int value) {
        if (value > this.value) {
            this.value = value;
        }
    }

    /**
     * Gets value.
     *
     * @param value the value
     * @return the value
     */
    public int getValue (int value) {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
