package chap06.iphonemake;

public class IPhone13 {

    private final String company;
    private final String modelName;
    private final int serialNumber;
    private final double screenSize;

    public IPhone13(String company, String modelName, int serialNumber, double screenSize) {
        this.company = company;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.screenSize = screenSize;
    }

    public String getCompany() {
        return company;
    }

    public String getModelName() {
        return modelName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public double getScreenSize() {
        return screenSize;
    }
}
