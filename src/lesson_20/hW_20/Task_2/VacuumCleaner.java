package lesson_20.hW_20.Task_2;

import lesson_21.hw_21.Filter;

public class VacuumCleaner {
    private int power;
    private String dustCollectionType;
    private Filter filter;
    public VacuumCleaner(int power, String dustCollectionType,String filterType) {
        this.power = power;
        this.dustCollectionType = dustCollectionType;
        this.filter =new Filter(filterType);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDustCollectionType() {
        return dustCollectionType;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void setDustCollectionType(String dustCollectionType) {
        this.dustCollectionType = dustCollectionType;
    }
    public String info() {
        return "Пылесос мощностью " + power + " Вт , тип сбора пыли: " + dustCollectionType + " ; Тип фильтра: " + filter.getType();
    }

}
