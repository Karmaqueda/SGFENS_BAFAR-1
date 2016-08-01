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
 * This class represents the primary key of the cr_score table.
 */
public class CrScorePk implements Serializable
{
	protected int idScore;

	/** 
	 * This attribute represents whether the primitive attribute idScore is null.
	 */
	protected boolean idScoreNull;

	/** 
	 * Sets the value of idScore
	 */
	public void setIdScore(int idScore)
	{
		this.idScore = idScore;
	}

	/** 
	 * Gets the value of idScore
	 */
	public int getIdScore()
	{
		return idScore;
	}

	/**
	 * Method 'CrScorePk'
	 * 
	 */
	public CrScorePk()
	{
	}

	/**
	 * Method 'CrScorePk'
	 * 
	 * @param idScore
	 */
	public CrScorePk(final int idScore)
	{
		this.idScore = idScore;
	}

	/** 
	 * Sets the value of idScoreNull
	 */
	public void setIdScoreNull(boolean idScoreNull)
	{
		this.idScoreNull = idScoreNull;
	}

	/** 
	 * Gets the value of idScoreNull
	 */
	public boolean isIdScoreNull()
	{
		return idScoreNull;
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
		
		if (!(_other instanceof CrScorePk)) {
			return false;
		}
		
		final CrScorePk _cast = (CrScorePk) _other;
		if (idScore != _cast.idScore) {
			return false;
		}
		
		if (idScoreNull != _cast.idScoreNull) {
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
		_hashCode = 29 * _hashCode + idScore;
		_hashCode = 29 * _hashCode + (idScoreNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrScorePk: " );
		ret.append( "idScore=" + idScore );
		return ret.toString();
	}

}
