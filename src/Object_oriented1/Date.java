package Object_oriented1;

public class Date {
    private int day, month, year;
    Date(int i, int j, int k){
        day = i;
        month = j;
        year = k;
    }
    Date(){
        day = 1;
        month = 1;
        year = 1998;
    }
    Date(Date d){
        day = d.day;
        month = d.month;
        year = d.year;
    }
    public Date tommorrow(){
        Date d = new Date(this);
        d.day++;
        if(d.day > dayInMonth()){
            d.day = 1;
            d.month++;
            if(d.month > 12){
                d.month = 1;
            }
        }
        return d;
    }
    public int dayInMonth(){
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        }
        return 1;
    }
    public static void main(String [] args){
        Date d1 = new Date(31, 12, 2000);
        d1.dayInMonth();
    }
}
