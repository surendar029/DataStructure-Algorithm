package String.Basics;

public class TimeConversion {
    public static void main(String[] args) {
        String s="07:05:45PM";
        String[] parts = s.substring(0,8).split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2]);
        boolean isPM=false;
        if(s.endsWith("PM")) isPM=true;

        if(isPM && hour!=12) hour+=12;
        if(!isPM && hour==12) hour=0;
        String result=String.format("%02d:%02d:%02d",hour,minute,second);
        System.out.println(result);

    }
}
