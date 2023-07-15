package com.nowcoder.community.entity;

/**
 * 封装分页相关的信息
 */
public class Page {

    private int current = 1;

    private int limit = 10;

    private int rows;

    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1&&limit<=100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获得当前页的起始行
     * @return
     */
    public int getOffset(){
        return (current-1)*limit;
    }

    //获取总页数
    public int getTotal(){
        if(rows%limit==0){
            return rows / limit;
        }
        else{
            return rows / limit + 1;
        }
    }

    /**
     * 获取起始页码，即不多显示，但仍有
     */
    public int getFrom(){
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    /**
     * 获取结束页码
     */
    public int getTo(){
        int to = current + 2;
        int total = getTotal();
        return to>total ? total : to;
    }


}
