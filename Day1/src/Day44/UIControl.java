package Day44;

public class UIControl {
    private boolean isEnable;

    public UIControl(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public void disable(){
        this.isEnable = false;
    }
    public void enable(){
        this.isEnable = true;
    }

    public boolean isEnable() {
        return isEnable;
    }
}
