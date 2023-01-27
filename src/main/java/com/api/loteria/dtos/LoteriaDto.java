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

}
