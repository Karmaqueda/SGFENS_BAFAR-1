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
 * This class represents the primary key of the sar_comprobante table.
 */
public class SarComprobantePk implements Serializable
{
	protected int idComprobanteFiscal;

	/** 
	 * This attribute represents whether the primitive attribute idComprobanteFiscal is null.
	 */
	protected boolean idComprobanteFiscalNull;

	/** 
	 * Sets the value of idComprobanteFiscal
	 */
	public void setIdComprobanteFiscal(int idComprobanteFiscal)
	{
		this.idComprobanteFiscal = idComprobanteFiscal;
	}

	/** 
	 * Gets the value of idComprobanteFiscal
	 */
	public int getIdComprobanteFiscal()
	{
		return idComprobanteFiscal;
	}

	/**
	 * Method 'SarComprobantePk'
	 * 
	 */
	public SarComprobantePk()
	{
	}

	/**
	 * Method 'SarComprobantePk'
	 * 
	 * @param idComprobanteFiscal
	 */
	public SarComprobantePk(final int idComprobanteFiscal)
	{
		this.idComprobanteFiscal = idComprobanteFiscal;
	}

	/** 
	 * Sets the value of idComprobanteFiscalNull
	 */
	public void setIdComprobanteFiscalNull(boolean idComprobanteFiscalNull)
	{
		this.idComprobanteFiscalNull = idComprobanteFiscalNull;
	}

	/** 
	 * Gets the value of idComprobanteFiscalNull
	 */
	public boolean isIdComprobanteFiscalNull()
	{
		return idComprobanteFiscalNull;
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
		
		if (!(_other instanceof SarComprobantePk)) {
			return false;
		}
		
		final SarComprobantePk _cast = (SarComprobantePk) _other;
		if (idComprobanteFiscal != _cast.idComprobanteFiscal) {
			return false;
		}
		
		if (idComprobanteFiscalNull != _cast.idComprobanteFiscalNull) {
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
		_hashCode = 29 * _hashCode + idComprobanteFiscal;
		_hashCode = 29 * _hashCode + (idComprobanteFiscalNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SarComprobantePk: " );
		ret.append( "idComprobanteFiscal=" + idComprobanteFiscal );
		return ret.toString();
	}

}
