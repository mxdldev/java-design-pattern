package com.mxdl.desigin.pattern.create.a02_builder.entity;

/**
 * Description: <APerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Person {
    private String header;
    private String body;
    private String footer;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "APerson{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
