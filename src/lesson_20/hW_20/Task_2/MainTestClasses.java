package lesson_20.hW_20.Task_2;

import lesson_21.hw_21.Item;

public class MainTestClasses {
    public static void main(String[] args) {
        // Тест игровых персонажей
        GameCharacter warior = new Warrior("Боромир",150, 20,100);
        GameCharacter mage = new Mage("Гендальф", 80,30,120);
        System.out.println("Игровые персонажи до апгрейда:");
        System.out.println(warior.info());
        System.out.println(mage.info());
        warior.setStrength(110);
        ((Mage)mage).setMagicPower(130);
        warior.getInventory().addItem(new Item("Кольцо Всевластия"));
        mage.getInventory().addItem(new Item("Белый посох"));
        System.out.println("Игровые персонажи после апгрейда:");
        System.out.println(warior.info());
        System.out.println(mage.info());
        System.out.println("===============================================>\n");

        // Тестирование пылесосов
        VacuumCleaner vacuumCleaner = new VacuumCleaner(1200,"циклонный фильтр","HEPA");
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner(200,"контейнер","HEPA2",3);
        WashingVacuumCleaner washingVacuumCleaner = new WashingVacuumCleaner(1500,"Контейнер с водой","водный",3);
        System.out.println("Пылесосы:");
        System.out.println(vacuumCleaner.info());
        System.out.println(robotVacuumCleaner.info());
        System.out.println(washingVacuumCleaner.info());
        vacuumCleaner.setPower(1300);
        robotVacuumCleaner.setBatteryLife(3);
        washingVacuumCleaner.setWaterTankVolume(4);
        System.out.println("Пылесоса после кастомизации: ");
        System.out.println(vacuumCleaner.info());
        System.out.println(robotVacuumCleaner.info());
        System.out.println(washingVacuumCleaner.info());

    }
}
