package radovan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Character {
	public String name;
	public String allegiance;
	public String message_file;

	public Character(String name, String allegiance, String message_file) {
		super();
		this.name = name;
		this.allegiance = allegiance;
		this.message_file = message_file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAllegiance() {
		return allegiance;
	}

	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}

	public String getMessage_file() {
		return message_file;
	}

	public void setMessage_file(String message_file) {
		this.message_file = message_file;
	}

	public static void printM(String message_file) throws IOException {

		String line = null;
		try {
			FileReader fileReader = new FileReader(message_file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + message_file + "'");
		}
	}

		public static int count (String message_file) throws IOException {
		int count = 0;
		try {
			FileReader fr = new FileReader(message_file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				count++;
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error" + e.getMessage());
		}
		return count;
	}

		public static boolean isSurrogatePair(char charAt, char charAt2) {
			// TODO Auto-generated method stub
			return false;
		}
		public static int searchPositive(String message_file) {// search for positive emoji

			String positive1 = "ðŸ˜„";
			String positive2 = "ðŸ™‚";
			String positive3 = "ðŸ˜Š";
			String positive4 = "ðŸ˜�";

			File file = new File(message_file);
			int countpositive = 0;
			try {
				FileReader reader = new FileReader(file);
				BufferedReader br = new BufferedReader(reader);
				String line;

				while ((line = br.readLine()) != null) {
					if (line.contains(positive1) || line.contains(positive2) || line.contains(positive3)
							|| line.contains(positive4)) {
						countpositive++;
					}
				}
			} catch (FileNotFoundException e) {

				System.err.println("alert");
			} catch (IOException e) {

				System.err.println("alert");
			}
			return countpositive;
		}

		public static int searchNegative(String message_file) {// search for negative emoji

			String negative1 = "ðŸ˜¢";
			String negative2 = "ðŸ˜­";
			String negative3 = "ðŸ˜ž";
			String negative4 = "ðŸ‘¿";
			File file = new File(message_file);
			int countnegative = 0;
			try {
				FileReader reader = new FileReader(file);
				BufferedReader br = new BufferedReader(reader);
				String line;

				while ((line = br.readLine()) != null) {
					if (line.contains(negative1) || line.contains(negative2) || line.contains(negative3)
							|| line.contains(negative4)) {
						countnegative++;
					}
				}
			} catch (FileNotFoundException e) {

				System.err.println("alert");
			} catch (IOException e) {

				System.err.println("alert");
			}
			return countnegative;
		}

}
