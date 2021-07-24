package factory_Method_Design_Pattern;


public class App {
	
	public static void  main(String[]args)  {

    BatchProcessor  batchProcessor= new BatchProcessor();
    batchProcessor.processBatch("Sujit");
    System.out.println("Done");
}
}
