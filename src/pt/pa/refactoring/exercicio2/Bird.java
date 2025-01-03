package pt.pa.refactoring.exercicio2;

public class Bird {
    private Animal animal;
    public Bird() {
        this.animal = new Animal();
    }
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat() {
        animal.eat();
    }
}
