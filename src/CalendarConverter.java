public class CalendarConverter {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public CalendarConverter() {
    }

    public static String convertDayToString(int dayNumber) {

        String dayString;

        switch (dayNumber) {
            case MONDAY:
                dayString = "Poniedziałek";
                break;
            case TUESDAY:
                dayString = "Wtorek";
                break;
            case WEDNESDAY:
                dayString = "Sroda";
                break;
            case THURSDAY:
                dayString = "Czwartek";
                break;
            case FRIDAY:
                dayString = "Piątek";
            case SATURDAY:
                dayString = "Sobota";
                break;
            default:
                dayString = "Niedziela";
        }
        return dayString;
    }
}
