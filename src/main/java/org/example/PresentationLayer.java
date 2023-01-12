package org.example;

public class PresentationLayer {

    double epsilon;
    double a;
    double b;

    public void getResult(){
        ServiceLayer serviceLayer = new ServiceLayer();

        serviceLayer.epsilon = epsilon;
        serviceLayer.a = a;
        serviceLayer.b = b;

        System.out.println("I = " + serviceLayer.MathModel());
    }

}
