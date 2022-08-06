import java.sql.SQLOutput;
import java.util.Scanner;



    public class Bot {

    private static final String[] COMMANDS = new String[]{
            "/help", "/start", "/end", "/getLocation"
    };
    private  static final String[] RESULTS = new String[]{
            "", "Bot started!...", "Bot ended", "location is Moscow"
    };

    public static void bot(String[] args){
        Scanner scanner = new Scanner(System.in);

        String commands = "commands available for this bot \n";
        for (String command: COMMANDS){
            commands += command + "\n";
        }
        RESULTS[0] = commands;

        String input;
        boolean found;
        while (!(input = scanner.nextLine()).equals(COMMANDS[2])) {
            found = false;
            for (int i = 0; i < COMMANDS.length; i++){
                if (COMMANDS[i].equals(input)){
                    print(RESULTS[i]);
                    found = true;
                    break;
                }
            }
            if (!found){
                print("no command found. Try typing " + COMMANDS[0]);
            }
        }
    }

    private static void print (Object object){
        System.out.println(object);
    }
}
