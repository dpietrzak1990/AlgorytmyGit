package Algorithms;

import java.util.InputMismatchException;
import java.util.Stack;

/**
 * Created by RENT on 2017-08-03.
 */
public class ONP extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Odwrotna notacja polska";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer> s = new Stack<>();
        Integer v1 = 0;
        Integer v2 = 0;

        for(int i = 1; i < input.length; i++) {
            switch(input[i]) {
                case "D":
                    v1=s.pop();
                    v2=s.pop();
                    s.push(v1+v2);
                    break;
                case "O":
                    v1 = s.pop();
                    v2= s.pop();
                    s.push(v1-v2);
                    break;
                case "M":
                    v1 = s.pop();
                    v2 = s.pop();
                    s.push(v1*v2);
                    break;
                case "I":
                    v1 = s.pop();
                    v2 = s.pop();
                    s.push(v1/v2);
                    break;
                case "R":
                    System.out.println(s.pop());
                    break;
                default:
                    s.push(Integer.parseInt(input[i]));
            }
        }
    }
}
