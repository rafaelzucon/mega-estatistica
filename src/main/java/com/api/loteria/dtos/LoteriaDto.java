package com.api.loteria.dtos;
import javax.validation.constraints.NotBlank;
public class LoteriaDto {
    @NotBlank
    private String nro1;
    @NotBlank
    private String nro2;
    @NotBlank
    private String nro3;
    @NotBlank
    private String nro4;
    @NotBlank
    private String nro5;
    @NotBlank
    private String nro6;

    @NotBlank
    private String data_sorteio;

    @NotBlank
    private String sorteio;

    public String getNro1() {
        return nro1;
    }

    public void setNro1(String nro1) {
        this.nro1 = nro1;
    }

    public String getNro2() {
        return nro2;
    }

    public void setNro2(String nro2) {
        this.nro2 = nro2;
    }

    public String getNro3() {
        return nro3;
    }

    public void setNro3(String nro3) {
        this.nro3 = nro3;
    }

    public String getNro4() {
        return nro4;
    }

    public void setNro4(String nro4) {
        this.nro4 = nro4;
    }

    public String getNro5() {
        return nro5;
    }

    public void setNro5(String nro5) {
        this.nro5 = nro5;
    }

    public String getNro6() {
        return nro6;
    }

    public void setNro6(String nro6) {
        this.nro6 = nro6;
    }

    public String getData_sorteio() {
        return data_sorteio;
    }

    public void setData_sorteio(String data_sorteio) {
        this.data_sorteio = data_sorteio;
    }

    public String getSorteio() {
        return sorteio;
    }

    public void setSorteio(String sorteio) {
        this.sorteio = sorteio;
    }
}
