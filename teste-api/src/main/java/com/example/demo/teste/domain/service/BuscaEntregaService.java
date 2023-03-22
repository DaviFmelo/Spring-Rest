package com.example.demo.teste.domain.service;

import org.springframework.stereotype.Service;

import com.example.demo.teste.domain.exception.EntidadeNaoEncontradaException;
import com.example.demo.teste.domain.model.Entrega;
import com.example.demo.teste.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;

	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
