import java.util.*;
public class topkfrequent {
    public static void main(String[] args) {
        int[] arr=new int[] {0,0,1,2,2,2,3};
        int k=2;
        Arrays.sort(arr);
        ArrayList <Integer> arr1=new ArrayList<>();
        for(int i: arr){
            if(!arr1.contains(i)){
                arr1.add(i);
            }
        }
        for(int j=0;j<k;j++){
            System.out.println(arr1.get(j));
        }
    }
}
