package factory_Method_Design_Pattern;

import java.io.File;
import java.util.List;

public class TextParser {

	public TextParser(File file) {
		System.out.println("Creating TEXT parser");
		
	}
	
	public List<Record> parse(){
		System.out.println("Parsing text and creating list");
		return null;
	}
}
