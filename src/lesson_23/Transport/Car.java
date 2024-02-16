package lesson_23.Transport;

public class Car extends Vehicle{
 //   public Car() {
   //     super();
   // }
    public Car(Engine engine) {
        super();
        this.setEngine(engine);
    }
    public String toString(){
        return "Car {id: " + getId()+ "; engine: " + getEngine()+ "}";
    }

    @Override
    public void startEngine() {
        if (getEngine() != null){
            getEngine().start();
        }
    }
}
