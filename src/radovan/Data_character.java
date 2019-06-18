package radovan;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;





public class Data_character extends Character  {
	public Data_character(String name, String allegiance, String message_file) {
		super(name, allegiance, message_file);
		// TODO Auto-generated constructor stub
	}



	public static List<Character> createListOfCharacters() throws IOException {
		List<Character> c = new ArrayList<Character>();// storing data from txt file into array list

		FileReader fr = new FileReader("resource/got_meta_data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] arrs = null;

		br.readLine();
		while ((line = br.readLine()) != null) {
			arrs = line.split(", ");

			c.add(new Character((arrs[0]), arrs[1], arrs[2]));

		}
		br.close();
		fr.close();
		return c;
	}
	

	}


