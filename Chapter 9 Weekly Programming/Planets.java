import java.util.Scanner;

public class Planets {

    public enum Planet {
        MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a planet name: ");
        String planetName = input.nextLine().toUpperCase();
        try {
            Planet planet = Planet.valueOf(planetName);
            System.out.println(planet + " is planet number " + (planet.ordinal() + 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid planet name.");
        }
        input.close();
    }
}
