import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }
        static long inicio;
        static String nome = "Danielle Hall";

        static final String path = "D:/MATHEUS//Documents/Ciencias_da_computacao/CPED/BuscaTXTsemThread/src/";

        public static String ler_arquivo(String pattern, String fileName) {
            try {

                Scanner scan = new Scanner(new File(fileName));
                int numeroLinha = 1;

                while(scan.hasNextLine()){
                    String linha = scan.nextLine();

                    if(linha.toUpperCase().contains(pattern.toUpperCase())){
                        System.out.println(fileName + " - " + numeroLinha + " - " + linha);

                    }
                    numeroLinha++;

                }


                scan.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "texto não encontrado";

        }

        public static void run() {
            inicio = System.currentTimeMillis();
            ler_arquivo(nome, path+"a1.txt");
            ler_arquivo(nome, path+"a2.txt");
            ler_arquivo(nome, path+"a3.txt");
            ler_arquivo(nome, path+"a4.txt");
            ler_arquivo(nome, path+"a5.txt");
            ler_arquivo(nome, path+"a6.txt");
            ler_arquivo(nome, path+"a7.txt");
            ler_arquivo(nome, path+"arq_1.txt");
            ler_arquivo(nome, path+"arq_2.txt");
            ler_arquivo(nome, path+"arq_3.txt");
            ler_arquivo(nome, path+"arq_4.txt");
            ler_arquivo(nome, path+"arq_5.txt");
            long fim = System.currentTimeMillis();
            long total = fim - inicio;
            System.out.println("Tempo Total: "+total);
        }}
