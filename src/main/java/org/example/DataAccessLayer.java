package org.example;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataAccessLayer {
    double epsilon;
    double a;
    double b;
    double resultIntegral;

    public String Data() {
        JSONObject file = new JSONObject();

        file.put("Epsilon", epsilon);
        file.put("A", a);
        file.put("B", b);
        file.put("Result", resultIntegral);

        try (PrintWriter out = new PrintWriter(new FileWriter("data.json"))) {
            out.write(file.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "" + file;
    }

}
