public class Duck extends Animal{
    public void move(){
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках");
    }

    public Duck(Double weight, Integer age, String name) {
        super(weight, age, name);
    }

    public Duck() {
    }
}