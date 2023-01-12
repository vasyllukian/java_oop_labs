package org.example;

public class ServiceLayer {

    double epsilon;
    double a;
    double b;

    public String MathModel(){
        DataAccessLayer dataAccessLayer = new DataAccessLayer();

        dataAccessLayer.resultIntegral = Integral();

        return dataAccessLayer.Data();
    }

    private double function(double x){
        return x;
    }

    public double Integral(){
        double h = Math.sqrt(Math.sqrt(epsilon));
        int n = (int) Math.round((b-a)/h);
        n += 4-(n%4);
        h = (b-a)/n;
        double sum = 0, sum2 = 0;
        double[] x = new double[n];
        for(int i = 0; i < n; i++){
            x[i] = a + i * h;
        }
        for(int i = 1; i < n; i++){
            if (i%2 == 1){
                sum += function(x[i]);
            }
            else {
                sum2 += function(x[i]);
            }

        }
        return h/3*(function(a)+function(b)+4*sum+2*(sum2));
    }
}
