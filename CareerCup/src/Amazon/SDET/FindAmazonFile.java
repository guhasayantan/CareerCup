package Amazon.SDET;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class FindAmazonFile {

	public static void main(String[] args) {
		List<String> folders = fileList("/home/sayantan/workspace/Test");
		for(String foldername : folders)
		{
			File folder = new File(foldername);
			File[] listOfFiles = folder.listFiles();

			for (File file : listOfFiles) {
			    if (file.isFile()) {
			    	findAmazon(foldername+"/"+file.getName());
			    }
			}
		}
	}
	public static List<String> fileList(String directory) {
        List<String> fileNames = new ArrayList<>();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directory))) {
            for (Path path : directoryStream) {
                fileNames.add(path.toString());
            }
        } catch (IOException ex) {}
        return fileNames;
    }
	public static void findAmazon(String filename)
	{
		File file = new File(filename);

		try {
		    Scanner scanner = new Scanner(file);
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine();
		        
		        if(line.contains("Amazon")) { 
		            System.out.println("Amazon is in " +filename);
		        }
		    }
		} catch(FileNotFoundException e) { 
		    //handle this
		}
	}
}
