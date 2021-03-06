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
 * This class represents the primary key of the nomina_puesto table.
 */
public class NominaPuestoPk implements Serializable
{
	protected int idPuesto;

	/** 
	 * This attribute represents whether the primitive attribute idPuesto is null.
	 */
	protected boolean idPuestoNull;

	/** 
	 * Sets the value of idPuesto
	 */
	public void setIdPuesto(int idPuesto)
	{
		this.idPuesto = idPuesto;
	}

	/** 
	 * Gets the value of idPuesto
	 */
	public int getIdPuesto()
	{
		return idPuesto;
	}

	/**
	 * Method 'NominaPuestoPk'
	 * 
	 */
	public NominaPuestoPk()
	{
	}

	/**
	 * Method 'NominaPuestoPk'
	 * 
	 * @param idPuesto
	 */
	public NominaPuestoPk(final int idPuesto)
	{
		this.idPuesto = idPuesto;
	}

	/** 
	 * Sets the value of idPuestoNull
	 */
	public void setIdPuestoNull(boolean idPuestoNull)
	{
		this.idPuestoNull = idPuestoNull;
	}

	/** 
	 * Gets the value of idPuestoNull
	 */
	public boolean isIdPuestoNull()
	{
		return idPuestoNull;
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
		
		if (!(_other instanceof NominaPuestoPk)) {
			return false;
		}
		
		final NominaPuestoPk _cast = (NominaPuestoPk) _other;
		if (idPuesto != _cast.idPuesto) {
			return false;
		}
		
		if (idPuestoNull != _cast.idPuestoNull) {
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
		_hashCode = 29 * _hashCode + idPuesto;
		_hashCode = 29 * _hashCode + (idPuestoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.NominaPuestoPk: " );
		ret.append( "idPuesto=" + idPuesto );
		return ret.toString();
	}

}
