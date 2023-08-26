package com.example.demo;

import java.util.ArrayList;

public class DataState {
    private ArrayList<Glass> glasses;
    private String filename;
    private double[] expectValue;
    private double[] dispersion;

    public void setDispersion(double[] dispersion) {
        this.dispersion = dispersion;
    }

    public double[] getExpectValue() {
        return expectValue;
    }

    public void setExpectValue(double[] expectValue) {
        this.expectValue = expectValue;
    }

    public DataState(String filename) {
        this.filename = filename;
    }

    public ArrayList<Glass> getGlasses() {
        return glasses;
    }

    public void setGlasses(ArrayList<Glass> glasses) {
        this.glasses = glasses;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String printExpectedValue() {
        String resultText = String.format("\nМатематичне очікування Id: %s," +
                "\nМатематичне очікування RI: %s, \nМатематичне очікування Na: %s," +
                "\nМатематичне очікування Mg: %s, \nМатематичне очікування Al: %s," +
                "\nМатематичне очікування Si: %s, \nМатематичне очікування K: %s," +
                "\nМатематичне очікування Ca: %s, \nМатематичне очікування Ba: %s," +
                "\nМатематичне очікування Fe: %s \n",
                this.expectValue[0], this.expectValue[1], this.expectValue[2], this.expectValue[3],
                this.expectValue[4], this.expectValue[5],
                this.expectValue[6], this.expectValue[7], this.expectValue[8], this.expectValue[9]);
        return resultText;
    }

    public void printDispersion() {
        System.out.printf("\nДисперсія Id: %s," +
                        "\nДисперсія RI: %s, \nДисперсія Na: %s," +
                        "\nДисперсія Mg: %s, \nДисперсія Al: %s," +
                        "\nДисперсія Si: %s, \nДисперсія K: %s," +
                        "\nДисперсія Ca: %s, \nДисперсія Ba: %s," +
                        "\nДисперсія Fe: %s \n",
                this.dispersion[0], this.dispersion[1], this.dispersion[2], this.dispersion[3],
                this.dispersion[4], this.dispersion[5],
                this.dispersion[6], this.dispersion[7], this.dispersion[8], this.dispersion[9]);
    }
}
