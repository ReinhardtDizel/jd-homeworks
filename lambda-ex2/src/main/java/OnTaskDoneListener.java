package main.java;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}