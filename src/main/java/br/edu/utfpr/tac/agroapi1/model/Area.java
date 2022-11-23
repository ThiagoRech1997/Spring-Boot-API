package br.edu.utfpr.tac.agroapi1.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_area")
public class Area {
    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private Long poligonoX;
    @Column(nullable = false)
    private Long poligonoY;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Area() {
        this.id = UUID.randomUUID();
    }
}
