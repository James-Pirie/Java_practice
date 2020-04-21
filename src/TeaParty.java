import javax.swing.*;
import java.util.Scanner;

public class TeaParty {
    public static void main(String[] args){
        boolean askAgain = true;
        int[] number_of_tea_types = {0, 0, 0, 0, 0, 0};
        String[] list_of_tea_types = {"G", "C", "E", "P", "L", "S"};
        System.out.println("Type done when done");
        StringBuilder total_output = new StringBuilder();
        while (askAgain) {
            Scanner teaInput = new Scanner(System.in);
            String teaInputStr = teaInput.nextLine();
            System.out.println(teaInputStr);
            if(teaInputStr.equals("done"))
                askAgain = false;
            else
                total_output.append(teaInputStr).append(";");

        }
        String[] total_output_list = total_output.toString().split(";");


        for(int i = 0; i < total_output_list.length; i ++){
            for(int x = 0; x < list_of_tea_types.length; x ++){
                if(total_output_list[i].split(" ")[0].equals(list_of_tea_types[x])){
                    int number_of_tea_item = Integer.parseInt(total_output_list[i].split(" ")[1]);
                    number_of_tea_types[x] += number_of_tea_item;
                }
            }
        }
        for (int i = 0; i < list_of_tea_types.length; i ++) {
            System.out.println(list_of_tea_types[i] + " " + number_of_tea_types[i]);
        }
    }
}
