package trappingRainWater;


import java.util.Stack;

import static java.lang.Math.*;

public class TrappingRainWater {

    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        int area = 0;
        while (current < height.length){
            while (!stack.isEmpty() && height[current] > height[stack.peek()]){
                int top = stack.peek();
                stack.pop();
                if (stack.isEmpty())
                    break;
                int dist = current - stack.peek() - 1;
                int bounded_height = min(height[current], height[stack.peek()]) - height[top];
                area += bounded_height * dist;
            }
            stack.push(current++);
        }
        return area;
    }


}
