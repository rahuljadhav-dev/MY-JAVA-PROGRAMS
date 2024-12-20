package cf.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Task4 {
	public static void main(String[] args) {
	     TreeMap<String, String> map = new TreeMap<String, String>();
	        map.put("Movie", "HD");
	        map.put("Doucment", "Pdf");
	        map.put("Documentry", "MP4");
	        map.put("Code", "txt");
	        map.put("Song", "Mp3");
	        map.put("Video", "HD");
	        

	        // Define video formats
	        Set<String> videoFormats = new HashSet<>(Arrays.asList("HD", "MP4"));

	        // Use removeIf to remove entries with values in videoFormats
	        map.entrySet().removeIf(entry -> videoFormats.contains(entry.getValue()));

	        // Print the updated map
	        System.out.println(map);
		

	
	}

}
