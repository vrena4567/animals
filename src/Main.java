import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        List<String> listOfDogs = FileReader.fileReader("res/dog.txt");
        for (var line : listOfDogs) {
            String[] lineAsArray = line.split(",");
            String name =lineAsArray[0];
            int age = Integer.parseInt(lineAsArray[1]);
            String color = lineAsArray[2];
            Dog doggo =new Dog(name, age, color);
            dogList.add(doggo);
        }
        System.out.println(dogList.toString());

        List<Chicken> chickenList = new ArrayList<>();
        List<String> listOfChickens = FileReader.fileReader("res/chicken.txt");
        for (var line : listOfChickens) {
            String[] lineAsArray = line.split(",");
            int eggPerSec = Integer.parseInt(lineAsArray[0]);
            double weight = Double.parseDouble(lineAsArray[1]);
            Chicken chick = new Chicken(eggPerSec, weight);
            chickenList.add(chick);
        }
        System.out.println(chickenList.toString());

        List<Animal> animalList = new ArrayList<>();
        List<String> listOfAnimals = FileReader.fileReader("res/vegyes.txt");
        for (var line : listOfAnimals) {
            String[] lineAsArray = line.split(",");
            if(lineAsArray[0].equals("csirke")) {
                int eggPerSec = Integer.parseInt(lineAsArray[1]);
                double weight = Double.parseDouble(lineAsArray[2]);
                Chicken chick = new Chicken(eggPerSec, weight);
                animalList.add(chick);
            } else if(lineAsArray[0].equals("kutya")) {
                String name =lineAsArray[1];
                int age = Integer.parseInt(lineAsArray[2]);
                String color = lineAsArray[3];
                Dog doggo =new Dog(name, age, color);
                animalList.add(doggo);
            }
        }
        System.out.println(animalList);
    }
}
