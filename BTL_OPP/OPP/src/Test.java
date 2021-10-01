import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String []args) throws IOException {
        DictionaryCommandLine dCL = new DictionaryCommandLine();
        dCL.dictionaryAdvanced();
        dCL.dictionarySearcher();
    }
}
