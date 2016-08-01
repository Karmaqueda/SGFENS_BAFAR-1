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
 * This class represents the primary key of the SERVICIO table.
 */
public class ServicioPk implements Serializable
{
	protected int idServicio;

	/** 
	 * This attribute represents whether the primitive attribute idServicio is null.
	 */
	protected boolean idServicioNull;

	/** 
	 * Sets the value of idServicio
	 */
	public void setIdServicio(int idServicio)
	{
		this.idServicio = idServicio;
	}

	/** 
	 * Gets the value of idServicio
	 */
	public int getIdServicio()
	{
		return idServicio;
	}

	/**
	 * Method 'ServicioPk'
	 * 
	 */
	public ServicioPk()
	{
	}

	/**
	 * Method 'ServicioPk'
	 * 
	 * @param idServicio
	 */
	public ServicioPk(final int idServicio)
	{
		this.idServicio = idServicio;
	}

	/** 
	 * Sets the value of idServicioNull
	 */
	public void setIdServicioNull(boolean idServicioNull)
	{
		this.idServicioNull = idServicioNull;
	}

	/** 
	 * Gets the value of idServicioNull
	 */
	public boolean isIdServicioNull()
	{
		return idServicioNull;
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
		
		if (!(_other instanceof ServicioPk)) {
			return false;
		}
		
		final ServicioPk _cast = (ServicioPk) _other;
		if (idServicio != _cast.idServicio) {
			return false;
		}
		
		if (idServicioNull != _cast.idServicioNull) {
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
		_hashCode = 29 * _hashCode + idServicio;
		_hashCode = 29 * _hashCode + (idServicioNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.ServicioPk: " );
		ret.append( "idServicio=" + idServicio );
		return ret.toString();
	}

}