package org.example;

public class Main {
    public static void main(String[] args) {
        PresentationLayer presentationLayer = new PresentationLayer();
        presentationLayer.step = 0.1;
        presentationLayer.a = 0;
        presentationLayer.b = 5;
        presentationLayer.getResult();
    }
}