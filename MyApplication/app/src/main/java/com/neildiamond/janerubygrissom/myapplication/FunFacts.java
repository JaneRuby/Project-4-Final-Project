package com.neildiamond.janerubygrissom.myapplication;

/**
 * Created by janerubygrissom on 9/8/16.
 */
public class FunFacts {

    String factTitle;
    String factBody;

    public FunFacts(String title, String body){
        factTitle=title;
        factBody = body;
    }

    public String getFactBody() {
        return factBody;
    }

    public void setFactBody(String factBody) {
        this.factBody = factBody;
    }

    public String getFactTitle() {
        return factTitle;
    }

    public void setFactTitle(String factTitle) {
        this.factTitle = factTitle;
    }




}
