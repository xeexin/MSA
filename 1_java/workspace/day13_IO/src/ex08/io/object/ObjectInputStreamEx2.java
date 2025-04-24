//package ex08.io.object;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
//
//public class ObjectInputStreamEx2 {
//	public static void main(String[] args) throws Exception {
//
//		InputStream is = new FileInputStream("grade.dat");
//		ObjectInputStream ois = new ObjectInputStream(is);
//
//		Grade dto = (Grade) ois.readObject();
//		ois.close();
//
//	}
//
//}
