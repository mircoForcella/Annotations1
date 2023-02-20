public class Car {
    private String modelName;
    private int mileage;

    public Car(String modelName, int mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Deprecated
    public String printCarDetails(){
        return  modelName + " "+ mileage;
    }

    public void getCarDetails() {
        System.out.println("Car Details:");
        System.out.println("  Model Name: " + modelName);
        System.out.println("  Mileage: " + mileage);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

