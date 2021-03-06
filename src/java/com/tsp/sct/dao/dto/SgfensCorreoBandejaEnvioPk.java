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
 * This class represents the primary key of the SGFENS_CORREO_BANDEJA_ENVIO table.
 */
public class SgfensCorreoBandejaEnvioPk implements Serializable
{
	protected int idCorreo;

	/** 
	 * This attribute represents whether the primitive attribute idCorreo is null.
	 */
	protected boolean idCorreoNull;

	/** 
	 * Sets the value of idCorreo
	 */
	public void setIdCorreo(int idCorreo)
	{
		this.idCorreo = idCorreo;
	}

	/** 
	 * Gets the value of idCorreo
	 */
	public int getIdCorreo()
	{
		return idCorreo;
	}

	/**
	 * Method 'SgfensCorreoBandejaEnvioPk'
	 * 
	 */
	public SgfensCorreoBandejaEnvioPk()
	{
	}

	/**
	 * Method 'SgfensCorreoBandejaEnvioPk'
	 * 
	 * @param idCorreo
	 */
	public SgfensCorreoBandejaEnvioPk(final int idCorreo)
	{
		this.idCorreo = idCorreo;
	}

	/** 
	 * Sets the value of idCorreoNull
	 */
	public void setIdCorreoNull(boolean idCorreoNull)
	{
		this.idCorreoNull = idCorreoNull;
	}

	/** 
	 * Gets the value of idCorreoNull
	 */
	public boolean isIdCorreoNull()
	{
		return idCorreoNull;
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
		
		if (!(_other instanceof SgfensCorreoBandejaEnvioPk)) {
			return false;
		}
		
		final SgfensCorreoBandejaEnvioPk _cast = (SgfensCorreoBandejaEnvioPk) _other;
		if (idCorreo != _cast.idCorreo) {
			return false;
		}
		
		if (idCorreoNull != _cast.idCorreoNull) {
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
		_hashCode = 29 * _hashCode + idCorreo;
		_hashCode = 29 * _hashCode + (idCorreoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SgfensCorreoBandejaEnvioPk: " );
		ret.append( "idCorreo=" + idCorreo );
		return ret.toString();
	}

}
