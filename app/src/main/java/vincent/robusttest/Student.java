package vincent.robusttest;

/**
 * Created by vincent on 2017/3/17.
 * email-address:674928145@qq.com
 * description:
 */

public class Student {

    private int smallNum;
    private int bigNum;

    public void setSmallNum(int smallNum) {
        this.smallNum = smallNum;
    }

    public void setBigNum(int bigNum) {
        this.bigNum = bigNum;
    }

    public int getSmallNum() {
        return smallNum;
    }

    public int getBigNum() {
        return bigNum;
    }

    public int dividedBigBySmall() {
        return bigNum / smallNum;
    }
}
