package UnidadDeportivaUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HORA")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hora {
    @Id @Column(name = "IDHORA")
    private String IDHORA;
}
