package com.bellicose.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mx.com.bellicose.futbolistasmongo.dao.FutbolistaDAO;
import mx.com.bellicose.futbolistasmongo.dto.Futbolista;

@Path("/bellicose")
public class FutbolistaREST {

	@GET
	@Path("/leer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Futbolista> leerFutbolista(){
		FutbolistaDAO dao = new FutbolistaDAO();
		List<Futbolista> leer = dao.leer();
		ArrayList<Futbolista> futbolistas = new ArrayList<>();
		System.out.println("ESTOY en REST ===>");
		for (Futbolista futbolista : leer) {
			futbolistas.add((Futbolista) futbolista);
			System.out.println(futbolista.toString());
		}
		return futbolistas;
	}
}
