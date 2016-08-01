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
 * This class represents the primary key of the sgfens_cobranza_abono table.
 */
public class SgfensCobranzaAbonoPk implements Serializable
{
	protected int idCobranzaAbono;

	/** 
	 * This attribute represents whether the primitive attribute idCobranzaAbono is null.
	 */
	protected boolean idCobranzaAbonoNull;

	/** 
	 * Sets the value of idCobranzaAbono
	 */
	public void setIdCobranzaAbono(int idCobranzaAbono)
	{
		this.idCobranzaAbono = idCobranzaAbono;
	}

	/** 
	 * Gets the value of idCobranzaAbono
	 */
	public int getIdCobranzaAbono()
	{
		return idCobranzaAbono;
	}

	/**
	 * Method 'SgfensCobranzaAbonoPk'
	 * 
	 */
	public SgfensCobranzaAbonoPk()
	{
	}

	/**
	 * Method 'SgfensCobranzaAbonoPk'
	 * 
	 * @param idCobranzaAbono
	 */
	public SgfensCobranzaAbonoPk(final int idCobranzaAbono)
	{
		this.idCobranzaAbono = idCobranzaAbono;
	}

	/** 
	 * Sets the value of idCobranzaAbonoNull
	 */
	public void setIdCobranzaAbonoNull(boolean idCobranzaAbonoNull)
	{
		this.idCobranzaAbonoNull = idCobranzaAbonoNull;
	}

	/** 
	 * Gets the value of idCobranzaAbonoNull
	 */
	public boolean isIdCobranzaAbonoNull()
	{
		return idCobranzaAbonoNull;
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
		
		if (!(_other instanceof SgfensCobranzaAbonoPk)) {
			return false;
		}
		
		final SgfensCobranzaAbonoPk _cast = (SgfensCobranzaAbonoPk) _other;
		if (idCobranzaAbono != _cast.idCobranzaAbono) {
			return false;
		}
		
		if (idCobranzaAbonoNull != _cast.idCobranzaAbonoNull) {
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
		_hashCode = 29 * _hashCode + idCobranzaAbono;
		_hashCode = 29 * _hashCode + (idCobranzaAbonoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SgfensCobranzaAbonoPk: " );
		ret.append( "idCobranzaAbono=" + idCobranzaAbono );
		return ret.toString();
	}

}
