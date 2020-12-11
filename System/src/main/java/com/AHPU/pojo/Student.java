package com.AHPU.pojo;

public class Student {
    private String NAME;
    private String ID;
    private String CLASS;
    private String GRADE;
    private String SEX;
    private String FLOORNUM;
    private String ROOMNUM;
    private String TEL;
    private String ADDRESS;
    private String PASSWORD;

    public Student(String NAME, String ID, String CLASS, String GRADE, String SEX, String FLOORNUM, String ROOMNUM, String TEL, String ADDRESS) {
        this.NAME = NAME;
        this.ID = ID;
        this.CLASS = CLASS;
        this.GRADE = GRADE;
        this.SEX = SEX;
        this.FLOORNUM = FLOORNUM;
        this.ROOMNUM = ROOMNUM;
        this.TEL = TEL;
        this.ADDRESS = ADDRESS;

    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getFLOORNUM() {
        return FLOORNUM;
    }

    public void setFLOORNUM(String FLOORNUM) {
        this.FLOORNUM = FLOORNUM;
    }

    public String getROOMNUM() {
        return ROOMNUM;
    }

    public void setROOMNUM(String ROOMNUM) {
        this.ROOMNUM = ROOMNUM;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名:'" + NAME + '\'' +
                ", 学号:'" + ID + '\'' +
                ", 班级:'" + CLASS + '\'' +
                ", 学院:'" + GRADE + '\'' +
                ", 性别:'" + SEX + '\'' +
                ", 楼号:'" + FLOORNUM + '\'' +
                ", 宿舍号:'" + ROOMNUM + '\'' +
                ", 电话:'" + TEL + '\'' +
                ", 家庭地址:'" + ADDRESS + '\'' +
                '}';
    }
}
