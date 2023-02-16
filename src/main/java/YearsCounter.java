public class YearsCounter {
    public static int leapYearCount(int year) {
        int counter = 0;
        for (double i = 1; i <= year; i++) {
            if ((i / 4) % 1 == 0) {

                if ((i / 100) % 1 != 0) {
                    counter++;
                }
                if ((i / 400) % 1 == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}