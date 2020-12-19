package jp.ac.uryukyu.ie.e205708;

import java.io.*;
import java.util.ArrayList;

public class WordList {
    String filename;

    WordList(String _filename){
        this.filename = _filename;
    }
    ArrayList<Word> wordList = new ArrayList<Word>();

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

    //prog_exe2で書かれてたものをそのまま持ってきてます。
    public void waitMoment(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException e){
            System.out.println( e.getMessage() );
        }
    }
}
