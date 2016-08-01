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
 * This class represents the primary key of the sgfens_cobranza_registro_deposito_banco table.
 */
public class SgfensCobranzaRegistroDepositoBancoPk implements Serializable
{
	protected int idDeposito;

	/** 
	 * This attribute represents whether the primitive attribute idDeposito is null.
	 */
	protected boolean idDepositoNull;

	/** 
	 * Sets the value of idDeposito
	 */
	public void setIdDeposito(int idDeposito)
	{
		this.idDeposito = idDeposito;
	}

	/** 
	 * Gets the value of idDeposito
	 */
	public int getIdDeposito()
	{
		return idDeposito;
	}

	/**
	 * Method 'SgfensCobranzaRegistroDepositoBancoPk'
	 * 
	 */
	public SgfensCobranzaRegistroDepositoBancoPk()
	{
	}

	/**
	 * Method 'SgfensCobranzaRegistroDepositoBancoPk'
	 * 
	 * @param idDeposito
	 */
	public SgfensCobranzaRegistroDepositoBancoPk(final int idDeposito)
	{
		this.idDeposito = idDeposito;
	}

	/** 
	 * Sets the value of idDepositoNull
	 */
	public void setIdDepositoNull(boolean idDepositoNull)
	{
		this.idDepositoNull = idDepositoNull;
	}

	/** 
	 * Gets the value of idDepositoNull
	 */
	public boolean isIdDepositoNull()
	{
		return idDepositoNull;
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
		
		if (!(_other instanceof SgfensCobranzaRegistroDepositoBancoPk)) {
			return false;
		}
		
		final SgfensCobranzaRegistroDepositoBancoPk _cast = (SgfensCobranzaRegistroDepositoBancoPk) _other;
		if (idDeposito != _cast.idDeposito) {
			return false;
		}
		
		if (idDepositoNull != _cast.idDepositoNull) {
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
		_hashCode = 29 * _hashCode + idDeposito;
		_hashCode = 29 * _hashCode + (idDepositoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.SgfensCobranzaRegistroDepositoBancoPk: " );
		ret.append( "idDeposito=" + idDeposito );
		return ret.toString();
	}

}
