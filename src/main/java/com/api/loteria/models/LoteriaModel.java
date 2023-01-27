package com.api.loteria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

//ENTITY
@Entity
@IdClass(LoteriaModelId.class)
@Table(name = "TB_SORTEIOS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoteriaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 2)
    private String nro1;
    @Column(nullable = false, length = 2)
    private String nro2;
    @Column(nullable = false, length = 2)
    private String nro3;
    @Column(nullable = false, length = 2)
    private String nro4;
    @Column(nullable = false, length = 2)
    private String nro5;
    @Column(nullable = false, length = 2)
    private String nro6;
    @Column(nullable = false, length = 10)
    private String data_sorteio;

    @Column(nullable = false, length = 10)
    private String sorteio;
    @Column(nullable = false)
    private LocalDateTime registrationDate;


    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

}
