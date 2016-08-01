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
 * This class represents the primary key of the carga_xls table.
 */
public class CargaXlsPk implements Serializable
{
	protected int idCarga;

	/** 
	 * This attribute represents whether the primitive attribute idCarga is null.
	 */
	protected boolean idCargaNull;

	/** 
	 * Sets the value of idCarga
	 */
	public void setIdCarga(int idCarga)
	{
		this.idCarga = idCarga;
	}

	/** 
	 * Gets the value of idCarga
	 */
	public int getIdCarga()
	{
		return idCarga;
	}

	/**
	 * Method 'CargaXlsPk'
	 * 
	 */
	public CargaXlsPk()
	{
	}

	/**
	 * Method 'CargaXlsPk'
	 * 
	 * @param idCarga
	 */
	public CargaXlsPk(final int idCarga)
	{
		this.idCarga = idCarga;
	}

	/** 
	 * Sets the value of idCargaNull
	 */
	public void setIdCargaNull(boolean idCargaNull)
	{
		this.idCargaNull = idCargaNull;
	}

	/** 
	 * Gets the value of idCargaNull
	 */
	public boolean isIdCargaNull()
	{
		return idCargaNull;
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
		
		if (!(_other instanceof CargaXlsPk)) {
			return false;
		}
		
		final CargaXlsPk _cast = (CargaXlsPk) _other;
		if (idCarga != _cast.idCarga) {
			return false;
		}
		
		if (idCargaNull != _cast.idCargaNull) {
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
		_hashCode = 29 * _hashCode + idCarga;
		_hashCode = 29 * _hashCode + (idCargaNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CargaXlsPk: " );
		ret.append( "idCarga=" + idCarga );
		return ret.toString();
	}

}
