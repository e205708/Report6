package jp.ac.uryukyu.ie.e205708;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordListTest {
    @Test void MakeListTest(){
        WordList wl = new WordList("test.txt");
        wl.makeWordList();
        assertEquals(wl.wordList.get(0).getFront(),"apple");
        assertEquals(wl.wordList.get(0).getBack(),"りんご");
    }
}
