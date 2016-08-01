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
 * This class represents the primary key of the comprobante_descripcion_personalizada table.
 */
public class ComprobanteDescripcionPersonalizadaPk implements Serializable
{
	protected int idComprobanteDescripcionPersonalizada;

	/** 
	 * This attribute represents whether the primitive attribute idComprobanteDescripcionPersonalizada is null.
	 */
	protected boolean idComprobanteDescripcionPersonalizadaNull;

	/** 
	 * Sets the value of idComprobanteDescripcionPersonalizada
	 */
	public void setIdComprobanteDescripcionPersonalizada(int idComprobanteDescripcionPersonalizada)
	{
		this.idComprobanteDescripcionPersonalizada = idComprobanteDescripcionPersonalizada;
	}

	/** 
	 * Gets the value of idComprobanteDescripcionPersonalizada
	 */
	public int getIdComprobanteDescripcionPersonalizada()
	{
		return idComprobanteDescripcionPersonalizada;
	}

	/**
	 * Method 'ComprobanteDescripcionPersonalizadaPk'
	 * 
	 */
	public ComprobanteDescripcionPersonalizadaPk()
	{
	}

	/**
	 * Method 'ComprobanteDescripcionPersonalizadaPk'
	 * 
	 * @param idComprobanteDescripcionPersonalizada
	 */
	public ComprobanteDescripcionPersonalizadaPk(final int idComprobanteDescripcionPersonalizada)
	{
		this.idComprobanteDescripcionPersonalizada = idComprobanteDescripcionPersonalizada;
	}

	/** 
	 * Sets the value of idComprobanteDescripcionPersonalizadaNull
	 */
	public void setIdComprobanteDescripcionPersonalizadaNull(boolean idComprobanteDescripcionPersonalizadaNull)
	{
		this.idComprobanteDescripcionPersonalizadaNull = idComprobanteDescripcionPersonalizadaNull;
	}

	/** 
	 * Gets the value of idComprobanteDescripcionPersonalizadaNull
	 */
	public boolean isIdComprobanteDescripcionPersonalizadaNull()
	{
		return idComprobanteDescripcionPersonalizadaNull;
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
		
		if (!(_other instanceof ComprobanteDescripcionPersonalizadaPk)) {
			return false;
		}
		
		final ComprobanteDescripcionPersonalizadaPk _cast = (ComprobanteDescripcionPersonalizadaPk) _other;
		if (idComprobanteDescripcionPersonalizada != _cast.idComprobanteDescripcionPersonalizada) {
			return false;
		}
		
		if (idComprobanteDescripcionPersonalizadaNull != _cast.idComprobanteDescripcionPersonalizadaNull) {
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
		_hashCode = 29 * _hashCode + idComprobanteDescripcionPersonalizada;
		_hashCode = 29 * _hashCode + (idComprobanteDescripcionPersonalizadaNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.ComprobanteDescripcionPersonalizadaPk: " );
		ret.append( "idComprobanteDescripcionPersonalizada=" + idComprobanteDescripcionPersonalizada );
		return ret.toString();
	}

}
