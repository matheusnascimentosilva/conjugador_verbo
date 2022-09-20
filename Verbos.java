import java.io.*;
import java.util.Scanner;

public class Verbos {

    String nome;
    String one = "ar";
    String two = "er";
    String thr = "ir";

    public static void Buscador(String path,String verbo) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linha = "";
        int cont = 0;
        while(true){
            if(linha != null){
                System.out.println("Consultando>>>>>"+"linha:"+cont+"verificada");
                cont++;
            }else{
                System.out.println("Erro ao abrir o arquivo!");
                break;
            }
            linha = br.readLine();

            if(linha.equalsIgnoreCase(verbo)){
                System.out.println("Esse verbo existe!");
                System.out.println("Encontrado na linha:"+cont);
                break;
            }
        }
        br.close();
    }
    public static void escritor(String path, String verbo) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva o verbo:");
        linha = in.nextLine();
        bw.append(linha+"\n");
        bw.close();
    }

    public static void verificador(String path ,String verbo) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linha = "";
        String[] terminacoes = {"ar","er","ir"};


        if(verbo.endsWith("ar")){

            System.out.println("Presente:");
            System.out.println("Eu:");
            System.out.println("Tu:");
            System.out.println("Ele:");
            System.out.println("Nós:");
            System.out.println("Vós:");
            System.out.println("Eles:");

            System.out.println("Passado:");
            System.out.println("Eu:");
            System.out.println("Tu:");
            System.out.println("Ele:");
            System.out.println("Nós:");
            System.out.println("Vós:");
            System.out.println("Eles:");

            System.out.println("Futuro:");
            System.out.println("Eu:");
            System.out.println("Tu:");
            System.out.println("Ele:");
            System.out.println("Nós:");
            System.out.println("Vós:");
            System.out.println("Eles:");
        }

    }


}
