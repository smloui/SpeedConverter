public class SpeedConverter {


    public static long toMilesPerHour(double kiloMetersPerHour) {

        if(kiloMetersPerHour < 0){
            return -1;
        }else{
            return Math.round(kiloMetersPerHour / 1.609);
        }
    }


    public static void printConversion(double kilometersPerHour){
        long milesPerHour =0;

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h= "+milesPerHour + " mi/h");
        }


    }

    //end of class
}
