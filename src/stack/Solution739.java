package stack;

import java.util.Stack;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {

            for (int j = i+1; j <temperatures.length ; j++) {
                if (temperatures[j] > temperatures[i]){
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }
    //单调栈
    public int[] dailyTemperature(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            while(!stack.empty() || temperatures[i] > temperatures[stack.peek()]){
                Integer preIndex = stack.pop();
                ans[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
