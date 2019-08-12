/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package sga.eis.dto;

import sga.eis.dao.*;
import sga.eis.factory.*;
import sga.eis.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Usuario implements Serializable
{
	/** 
	 * This attribute maps to the column id_usuario in the usuario table.
	 */
	protected Integer idUsuario;

	/** 
	 * This attribute maps to the column id_persona in the usuario table.
	 */
	protected Integer idPersona;

	/** 
	 * This attribute maps to the column username in the usuario table.
	 */
	protected String username;

	/** 
	 * This attribute maps to the column password in the usuario table.
	 */
	protected String password;

	/**
	 * Method 'Usuario'
	 * 
	 */
	public Usuario()
	{
	}

	/**
	 * Method 'getIdUsuario'
	 * 
	 * @return Integer
	 */
	public Integer getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'setIdUsuario'
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(Integer idUsuario)
	{
		this.idUsuario = idUsuario;
	}

	/**
	 * Method 'getIdPersona'
	 * 
	 * @return Integer
	 */
	public Integer getIdPersona()
	{
		return idPersona;
	}

	/**
	 * Method 'setIdPersona'
	 * 
	 * @param idPersona
	 */
	public void setIdPersona(Integer idPersona)
	{
		this.idPersona = idPersona;
	}

	/**
	 * Method 'getUsername'
	 * 
	 * @return String
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Method 'setUsername'
	 * 
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Usuario)) {
			return false;
		}
		
		final Usuario _cast = (Usuario) _other;
		if (idUsuario == null ? _cast.idUsuario != idUsuario : !idUsuario.equals( _cast.idUsuario )) {
			return false;
		}
		
		if (idPersona == null ? _cast.idPersona != idPersona : !idPersona.equals( _cast.idPersona )) {
			return false;
		}
		
		if (username == null ? _cast.username != username : !username.equals( _cast.username )) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idUsuario != null) {
			_hashCode = 29 * _hashCode + idUsuario.hashCode();
		}
		
		if (idPersona != null) {
			_hashCode = 29 * _hashCode + idPersona.hashCode();
		}
		
		if (username != null) {
			_hashCode = 29 * _hashCode + username.hashCode();
		}
		
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsuarioPk
	 */
	public UsuarioPk createPk()
	{
		return new UsuarioPk(idUsuario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "ap.eis.dto.Usuario: " );
		ret.append( "idUsuario=" + idUsuario );
		ret.append( ", idPersona=" + idPersona );
		ret.append( ", username=" + username );
		ret.append( ", password=" + password );
		return ret.toString();
	}

}
