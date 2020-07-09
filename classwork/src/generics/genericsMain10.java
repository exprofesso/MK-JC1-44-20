package generics;

public class genericsMain10 {
    public static void main(String[] args) {
        BoxGenericsNumber<Integer> box1 = new BoxGenericsNumber<>();
        BoxGenericsNumber<Integer> box2 = new BoxGenericsNumber<>();


        box1.setIter(10);
        box2.setIter(55);

        BoxGenericsNumber.copy(box1, box2);

    }
}
