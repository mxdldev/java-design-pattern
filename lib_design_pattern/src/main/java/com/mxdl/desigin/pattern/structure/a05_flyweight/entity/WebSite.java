package com.mxdl.desigin.pattern.structure.a05_flyweight.entity;

import com.mxdl.desigin.pattern.structure.a05_flyweight.contract.IWebSite;

/**
 * Description: <WebSite><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class WebSite implements IWebSite {
    private String name;

    public WebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类："+name+"；用户："+user.getName());
    }
}
