public class CatRunner {
    public static void main(String[] args){

        Cat cat1 = new Cat("Bob",7, 16.0, "black");
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("John", 1, 3.2, "white");
        cat2.introduce();
        cat2.printCatInfo();
    }
}
