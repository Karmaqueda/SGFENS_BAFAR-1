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
 * This class represents the primary key of the addendas table.
 */
public class AddendasPk implements Serializable
{
	protected int idAddendas;

	/** 
	 * This attribute represents whether the primitive attribute idAddendas is null.
	 */
	protected boolean idAddendasNull;

	/** 
	 * Sets the value of idAddendas
	 */
	public void setIdAddendas(int idAddendas)
	{
		this.idAddendas = idAddendas;
	}

	/** 
	 * Gets the value of idAddendas
	 */
	public int getIdAddendas()
	{
		return idAddendas;
	}

	/**
	 * Method 'AddendasPk'
	 * 
	 */
	public AddendasPk()
	{
	}

	/**
	 * Method 'AddendasPk'
	 * 
	 * @param idAddendas
	 */
	public AddendasPk(final int idAddendas)
	{
		this.idAddendas = idAddendas;
	}

	/** 
	 * Sets the value of idAddendasNull
	 */
	public void setIdAddendasNull(boolean idAddendasNull)
	{
		this.idAddendasNull = idAddendasNull;
	}

	/** 
	 * Gets the value of idAddendasNull
	 */
	public boolean isIdAddendasNull()
	{
		return idAddendasNull;
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
		
		if (!(_other instanceof AddendasPk)) {
			return false;
		}
		
		final AddendasPk _cast = (AddendasPk) _other;
		if (idAddendas != _cast.idAddendas) {
			return false;
		}
		
		if (idAddendasNull != _cast.idAddendasNull) {
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
		_hashCode = 29 * _hashCode + idAddendas;
		_hashCode = 29 * _hashCode + (idAddendasNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.AddendasPk: " );
		ret.append( "idAddendas=" + idAddendas );
		return ret.toString();
	}

}
