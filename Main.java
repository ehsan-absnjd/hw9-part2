package second;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(7,3,9,2,5,5,8,5,6,3,4,7, 8));
        correct(arrayList);
        for (int number : arrayList ) {
            System.out.print(number + " ");
        }

    }
    public static void correct(ArrayList<Integer> arrayList){
        int size =arrayList.size();
        if(size%2!=0) {
            arrayList.remove(size - 1);
            size-=1;
        }
        for (int i=size-2 ; i>=0; i-=2){
            if ( arrayList.get(i) > arrayList.get(i+1)){
                arrayList.remove(i);
                arrayList.remove(i);
            }
        }
    }
}
