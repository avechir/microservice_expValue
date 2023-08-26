package com.example.demo;

public class Glass {
    private final int id;
    private final double RI;
    private final double Na;
    private final double Mg;
    private final double Al;
    private final double Si;
    private final double K;
    private final double Ca;
    private final double Ba;
    private final double Fe;
    private String type;

    public Glass(int id, double RI, double Na, double Mg, double Al, double Si,
                 double K, double Ca, double Ba, double Fe, String type){
        this.id = id;
        this.RI = RI;
        this.Na = Na;
        this.Mg = Mg;
        this.Al = Al;
        this.Si = Si;
        this.K = K;
        this.Ca = Ca;
        this.Ba = Ba;
        this.Fe = Fe;
        this.type = type;
    }
    @Override
    public String toString(){
        return String.format("Id number: %s, refractive index: %s, Sodium: %s, " +
                        "Magnesium: %s, Aluminum: %s, Silicon: %s, Potassium: %s, Calcium: %s," +
                        "Barium: %s, Iron: %s, Type of glass: %s ",
            id, RI, Na, Mg, Al, Si, K, Ca, Ba, Fe, type);
    }

    public int getId() {
        return id;
    }
    public double getRI() {
        return RI;
    }
    public double getNa() {
        return Na;
    }
    public double getMg() {
        return Mg;
    }
    public double getAl() {
        return Al;
    }
    public double getSi() {
        return Si;
    }
    public double getK() {
        return K;
    }
    public double getCa() {
        return Ca;
    }
    public double getBa() {
        return Ba;
    }
    public double getFe() {
        return Fe;
    }
    public String getType() {
        return type;
    }
    public void setType(int n) {
        type = Integer.toString(n);
    }

}
