//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//java

// class romantoint {
//     public int romanToInt(String s) {
//         int result = 0;
//         int prevValue = 0;

//         for (int i = s.length() - 1; i >= 0; i--) {
//             char c = s.charAt(i);
//             int curValue = 0;

//             switch (c) {
//                 case 'I':
//                     curValue = 1;
//                     break;
//                 case 'V':
//                     curValue = 5;
//                     break;
//                 case 'X':
//                     curValue = 10;
//                     break;
//                 case 'L':
//                     curValue = 50;
//                     break;
//                 case 'C':
//                     curValue = 100;
//                     break;
//                 case 'D':
//                     curValue = 500;
//                     break;
//                 case 'M':
//                     curValue = 1000;
//                     break;
//             }

//             if (curValue < prevValue) {
//                 result -= curValue;
//             } else {
//                 result += curValue;
//             }

//             prevValue = curValue;
//         }

//         return result;
//     }
// }

// import java.util.*;
// public class romantoint{
//     public int RomanToInt(String s){
//         Map<Character,Integer> map=new HashMap<>();
//         map.put('I',1);
//         map.put('V', 5);
//         map.put('X', 10);
//         map.put('L', 50);
//         map.put('C', 100);
//         map.put('D', 500);
//         map.put('M', 1000);
//         int result=0;
//         int prev=0;

//         for(int i=s.length()-1;i>=0;i++){
//             int curr=map.get(s.charAt(i));
//             if(curr<prev){
//                 result-=curr;
//             }
//             else{
//                 result+=curr;
//             }prev=curr;
//         }return result;
//     }
//     public static void main(String[] args) {
//         romantoint solution=new romantoint();
//         String rom="MCMXCIV";
//         System.out.println(solution.RomanToInt(rom));
//     }
// }

import java.util.*;

public class romantoint {
    public int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        romantoint sol = new romantoint();
        String romanNumeral = "MIV";
        System.out.println("Integer value of " + romanNumeral + " is: " + sol.romanToInt(romanNumeral));
    }
}
