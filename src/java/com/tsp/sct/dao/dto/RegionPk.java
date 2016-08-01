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
 * This class represents the primary key of the region table.
 */
public class RegionPk implements Serializable
{
	protected long idRegion;

	/** 
	 * This attribute represents whether the primitive attribute idRegion is null.
	 */
	protected boolean idRegionNull;

	/** 
	 * Sets the value of idRegion
	 */
	public void setIdRegion(long idRegion)
	{
		this.idRegion = idRegion;
	}

	/** 
	 * Gets the value of idRegion
	 */
	public long getIdRegion()
	{
		return idRegion;
	}

	/**
	 * Method 'RegionPk'
	 * 
	 */
	public RegionPk()
	{
	}

	/**
	 * Method 'RegionPk'
	 * 
	 * @param idRegion
	 */
	public RegionPk(final long idRegion)
	{
		this.idRegion = idRegion;
	}

	/** 
	 * Sets the value of idRegionNull
	 */
	public void setIdRegionNull(boolean idRegionNull)
	{
		this.idRegionNull = idRegionNull;
	}

	/** 
	 * Gets the value of idRegionNull
	 */
	public boolean isIdRegionNull()
	{
		return idRegionNull;
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
		
		if (!(_other instanceof RegionPk)) {
			return false;
		}
		
		final RegionPk _cast = (RegionPk) _other;
		if (idRegion != _cast.idRegion) {
			return false;
		}
		
		if (idRegionNull != _cast.idRegionNull) {
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
		_hashCode = 29 * _hashCode + (int) (idRegion ^ (idRegion >>> 32));
		_hashCode = 29 * _hashCode + (idRegionNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.RegionPk: " );
		ret.append( "idRegion=" + idRegion );
		return ret.toString();
	}

}
