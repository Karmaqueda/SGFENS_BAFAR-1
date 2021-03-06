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
 * This class represents the primary key of the call_center table.
 */
public class CallCenterPk implements Serializable
{
	protected int idCallCenter;

	/** 
	 * This attribute represents whether the primitive attribute idCallCenter is null.
	 */
	protected boolean idCallCenterNull;

	/** 
	 * Sets the value of idCallCenter
	 */
	public void setIdCallCenter(int idCallCenter)
	{
		this.idCallCenter = idCallCenter;
	}

	/** 
	 * Gets the value of idCallCenter
	 */
	public int getIdCallCenter()
	{
		return idCallCenter;
	}

	/**
	 * Method 'CallCenterPk'
	 * 
	 */
	public CallCenterPk()
	{
	}

	/**
	 * Method 'CallCenterPk'
	 * 
	 * @param idCallCenter
	 */
	public CallCenterPk(final int idCallCenter)
	{
		this.idCallCenter = idCallCenter;
	}

	/** 
	 * Sets the value of idCallCenterNull
	 */
	public void setIdCallCenterNull(boolean idCallCenterNull)
	{
		this.idCallCenterNull = idCallCenterNull;
	}

	/** 
	 * Gets the value of idCallCenterNull
	 */
	public boolean isIdCallCenterNull()
	{
		return idCallCenterNull;
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
		
		if (!(_other instanceof CallCenterPk)) {
			return false;
		}
		
		final CallCenterPk _cast = (CallCenterPk) _other;
		if (idCallCenter != _cast.idCallCenter) {
			return false;
		}
		
		if (idCallCenterNull != _cast.idCallCenterNull) {
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
		_hashCode = 29 * _hashCode + idCallCenter;
		_hashCode = 29 * _hashCode + (idCallCenterNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CallCenterPk: " );
		ret.append( "idCallCenter=" + idCallCenter );
		return ret.toString();
	}

}
