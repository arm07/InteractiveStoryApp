package com.arm07.android.interactivestory.model;

/**
 * Created by rashmi on 11/2/2017.
 */

public class Choice {
    private int txtId;
    private int nextPage;

    public Choice(int txtId, int nextPage) {
        this.txtId = txtId;
        this.nextPage = nextPage;
    }

    public int getTxtId() {
        return txtId;
    }

    public void setTxtId(int txtId) {
        this.txtId = txtId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
