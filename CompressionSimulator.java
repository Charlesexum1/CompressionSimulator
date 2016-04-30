import java.util.Scanner;
import javax.swing.JOptionPane;
public class CompressionSimulator {
	
	public void Compress(){
		Scanner keys = new Scanner(System.in);
		String fileSize;
		int space = 1000;
		
		double blockSize = 512.00;
		
		
		fileSize = 
			JOptionPane.showInputDialog("Input uncompressed file size");
			double getFileSize = Double.parseDouble(fileSize);
				
		
		while ((space >= 0) && (!(getFileSize == -1.0))) {
			getFileSize = getFileSize * .8;
			double calcCompress = getFileSize / blockSize;
			double storeSize = Math.ceil(calcCompress);
			int storageBlock = (int)storeSize;
			space -= storageBlock;
			JOptionPane.showMessageDialog(null,"There are: " + space + " blocks left.", "Compression Simulator", JOptionPane.PLAIN_MESSAGE);
			fileSize = 
			JOptionPane.showInputDialog("Input uncompressed file size");
			getFileSize = Double.parseDouble(fileSize);
			}
		}
	
	public static void main (String args[]) {
		CompressionSimulator demo = new CompressionSimulator();
		demo.Compress();
		
			
		
		}
	
	}
