public class Word {
    private String wordTarget;
    private String wordExplain;

    /**
     * Phương thức khởi tạo có tham số
     * @param wordTarget : word English
     * @param wordExplain : word Vietnamese
     */
    public Word(String wordTarget, String wordExplain)
    {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
    }

    /**
     *  Phương thức trả về từ tiếng Anh
     * @return : English
     */
    public String getWordTarget()
    {
        return wordTarget;
    }

    /**
     * Phương thức trả về từ tiếng Việt
     * @return : Vietnamese
     */
    public String getWordExplain()
    {
        return wordExplain;
    }

    /**
     * Phương thức sửa từ tiếng Anh
     * @param wordTarget : English
     */
    public void setWordTarget(String wordTarget)
    {
        this.wordTarget = wordTarget;
    }

    /**
     * Phương thức sửa từ tiếng Việt
     * @param wordExplain : Vietnamese
     */
    public void setWordExplain(String wordExplain)
    {
        this.wordExplain = wordExplain;
    }
}
