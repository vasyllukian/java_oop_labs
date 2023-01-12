package org.example;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataAccessLayer {
    double step;
    double a;
    double b;
    double resultIntegral;

    public String Data() {
        JSONObject file = new JSONObject();

        file.put("Step", step);
        file.put("A (upper bound)", a);
        file.put("B (lower bound)", b);
        file.put("Result", resultIntegral);

        try (PrintWriter out = new PrintWriter(new FileWriter("result_integral.json"))) {
            out.write(file.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "" + file;
    }

}
