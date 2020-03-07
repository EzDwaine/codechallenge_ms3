package com.mycompany.app;

import com.opencsv.bean.CsvBindByName;

public class Columns {
    @CsvBindByName
    private String A;
    @CsvBindByName
    private String B;
    @CsvBindByName
    private String C;
    @CsvBindByName
    private String D;
    @CsvBindByName
    private String E;
    @CsvBindByName
    private String F;
    @CsvBindByName
    private String G;
    @CsvBindByName
    private String H;
    @CsvBindByName
    private String I;
    @CsvBindByName
    private String J;

    public String getA(){
        return A;
    }
    public void setA(String A) {
        this.A = A;
    }

    public String getB(){
        return B;
    }
    public void setB(String B) {
        this.B = B;
    }

    public String getC(){
        return C;
    }
    public void setC(String C) {
        this.C = C;
    }

    public String getD(){
        return D;
    }
    public void setD(String D) {
        this.D = D;
    }

    public String getE() {
        return E;
    }
    public void setE(String E) {
        this.E = E;
    }

    public String getF(){
        return F;
    }
    public void setF(String F) {
        this.F = F;
    }

    public String getG(){
        return G;
    }
    public void setG(String G) {
        this.G = G;
    }

    public String getH(){
        return H;
    }
    public void setH(String H) {
        this.H = H;
    }

    public String getI(){
        return I;
    }
    public void setI(String I) {
        this.I = I;
    }

    public String getJ(){
        return J;
    }
    public void setJ(String J) {
        this.J = J;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
            builder.append(A).append(" | ")
                    .append(B).append(" | ")
                    .append(C).append(" | ")
                    .append(D).append(" | ")
                    .append(E).append(" | ")
                    .append(F).append(" | ")
                    .append(G).append(" | ")
                    .append(I).append(" | ")
                    .append(J).append(" | ");

        return builder.toString();
    }
}
