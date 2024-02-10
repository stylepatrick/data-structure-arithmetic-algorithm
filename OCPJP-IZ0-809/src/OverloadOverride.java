public enum OverloadOverride {

    TEST(true);

    private boolean val;

    private OverloadOverride(boolean t) {
        this.val = t;
    }

    public void setT() {
        this.val = false;
    }

    public boolean getT() {
        return this.val;
    }
}
