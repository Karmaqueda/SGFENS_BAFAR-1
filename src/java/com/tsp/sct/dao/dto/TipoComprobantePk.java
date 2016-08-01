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
 * This class represents the primary key of the tipo_comprobante table.
 */
public class TipoComprobantePk implements Serializable
{
	protected int idTipoComprobante;

	/** 
	 * This attribute represents whether the primitive attribute idTipoComprobante is null.
	 */
	protected boolean idTipoComprobanteNull;

	/** 
	 * Sets the value of idTipoComprobante
	 */
	public void setIdTipoComprobante(int idTipoComprobante)
	{
		this.idTipoComprobante = idTipoComprobante;
	}

	/** 
	 * Gets the value of idTipoComprobante
	 */
	public int getIdTipoComprobante()
	{
		return idTipoComprobante;
	}

	/**
	 * Method 'TipoComprobantePk'
	 * 
	 */
	public TipoComprobantePk()
	{
	}

	/**
	 * Method 'TipoComprobantePk'
	 * 
	 * @param idTipoComprobante
	 */
	public TipoComprobantePk(final int idTipoComprobante)
	{
		this.idTipoComprobante = idTipoComprobante;
	}

	/** 
	 * Sets the value of idTipoComprobanteNull
	 */
	public void setIdTipoComprobanteNull(boolean idTipoComprobanteNull)
	{
		this.idTipoComprobanteNull = idTipoComprobanteNull;
	}

	/** 
	 * Gets the value of idTipoComprobanteNull
	 */
	public boolean isIdTipoComprobanteNull()
	{
		return idTipoComprobanteNull;
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
		
		if (!(_other instanceof TipoComprobantePk)) {
			return false;
		}
		
		final TipoComprobantePk _cast = (TipoComprobantePk) _other;
		if (idTipoComprobante != _cast.idTipoComprobante) {
			return false;
		}
		
		if (idTipoComprobanteNull != _cast.idTipoComprobanteNull) {
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
		_hashCode = 29 * _hashCode + idTipoComprobante;
		_hashCode = 29 * _hashCode + (idTipoComprobanteNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.TipoComprobantePk: " );
		ret.append( "idTipoComprobante=" + idTipoComprobante );
		return ret.toString();
	}

}
