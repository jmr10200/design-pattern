package hello.example.designpattern.chainofresponsibility.atm;

public class WonTypeList {

    private long fiftyThousandCnt;
    private long tenThousandCnt;
    private long oneThousandCnt;
    private long fiveThousandCnt;
    private long coins;

    public long getFiftyThousandCnt() {
        return fiftyThousandCnt;
    }

    public void setFiftyThousandCnt(long fiftyThousandCnt) {
        this.fiftyThousandCnt = fiftyThousandCnt;
    }

    public long getTenThousandCnt() {
        return tenThousandCnt;
    }

    public void setTenThousandCnt(long tenThousandCnt) {
        this.tenThousandCnt = tenThousandCnt;
    }

    public long getOneThousandCnt() {
        return oneThousandCnt;
    }

    public void setOneThousandCnt(long oneThousandCnt) {
        this.oneThousandCnt = oneThousandCnt;
    }

    public long getFiveThousandCnt() {
        return fiveThousandCnt;
    }

    public void setFiveThousandCnt(long fiveThousandCnt) {
        this.fiveThousandCnt = fiveThousandCnt;
    }

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }
}
