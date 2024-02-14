package lesson_21.hw_21;

public class Inventory {
    private Item[] items;
    private int capasity;
    private int count;

    public Inventory(int capasity) {
        this.capasity = capasity;
        this.items = new Item[capasity];
        this.count = 0;
    }
    public boolean addItem(Item item) {
        if (count < capasity) {
            items[count] = item;
            count++;
            return true;
        }else {
            return false;
        }
    }
    public Item getItem(int index){
        if (index >= 0 && index < count)
        {
            return items[index];
        } else {
            return null;
        }
    }
    public int getCount () {
        return count;
    }
}
