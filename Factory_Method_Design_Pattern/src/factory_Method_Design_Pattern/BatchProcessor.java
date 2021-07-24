package factory_Method_Design_Pattern;

import java.io.File;
import java.util.List;

public class BatchProcessor {

	public void processBatch(String fileName, String format) {
		
		File file = openFile(fileName);
		
		TextParser parser = new  TextParser(file);
		List<Record> records= parser.parse();
		
		processRecords(records);
		writeSummary();
		closeFile(file);
	}
	
	private void writeSummary() {
		System.out.println("Wrote batch summary-0 failed");
		
	}

	private void closeFile(File file) {
		System.out.println("close File");
		
	}

	private File openFile(String fileName) {
		System.out.println("open File");
		return null;
	}
	
	private void processRecords(List<Record> records) {
		System.out.println("processing each record");
	}
	
}
