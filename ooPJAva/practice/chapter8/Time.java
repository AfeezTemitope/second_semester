public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour/minute/seconds out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String... args) {
        Time time = new Time();
        displayTime("After time is created", time);
        System.out.println();

        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);
    }

    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %02d:%02d:%02d%n",
                header, t.toUniversalString(), t.hour, t.minute, t.second);
    }
}
