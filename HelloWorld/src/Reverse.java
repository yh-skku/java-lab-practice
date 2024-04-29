import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Reverse {
	public static void main(String[] args) throws IOException{
		InputStream fis = new FileInputStream("input.txt");
		FileOutputStream fos = new FileOutputStream("output.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		ArrayList<String> text = new ArrayList<>();
		
		String data;
		int i=0;
		while((data = br.readLine())!= null) {
			text.add(data);
			i++;
		}
		
		while(i>0) {
			bw.write(text.get(--i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
		
		br.close();
		isr.close();
		fis.close();
		
		
	}

}
