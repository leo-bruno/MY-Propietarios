package com;

import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FlowEvent;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;

@ManagedBean(name="UsuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;

	String correo, password, cliente;
	
	Usuario usuario;
	DatastoreService ds;
	Usuario usuarioSeleccionado;
	List<Usuario> listaUsuario;
	
	ObjetoBean objeto;
	
	private boolean skip;
	
	public UsuarioBean() {
		skip=false;
	}
	
	public String irIndexUsuario() {
		return "paginaAdmin";
	}
	public void imprimir(String msg) {
		System.out.println("Mensaje: "+msg);
	}
	public List<Usuario> getLista(){
		imprimir("entra getLista");
		listaUsuario=new ArrayList<Usuario>();
		ds=DatastoreServiceFactory.getDatastoreService();
		Query query=new Query("Usuario").addSort("correo", Query.SortDirection.ASCENDING);
		List<Entity>entities=new ArrayList<Entity>();
		imprimir("hace query");
		entities=ds.prepare(query).asList(FetchOptions.Builder.withLimit(20));
		
		for(Entity e : entities) {
			
			String vCorreo=(String)e.getProperty("correo");
			String vPassword=(String)e.getProperty("password");
			String vCliente=(String)e.getProperty("cliente");
			usuario=new Usuario(vCorreo,vPassword,vCliente);
			listaUsuario.add(usuario);
		}
		
		return listaUsuario;
	}
	public String irModificarUsuario() {
		
		return "";
	}
	
	public String borrarUsuario() {
		return "";
	}
	
	public String irCrearUsuario() {
		return "crearPropietario";
	}
	
	public String Acceder() {
		ds=DatastoreServiceFactory.getDatastoreService();
		listaUsuario=new ArrayList<Usuario>();
		Query q=new Query("Usuario");
		
		List<Entity> ent=ds.prepare(q).asList(FetchOptions.Builder.withDefaults());
		if(ent.isEmpty()) {
			usuarioSeleccionado=new Usuario("support@masteryield.com","Nadia123","todo");
			ds.put(usuarioSeleccionado.getEnt());
		}
		if(correo.equals("support@masteryield.com") && password.equals("Nadia123")) return "paginaAdmin";
		else {
			for(Entity e : ent) {
				if(e.getProperty("correo").toString().equals(correo) && e.getProperty("password").toString().equals(password)) {
					String vC=(String)e.getProperty("correo");
					String vP=(String)e.getProperty("password");
					String vCl=(String)e.getProperty("cliente");
					usuarioSeleccionado=new Usuario(vC,vP,vCl);
					listaUsuario.add(usuarioSeleccionado);
				}
			}
		}
		if(listaUsuario.isEmpty()) return "hello";

		
		return "paginaPrincipal";
	}
	
	public String doRegistro() throws Exception{
		String[] objetos;
		ds=DatastoreServiceFactory.getDatastoreService();
		int i=0;
	
		
		objetos=objeto.getObjetosSeleccionados();
		usuarioSeleccionado=new Usuario(correo,password,cliente);
		ds.put(usuarioSeleccionado.getEnt());
		/* MOTO PARA AGREGAR EN LA BASE DE DATOS, PERO HASTA QUE LA TABLA NO SE CREE NO SE PUEDE PROBAR
		while(!objetos[i].isEmpty()) {
			String query="insert into owner_properties (email,password,objectno) values ('"+correo+"', '"+password+"', '"+objetos[i]+"');";
			String url = "http://130.193.15.22:8080/Propietarios_MY/webresources/com.Operaciones/metodo4/"+query;
	        URLConnection connection = new URL( url).openConnection();
	        InputStream stream=connection.getInputStream();
			i++;
		}
		*/
		return "paginaAdmin";
	}

	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DatastoreService getDs() {
		return ds;
	}

	public void setDs(DatastoreService ds) {
		this.ds = ds;
	}

	public Usuario getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirmar";
        }
        else {
            return event.getNewStep();
        }
    }
	public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
	
}
