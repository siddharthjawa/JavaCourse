import java.io.*;

     class MinsToHours{
    static void ConvertMins(int n){

    int years, days;
        years=n/525600;
        days=n/3600;
        System.out.println("Years =" +years);
        System.out.println("Days = " +days);

    }

    public static void main(String[] args) {
        int n= 3456789;
        ConvertMins(n);
    }
}
