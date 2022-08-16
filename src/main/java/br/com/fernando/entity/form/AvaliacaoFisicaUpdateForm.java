package br.com.fernando.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaUpdateForm {

  private double peso;

  private double altura;
}
