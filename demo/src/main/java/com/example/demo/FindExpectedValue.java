package com.example.demo;

import java.util.ArrayList;

public class FindExpectedValue implements DataOperation{
    @Override
    public void execute(DataState dataState) {
        ArrayList<Glass> glasses = dataState.getGlasses();
        int n = glasses.size();
        double[] expectVal = new double[11];
        for (Glass glass : glasses) {
            expectVal[0] += glass.getId();
            expectVal[1] += glass.getRI();
            expectVal[2] += glass.getNa();
            expectVal[3] += glass.getMg();
            expectVal[4] += glass.getAl();
            expectVal[5] += glass.getSi();
            expectVal[6] += glass.getK();
            expectVal[7] += glass.getCa();
            expectVal[8] += glass.getBa();
            expectVal[9] += glass.getFe();
        }
        for (int i = 0; i < expectVal.length; i++) {
            expectVal[i] = expectVal[i]/n;
        }
        dataState.setExpectValue(expectVal);
    }
}
