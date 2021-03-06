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
 * This class represents the primary key of the cr_cred_cliente table.
 */
public class CrCredClientePk implements Serializable
{
	protected int idCredCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCredCliente is null.
	 */
	protected boolean idCredClienteNull;

	/** 
	 * Sets the value of idCredCliente
	 */
	public void setIdCredCliente(int idCredCliente)
	{
		this.idCredCliente = idCredCliente;
	}

	/** 
	 * Gets the value of idCredCliente
	 */
	public int getIdCredCliente()
	{
		return idCredCliente;
	}

	/**
	 * Method 'CrCredClientePk'
	 * 
	 */
	public CrCredClientePk()
	{
	}

	/**
	 * Method 'CrCredClientePk'
	 * 
	 * @param idCredCliente
	 */
	public CrCredClientePk(final int idCredCliente)
	{
		this.idCredCliente = idCredCliente;
	}

	/** 
	 * Sets the value of idCredClienteNull
	 */
	public void setIdCredClienteNull(boolean idCredClienteNull)
	{
		this.idCredClienteNull = idCredClienteNull;
	}

	/** 
	 * Gets the value of idCredClienteNull
	 */
	public boolean isIdCredClienteNull()
	{
		return idCredClienteNull;
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
		
		if (!(_other instanceof CrCredClientePk)) {
			return false;
		}
		
		final CrCredClientePk _cast = (CrCredClientePk) _other;
		if (idCredCliente != _cast.idCredCliente) {
			return false;
		}
		
		if (idCredClienteNull != _cast.idCredClienteNull) {
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
		_hashCode = 29 * _hashCode + idCredCliente;
		_hashCode = 29 * _hashCode + (idCredClienteNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrCredClientePk: " );
		ret.append( "idCredCliente=" + idCredCliente );
		return ret.toString();
	}

}
