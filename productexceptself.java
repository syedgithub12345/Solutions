class productexceptself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}



//work in progress

// public class productexceptself {
//     public int[] productexceptselfno(int[] nums){
//         int leftnums[]=new int[nums.length];
//         int rightnums[]=new int[nums.length];

//         leftnums[0]=nums[0];
//         for(int i=1;i<nums.length;i++){
//             leftnums[i]=leftnums[i-1]*leftnums[i];
//         }
//         rightnums[nums.length-1]=nums[nums.length-1];
//         for(int i=nums.length-1;i>=0;i--){
//             leftnums[i]=leftnums[i]*leftnums[i+1];
//         }
//         int[] output=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             if(i==0){
//                 output[i]=rightnums[i+1];
//             }
//             else if(i==nums.length-1){
//                 output[i]=leftnums[i-1];
//             }
//             else{
//                 output[i]=leftnums[i-1]*rightnums[i+1];
//             }
//         }return output;
//     }
// }
