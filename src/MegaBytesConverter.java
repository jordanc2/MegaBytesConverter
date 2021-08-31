public class MegaBytesConverter {



        //int kiloBytes = 0;

        public static void printMegaBytesAndKiloBytes(int kiloBytes){

            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            if (remainingKiloBytes < 0){
                System.out.println("Invalid Value");
            }
            System.out.println(kiloBytes + " = " + megaBytes + " MB and " + remainingKiloBytes + " KB");

        }

        public static void main(String[] args) {

            printMegaBytesAndKiloBytes(2500);
            printMegaBytesAndKiloBytes(3500);
            printMegaBytesAndKiloBytes(1024);
        }

}
