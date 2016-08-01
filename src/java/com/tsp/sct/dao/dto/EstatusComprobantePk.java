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
 * This class represents the primary key of the estatus_comprobante table.
 */
public class EstatusComprobantePk implements Serializable
{
	protected int idEstatusComprobante;

	/** 
	 * This attribute represents whether the primitive attribute idEstatusComprobante is null.
	 */
	protected boolean idEstatusComprobanteNull;

	/** 
	 * Sets the value of idEstatusComprobante
	 */
	public void setIdEstatusComprobante(int idEstatusComprobante)
	{
		this.idEstatusComprobante = idEstatusComprobante;
	}

	/** 
	 * Gets the value of idEstatusComprobante
	 */
	public int getIdEstatusComprobante()
	{
		return idEstatusComprobante;
	}

	/**
	 * Method 'EstatusComprobantePk'
	 * 
	 */
	public EstatusComprobantePk()
	{
	}

	/**
	 * Method 'EstatusComprobantePk'
	 * 
	 * @param idEstatusComprobante
	 */
	public EstatusComprobantePk(final int idEstatusComprobante)
	{
		this.idEstatusComprobante = idEstatusComprobante;
	}

	/** 
	 * Sets the value of idEstatusComprobanteNull
	 */
	public void setIdEstatusComprobanteNull(boolean idEstatusComprobanteNull)
	{
		this.idEstatusComprobanteNull = idEstatusComprobanteNull;
	}

	/** 
	 * Gets the value of idEstatusComprobanteNull
	 */
	public boolean isIdEstatusComprobanteNull()
	{
		return idEstatusComprobanteNull;
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
		
		if (!(_other instanceof EstatusComprobantePk)) {
			return false;
		}
		
		final EstatusComprobantePk _cast = (EstatusComprobantePk) _other;
		if (idEstatusComprobante != _cast.idEstatusComprobante) {
			return false;
		}
		
		if (idEstatusComprobanteNull != _cast.idEstatusComprobanteNull) {
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
		_hashCode = 29 * _hashCode + idEstatusComprobante;
		_hashCode = 29 * _hashCode + (idEstatusComprobanteNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.EstatusComprobantePk: " );
		ret.append( "idEstatusComprobante=" + idEstatusComprobante );
		return ret.toString();
	}

}
