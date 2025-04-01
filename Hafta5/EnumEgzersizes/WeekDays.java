package Hafta5.EnumEgzersizes;

public enum WeekDays {
    PAZARTESI(9, 5),

    SALI(4, 12),

    CARSAMBA(8, 4),

    PERSEMBE(4, 12),

    CUMA(16, 0),

    CUMARTESI(9,5),

    PAZAR(7,3);

    private final double start;
    private final double finish;



    WeekDays(double start, double finish) {
    this.start = start;
    this.finish = finish;
    }

    public double getStart() {
        return start;
    }

    public double getFinish() {
        return finish;
    }
}