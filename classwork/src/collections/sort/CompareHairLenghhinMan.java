package collections.sort;

import obj.core.Man;

import java.util.Comparator;

public class CompareHairLenghhinMan implements Comparator<Man> {


    public int compare (Man o1, Man o2){
        return o2.compareTo(o1);
    }



}
