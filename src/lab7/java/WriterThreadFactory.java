package lab7.java;

import java.util.concurrent.ThreadFactory;

public class WriterThreadFactory implements ThreadFactory {

    private int num = 1;

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r, "writer " + num++);
    }
}
