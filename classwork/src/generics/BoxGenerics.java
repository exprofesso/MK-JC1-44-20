package generics;

public class BoxGenerics<T> {
    private T iter;

    public T getIter() {
        return iter;
    }

    public void setIter(T iter) {
        this.iter = iter;
    }
}
