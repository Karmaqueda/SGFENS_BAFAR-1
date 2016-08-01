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
 * This class represents the primary key of the paquete_relacion_concepto table.
 */
public class PaqueteRelacionConceptoPk implements Serializable
{
	protected int idPaqueteRelacionConcepto;

	/** 
	 * This attribute represents whether the primitive attribute idPaqueteRelacionConcepto is null.
	 */
	protected boolean idPaqueteRelacionConceptoNull;

	/** 
	 * Sets the value of idPaqueteRelacionConcepto
	 */
	public void setIdPaqueteRelacionConcepto(int idPaqueteRelacionConcepto)
	{
		this.idPaqueteRelacionConcepto = idPaqueteRelacionConcepto;
	}

	/** 
	 * Gets the value of idPaqueteRelacionConcepto
	 */
	public int getIdPaqueteRelacionConcepto()
	{
		return idPaqueteRelacionConcepto;
	}

	/**
	 * Method 'PaqueteRelacionConceptoPk'
	 * 
	 */
	public PaqueteRelacionConceptoPk()
	{
	}

	/**
	 * Method 'PaqueteRelacionConceptoPk'
	 * 
	 * @param idPaqueteRelacionConcepto
	 */
	public PaqueteRelacionConceptoPk(final int idPaqueteRelacionConcepto)
	{
		this.idPaqueteRelacionConcepto = idPaqueteRelacionConcepto;
	}

	/** 
	 * Sets the value of idPaqueteRelacionConceptoNull
	 */
	public void setIdPaqueteRelacionConceptoNull(boolean idPaqueteRelacionConceptoNull)
	{
		this.idPaqueteRelacionConceptoNull = idPaqueteRelacionConceptoNull;
	}

	/** 
	 * Gets the value of idPaqueteRelacionConceptoNull
	 */
	public boolean isIdPaqueteRelacionConceptoNull()
	{
		return idPaqueteRelacionConceptoNull;
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
		
		if (!(_other instanceof PaqueteRelacionConceptoPk)) {
			return false;
		}
		
		final PaqueteRelacionConceptoPk _cast = (PaqueteRelacionConceptoPk) _other;
		if (idPaqueteRelacionConcepto != _cast.idPaqueteRelacionConcepto) {
			return false;
		}
		
		if (idPaqueteRelacionConceptoNull != _cast.idPaqueteRelacionConceptoNull) {
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
		_hashCode = 29 * _hashCode + idPaqueteRelacionConcepto;
		_hashCode = 29 * _hashCode + (idPaqueteRelacionConceptoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.PaqueteRelacionConceptoPk: " );
		ret.append( "idPaqueteRelacionConcepto=" + idPaqueteRelacionConcepto );
		return ret.toString();
	}

}
