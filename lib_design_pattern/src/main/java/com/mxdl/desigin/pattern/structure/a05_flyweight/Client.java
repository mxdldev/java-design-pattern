package com.mxdl.desigin.pattern.structure.a05_flyweight;

import com.mxdl.desigin.pattern.structure.a05_flyweight.entity.User;
import com.mxdl.desigin.pattern.structure.a05_flyweight.entity.WebSite;
import com.mxdl.desigin.pattern.structure.a05_flyweight.factory.WebSiteFactory;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSite("产品展示");
        webSite.use(new User("张三"));
        webSite.use(new User("李四"));
        webSite.use(new User("王五"));

        WebSite webSite1 = webSiteFactory.getWebSite("博客");
        webSite1.use(new User("张三"));
        webSite1.use(new User("李四"));

        System.out.println("网站分类总数："+webSiteFactory.getWebSiteSize());
    }
}
