package jp.ac.uryukyu.ie.e205708;

/**
 * this class is used as Word in wordbook.
 */
public class Word {
    /**
     * String front is first displaying word basically English.
     */
    private String front;

    /**
     * String back is second displaying word basically Japanese.
     */
    private String back;

    /**
     * constructer
     * @param _front 
     * @param _back 
     */
    Word(String _front,String _back){
        this.front = _front;
        this.back = _back;
    }

    /**
     * this mathod display String front.
     * 
     * @see WordList#studyWords()
     */
    public void callFront(){
        System.out.println(this.front);
    }

    /**
     * this mathod display String back.
     * 
     * @see WordList#studyWords()
     */
    public void callBack(){
        System.out.println(this.back);
    }
}
