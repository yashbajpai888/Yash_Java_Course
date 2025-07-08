//package FileHandling;
//
//import java.io.BufferedWriter;
//public class BufferedWriter56 {
//	public static void main(String[] args) {
//		BufferedWriter b=new BufferedWriter("C:\\Users\\Yash\\Desktop\\a.txt");
//		try
//		{
//			b.BufferedWriter();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//}

/* */
//package FileHandling;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//
//public class BufferedWriter56 {
//    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("C:\\Users\\Yash\\Desktop\\buffered.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("Buffered Writer Example");
//            bw.newLine();
//            bw.write("Second Line");
//
//            bw.close(); // Also closes the FileWriter internally
//            System.out.println("Data written using BufferedWriter.");
//        } catch (Exception e) {
//            System.out.println("Exception Handled");
//        }
//    }
//}
