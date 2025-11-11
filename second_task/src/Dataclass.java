


public class Dataclass {
    private int day, month, year, total;

    Dataclass(int day, int month, int year){
        if(day!=0 ){
        this.day = day;}
        else {
            this.day = 1;
        }
        if (month!=0 ){
        this.month = month;}
        else {
            this.month = 1;
        }
        this.year = year;
        this.total = day+month*30+year*365;
    }
    String Compare(Dataclass a){
        if (this.total>a.total){
            return "Current date bigger";
        }
        if (this.total<a.total){
            return "Current date less";
        }
        return "Dates same";
    }
    int StartDays(){
        return this.month*30+this.day;
    }
    int DaysToEnd(){
        return 365-this.month*30-this.day;
    }
    int DaysDifference(Dataclass a){
        return Math.abs(this.total-a.total);
    }
    Dataclass SetNewDate(int days){
        int newT = this.total+days;
        return new Dataclass(newT%365%30, newT%365/30 ,newT/365);
    }
    String GetData(){
        return this.day+"."+this.month+"."+this.year;


    }



}
