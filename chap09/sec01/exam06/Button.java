package chap09.sec01.exam06;

public class Button {
    public Object set;
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }


    static interface OnClickListener {
        void onClick();
    }
}
