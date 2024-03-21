//There are two n-element arrays of integers, A and B. 
//Permute them into some A' and B' such that the relation A'[i] +B'[i]>=k holds for all i where 0<=i<=n.

public class twosum {
    public static void main(String[] args) {
    int[] a={3,4,5,3,88,2};
    int[] b={5,85,65,77,25,19};

    int n=a.length;
    int k=232;
    boolean found=true;
    for(int i=0;i<n;i++){
            if(a[i]+b[i]<k){
                found=false;
                break;
        }
    }
    if (found==true){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
}