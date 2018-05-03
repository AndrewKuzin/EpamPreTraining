public class DateCheck {
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MART = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;
    public static final int LAEP1 = 4;
    public static final int LAEP2 = 100;
    public static final int LAEP3 = 400;


    public static String nextDay(String date) {
        int day = Integer.parseInt(date.substring(0, date.indexOf(".")));
        int month = Integer.parseInt(date.substring(date.indexOf(".") + 1, date.lastIndexOf(".")));
        int year = Integer.parseInt(date.substring(date.lastIndexOf(".") + 1));


        if (day <= 0 || month <= 0 || month > 12 || (day > 28 && month == FEBRUARY && checkLeap(year) == false) ||
                day > 31 || (day == 31 && (month == APRIL || month == JUNE
                || month == SEPTEMBER || month == NOVEMBER))) {
            return "wrong input";
        } else if (day < 28) {
            day++;
        } else if (day == 28) {
            if (month == FEBRUARY && checkLeap(year) == false) {
                day = 1;
                month++;
            } else if (month == FEBRUARY) {
                day++;
            }
        } else if (day == 29 && month == FEBRUARY) {
            day = 1;
            month++;
        } else if (day < 31) {
            day++;
        } else if (month == FEBRUARY) {
            day = 1;
            month = 1;
            year++;
        } else {
            day = 1;
            month++;
        }

        return "next day is: " + day + "." + month + "." + year;
    }


    private static boolean checkLeap(int year) {
        if ((year % LAEP1 == 0 && year % LAEP2 != 0) || year % LAEP3 == 0) {
            return true;
        } else return false;

    }
}
