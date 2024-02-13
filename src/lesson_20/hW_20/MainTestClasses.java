package lesson_20.hW_20;

public class MainTestClasses {
    public static void main(String[] args) {
        // Тест игровых персонажей
        GameCharacter warrior = new Warrior("Боромир", 100,50);
        GameCharacter mage = new Mage("Гендальф", 80,120);
        System.out.println("Игровые персонажи до апгрейда:");
        System.out.println(warrior.info());
        System.out.println(mage.info());
        warrior.setStrength(110);
        ((Mage)mage).setMagicPower(130);
        System.out.println("Игровые персонажи после апгрейда:");
        System.out.println(warrior.info());
        System.out.println(mage.info());
        System.out.println("===============================================>\n");

        // Тестирование пылесосов
        VacuumCleaner vacuumCleaner = new VacuumCleaner(1200,"циклонный фильтр");
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner(200,"контейнер",2);
        WashingVacuumCleaner washingVacuumCleaner = new WashingVacuumCleaner(1500,"водяной фильтр",1);
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
