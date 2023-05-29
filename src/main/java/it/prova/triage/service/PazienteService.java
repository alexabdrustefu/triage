package it.prova.triage.service;

import java.util.List;

import it.prova.triage.dto.PazienteDTO;
import it.prova.triage.model.Paziente;

public interface PazienteService {

	public List<PazienteDTO> listAllPazienti();

	public PazienteDTO visualizzaPaziente(Long id);

	public PazienteDTO inserisciPaziente(PazienteDTO pazienteInput);

	public PazienteDTO aggiornaPaziente(PazienteDTO pazienteInput);

	public void eliminaPaziente(Long id);
	
	Paziente findByCodiceFiscale(String codiceFiscale);
	
	public Paziente aggiorna(Paziente pazienteInstance);
	
	public Paziente caricaSingoloPaziente(Long id);
}