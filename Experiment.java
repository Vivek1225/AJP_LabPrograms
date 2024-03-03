
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) throws FileNotFoundException{
        FileInputStream f1 = new FileInputStream("C:\\Users\\aniru\\OneDrive\\Desktop\\STUDY\\Advanced Java Programming\\Programs\\src\\AJP\\text1.txt");
        Scanner fileScanner = new Scanner(f1).useDelimiter("\t");
        Scanner scanner1 = new Scanner(System.in);
        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        String dataArray[];
        String read;
        while (fileScanner.hasNext()) {
            read = fileScanner.nextLine();
            dataArray = read.split("\t");
            hashtable.put(dataArray[1], dataArray[0]);
        }
        System.out.println(hashtable);
        System.out.println("Enter key or value to get it's corresponding value: ");
        String key = scanner1.next();
        if(hashtable.containsKey(key))
            System.out.println("value is : "+hashtable.get(key));
        else if(hashtable.contains(key)){
            String res = null;
            for (String k : hashtable.keySet()) {
                if (hashtable.get(k).equals(key)) {
                    res = k;
                    break;
                }
            }
            System.out.println("key is : "+res);
        }
            
        else
            System.out.println("Key not found");

        fileScanner.close();
        scanner1.close();
    }
}