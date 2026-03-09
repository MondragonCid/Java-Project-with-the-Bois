import java.util.*;

public class App{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Damn dawg, welcome to Rock Paper Scissors.");

        for (int i = 10; i <= 100; i+=10){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(" " + i + "%");
        }

        System.out.println("\nGame Ready!");

        System.out.println("\n-----------System------------");
        System.out.print("Choose your Character:\n[0]Seth\n[1]Seraph\n[2]Aurelius\n[3]Agnis\n[4]Verlierer\n[5]Fvyina\nChoose: ");
        int chooseCharacter = scanner.nextInt();
        scanner.nextLine();


        Player player = new Player(choose.getCharacter((chooseCharacter)));
        
        String[] map = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        
        int playerPos = 0;
        map[playerPos] = "P";

        while (true){
            for (int i = 0; i < map.length; i++){
                System.out.print(" " + map[i] + " ");
            }
            System.out.println();

            System.out.print("Enter command (a: left, d: right, q: quit): ");
            String command = scanner.nextLine();

            if (command.equals("a") && playerPos > 0){
                map[playerPos] = " ";   
                playerPos--;
            } else if (command.equals("d") && playerPos < map.length - 1){
                map[playerPos] = " ";   
                playerPos++;
            } else if (command.equals("q")){
                System.out.println("Game Over");
                break;
            } else {
                System.out.println("Invalid command. Please enter 'a', 'd', or 'q'.");
                continue;
            }
            
    }
}