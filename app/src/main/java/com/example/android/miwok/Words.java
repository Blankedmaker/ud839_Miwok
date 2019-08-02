package com.example.android.miwok;

public class Words {

    private String englishWord;
    private String miwokWord;

    public Words(){

    }

    public Words(String englishWord, String miwokWord){
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
    }

    public void setEnglishWord(String englishWord){
        this.englishWord = englishWord;
    }

    public String getEnglishWord(){
        return englishWord;
    }

    public void setMiwokWord(String miwokWord){
        this.miwokWord = miwokWord;
    }

    public String getMiwokWord(){
        return miwokWord;
    }

}
