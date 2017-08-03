package Algorithms;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-03.
 */
public class PrzeliczanieSystemow extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Przeliczanie systemow";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int L = Integer.parseInt(input[1]);
        int P = Integer.parseInt(input[2]);

        Stack<Integer> st = new Stack<>();

        while (L > 0) {
            st.push(L % P);
            L = Math.floorDiv(L, P);

            }
            while(!st.empty()){
                System.out.println(st.pop());
            }

        }
    }

