package com.epam.mjc;

import java.util.LinkedList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> oper = list -> {
            List<Integer> res = new LinkedList<>();
            for (Integer i : list) {
                i = i / divider;
                res.add(i);
            }
            return res;
        };
        return oper;
    }
}
