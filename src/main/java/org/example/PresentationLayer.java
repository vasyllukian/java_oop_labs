package org.example;

public class PresentationLayer {

    double step;
    double a;
    double b;

    public void getResult(){
        ServiceLayer serviceLayer = new ServiceLayer();

        serviceLayer.step = step;
        serviceLayer.a = a;
        serviceLayer.b = b;

        System.out.println("I = " + serviceLayer.MathModel());
    }

}
