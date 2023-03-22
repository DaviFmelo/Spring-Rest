package com.example.demo.teste.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.example.demo.teste.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaModel {

	private Long id;
	private ClienteResumoModel cliente;
	private DestinatarioModel destinatario;
	private BigDecimal taxa;
	private StatusEntrega status;
	private OffsetDateTime dataPedido;
	private OffsetDateTime dataFinalizacao;

}
