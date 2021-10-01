import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryManagement {

    private Dictionary d;
    private int n;
    private HashMap <String,String> map;

    /**
     * Phương thức khởi tạo không tham số quản lý từ điển
     */
    public DictionaryManagement () {
         map = new HashMap<>();
    }

    /**
     * Phương thức trả về từ tiếng anh
     * @param words : English
     * @return : English
     */
    public String getMap(String words)
    {
        return map.get(words);
    }

    /**
     * Phương thức tra cứu từ điển bằng dòng lệnh
     */
    public void dictionaryLookup()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tra cứu từ :");
        String searchWord = scanner.next();
        System.out.print(searchWord + " -> " + map.get(searchWord));
    }

    /**
     * Nhập dữ liệu từ điển bằng dòng lệnh
     * @param scanner
     */
    public void insertFromCommandline(Scanner scanner)
    {
        System.out.print("Số lượng từ vựng: ");
        n = scanner.nextInt();
        d = new Dictionary(n);
        scanner.nextLine();
        for(int i=0;i<n;i++)
        {
             String wordTarget = scanner.nextLine();
             String wordExplain = scanner.nextLine();
             d.insertWord(i,wordTarget,wordExplain);
        }
    }

    /**
     *  Hiển thị tất cả các từ điển
     */
    public void showAllWords()
    {
        System.out.print("No\t\t| English\t\t| Vietnamese\n");
        for(int i=0;i<d.lengthWord();i++)
        {
            Word w = d.getW(i);
            System.out.printf("%d\t\t| %s\t\t\t| %s\n",i+1,w.getWordTarget(),w.getWordExplain());
        }
    }

    /**
     * Nhập dữ liệu từ điển trong file
     * @throws IOException
     */
    public void insertFromFile() throws IOException {
        File file = new File("C:\\Users\\admin\\Desktop\\BTL_OPP\\OPP\\data\\data.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        d = new Dictionary(n);
        String st = br.readLine();
        Integer n = Integer.parseInt(st);
        d = new Dictionary(n);
        int i=0;
        map = new HashMap<>();
        while ((st = br.readLine()) != null) {
            int index = st.indexOf(" ");
            System.out.println(st);
            String wordTarget = st.substring(0,index);
            String wordExplain = st.substring(index+1);
            map.put(wordTarget,wordExplain);
            d.insertWord(i++,wordTarget,wordExplain);
        }
    }

    /**
     * chức năng gọi hàm insertFromCommandline() và showAllWords()
     * @throws IOException
     */
    public void dictionaryBasic() throws IOException {
//        insertFromCommandline(scanner);
        insertFromFile();
        showAllWords();
    }

    /**
     * Phương thức trả về lớp từ điển
     * @return
     */
    public Dictionary getD() {
        return d;
    }
}
