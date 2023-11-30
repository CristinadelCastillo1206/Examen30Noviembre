package com.CoreNetworks.Modelo;

import java.util.Objects;

public class Ejercicio7 {


    public String saca1;

    public String saca2;

    public String saca3;

    public String saca4;

    public String saca5;

    public String saca6;

    public String lanzarDado;


    @Override
    public String toString() {
        return "Ejercicio7{" +
                "saca1='" + saca1 + '\'' +
                ", saca2='" + saca2 + '\'' +
                ", saca3='" + saca3 + '\'' +
                ", saca4='" + saca4 + '\'' +
                ", saca5='" + saca5 + '\'' +
                ", saca6='" + saca6 + '\'' +
                ", lanzarDado='" + lanzarDado + '\'' +
                '}';
    }

    public Ejercicio7() {
    }

    public Ejercicio7(String saca1, String saca2, String saca3, String saca4, String saca5, String saca6, String lanzarDado) {

        this.saca1 = saca1;
        this.saca2 = saca2;
        this.saca3 = saca3;
        this.saca4 = saca4;
        this.saca5 = saca5;
        this.saca6 = saca6;
        this.lanzarDado = lanzarDado;
    }

    public String getSaca1() {
        return saca1;
    }

    public void setSaca1(String saca1) {
        this.saca1 = saca1;
    }

    public String getSaca2() {
        return saca2;
    }

    public void setSaca2(String saca2) {
        this.saca2 = saca2;
    }

    public String getSaca3() {
        return saca3;
    }

    public void setSaca3(String saca3) {
        this.saca3 = saca3;
    }

    public String getSaca4() {
        return saca4;
    }

    public void setSaca4(String saca4) {
        this.saca4 = saca4;
    }

    public String getSaca5() {
        return saca5;
    }

    public void setSaca5(String saca5) {
        this.saca5 = saca5;
    }

    public String getSaca6() {
        return saca6;
    }

    public void setSaca6(String saca6) {
        this.saca6 = saca6;
    }

    public String getLanzarDado() {
        return lanzarDado;
    }

    public void setLanzarDado(String lanzarDado) {
        this.lanzarDado = lanzarDado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio7 that = (Ejercicio7) o;
        return Objects.equals(saca1, that.saca1) && Objects.equals(saca2, that.saca2) && Objects.equals(saca3, that.saca3) && Objects.equals(saca4, that.saca4) && Objects.equals(saca5, that.saca5) && Objects.equals(saca6, that.saca6) && Objects.equals(lanzarDado, that.lanzarDado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saca1, saca2, saca3, saca4, saca5, saca6, lanzarDado);
    }
}
