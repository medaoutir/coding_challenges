package largestRectangle;

import java.util.Stack;

import static java.lang.Math.*;

public class LargestRectangle {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int current = 0;
        int storedArea = 0;
        int distance = 0;
        while(current < heights.length){
            while(stack.peek()!= - 1 && heights[current] < heights[stack.peek()]){
              int top = stack.peek();
              stack.pop();
              distance = current - stack.peek() - 1;
              int area = heights[top] * distance;
              int maxArea = max(storedArea, area);
              storedArea = maxArea;
            }
            if (stack.peek() == -1){
                distance = current + 1;
            }
            stack.push(current++);
        }
        return storedArea;
    }
}
