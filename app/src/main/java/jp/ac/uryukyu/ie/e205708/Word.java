package jp.ac.uryukyu.ie.e205708;

public class Word {
    private String front;
    private String back;

    Word(String _front,String _back){
        this.front = _front;
        this.back = _back;
    }

    public void callFront(){
        System.out.println(this.front);
    }

    public void callBack(){
        System.out.println(this.back);
    }
}
