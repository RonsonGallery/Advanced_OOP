package IO;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files

import Country.City;
import Country.Kibbutz;
import Country.Map;
import Country.Moshav;
import Country.RamzorColor;
import Country.Settlement;
import Location.Location;
import Location.Point;
import Location.Size;
import Population.Healthy;
import Population.Person;

public class SimulationFile {
	
	List<Settlement> settlements = new ArrayList<>();
	Map map = new Map(settlements);
	
	
	
	public SimulationFile() {
		// TODO Auto-generated constructor stub
	}
	
/*	
	Point p = new Point(1,1);
	Size s = new Size(5,5);
	Location l = new Location(p,s);
	Healthy pep;
	List<Person> people = new ArrayList<>();
	City c = new City("Ashdod",l,people,RamzorColor.Green);
	for(int i = 0; i < 4;i++) {
		int randomNum = rand.nextInt(121);
		pep = new Healthy(randomNum, p, c);
		c.addPerson(pep);
	}	
*/
	public Map Loadfile() {

		Random rand = new Random();
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] arrofStr = data.split(";",0);
				
				List<Person> people = new ArrayList<>();
				System.out.println(arrofStr[0]);
				//System.out.println(arrofStr[6]);
				
				if(arrofStr[0].equals("City")) {
					//System.out.println(arrofStr[2]);
					Point p = new Point(Integer.parseInt(arrofStr[2].replaceAll(" ","")),Integer.parseInt(arrofStr[3].replaceAll(" ","")));
					//System.out.println(p);
					Size s = new Size(Integer.parseInt(arrofStr[4].replaceAll(" ","")),Integer.parseInt(arrofStr[5].replaceAll(" ","")));
					//System.out.println(s);
					Location l = new Location(p,s);
					
					City c = new City(arrofStr[1],l,people ,RamzorColor.Green);
					Healthy pep;
					for(int i = 0; i < Integer.parseInt(arrofStr[6].replaceAll(" ",""));i++) {
						int randomNum = rand.nextInt(121);
						pep = new Healthy(randomNum, p, c);
						c.addPerson(pep);
					}	
					//System.out.println(c);
					map.addSettlements(c);
				}
				
				
				if(arrofStr[0].equals("Moshav")) {
					
					Point p = new Point(Integer.parseInt(arrofStr[2].replaceAll(" ","")),Integer.parseInt(arrofStr[3].replaceAll(" ","")));
					Size s = new Size(Integer.parseInt(arrofStr[4].replaceAll(" ","")),Integer.parseInt(arrofStr[5].replaceAll(" ","")));
					Location l = new Location(p,s);
					
					Moshav c = new Moshav(arrofStr[1],l,people ,RamzorColor.Green);
					Healthy pep;
					//System.out.println(arrofStr[6]);
					for(int i = 0; i < Integer.parseInt(arrofStr[6].replaceAll(" ",""));i++) {
						int randomNum = rand.nextInt(121);
						pep = new Healthy(randomNum, p, c);
						c.addPerson(pep);
					}	
					//System.out.println(c);
					map.addSettlements(c);			
					
				}
				if(arrofStr[0].equals("Kibbutz")) {
					
					Point p = new Point(Integer.parseInt(arrofStr[2].replaceAll(" ","")),Integer.parseInt(arrofStr[3].replaceAll(" ","")));
					Size s = new Size(Integer.parseInt(arrofStr[4].replaceAll(" ","")),Integer.parseInt(arrofStr[5].replaceAll(" ","")));
					Location l = new Location(p,s);
					
					Kibbutz c = new Kibbutz(arrofStr[1],l,people ,RamzorColor.Green);
					Healthy pep;
					for(int i = 0; i < Integer.parseInt(arrofStr[6].replaceAll(" ",""));i++) {
						int randomNum = rand.nextInt(121);
						//randomNum1 = rand.nextInt(4);
						//randomNum = 5 * randomNum1 + randomNum1; 
						pep = new Healthy(randomNum, p, c);
						c.addPerson(pep);
					}	
					//System.out.println(c);
					map.addSettlements(c);
					
				}
				//System.out.println(data);
			}
			myReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		//System.out.println(map.getSettlements().length);
		//System.out.println(map);
		return map;
	}

}
