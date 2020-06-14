package car;

public abstract class AbstractCar {
    public enum BodyType{
        Hatchback("Hatchback"),
        Sedan("Sedan"),
        MUV("MUV"),
        SUV("SUV"),
        Coupe("Coupe"),
        Convertible("Convertible"),
        Wagon("Wagon"),
        Van("Van"),
        Jeep("Jeep");

        BodyType(String type) {
        }
    }

    private static long nextId = 1;
    private long id;
    private String model; //  марка
    private BodyType type; // тип кузова
    private boolean autoTransmission; // коробка передач
    private String engine; // двигатель
    private String driveUnit; //привод
    private int year;

    AbstractCar(BodyType type, boolean isAutoTransmission, String engine, String driveUnit, int year){
        this.setId();
        this.setType(type);
        this.setTransmission(isAutoTransmission);
        this.setEngine(engine);
        this.setDriveUnit(driveUnit);
        this.setYear(year);
    }

    public long getId() {
        return id;
    }

    protected void setId() {
        this.id = nextId++;
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    public BodyType getType() {
        return type;
    }

    protected void setType(BodyType type) {
        this.type = type;
    }

    public boolean getTransmission() {
        return autoTransmission;
    }

    protected void setTransmission(boolean transmission) {
        this.autoTransmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    protected void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    protected void setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
