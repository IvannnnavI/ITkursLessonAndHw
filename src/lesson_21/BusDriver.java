package lesson_21;

public class BusDriver {
    private String licenceNumber;
    private Autobus autobus;

    public BusDriver(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
