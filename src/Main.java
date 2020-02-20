import java.io.*;
import java.util.*;


public class Main {

        public static void main(String[] args) throws Exception
        {
            // pass the path to the file as a parameter
            File file =
                    new File("C:\\Users\\iamrk\\Documents\\uni\\hashcode2\\src\\a_example.txt");
            Scanner sc = new Scanner(file);
            ArrayList<String[]> stringArray = new ArrayList<>();
            while (sc.hasNextLine()) {
                stringArray.add((sc.nextLine().split(" ")));
            }
            String[] constraints = stringArray.get(0);
            String[] scores = stringArray.get(1);
            ArrayList<String[]> libdata = new ArrayList<>();
            for(int i = 2; i < stringArray.size(); i++){
                libdata.add(stringArray.get(i));
            }
        }

    }

