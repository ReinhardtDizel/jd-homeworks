package main.java;

public class Worker {

    private OnTaskDoneListener callback;

    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 67; i++) {
            callback.onDone("Task " + i + " is done");
        }
        for (int i = 68; i <= 100; i++) {
            errorCallback.onError("Task " + i + " is error");
        }
    }
}
