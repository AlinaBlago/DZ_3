package car;

public final class Audi extends AbstractCar {
    public enum Series{
        a1, a3, a4, a5, a6, a7, a8, e_tron,
        q2, q3, q5, q7, q8,
        r8, rs3, rs4, rs5, rs6, rs7,
        rs_q3, rs_q8,
        s1, s3, s4, s5, s6, s7, s8,
        sq2, sq5, sq7, sq8,
        tt, tt_rs, tts
    }

    private Series series;

    public Series getSeries() {
        return series;
    }

    protected void setSeries(Series series) {
        this.series = series;
    }

    public Audi(BodyType type, boolean isAutoTransmission, String engine, String driveUnit, Series series, int year) {
        super(type, isAutoTransmission, engine, driveUnit, year);
        this.setModel("AUDI");
        this.setSeries(series);
    }

    @Override
    public String toString() {
        return "AUDI: series - " + getSeries() + ", year - " + getYear() + ", bodyType - " + getType()
                + ", isAutoTRANSMISSION - " + getTransmission()
                + ", engine - " + getEngine() + ", driveUnit is " + getDriveUnit();
    }
}

