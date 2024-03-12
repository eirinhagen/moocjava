package TelevisionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        while (true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(name,duration));
        }

        System.out.println("Program maximum duration?");
        int userDuration = Integer.parseInt(scanner.nextLine());
        for(TelevisionProgram program : programs){
            if (program.getDuration() <= userDuration){
                System.out.println(program);
            }
        }
    }
}
