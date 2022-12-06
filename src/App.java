
    import java.util.Scanner;

    public class App {
        public static void main(String[] args) throws Exception {
            Scanner ler = new Scanner(System.in);
    
            System.out.println("Digite o número inteiro: ");
            int número = ler.nextInt();
            reverso(número);
            ler.close();
        }
    
        public static void reverso(int número) {
            int número2 = 0;
    
            while (número > 0) {
                número2 *= 10;
                número2 += (número % 10);
                número /= 10;
            }
            System.out.println("O número invertido é: " + número2);
        }
    }