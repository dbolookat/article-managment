package ir.maktab56.hw7.domain;

import javax.xml.crypto.Data;

public class Article {
    private int id;
    private String title;
    private String brief;
    private String content;
    private Data creatdate;
    private boolean ispublished;
    private Data publishdate;

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Data getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Data creatdate) {
        this.creatdate = creatdate;
    }

    public boolean isIspublished() {
        return ispublished;
    }

    public void setIspublished(boolean ispublished) {
        this.ispublished = ispublished;
    }

    public Data getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Data publishdate) {
        this.publishdate = publishdate;
    }

}
