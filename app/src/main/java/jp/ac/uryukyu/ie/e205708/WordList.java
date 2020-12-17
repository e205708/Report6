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
}
