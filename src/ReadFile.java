import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;


public class ReadFile {
	public ArrayList<String> load(String f1) throws IOException{
				ArrayList<String> out = new ArrayList();
				File f = new File(f1);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String st;
				while((st =br.readLine())!=null) {
					String[] str = st.split(" ");
					for (int i=0;i<str.length ;i++) {
						out.add(str[i].replaceAll("[^a-zA-Z]", "").toLowerCase());
					}
				}
		
		
		return out;
	}
	
	public HashSet<String> findCommon(ArrayList ar1,ArrayList ar2,ArrayList ar3){
		HashSet<String> out = new HashSet();
		for(int i=0;i<ar1.size();i++) {
			String word = (String)ar1.get(i);
			if(ar2.contains(word) && ar3.contains(word)) {
				out.add(word);
			}
		}
		return out;
	}

}
