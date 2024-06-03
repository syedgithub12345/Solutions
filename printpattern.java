// Print the following Pattern and get the OutPut?
// N=5
// Output
// 1
// 3*2
// 4*5*6
// 10*9*8*7
// 11*12*13*14*15
public class printpattern{
    public static void main(String[] args) {
        int N=5;
        int num=1;
        for(int i=0;i<N;i++){
            if(i%2==0){
                for(int j=0;j<=i;j++){
                    if(i==j){
                        System.out.println(num);
                    }else{
                        System.out.println(num+"*");
                    }num++;
                }
            }else{
                int temp=num+1;
                for(int k=0;k<=i;k++){
                    if(i==k){
                        System.out.println(temp);
                    }
                    else{
                        System.out.println(temp+"*");
                    }temp--;
                    num++;
                }
            }
            System.out.println();
        }
    }
}