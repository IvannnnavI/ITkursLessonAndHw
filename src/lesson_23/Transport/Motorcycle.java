package lesson_23.Transport;

public class Motorcycle extends Vehicle{
    public Motorcycle(Engine engine) {
        super();
        this.setEngine(engine);
    }
    public String toString(){
        return "Motorcycle {id: " + getId()+ "; engine: " + getEngine()+ "}";
    }

    @Override
    public void startEngine() {
        if (getEngine() != null){
            getEngine().start();
        }
    }
}
