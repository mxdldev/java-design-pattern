package com.mxdl.desigin.pattern.structure.a05_flyweight.factory;

import com.mxdl.desigin.pattern.structure.a05_flyweight.entity.WebSite;

import java.util.HashMap;

/**
 * Description: <WebSiteFactory><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class WebSiteFactory {
    private HashMap<String, WebSite> mHashMap = new HashMap<>();
    public WebSite getWebSite(String key) {
        if (!mHashMap.containsKey(key)) {
            mHashMap.put(key, new WebSite(key));
        }
        return mHashMap.get(key);
    }
    public int getWebSiteSize(){
        return mHashMap.size();
    }
}
