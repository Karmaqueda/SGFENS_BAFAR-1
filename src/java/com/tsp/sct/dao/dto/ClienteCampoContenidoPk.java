/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the cliente_campo_contenido table.
 */
public class ClienteCampoContenidoPk implements Serializable
{
	protected int idContenido;

	/** 
	 * This attribute represents whether the primitive attribute idContenido is null.
	 */
	protected boolean idContenidoNull;

	/** 
	 * Sets the value of idContenido
	 */
	public void setIdContenido(int idContenido)
	{
		this.idContenido = idContenido;
	}

	/** 
	 * Gets the value of idContenido
	 */
	public int getIdContenido()
	{
		return idContenido;
	}

	/**
	 * Method 'ClienteCampoContenidoPk'
	 * 
	 */
	public ClienteCampoContenidoPk()
	{
	}

	/**
	 * Method 'ClienteCampoContenidoPk'
	 * 
	 * @param idContenido
	 */
	public ClienteCampoContenidoPk(final int idContenido)
	{
		this.idContenido = idContenido;
	}

	/** 
	 * Sets the value of idContenidoNull
	 */
	public void setIdContenidoNull(boolean idContenidoNull)
	{
		this.idContenidoNull = idContenidoNull;
	}

	/** 
	 * Gets the value of idContenidoNull
	 */
	public boolean isIdContenidoNull()
	{
		return idContenidoNull;
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
		
		if (!(_other instanceof ClienteCampoContenidoPk)) {
			return false;
		}
		
		final ClienteCampoContenidoPk _cast = (ClienteCampoContenidoPk) _other;
		if (idContenido != _cast.idContenido) {
			return false;
		}
		
		if (idContenidoNull != _cast.idContenidoNull) {
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
		_hashCode = 29 * _hashCode + idContenido;
		_hashCode = 29 * _hashCode + (idContenidoNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ClienteCampoContenidoPk: " );
		ret.append( "idContenido=" + idContenido );
		return ret.toString();
	}

}
