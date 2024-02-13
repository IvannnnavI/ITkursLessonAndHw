package lesson_19;

public class FinalDemo {
    public static final double PI = 3.149615;
    private final int x;
    private final int [] ints;

    public FinalDemo(int x) {
        this.x = x;
        ints = new int[10];
      //  this.x = 15;  изменить значение Final int  нельзя.
    }
    public void setX(int newValue){
        //this.x = newValue;изменить значение Final int  нельзя.

    }
    //public void newSeizeArray(int size);
  //  ints = new int[size];
    public void setNewValue(){
        for (int i = 0; i < ints.length ; i++) {
            ints[i] = i*10;

        }
    }
    public void printArray(){
        System.out.println("[");
        for (int i = 0; i < ints.length ; i++) {
            System.out.print(ints[i] + ((i< ints.length - 1)? "," :"]\n"));
        }

    }
}
