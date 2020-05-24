//修改01
package day001.inputstream01;
/**
 * 读写二进制文件mp3/JPG
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fis = new FileInputStream("C:\\CloudMusic\\music.mp3");
			dis = new DataInputStream(fis);
			fos = new FileOutputStream("D:\\wpp/music.mp3");
			dos = new DataOutputStream(fos);
			int length=fis.available();
			byte[] b=new byte[length];
			dis.read(b);
			dos.write(b);
//			int b;
//			while((b=dis.read())!=-1) {
//				dos.write(b);	
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
