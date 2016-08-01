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
 * This class represents the primary key of the puntos_interes table.
 */
public class PuntosInteresPk implements Serializable
{
	protected int idPunto;

	/** 
	 * This attribute represents whether the primitive attribute idPunto is null.
	 */
	protected boolean idPuntoNull;

	/** 
	 * Sets the value of idPunto
	 */
	public void setIdPunto(int idPunto)
	{
		this.idPunto = idPunto;
	}

	/** 
	 * Gets the value of idPunto
	 */
	public int getIdPunto()
	{
		return idPunto;
	}

	/**
	 * Method 'PuntosInteresPk'
	 * 
	 */
	public PuntosInteresPk()
	{
	}

	/**
	 * Method 'PuntosInteresPk'
	 * 
	 * @param idPunto
	 */
	public PuntosInteresPk(final int idPunto)
	{
		this.idPunto = idPunto;
	}

	/** 
	 * Sets the value of idPuntoNull
	 */
	public void setIdPuntoNull(boolean idPuntoNull)
	{
		this.idPuntoNull = idPuntoNull;
	}

	/** 
	 * Gets the value of idPuntoNull
	 */
	public boolean isIdPuntoNull()
	{
		return idPuntoNull;
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
		
		if (!(_other instanceof PuntosInteresPk)) {
			return false;
		}
		
		final PuntosInteresPk _cast = (PuntosInteresPk) _other;
		if (idPunto != _cast.idPunto) {
			return false;
		}
		
		if (idPuntoNull != _cast.idPuntoNull) {
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
		_hashCode = 29 * _hashCode + idPunto;
		_hashCode = 29 * _hashCode + (idPuntoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.PuntosInteresPk: " );
		ret.append( "idPunto=" + idPunto );
		return ret.toString();
	}

}