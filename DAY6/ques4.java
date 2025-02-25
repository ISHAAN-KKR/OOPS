class Time {
    private int hour, minute, second;

    // Constructor to initialize time
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to add two Time objects
    public void add(Time other) {
        int totalSeconds = this.second + other.second;
        int totalMinutes = this.minute + other.minute + (totalSeconds / 60);
        int totalHours = this.hour + other.hour + (totalMinutes / 60);

        totalSeconds %= 60;
        totalMinutes %= 60;
        totalHours %= 24; // To keep time within 24 hours

        System.out.println("Added Time: " + totalHours + "h " + totalMinutes + "m " + totalSeconds + "s");
    }

    public static void main(String[] args) {
        // Creating time objects
        Time time1 = new Time(10, 45, 30);
        Time time2 = new Time(2, 20, 40);

        // Adding time objects
        time1.add(time2);
    }
}
