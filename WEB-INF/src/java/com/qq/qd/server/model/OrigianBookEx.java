package com.qq.qd.server.model;

/**
 * Created by wangzhi.a on 2017/6/21.
 */
public class OrigianBookEx {
    private long freetype;
    private int categoryId;
    private String categoryName;
    private long bookId;
    private long pBookId;
    private int voteSum;
    private int top;

    public long getFreetype() {
        return freetype;
    }

    public void setFreetype(long freetype) {
        this.freetype = freetype;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getpBookId() {
        return pBookId;
    }

    public void setpBookId(long pBookId) {
        this.pBookId = pBookId;
    }

    public int getVoteSum() {
        return voteSum;
    }

    public void setVoteSum(int voteSum) {
        this.voteSum = voteSum;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "OrigianBookEx{" +
                "freetype=" + freetype +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", bookId=" + bookId +
                ", pBookId=" + pBookId +
                ", voteSum=" + voteSum +
                ", top=" + top +
                '}';
    }
}
