
//import java.io.PrintStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Server {
//    static public int OneTimePassword(){
//        Random num= new Random();
//        int otp = num.nextInt(5000);
//        otp=otp+5000;
//        return otp;
//    }
//
//    public static boolean main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int otpEntered;
//int otp=OneTimePassword();boolean correct=false;
//
//        try {
//            System.out.println("SENDING OTP...PLEASE WAIT...\n");
//            ServerSocket ss= new ServerSocket(3478);
//            Socket Soc= ss.accept();;
//            System.out.println("OTP SEND SUCCESSFULLY\n\nPLEASE ENTER THE SENT OTP:");
//
//            PrintStream ps= new PrintStream(Soc.getOutputStream());
//            ps.print(otp);
//
//            Soc.close();
//            ss.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        otpEntered=sc.nextInt();
//        if(otp==otpEntered)
//            correct=true;
//        return correct;
//    }
//
