public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.
        Duck duck = new Duck(20.3,2,"уткаДаг");
        Dog dog = new Dog(10.3,5,"Рекс");

        dog.move();
        duck.move();

        dog.walk();
        duck.walk();
    }
}
