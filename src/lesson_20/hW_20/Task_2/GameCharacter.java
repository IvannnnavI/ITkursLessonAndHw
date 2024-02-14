package lesson_20.hW_20.Task_2;

import lesson_21.hw_21.Inventory;

public class GameCharacter {
    private String name;
    private int strength;
    private Inventory inventory;

    public GameCharacter(String name, int strength,int inventoryCapacity) {
        this.name = name;
        this.strength = strength;
        this.inventory = new Inventory (inventoryCapacity);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String attack(){
        return name + " атакует с силой " + strength;
    }
    public String info() {
        StringBuilder info = new StringBuilder ("Персонаж: " + name + ", Cила атаки: " + strength + ". Инвентарь: ");
        if (inventory.getCount() > 0) {
            for (int i = 0; i <inventory.getCount() ; i++) {
                info.append(inventory.getItem(i).getName());
                if (i < inventory.getCount() -1){
                    info.append(", ");
                }
            }
        }else {
            info.append("пуст");
        }
        return info.toString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }



}
