package org.example.Tailieu;

public abstract  class Ngoaikhoa {
    private String nameNk;

    public String getNameNk() {
        return nameNk;
    }

    public void setNameNk(String nameNk) {
        this.nameNk = nameNk;
    }
    public abstract void thamgia();
    public abstract double getDiem();
}
