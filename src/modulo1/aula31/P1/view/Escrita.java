package modulo1.aula31.P1.view;

import java.io.*;

public class Escrita {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("P1/dados/molhos.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Sugo\n");
            bw.write("Branco\n");
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o arquivo");
        } catch (IOException e) {
            System.out.println("Nao foi possivel escrever no arquivo");
        }
    }
}
