package Lectures.Lecture_04;

import java.util.Arrays;
import java.util.Stack;


public class Example_02 {
    public static void main(String[] args) {
        var exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(exp);

        Stack<Integer> stack = new Stack<>();
        for (String s : exp)
//            if (isDigit(s)) {
//                stack.push(Integer.parseInt(s));
//            } else {
                switch (s) {
                    case "+":
                        res = stack.pop() + stack.pop();
                        stack.push(res);
                        break;
                    case "-":
                        res = -stack.pop() + stack.pop();
                        stack.push(res);
                        break;
                    case "*":
                        res = stack.pop() * stack.pop();
                        stack.push(res);
                        break;
                    case "/":
                        res = stack.pop() / stack.pop();
                        stack.push(res);
                        break;
                    default:
                        break;
                }
//            }
//        }
        System.out.printf("%d\n", stack.pop());
    }
}

