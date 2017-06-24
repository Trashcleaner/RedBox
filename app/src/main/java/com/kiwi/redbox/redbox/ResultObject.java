package com.kiwi.redbox.redbox;

/**
 * Created by obrusvit on 24.6.17.
 */

public class ResultObject {

    private int buyPrice;
    private String flyFrom;
    private String flyTo;
    private String dateFrom;
    private String dateTo;

    public ResultObject(int buyPrice, String flyFrom, String flyTo, String dateFrom, String dateTo) {
        this.buyPrice = buyPrice;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    @Override
    public String toString() {
        return "ResultObject{" +
                "buyPrice=" + buyPrice +
                ", flyFrom='" + flyFrom + '\'' +
                ", flyTo='" + flyTo + '\'' +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                '}';
    }
}
