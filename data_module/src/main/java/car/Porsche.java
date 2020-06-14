package car;

public final class Porsche extends AbstractCar {
    public enum Series{
       cayman, boxster, carrera, turbo, taycan, panamera, macan, cayenne
    }

    private boolean isGibrid;
    private Series series;

    public boolean isGibrid() {
        return isGibrid;
    }

    public void setGibrid(boolean gibrid) {
        isGibrid = gibrid;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Porsche(BodyType type, boolean isAutoTransmission, String engine, String driveUnit, Series series, int year, boolean gibrid) {
        super(type, isAutoTransmission, engine, driveUnit, year);
        this.setModel("Porsche");
        this.setSeries(series);
        this.setGibrid(gibrid);
    }

    @Override
    public String toString() {
        return "Porsche: series - " + getSeries() + ", year - " + getYear() + ", bodyType - " + getType()
                + ", isAutoTRANSMISSION - " + getTransmission()
                + ", engine - " + getEngine() + ", driveUnit is " + getDriveUnit()
                + ", isGibrid " + isGibrid;
    }
}
