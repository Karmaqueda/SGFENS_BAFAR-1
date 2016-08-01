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
 * This class represents the primary key of the nomina_registro_patronal table.
 */
public class NominaRegistroPatronalPk implements Serializable
{
	protected int idNominaRegPatronal;

	/** 
	 * This attribute represents whether the primitive attribute idNominaRegPatronal is null.
	 */
	protected boolean idNominaRegPatronalNull;

	/** 
	 * Sets the value of idNominaRegPatronal
	 */
	public void setIdNominaRegPatronal(int idNominaRegPatronal)
	{
		this.idNominaRegPatronal = idNominaRegPatronal;
	}

	/** 
	 * Gets the value of idNominaRegPatronal
	 */
	public int getIdNominaRegPatronal()
	{
		return idNominaRegPatronal;
	}

	/**
	 * Method 'NominaRegistroPatronalPk'
	 * 
	 */
	public NominaRegistroPatronalPk()
	{
	}

	/**
	 * Method 'NominaRegistroPatronalPk'
	 * 
	 * @param idNominaRegPatronal
	 */
	public NominaRegistroPatronalPk(final int idNominaRegPatronal)
	{
		this.idNominaRegPatronal = idNominaRegPatronal;
	}

	/** 
	 * Sets the value of idNominaRegPatronalNull
	 */
	public void setIdNominaRegPatronalNull(boolean idNominaRegPatronalNull)
	{
		this.idNominaRegPatronalNull = idNominaRegPatronalNull;
	}

	/** 
	 * Gets the value of idNominaRegPatronalNull
	 */
	public boolean isIdNominaRegPatronalNull()
	{
		return idNominaRegPatronalNull;
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
		
		if (!(_other instanceof NominaRegistroPatronalPk)) {
			return false;
		}
		
		final NominaRegistroPatronalPk _cast = (NominaRegistroPatronalPk) _other;
		if (idNominaRegPatronal != _cast.idNominaRegPatronal) {
			return false;
		}
		
		if (idNominaRegPatronalNull != _cast.idNominaRegPatronalNull) {
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
		_hashCode = 29 * _hashCode + idNominaRegPatronal;
		_hashCode = 29 * _hashCode + (idNominaRegPatronalNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.NominaRegistroPatronalPk: " );
		ret.append( "idNominaRegPatronal=" + idNominaRegPatronal );
		return ret.toString();
	}

}