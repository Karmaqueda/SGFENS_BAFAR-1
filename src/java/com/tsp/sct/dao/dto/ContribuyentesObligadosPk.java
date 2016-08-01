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
 * This class represents the primary key of the contribuyentes_obligados table.
 */
public class ContribuyentesObligadosPk implements Serializable
{
	protected int idContribuyentesObligados;

	/** 
	 * This attribute represents whether the primitive attribute idContribuyentesObligados is null.
	 */
	protected boolean idContribuyentesObligadosNull;

	/** 
	 * Sets the value of idContribuyentesObligados
	 */
	public void setIdContribuyentesObligados(int idContribuyentesObligados)
	{
		this.idContribuyentesObligados = idContribuyentesObligados;
	}

	/** 
	 * Gets the value of idContribuyentesObligados
	 */
	public int getIdContribuyentesObligados()
	{
		return idContribuyentesObligados;
	}

	/**
	 * Method 'ContribuyentesObligadosPk'
	 * 
	 */
	public ContribuyentesObligadosPk()
	{
	}

	/**
	 * Method 'ContribuyentesObligadosPk'
	 * 
	 * @param idContribuyentesObligados
	 */
	public ContribuyentesObligadosPk(final int idContribuyentesObligados)
	{
		this.idContribuyentesObligados = idContribuyentesObligados;
	}

	/** 
	 * Sets the value of idContribuyentesObligadosNull
	 */
	public void setIdContribuyentesObligadosNull(boolean idContribuyentesObligadosNull)
	{
		this.idContribuyentesObligadosNull = idContribuyentesObligadosNull;
	}

	/** 
	 * Gets the value of idContribuyentesObligadosNull
	 */
	public boolean isIdContribuyentesObligadosNull()
	{
		return idContribuyentesObligadosNull;
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
		
		if (!(_other instanceof ContribuyentesObligadosPk)) {
			return false;
		}
		
		final ContribuyentesObligadosPk _cast = (ContribuyentesObligadosPk) _other;
		if (idContribuyentesObligados != _cast.idContribuyentesObligados) {
			return false;
		}
		
		if (idContribuyentesObligadosNull != _cast.idContribuyentesObligadosNull) {
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
		_hashCode = 29 * _hashCode + idContribuyentesObligados;
		_hashCode = 29 * _hashCode + (idContribuyentesObligadosNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.ContribuyentesObligadosPk: " );
		ret.append( "idContribuyentesObligados=" + idContribuyentesObligados );
		return ret.toString();
	}

}