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
 * This class represents the primary key of the certificado_digital table.
 */
public class CertificadoDigitalPk implements Serializable
{
	protected int idCertificadoDigital;

	/** 
	 * This attribute represents whether the primitive attribute idCertificadoDigital is null.
	 */
	protected boolean idCertificadoDigitalNull;

	/** 
	 * Sets the value of idCertificadoDigital
	 */
	public void setIdCertificadoDigital(int idCertificadoDigital)
	{
		this.idCertificadoDigital = idCertificadoDigital;
	}

	/** 
	 * Gets the value of idCertificadoDigital
	 */
	public int getIdCertificadoDigital()
	{
		return idCertificadoDigital;
	}

	/**
	 * Method 'CertificadoDigitalPk'
	 * 
	 */
	public CertificadoDigitalPk()
	{
	}

	/**
	 * Method 'CertificadoDigitalPk'
	 * 
	 * @param idCertificadoDigital
	 */
	public CertificadoDigitalPk(final int idCertificadoDigital)
	{
		this.idCertificadoDigital = idCertificadoDigital;
	}

	/** 
	 * Sets the value of idCertificadoDigitalNull
	 */
	public void setIdCertificadoDigitalNull(boolean idCertificadoDigitalNull)
	{
		this.idCertificadoDigitalNull = idCertificadoDigitalNull;
	}

	/** 
	 * Gets the value of idCertificadoDigitalNull
	 */
	public boolean isIdCertificadoDigitalNull()
	{
		return idCertificadoDigitalNull;
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
		
		if (!(_other instanceof CertificadoDigitalPk)) {
			return false;
		}
		
		final CertificadoDigitalPk _cast = (CertificadoDigitalPk) _other;
		if (idCertificadoDigital != _cast.idCertificadoDigital) {
			return false;
		}
		
		if (idCertificadoDigitalNull != _cast.idCertificadoDigitalNull) {
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
		_hashCode = 29 * _hashCode + idCertificadoDigital;
		_hashCode = 29 * _hashCode + (idCertificadoDigitalNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CertificadoDigitalPk: " );
		ret.append( "idCertificadoDigital=" + idCertificadoDigital );
		return ret.toString();
	}

}
