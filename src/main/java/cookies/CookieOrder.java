package cookies;

public class CookieOrder {

    private int numBoxes;
    private Object variety;

    public CookieOrder(String localVariety, int localNumBoxes) {
        this.numBoxes = localNumBoxes;
        this.variety = localVariety;
    }

    public int getNumBoxes() {
        return numBoxes;
    }

    public Object getVariety() {
        return this.variety;
    }
}
