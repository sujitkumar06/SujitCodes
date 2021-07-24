package factory_Method_Design_Pattern;

import java.io.File;

public class CSVParser extends TextParser {

	public CSVParser(File file) {
		System.out.println("Created CSV parser");
	}

}
