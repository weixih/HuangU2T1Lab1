// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;
    private String color;

    // constructor
    public Cat(String catName, int catAge, double catWeight, String catColor) {
        name = catName;
        age = catAge;
        weight = catWeight;
        color = catColor;

    }

    // method that introduces the Cat
    public void introduce() {
        if(age < 7) {
            System.out.println("Hello my name is " + name + " and I am a younger cat");
        } else {
            System.out.println("Hello my name is " + name + " and I am an older cat");
        }
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Color: "+ color);

    }
}



