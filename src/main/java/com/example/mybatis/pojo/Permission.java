package com.example.mybatis.pojo;

public class Permission {
    private Long id;

    private String name;

    private String desc;

    private String url;

    public Permission(Long id, String name, String desc, String url) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.url = url;
    }

    public Permission() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}