package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Affiliate;
import model.Discipline;
import model.Events_;
import model.Results;
import model.Team;
import model.Team_affiliates;
import persistencia.CRUD;
import persistencia.DbConection;

public abstract class HandlingSystem {
	
	// metodos para table Discipline
	
	public static Discipline consultDiscipline(int code) {
		CRUD.setConnection(DbConection.ConexionBD());
		String sql = "select * from Disciplines where codigo=" + code + ";";
        ResultSet rs = CRUD.consultarBD(sql);
        Discipline ds = new Discipline();
        try {
        	if(rs.next()) {
        		ds.setCode(rs.getString("codigo"));
        		ds.setName(rs.getString("nombre"));
        		CRUD.cerrarConexion();
        	}else {
                CRUD.cerrarConexion();
                return null;
			}
        	
		} catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
		}

		return ds;
	}
	public static ArrayList<Discipline> consultDisciplines(){
	        CRUD.setConnection(DbConection.ConexionBD());
	        ArrayList<Discipline> listDisciplines = new ArrayList<>();
	        try {
	            String sql = "select * from Disciplines";
	            ResultSet rs = CRUD.consultarBD(sql);
	            while(rs.next()) {
	            	Discipline ds = new Discipline();
	        		ds.setCode(rs.getString("codigo"));
	        		ds.setName(rs.getString("nombre"));
	        		listDisciplines.add(ds);	
	            }
			} catch (SQLException ex) {
	            System.out.println(ex);
	        } finally {
	            CRUD.cerrarConexion();
	        }
		 
		 return listDisciplines;
	}
	
	//Metodos para table afiliados
	
	public static boolean addAffiliate(Affiliate af) {
		CRUD.setConnection(DbConection.ConexionBD());
		String sentencia = "INSERT INTO Affiliates(id,nombres,apellidos,birthday,celular,estado)"+
		" VALUES ("+"'"+af.getId()+"','"+"'"+af.getFirstName()+"','"+"'"+af.getLastName()+"','"
				+"'"+af.getBirthday()+"','"+"'"+af.getPhone()+"','"+"'"+af.getState()+"');";
		
		 if (CRUD.setAutoCommitBD(false)) {
	            if (CRUD.insertarBD(sentencia)) {
	                CRUD.commitBD();
	                CRUD.cerrarConexion();
	                return true;
	            } else {
	                CRUD.rollbackBD();
	                CRUD.cerrarConexion();
	                return false;
	            }
	        } else {
	            CRUD.cerrarConexion();
	            return false;
	        }
		
	}
	public static boolean updateAffiliate(Affiliate af) {
        CRUD.setConnection(DbConection.ConexionBD());
		String sentence= "UPDATE `Affiliates` SET id='"+af.getId()+"',nombres='"+af.getFirstName()
		+"',apellidos='"+af.getLastName()+"',birthday='"+af.getBirthday()+"',celular='"
		+af.getPhone()+"'.estado='"+af.getState()+"' WHERE `id`='"+af.getId()+"';";
        
		if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.actualizarBD(sentence)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
	}
	public static boolean deleteAffiliate(int code) {
        CRUD.setConnection(DbConection.ConexionBD());
        String Sentencia = "DELETE FROM `Affiliates` WHERE `id`='" + code + "';";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.borrarBD(Sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
		
	}
	public static Affiliate consultAffiliate(String code) {
		
		 CRUD.setConnection(DbConection.ConexionBD());
	        String sql = "select * from Affiliates where id=" + code + ";";
	        ResultSet rs = CRUD.consultarBD(sql);
	        Affiliate aff = new Affiliate();
	        try {
	            if (rs.next()) {
	            	aff.setId(rs.getString("id"));
	            	aff.setFirstName(rs.getString("nombres"));
	            	aff.setLastName(rs.getString("apellidos"));
	            	aff.setBirthday(rs.getString("birthday"));
	            	aff.setPhone(rs.getString("celular"));
	            	aff.setState(rs.getString("estado"));
	                CRUD.cerrarConexion();
	            } else {
	                CRUD.cerrarConexion();
	                return null;
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return null;
	        }
	        return aff;
		
	}
	public static ArrayList<Affiliate>consultAffiliates(){
		ArrayList<Affiliate> affs= new ArrayList<Affiliate>();
		CRUD.setConnection(DbConection.ConexionBD());
        String sql = "select * from Affiliates;";
        ResultSet rs = CRUD.consultarBD(sql);
        Affiliate aff = new Affiliate();
        try {
            while (rs.next()) {
            	aff.setId(rs.getString("id"));
            	aff.setFirstName(rs.getString("nombres"));
            	aff.setLastName(rs.getString("apellidos"));
            	aff.setBirthday(rs.getString("birthday"));
            	aff.setPhone(rs.getString("celular"));
            	aff.setState(rs.getString("estado"));
            	affs.add(aff);
               
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
        	 CRUD.cerrarConexion();
		}
        return affs;

	}
	
	//metodos para table Equipos
	
	public static boolean addTeam(Team team) {
		CRUD.setConnection(DbConection.ConexionBD());
		String sentencia = "INSERT INTO Teams(codigo,nombre,estado)"+
		" VALUES ("+"'"+team.getCode()+"','"+"'"+team.getName()+"','"+"'"+team.getState()+"');";
		 if (CRUD.setAutoCommitBD(false)) {
	            if (CRUD.insertarBD(sentencia)) {
	                CRUD.commitBD();
	                CRUD.cerrarConexion();
	                return true;
	            } else {
	                CRUD.rollbackBD();
	                CRUD.cerrarConexion();
	                return false;
	            }
	        } else {
	            CRUD.cerrarConexion();
	            return false;
	        }

	}
	// En estos delete solo hay que cambiar el estado...No eliminarlo completamente de la tabla
	public static boolean deleteTeam(String code) {
		
		CRUD.setConnection(DbConection.ConexionBD());
        String Sentencia = "DELETE FROM `Teams` WHERE `codigo`='" + code + "';";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.borrarBD(Sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
		
	}	
	public static Team consultTeam(){
		CRUD.setConnection(DbConection.ConexionBD());
        String sql = "select * from Teams;";
        ResultSet rs = CRUD.consultarBD(sql);
        Team team = new Team();
        try {
            if (rs.next()) {
            	team.setCode(rs.getString("codigo"));;
            	team.setName(rs.getString("nombre"));
            	team.setState(rs.getString("estado"));
                CRUD.cerrarConexion();

            }
            else {
                CRUD.cerrarConexion();
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
		
		return team;	
	}
	public static ArrayList<Team> consultTeams(){
		ArrayList<Team> teamList= new ArrayList<Team>();
		CRUD.setConnection(DbConection.ConexionBD());
        String sql = "select * from Teams;";
        ResultSet rs = CRUD.consultarBD(sql);
        Team team = new Team();
        try {
            while (rs.next()) {
            	team.setCode(rs.getString("codigo"));;
            	team.setName(rs.getString("nombre"));
            	team.setState(rs.getString("estado"));
            	teamList.add(team);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
        	 CRUD.cerrarConexion();
		}
		
		return teamList;	
	}
	
	// metodos para table eventos
	
	public static boolean addEvent(Events_ evento) {
		CRUD.setConnection(DbConection.ConexionBD());
		String sentencia = "INSERT INTO Events (codigo,nombre,estado,codDisciplina)"+
		" VALUES ("+"'"+evento.getCode()+"','"+"'"+evento.getName()+"','"+"'"+evento.getState()
		+"'"+evento.getCodDiscipline()+"');";
		 if (CRUD.setAutoCommitBD(false)) {
	            if (CRUD.insertarBD(sentencia)) {
	                CRUD.commitBD();
	                CRUD.cerrarConexion();
	                return true;
	            } else {
	                CRUD.rollbackBD();
	                CRUD.cerrarConexion();
	                return false;
	            }
	        } else {
	            CRUD.cerrarConexion();
	            return false;
	        }

	}
	
	// Tambien hay que cambiar esto para que no lo elimine completamente sino que solo
	
	//cambie el estado;->>>>>ERROR<<<<<<<-------------------------------------------
	
	public static boolean deleteEvent(String code) {
		
		CRUD.setConnection(DbConection.ConexionBD());
        String Sentencia = "DELETE FROM `Events` WHERE `codigo`='" + code + "';";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.borrarBD(Sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
		

	}	
	public static Events_ consultEvent(String code) {
		CRUD.setConnection(DbConection.ConexionBD());
        String sql = "select * from Events WHERE `codigo`='"+code+";";
        ResultSet rs = CRUD.consultarBD(sql);
        Events_ event = new Events_();
        try {
            if (rs.next()) {
            	event.setCode(rs.getString("codigo"));;
            	event.setName(rs.getString("nombre"));
            	event.setState(rs.getString("estado"));
                CRUD.cerrarConexion();
            }
            else {
            	CRUD.cerrarConexion();
            	return null;
            	
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
		return event;	
	}
	public static ArrayList<Events_> consultEvents(){
		
		ArrayList<Events_> eventList= new ArrayList<Events_>();
		CRUD.setConnection(DbConection.ConexionBD());
        String sql = "select * from Events;";
        ResultSet rs = CRUD.consultarBD(sql);
        Events_ event = new Events_();
        try {
            while (rs.next()) {
            	event.setCode(rs.getString("codigo"));;
            	event.setName(rs.getString("nombre"));
            	event.setState(rs.getString("estado"));
            	eventList.add(event);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
        	 CRUD.cerrarConexion();
		}
		return eventList;	

	}

	 // metodos para tabla Team-Affiliates
	
	//**** Creo que aqui podria implementarse un metodo para validar si exite un codigoT y codigoA iguales
	public static boolean addAffiliatesToTeam(String codeTeam,String codeAffiliate) {
		CRUD.setConnection(DbConection.ConexionBD());
		String sentencia = "INSERT INTO Team-Affiliates (codEquipo,codAfiliado)"+
		" VALUES ("+"'"+codeTeam+"','"+"'"+codeAffiliate+"');";
		 if (CRUD.setAutoCommitBD(false)) {
	            if (CRUD.insertarBD(sentencia)) {
	                CRUD.commitBD();
	                CRUD.cerrarConexion();
	                return true;
	            } else {
	                CRUD.rollbackBD();
	                CRUD.cerrarConexion();
	                return false;
	            }
	        } else {
	            CRUD.cerrarConexion();
	            return false;
	        }

	}
	public static boolean deleteAffiliatesToTeam(String code) {
		CRUD.setConnection(DbConection.ConexionBD());
        String Sentencia = "DELETE FROM `Team-Affiliates` WHERE `codAfiliado`='" + code + "';";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.borrarBD(Sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
	}
	public static ArrayList<Team_affiliates> consultTeamAffiliates(String codeTeam) {
		 CRUD.setConnection(DbConection.ConexionBD());
		 	ArrayList<Team_affiliates> listAffiliatesToTeam = new ArrayList<Team_affiliates>();
	        String sql = "select * from Team-Affiliates where id=" + codeTeam + ";";
	        ResultSet rs = CRUD.consultarBD(sql);
	        Team_affiliates ta = new Team_affiliates();
	        try {
	            while (rs.next()) {
	            	ta.setCodeAffiliate(rs.getString("codAfiliado"));
	            	ta.setCodeTeam(rs.getString("codEquipo"));
	            	listAffiliatesToTeam.add(ta);
	                CRUD.cerrarConexion();
	            } 
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return null;
	        }finally {
	        	CRUD.cerrarConexion();
			}
	        return listAffiliatesToTeam;
	}
	
	// metodos para la tabla Event-Participants
	
	public static boolean addParticipantToEvent(String codeEvent, String codeParticipant) {
		
		CRUD.setConnection(DbConection.ConexionBD());
		String sentencia = "INSERT INTO Event-Participants(codEvento,codParticipante)"+
		" VALUES ("+"'"+codeEvent+"','"+"'"+codeParticipant+"');";
		
		 if (CRUD.setAutoCommitBD(false)) {
	            if (CRUD.insertarBD(sentencia)) {
	                CRUD.commitBD();
	                CRUD.cerrarConexion();
	                return true;
	            } else {
	                CRUD.rollbackBD();
	                CRUD.cerrarConexion();
	                return false;
	            }
	        } else {
	            CRUD.cerrarConexion();
	            return false;
	        }
		
	}
	public static boolean deleteParticipantToEvent(String codeParticipant) {
		CRUD.setConnection(DbConection.ConexionBD());
        String Sentencia = "DELETE FROM `Event-Participants` WHERE `codParticipante`='" + codeParticipant + "';";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.borrarBD(Sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
	}
	
	// metodos para la tabla Results;
	
	public static boolean addResultToparticipants(String codeEvent,String codeParticipant, String rank) {
		
		CRUD.setConnection(DbConection.ConexionBD());
		String sentencia = "INSERT INTO Results(codEvento,codParticipant,ranking)"+
		" VALUES ("+"'"+codeEvent+"','"+"'"+codeParticipant+"','"+rank+"');";
		 if (CRUD.setAutoCommitBD(false)) {
	            if (CRUD.insertarBD(sentencia)) {
	                CRUD.commitBD();
	                CRUD.cerrarConexion();
	                return true;
	            } else {
	                CRUD.rollbackBD();
	                CRUD.cerrarConexion();
	                return false;
	            }
	        } else {
	            CRUD.cerrarConexion();
	            return false;
	        }
	}	
	public static ArrayList<Results> consultResults(String code){
		
		 	CRUD.setConnection(DbConection.ConexionBD());
		 	ArrayList<Results> listResults = new ArrayList();
	        String sql=null;
		 	if(code!=null) {
		 		if(code.length()==5) {
		 			sql= "select * from Results WHERE codEvento ;";;
		 		}else {
		 			sql= "select * from Results WHERE codParticipant ;";
		 		}
		 	}else {
		 		return null;
		 	}

	        ResultSet rs = CRUD.consultarBD(sql);
	        Results result = new Results();
	        try {
	            while (rs.next()) {
	            	result.setCodeEvent(rs.getString("codEvento"));
	            	result.setCodeParticipant(rs.getString("codParticipant"));
	            	result.setRanking(rs.getString("ranking"));
	            	listResults.add(result);
	                CRUD.cerrarConexion();
	            } 
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return null;
	        }finally {
	        	CRUD.cerrarConexion();
			}
	        return listResults;
	}
	// Metodos aledaños para consultas o actualizaciones
	
	public static String consultStateOfAnyThing(String code) {
		
		 CRUD.setConnection(DbConection.ConexionBD());
		 String sql=null;
		 	if(code!=null) {
		 		if(code.length()==4) {
		 			sql= "select * from Teams where codigo=" + code + ";";
		 		}else if(code.length()==5){
		 			sql= "select * from Events where codigo=" + code + ";";
		 			
		 		}else {
		 			sql= "select * from Affiliates where id=" + code + ";";
		 		}
		 	}else {
		 		return null;
		 	}
	        
	        ResultSet rs = CRUD.consultarBD(sql);
	        String out=null;
	        try {
	            if (rs.next()) {
	            	out=rs.getString("estado");
	                CRUD.cerrarConexion();
	            } else {
	                CRUD.cerrarConexion();
	                return null;
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            return null;
	        }
	        return out;
	}
	public static boolean updateStateOfAnyThing(String code,String newState) {
		
        CRUD.setConnection(DbConection.ConexionBD());
        String sql=null;
	 	if(code!=null) {
	 		if(code.length()==4) {
	 			sql= "UPDATE `Teams` SET estado='"+newState+"' WHERE id="+code+";";
	 		}else if(code.length()==5){
	 			sql= "UPDATE `Events` SET estado='"+newState+"' WHERE codigo="+code+";";
	 			
	 		}else {
	 			sql= "UPDATE `Affiliates` SET estado='"+newState+"' WHERE codigo="+code+";";
	 		}
	 	}else {
	 		return false;
	 	}
        
		if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.actualizarBD(sql)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
		
	}
	
	

	

	
	
	
	
	
	
	

}
