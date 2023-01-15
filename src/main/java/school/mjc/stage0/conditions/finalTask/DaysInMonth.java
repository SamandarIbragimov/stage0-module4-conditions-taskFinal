package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {

    //function to find out leap year
    public boolean isLeap(int year){
        if((year % 4 ==0) && (year % 100 !=0) || (year % 400 ==0))
            return true;
        else
            return false;
    }
    public void printDays(int year, int month) {

        if(year > 0 && month > 0){
            if (month == 2)
                System.out.println(isLeap(year)? 29: 28);
            else {
                switch (month){
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(30);
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(31);
                        break;
                    default: System.out.println("invalid date");
                }
            }
        }
        else
            System.out.println("invalid date");
    }
}
