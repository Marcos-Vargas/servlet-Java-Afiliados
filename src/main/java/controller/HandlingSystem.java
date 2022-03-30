package controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.Affiliate;
import model.Discipline;
import model.Events_;
import model.Team;
import persistencia.CRUD;
import persistencia.DbConection;

public abstract class HandlingSystem {
	
	// metodos para table Discipline
	
	public static Discipline consultDiscipline(int code) {
		CRUD.setConnection(DbConection.ConexionBD());
		String sql = "select * from productos where id=" + code + ";";
        ResultSet rs = CRUD.consultarBD(sql);
        Discipline ds = new Discipline(sql, sql)
        Producto p1 = new Producto();
		return null;
	}
	 public static ArrayList<Discipline> consultDisciplines(){
		 return null;
	}
	
	//Metodos para table afiliados
	
	public static boolean addAffiliate() {
		return false;
	}
	
	public static boolean updateAffiliate() {
		return false;
	}
	
	public static boolean deleteAffiliate() {
		return false;
	}
	public static Affiliate consultAffiliate() {
		return null;
		
	}
	public static ArrayList<Affiliate>consultAffiliates(){
		return null;
	}
	
	
	//metodos para table Equipos
	
	public static boolean addTeam() {
		return false;
	}
	public static boolean deleteTeam() {
		return false;
	}
	
	public static Team consultTeam() {
		return null;
	}
	
	public static ArrayList<Team> consultTeams(){
		return null;	
	}
	
	// metodos para table eventos
	
	public static boolean addEvent() {
		return false;
	}
	public static boolean deleteEvent() {
		return false;
	}
	
	public static Events_ consultEvent() {
		return null;
	}
	
	public static ArrayList<Events_> consultEvents(){
		return null;	
	}

	
	 // metodos para tabla Team-Affiliates
	
	public static boolean addAffiliatesToTeam() {
		return false;
	}
	
	public static boolean deleteAffiliatesToTeam() {
		return false;
	}
	
	// metodos para la tabla Event-Participants
	
	public static boolean addParticipantToEvent() {
		return false;
	}
	
	public static boolean deleteParticipantToEvent() {
		return false;
	}
	
	// metodos para la tabla Results;
	
	public static boolean addResultToparticipants() {
		return false;
	}
	
	
	//
	
	
	
	
	
	
	
	

}
