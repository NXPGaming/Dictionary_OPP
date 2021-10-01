import java.util.ArrayList;

public class Dictionary {
    private Word[] words;

      /**
       * phương thức khởi tạo không tham số với lớp từ điển
       * @param n : số lượng từ
       */
    public Dictionary(int n)
    {
        words = new Word[n];
    }

      /**
       * Thêm từ vào trong words
       * @param i : chỉ số từ cần thêm
       * @param wordTarget : English
       * @param wordExplain : Vietnamese
       */
    public void insertWord(int i,String wordTarget, String wordExplain)
    {
       words[i] = new Word(wordTarget,wordExplain);
    }

      /**
       * Phương thức trả về số lượng từ điển
       * @return length
       */
    public int lengthWord()
    {
        return words.length;
    }

      /**
       * phương thức trả về từ điển
       * @param i : chỉ số trả về
       * @return từ điển
       */
   public Word getW(int i)
   {
       return words[i];
   }
}
