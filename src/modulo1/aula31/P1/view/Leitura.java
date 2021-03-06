package modulo1.aula31.P1.view;

import java.io.*;

public class Leitura {
    public static void main(String[] args) {
        //java.io

        // criando o fluxo de entrada atraves de um arquivo
        try {
            FileInputStream fis = new FileInputStream("P1/dados/pratos.txt");
            //System.out.println(fis.read());
            InputStreamReader isr = new InputStreamReader(fis);
            // char[] dados = new char[5];
            // isr.read(dados, 0, 5);
            // System.out.println(dados);
            BufferedReader br = new BufferedReader(isr);

            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();

            System.out.println("Arquivo aberto com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        } catch(IOException e){
            System.out.println("Nao foi possivel ler o arquivo");
        }
    }
}
