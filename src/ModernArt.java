import java.util.Scanner;

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

        for (int i = 1; i < height_int; i ++) {
            for (int x = 1; x < width_int; x++) {
                if (i == y_location && x == x_location)
                    System.out.println("yo mama");

                else
                    canvas_gird[x][i] = 0;
                System.out.println(canvas_gird[x][i]);
            }
        }


    }
}
