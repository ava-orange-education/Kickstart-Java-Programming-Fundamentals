public class ShareMyFlag {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public boolean checkFlag() {
        return flag;
    }
}
