package Profiles;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class SkillsHashMap {

		public static void main(String[] args) {
			try(
			Scanner input = new Scanner(System.in)) {
				HashMap<String, String> skills = new HashMap<>();
			
			String skillsKey = "";
		    String typeValue = "";
			
		    	//skills include coding languages, software 
			    //types divided by how known
			    //data analytics | full stack web dev | multi | general | lab | bioinformatics
			    
			    skills.put("r","Data Analytics");
			    skills.put("sql","Data Analytics");
			    skills.put("python","Data Analytics");
			    skills.put("tableau","Data Analytics");
			    skills.put("power bi","Data Analytics");
			    skills.put("excel","Data Analytics");
			    skills.put("h20.ai","Data Analytics");
			    skills.put("machine learning","Data Analytics");
			    skills.put("data cleaning","Data Analytics");
			    skills.put("data modeling","Data Analytics");
			    skills.put("unsupervised learning","Data Analytics");
			    skills.put("dimensionality reduction","Data Analytics");
			    skills.put("r studio","Data Analytics");
			    skills.put("database design","Data Analytics");
			    skills.put("data visualization","Data Analytics");
			    skills.put("github","Multi");
			    skills.put("command line","Multi");
			    skills.put("html","Full Stack Web Dev");
			    skills.put("css","Full Stack Web Dev");
			    skills.put("javascript","Full Stack Web Dev");
			    skills.put("java","Full Stack Web Dev");
			    skills.put("project management","General Skills");
			    skills.put("api","Full Stack Web Dev");
			    skills.put("java","Full Stack Web Dev");
			    skills.put("eclipse","Full Stack Web Dev");
			    skills.put("vs code","Multi");
			    skills.put("microsoft office suite","General Skills");
			    skills.put("adobe creative suite","General Skills");
			    skills.put("google cloud platform","General Skills");
			    skills.put("googling","General Skills");
			    skills.put("google analytics","Data Analytics");
			    skills.put("marketing","General Skills");
			    skills.put("node.js","Full Stack Web Dev");
			    skills.put("sales","General Skills");
			    skills.put("recruiting","General Skills");
			    skills.put("jquery","Full Stack Web Dev");
			    skills.put("amazon web services","General Skills");
			    skills.put("kartra","General Skills");
			    skills.put("hubspot","General Skills");
			    skills.put("pandas","Data Analytics");
			    skills.put("omni-channel marketing","General Skills");
			    skills.put("mongodb","Multi");
			    skills.put("object-oriented programming","Full Stack Web Dev");
			    skills.put("livestock management","General Skills");
			    skills.put("licensed massage therapist","General Skills");
			    skills.put("customer retention","General Skills");
			    skills.put("drone operator","General Skills");
			    skills.put("elisa","Lab");
			    skills.put("polymerase chain reaction","Lab");
			    skills.put("dna extraction","Lab");
			    skills.put("isolation","Lab");
			    skills.put("research","General Skills");
			    skills.put("protein chromatography","Lab");
			    skills.put("pGLOTransformation","Lab");
			    skills.put("purification","Lab");
			    skills.put("amplification","Lab");
			    skills.put("dna master","Bioinformatics");
			    skills.put("genemark","Bioinformatics");
			    skills.put("glimmer","Bioinformatics");
			    skills.put("phagesdb blast","Bioinformatics");
			    skills.put("ncbi blast","Bioinformatics");
			    skills.put("hhpred","Bioinformatics");
			    skills.put("tmhmm","Bioinformatics");
			    skills.put("pdb","Bioinformatics");
			    skills.put("sosui","Bioinformatics");
			    skills.put("pecaan","Bioinformatics");
			    skills.put("senteny","Bioinformatics");
			    skills.put("gepard dot plot","Bioinformatics");
			    skills.put("aragorn","Bioinformatics");
			    skills.put("trna scanse","Bioinformatics");
			    skills.put("genetic centimorgan calculations","Bioinformatics");
			    skills.put("linkedin","General Skills");
			    
			    
			    
			    
//				for(loooooop) 
			    
			    System.out.println("What skillset are you looking for? Enter a language, software or skill here. ");
				skillsKey = input.nextLine();
				skillsKey = skillsKey.toLowerCase();

					if (skills.containsKey(skillsKey) == true) {
						typeValue = skills.get(skillsKey);
						System.out.println("Here is Liz's available " + typeValue + " skills selection.");
					//loop through the hash map and return each key/value pair
					for (Map.Entry<String, String> entry : skills.entrySet()){
						String key = entry.getKey();
						String value = entry.getValue();
						if (value == typeValue){
						System.out.println(key.toUpperCase());
						}
						}
					}
					else
					{
						System.out.println("Sorry, unfortunately Liz does not yet have that specific skillset in her current skills inventory.");
					}
			}
		}
}