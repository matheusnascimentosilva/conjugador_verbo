import java.io.IOException;
import java.util.Scanner;

public class Main extends Verbos {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Roger\\IdeaProjects\\verbose\\src\\verbos.txt";
        Scanner in = new Scanner(System.in);
        String verbo;
        System.out.println("Digite o Verbo:");
        verbo = in.nextLine();

        Buscador(path,verbo);

    }
}