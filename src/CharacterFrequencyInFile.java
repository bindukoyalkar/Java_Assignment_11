import java.io.*;
import java.util.*;
public class CharacterFrequencyInFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String file=sc.nextLine();
        StringBuilder sb=new StringBuilder("/home/binduk/IdeaProjects/Java assignment 11/src/");
        sb.append(file);
        String path=sb.toString();
        Map<Character,Integer> frequencyOfChars=new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String input;
            while( (input= br.readLine()) !=null){
                for(char c:input.toCharArray()){
                    frequencyOfChars.put(c, frequencyOfChars.getOrDefault(c,0)+1);
                }
            }
            System.out.println("Completed Reading the "+file+"file");
            BufferedWriter wr=new BufferedWriter(new FileWriter("/home/binduk/IdeaProjects/Java assignment 11/src/write.txt"));
            wr.write(frequencyOfChars.toString());
            System.out.println("Completed Writing to write.txt file");
            br.close();
            wr.close();
        }
        catch(Exception e){
            return;
        }
    }
}
