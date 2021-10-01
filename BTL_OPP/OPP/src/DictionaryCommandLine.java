import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandLine {
    private DictionaryManagement dictionaryManagement = new DictionaryManagement();

    /**
     * chức năng gọi hàm insertFromFile(), showAllWords(), dictionaryLookup()
     * @throws IOException
     */
    public void dictionaryAdvanced() throws IOException {
        dictionaryManagement.insertFromFile();
        dictionaryManagement.showAllWords();
        dictionaryManagement.dictionaryLookup();
    }

    /**
     * chức năng tìm kiếm các từ
     */
    public void dictionarySearcher(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập từ cần tìm kiếm : ");
        String words = scanner.next();
        Dictionary d = dictionaryManagement.getD();
        int n = d.lengthWord();
        System.out.printf("Danh sách các từ vựng bắt đầu bằng '%s': ",words);
        for (int i = 0; i < n; i++) {
            int searchWord = d.getW(i).getWordTarget().indexOf(words);
            if (searchWord != -1) {
                   System.out.print(d.getW(i).getWordTarget() + " ");
            }
        }
    }


}
