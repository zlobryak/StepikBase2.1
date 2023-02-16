public class Main {

    public static void main(String[] args) {
        int year = 401;
        YearsCounter service = new YearsCounter();
        int leapYearCount = service.leapYearCount(year);
        System.out.println("________");
        System.out.println(leapYearCount);

    }
}
