package iniciante;

import java.io.*;

public class Eco3 {
    public static void main(String[] args) {
	BufferedReader	inReader;
        inReader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = 0;
        try {
            while(N<12) {
                System.out.printf("vai ter copa");
            }
            
            inReader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
