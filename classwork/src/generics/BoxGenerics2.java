package generics;

public class BoxGenerics2<T, Z, M, V > {
    private T item;
    private Z item2;
    private M item3;
    private V item4;


    public T getIter() {
        return item;
    }

    public void setIter(T iter) {
        this.item = item;
    }
    public Z getIter2() {
        return item2;
    }

    public void setIter2(Z iter2) {
        this.item2 = item2;
    }
    public M getIter3() {
        return item3;
    }

    public void setIter3(M iter3) {
        this.item3 = item3;
    }
    public V getIter4() {
        return item4;
    }

    public void setIter4(V iter4) {
        this.item4 = item4;
    }

}
