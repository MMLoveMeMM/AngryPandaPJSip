package cn.pumpkin.angrypandapjsip.save;

import android.content.Context;

public class StorageManager {

    public static String SP_NAME_DEFAULT = "sip_config";
    private static StorageManager sInstance;

    private SPImpl mDefaultISP = null;

    public static StorageManager getInstance() {
        if (sInstance == null) {
            synchronized (StorageManager.class) {
                if (sInstance == null) {
                    sInstance = new StorageManager();
                }
            }
        }
        return sInstance;
    }

    public void init(Context context) {
        mDefaultISP = new SPImpl(context, SP_NAME_DEFAULT);
    }

    public synchronized ISP getDefaultISP(Context context) {
        if (mDefaultISP == null) {
            mDefaultISP = new SPImpl(context, SP_NAME_DEFAULT);
        }
        return mDefaultISP;
    }

}
