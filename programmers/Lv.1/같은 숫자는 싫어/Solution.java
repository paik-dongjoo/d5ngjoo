package CodingTest.StudyCT.ct1003;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int isCheck = 10;
        for (int num : arr) {
            if(num != isCheck){
                list.add(num);
                isCheck = num;
            }
        }

        int[] answer = new int[list.size()];
        int answerI=0;

        for (int num : list){
            answer[answerI] = num;
            answerI++;
        }

        return answer;

    }

//    public int[] solution(int []arr) {
//
//        boolean[] isCheck = new boolean[arr.length];
//        int count = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] == arr[i-1]){
//                isCheck[i] = true;
//            }
//        }
//        for (int i = 0; i < isCheck.length; i++) {
//            if(isCheck[i] == false){
//                count++;
//            }
//        }
//
//        int[] answer = new int[count];
//        int ansCnt = 0;
//        for (int i = 0; i < isCheck.length; i++) {
//            if(isCheck[i] == false){
//                answer[ansCnt] = arr[i];
//                ansCnt++;
//            }
//        }
//
//        return answer;
//
//    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};

        int[] answer = sol.solution(arr);
        int[] answer2 = sol.solution(arr2);
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}
