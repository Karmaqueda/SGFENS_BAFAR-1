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
 * This class represents the primary key of the municipio table.
 */
public class MunicipioPk implements Serializable
{
	protected long idMunicipio;

	/** 
	 * This attribute represents whether the primitive attribute idMunicipio is null.
	 */
	protected boolean idMunicipioNull;

	/** 
	 * Sets the value of idMunicipio
	 */
	public void setIdMunicipio(long idMunicipio)
	{
		this.idMunicipio = idMunicipio;
	}

	/** 
	 * Gets the value of idMunicipio
	 */
	public long getIdMunicipio()
	{
		return idMunicipio;
	}

	/**
	 * Method 'MunicipioPk'
	 * 
	 */
	public MunicipioPk()
	{
	}

	/**
	 * Method 'MunicipioPk'
	 * 
	 * @param idMunicipio
	 */
	public MunicipioPk(final long idMunicipio)
	{
		this.idMunicipio = idMunicipio;
	}

	/** 
	 * Sets the value of idMunicipioNull
	 */
	public void setIdMunicipioNull(boolean idMunicipioNull)
	{
		this.idMunicipioNull = idMunicipioNull;
	}

	/** 
	 * Gets the value of idMunicipioNull
	 */
	public boolean isIdMunicipioNull()
	{
		return idMunicipioNull;
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
		
		if (!(_other instanceof MunicipioPk)) {
			return false;
		}
		
		final MunicipioPk _cast = (MunicipioPk) _other;
		if (idMunicipio != _cast.idMunicipio) {
			return false;
		}
		
		if (idMunicipioNull != _cast.idMunicipioNull) {
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
		_hashCode = 29 * _hashCode + (int) (idMunicipio ^ (idMunicipio >>> 32));
		_hashCode = 29 * _hashCode + (idMunicipioNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.MunicipioPk: " );
		ret.append( "idMunicipio=" + idMunicipio );
		return ret.toString();
	}

}
