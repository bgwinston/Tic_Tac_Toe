import java.util.Scanner;

public class main {

    public static void main(String [] args) {

        char[] pos = {' ',' ',' ',' ',' ',' ',' ',' ', ' '};
        Scanner scanner=new Scanner(System.in);
        int input;
        char turn = 'x';
        while(true) {
            do {
                System.out.println("Enter a position: ");
                input = scanner.nextInt();
            }while(pos[input-1]=='x' || pos[input-1]=='o');
            pos[input - 1] = turn;

            System.out.println("  " + pos[6] + " |  " + pos[7] + " |  " + pos[8] + " ");
            System.out.println("----+----+----");
            System.out.println("  " + pos[3] + " |  " + pos[4] + " |   " + pos[5] + " ");
            System.out.println("----+----+----");
            System.out.println("  " + pos[0] + " |  " + pos[1] + " |   " + pos[2] + " ");

            if (turn== 'x') {
                turn = 'o';
            }
            else if (turn=='o'){
                turn='x';
            }

        }
    }
}
