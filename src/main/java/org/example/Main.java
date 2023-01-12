package org.example;

public class Main {
    public static void main(String[] args) {
        PresentationLayer presentationLayer = new PresentationLayer();
        presentationLayer.epsilon = 0.01;
        presentationLayer.a = 0;
        presentationLayer.b = 1;
        presentationLayer.getResult();
    }
}