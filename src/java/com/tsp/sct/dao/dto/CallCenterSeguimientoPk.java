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
 * This class represents the primary key of the call_center_seguimiento table.
 */
public class CallCenterSeguimientoPk implements Serializable
{
	protected int idCallCenterSeguimiento;

	/** 
	 * This attribute represents whether the primitive attribute idCallCenterSeguimiento is null.
	 */
	protected boolean idCallCenterSeguimientoNull;

	/** 
	 * Sets the value of idCallCenterSeguimiento
	 */
	public void setIdCallCenterSeguimiento(int idCallCenterSeguimiento)
	{
		this.idCallCenterSeguimiento = idCallCenterSeguimiento;
	}

	/** 
	 * Gets the value of idCallCenterSeguimiento
	 */
	public int getIdCallCenterSeguimiento()
	{
		return idCallCenterSeguimiento;
	}

	/**
	 * Method 'CallCenterSeguimientoPk'
	 * 
	 */
	public CallCenterSeguimientoPk()
	{
	}

	/**
	 * Method 'CallCenterSeguimientoPk'
	 * 
	 * @param idCallCenterSeguimiento
	 */
	public CallCenterSeguimientoPk(final int idCallCenterSeguimiento)
	{
		this.idCallCenterSeguimiento = idCallCenterSeguimiento;
	}

	/** 
	 * Sets the value of idCallCenterSeguimientoNull
	 */
	public void setIdCallCenterSeguimientoNull(boolean idCallCenterSeguimientoNull)
	{
		this.idCallCenterSeguimientoNull = idCallCenterSeguimientoNull;
	}

	/** 
	 * Gets the value of idCallCenterSeguimientoNull
	 */
	public boolean isIdCallCenterSeguimientoNull()
	{
		return idCallCenterSeguimientoNull;
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
		
		if (!(_other instanceof CallCenterSeguimientoPk)) {
			return false;
		}
		
		final CallCenterSeguimientoPk _cast = (CallCenterSeguimientoPk) _other;
		if (idCallCenterSeguimiento != _cast.idCallCenterSeguimiento) {
			return false;
		}
		
		if (idCallCenterSeguimientoNull != _cast.idCallCenterSeguimientoNull) {
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
		_hashCode = 29 * _hashCode + idCallCenterSeguimiento;
		_hashCode = 29 * _hashCode + (idCallCenterSeguimientoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CallCenterSeguimientoPk: " );
		ret.append( "idCallCenterSeguimiento=" + idCallCenterSeguimiento );
		return ret.toString();
	}

}
