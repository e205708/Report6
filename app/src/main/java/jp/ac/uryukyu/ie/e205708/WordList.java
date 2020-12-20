package jp.ac.uryukyu.ie.e205708;

import java.io.*;
import java.util.ArrayList;

/**
 * This class is used as wordbook.
 * This class have "Word" class List. and can make arraylist from specific file.
 */
public class WordList {
    /**
     * filename : The String is used to search file. 
     */
    String filename;

    /**
     * constructor
     * @param _filename the file name you want to study
     */
    WordList(String _filename){
        this.filename = _filename;
    }

    /**
     * wordList : ArrayList of Word.
     * @see Word makeWordList()
     */
    ArrayList<Word> wordList = new ArrayList<Word>();

    /**
     * this mathod makes Word Object from specific file and add these to wordList.
     * ""warning"" : this method make BufferedReader from "/Users/touyuamahiroto/prog2/report6/app/arc/main/resources/" + filename in default.
     *             : you have to change these your environment.
     *             :
     *             : file format - english:translation
     *             :               another_english:translation
     * 
     * references
     * https://www.javadrive.jp/start/stream/index3.html
     * すっきりわかるjava入門第３版,p679,try-with-resources文
     * 
     * @see Word
     */
    public void makeWordList(){
        try(BufferedReader br = new BufferedReader(new FileReader("/Users/touyamahiroto/prog2/report6/app/src/main/resources/"+filename))){
            String str = "";

            while(str!= null){
                str = br.readLine();
                if(str!=null){
                String[] splitedStr = str.split(":");
                wordList.add(new Word(splitedStr[0],splitedStr[1]));
                }
            }

        } catch(FileNotFoundException e){
            System.out.println("ファイルが見つかりません" + e.getMessage());
        } catch(IOException e){
            System.out.println("例外が発生しました" + e.getMessage());
        } 
    }

    /**
     * you can study english.
     * 1.displaying english.
     * 2.stop moment.
     * 3.displaying the word translation.
     * 
     * lasting this moving to last word.
     * 
     * @see waitMoment callFront() callBack()
     */
    public void studyWords(){
        System.out.println("スタート\n\n");

        for(Word wd : wordList){
            wd.callFront();
            waitMoment(5000);
            wd.callBack();
            System.out.println("--------------------");
            waitMoment(3000);
            
        }

        System.out.println("お疲れ様でした！");
    }

    /**
     * this mathod is used in studyWords() to stop motion.
     * 
     * @param time : assign time to stop.
     * 
     * quotation
     * watMoment at Actionクラスの装飾 in https://docs.google.com/document/d/1n_LWLTqTeDz-oJmVgQu5A_JNbPMEuB0V1PZ8Rxz29YU/edit
     */
    public void waitMoment(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException e){
            System.out.println( e.getMessage() );
        }
    }
}
