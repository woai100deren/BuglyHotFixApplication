package com.dj.plugin.buglyhotfix;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.dj.plugin.buglyhotfix.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
