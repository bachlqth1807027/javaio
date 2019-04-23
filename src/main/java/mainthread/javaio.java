package mainthread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class javaio {

    public static void main(String[] args) throws IOException {
        String connection = "https://www.w3schools.com/js/json_demo_array.txt";
        URL url = new URL(connection);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();

    }
}
