import java.util.Scanner;

public class LevelThree {
    public static void main(String[] args){
        int year=0,month=0,date=0,hour=0,minute=0,second=0;
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int sum=0;
        while (num!=sum){
            second++;
            if(second==60)
                minute++;
            if(minute==60)
                hour++;
            if(hour==24)
                date++;
            if(month==4||month==6||month==9||month==11){
                if(date==30)
                    month++;
            }
            else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                if(date==31)
                    month++;
            }
            if((year+1970)%4==0&&month==2){
                if(date==29)
                    month++;
            }
            else if((year+1970)%4!=0&&month==2){
                if(date==28)
                    month++;
            }
            if(month==12)
                year++;
            if((year+1970)%4!=0){
                if(month==4||month==6||month==9||month==11)
                sum=year*365*24*3600+month*30*24*3600+date*24*3600+hour*3600+minute*60+second;
            }
            else if()
        }

        /*second=num%60;
        minute=num/60%60;
        hour=num/3600%24;
        date=num/3600/24
        year=num/60/60/24/365;*/

        //System.out.println(year+1970+"-"+month+1+"-"+date+1+"-"+hour+"-"+minute+"-"+second);




    }
}
