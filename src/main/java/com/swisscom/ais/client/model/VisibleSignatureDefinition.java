package com.swisscom.ais.client.model;

public class VisibleSignatureDefinition {

    private int x = 0;
    private int y = 0;
    private int width = 150;
    private int height = 50;
    private int page = 0;
    private String iconPath;

    private String customTemplatePath;

    public VisibleSignatureDefinition(){}
    public VisibleSignatureDefinition(int x, int y, int width, int height, int page, String iconPath){
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);
        this.setPage(page);
        this.setIconPath(iconPath);
    }
    
    public VisibleSignatureDefinition(int page, String customTemplatePath) {
        this.setPage(page);
        this.setCustomTemplatePath(customTemplatePath);
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getCustomTemplatePath() {
        return customTemplatePath;
    }

    public void setCustomTemplatePath(String customTemplatePath) {
        this.customTemplatePath = customTemplatePath;
    }
}
