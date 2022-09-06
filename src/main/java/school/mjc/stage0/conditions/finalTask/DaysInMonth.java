package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (month){
            case 1:
            case 12:
            case 7:
            case 8:
            case 10:
            case 3:
            case 5:
                System.out.println(31);
                break;
            case 2:
                if (year%400==0 ||year%400==2 ||year%400==4 ||year%400==6 || year%400==8){
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println("invalid date");
        }


    }
}
