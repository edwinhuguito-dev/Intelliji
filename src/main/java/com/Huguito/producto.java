package com.Huguito;

public class producto {

    String producto01;
    String producto02;
    String producto03;

    public producto(String producto01, String producto02, String producto03) {
        this.producto01 = producto01;
        this.producto02 = producto02;
        this.producto03 = producto03;
    }

    public String getProducto01() {
        return producto01;
    }

    public void setProducto01(String producto01) {
        this.producto01 = producto01;
    }

    public String getProducto02() {
        return producto02;
    }

    public void setProducto02(String producto02) {
        this.producto02 = producto02;
    }

    public String getProducto03() {
        return producto03;
    }

    public void setProducto03(String producto03) {
        this.producto03 = producto03;
    }
}