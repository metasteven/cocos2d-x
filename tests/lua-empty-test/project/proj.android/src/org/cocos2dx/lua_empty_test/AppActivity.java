package org.cocos2dx.lua_empty_test;

import org.cocos2dx.lib.Cocos2dxActivity;

public class AppActivity extends Cocos2dxActivity {
    static {
        System.loadLibrary("compiler_rt_shared");
        System.loadLibrary("c++_shared");
    }
}
