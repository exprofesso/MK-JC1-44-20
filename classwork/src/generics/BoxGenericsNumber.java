package generics;

public class BoxGenericsNumber<Z extends Number> {
    private Z iter;

    public Z getIter() {
        return iter;
    }

    public void setIter(Z iter) {
        this.iter = iter;
    }



}
