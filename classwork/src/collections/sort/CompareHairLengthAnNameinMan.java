package collections.sort;

import obj.core.Man;

import java.util.Comparator;

public class CompareHairLengthAnNameinMan implements Comparator<Man> {
    @Override
    public int compare(Man o1, Man o2) {
        int diffName = o1.getName().compareTo(o2.getName());
        if(diffName != 0){
            return diffName;
        }
        return o1.getHairLergth() - o2.getHairLergth();
    }
}

