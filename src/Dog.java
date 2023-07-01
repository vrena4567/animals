public class Dog implements Animal {
    String name;
    int age;
    String color;
    String trick;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog(String name, int age, String color, String trick) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.trick = trick;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", trick='" + trick + '\'' +
                '}';
    }
}
