package car;

public final class BMW extends AbstractCar {
    public enum Series{
        series3,
        series5,
        series7,
        series8,
        x1,x2,x3,x4,x5,x6,x7,
        z4,
        m2,m5,m760,mz4,m8,x7m
    }

    private boolean isGt;
    private Series series;

    public boolean isGt() {
        return isGt;
    }

    public Series getSeries() {
        return series;
    }

    protected void setGt(boolean gt) {
        isGt = gt;
    }

    protected void setSeries(Series series) {
        this.series = series;
    }

    public BMW(BodyType type, boolean isAutoTransmission, String engine, String driveUnit, Series series, boolean isGt, int year){
        super(type , isAutoTransmission , engine , driveUnit, year);
        this.setModel("BMW");
        this.setGt(isGt);
        this.setSeries(series);
    }

    @Override
    public String toString() {
        return "BWM: series - " + getSeries() + ", year - " + getYear() + ", bodyType - " + getType()
                + ", isAutoTRANSMISSION - " + getTransmission()
                + ", engine - " + getEngine() + ", driveUnit is " + getDriveUnit();
    }
}


