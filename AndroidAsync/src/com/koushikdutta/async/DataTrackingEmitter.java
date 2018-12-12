package com.koushikdutta.async;

/**
 * Created by koush on 5/28/13.
 */
public interface DataTrackingEmitter extends DataEmitter {
    public interface DataTracker {
        void onData(long totalBytesRead);
    }
    void setDataTracker(DataTracker tracker);
    DataTracker getDataTracker();
    long getBytesRead();
    void setDataEmitter(DataEmitter emitter);
}
