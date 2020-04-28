import java.util.Scanner;
import java.util.StringJoiner;

public class ModernArt {
    public static void main(String[] args){
        Scanner width = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
        String width_str = width.nextLine();
        String height_str = height.nextLine();
        int  width_int = Integer.parseInt(width_str);
        int height_int = Integer.parseInt(height_str);
        int[][] canvas_gird = new int[width_int][height_int];
        Scanner coords_spread_colour = new Scanner(System.in);
        String coords_spread_colour_str = coords_spread_colour.nextLine();
        String[] coords_spread_colour_str_split = coords_spread_colour_str.split(" ");
        int x_location = Integer.parseInt(coords_spread_colour_str_split[0]);
        int y_location = Integer.parseInt(coords_spread_colour_str_split[1]);
        int spread = Integer.parseInt(coords_spread_colour_str_split[2]);
        // coords_spread_colour_str_split[3] is the colour code
        System.out.println(x_location);
        System.out.println(y_location);

        for (int y = 0; y < height_int; y ++) {
            for (int x = 0; x < width_int; x++) {
                if (y == y_location - 1 && x == x_location - 1) {
                    canvas_gird[x][y] = 1;


                }

                else
                    canvas_gird[x][y] = 0;
            }

        }
        int number_of_sides_in_a_square = 4;
        Integer initial_spread = spread;
        for (int i = 0; i < spread; i ++){
            for (int x = 0; x < initial_spread; x ++){
                int range_of_spread = initial_spread/2 - 1;
                for (int z = 0;z < number_of_sides_in_a_square; z ++)
                    if (z == 0)
                        canvas_gird[][]
                    else if (z == 1)
                        System.out.println();
                    else if (z == 2)
                        System.out.println();
                    else if (z == 3)
                        System.out.println();
            }
        }

        for (int[] row : canvas_gird) {
            StringJoiner sj = new StringJoiner(" | ");
            for (int col : row) {
                sj.add(String.format("%2d", col));
            }
            System.out.println(sj.toString());
        }
    }
}
