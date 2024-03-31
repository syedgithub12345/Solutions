// //************************************/
//in progress

// //insertion in heap
// import java.util.*;
// public class heap {
//     public void insert(int[] arr, int n, int value) {
//         n = n + 1;
//         arr[n] = value;
//         int i = n;
//         while (i > 1) {
//             int parent = i / 2;
//             if (arr[parent] < arr[i]) {
//                 int var;
//                 var = arr[parent];
//                 arr[parent] = arr[i];
//                 arr[i] = var;
//                 i = parent;
//             }
//             //System.out.println(Arrays.toString(arr));
//             else{
//                 return;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 60, 50, 40, 45 };
//         int n = arr.length - 1;
//         int value = 70;
//         heap hp = new heap();
//         hp.insert(arr, n, value);
//     }
// }

// //********************************************/
// //deletion in heap
// import java.util.*;
// public class heap{
//     public void delete(int[] arr,int n){
//         arr[1]=arr[n];
//         n=n-1;
//         int i=1;
//         while(i<n){
//             int left=arr[2*i];
//             int right=arr[2*i+1];
//             int larger=left>right?2*i:2*i+1;

//             if(arr[i]<arr[larger]){
//                 int temp=arr[i];
//                 arr[i]=arr[larger];
//                 arr[larger]=temp;
//                 i=larger;
//                 System.out.println(Arrays.toString(arr));
//             }else{
//                 return;
//             }
//         }System.out.println(Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         heap hp=new heap();
//         int[] arr={30,20,10,15};
//         int n=arr.length-1;
//         hp.delete(arr,n);
//     }
// }

// //*************************/
// //max heap
// import java.util.*;
// public class heap{
//     public void  heapify(int[] a, int n,int i){
//         int largest=i;
//         int l=2*i;
//         int r=2*i+1;
//         if(l<=n && a[l]>a[largest]){
//             largest=l;
//         }
//         if(r<=n && a[r]>a[largest]){
//             largest=r;
//         }
//         if(largest!=i){
//             //swap(a,i,largest);
//             //heapify(a,n,largest);
//         }
//     }
// }


// //****************************/
// //priority queue
// // BY DEFAULT, IT FORMS MAX HEAP IN JAVA
// import java.util.*;
// public class heap{
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq=new PriorityQueue<>();
//         //PriorityQueue<Intger> pq1=new PriorityQueue<>(Collections.reverseOrder());
//         pq.add(3);
//         pq.add(5);
//         pq.add(10);
//         System.out.println(pq);
//         while(!pq.isEmpty()){
//             System.out.println(pq.peek());
//             pq.poll();
//         }
//     }
// }

// //*********************************/
// import java.util.*;
// public class heap{
//     public void klargest(int[] arr,int k){
//         PriorityQueue<Integer> pq=new PriorityQueue<>();
//         for(int i=0;i<k;k++){
//             pq.add(arr[i]);
//         }for(int i=k;i<arr.length;i++){
//             if(pq.peek()<arr[i]){
//                 pq.pop();
//                 pq.add(arr[i]);
//             }
//         }return pq.peek();
//     }
// }