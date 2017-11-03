package com.arm07.android.interactivestory.model;

/**
 * Created by rashmi on 11/2/2017.
 */

public class Page {
    private int imageId;
    private int txtId;
    private Choice choice1,choice2;
    private boolean isFinalPage=false;



    public Page(int imageId, int txtId) {
        this.imageId = imageId;
        this.txtId = txtId;
        this.isFinalPage=true;
    }

    public Page(int imageId, int txtId, Choice choice1, Choice choice2) {
        this.imageId = imageId;
        this.txtId = txtId;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        isFinalPage = finalPage;
    }
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTxtId() {
        return txtId;
    }

    public void setTxtId(int txtId) {
        this.txtId = txtId;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }
}
