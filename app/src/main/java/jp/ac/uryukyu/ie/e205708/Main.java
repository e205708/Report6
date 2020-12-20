package jp.ac.uryukyu.ie.e205708;

public class Main {
    public static void main(String[] args){
        WordList wl1 = new WordList("test.txt");
        wl1.makeWordList();
        wl1.studyWords();
        WordList wl2 = new WordList("number1.txt");
        wl2.makeWordList();
        wl2.studyWords();
    }
}
