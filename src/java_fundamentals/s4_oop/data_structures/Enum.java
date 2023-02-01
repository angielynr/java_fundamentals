package java_fundamentals.s4_oop.data_structures;

public class Enum {
    public static void main(String[] args) {
        whichSeason(EnumMonth.April);
    }

    public static void whichSeason(EnumMonth month){

        switch (month){
            case December:
            case January:
            case February:
                System.out.println(month + " is in the winter season\n");
                break;
            case March:
            case April:
            case May:
                System.out.println(month + " is in the spring season\n");
                break;
            case June:
            case July:
            case August:
                System.out.println(month + " is in the summer season\n");
                break;
            case September:
            case October:
            case November:
                System.out.println(month + " is in the autumn season\n");
                break;
        }
    }
}
