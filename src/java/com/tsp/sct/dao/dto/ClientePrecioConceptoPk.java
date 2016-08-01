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
 * This class represents the primary key of the cliente_precio_concepto table.
 */
public class ClientePrecioConceptoPk implements Serializable
{
	protected int idCliente;

	protected int idConcepto;

	/** 
	 * This attribute represents whether the primitive attribute idCliente is null.
	 */
	protected boolean idClienteNull;

	/** 
	 * This attribute represents whether the primitive attribute idConcepto is null.
	 */
	protected boolean idConceptoNull;

	/** 
	 * Sets the value of idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
	}

	/** 
	 * Gets the value of idCliente
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/** 
	 * Sets the value of idConcepto
	 */
	public void setIdConcepto(int idConcepto)
	{
		this.idConcepto = idConcepto;
	}

	/** 
	 * Gets the value of idConcepto
	 */
	public int getIdConcepto()
	{
		return idConcepto;
	}

	/**
	 * Method 'ClientePrecioConceptoPk'
	 * 
	 */
	public ClientePrecioConceptoPk()
	{
	}

	/**
	 * Method 'ClientePrecioConceptoPk'
	 * 
	 * @param idCliente
	 * @param idConcepto
	 */
	public ClientePrecioConceptoPk(final int idCliente, final int idConcepto)
	{
		this.idCliente = idCliente;
		this.idConcepto = idConcepto;
	}

	/** 
	 * Sets the value of idClienteNull
	 */
	public void setIdClienteNull(boolean idClienteNull)
	{
		this.idClienteNull = idClienteNull;
	}

	/** 
	 * Gets the value of idClienteNull
	 */
	public boolean isIdClienteNull()
	{
		return idClienteNull;
	}

	/** 
	 * Sets the value of idConceptoNull
	 */
	public void setIdConceptoNull(boolean idConceptoNull)
	{
		this.idConceptoNull = idConceptoNull;
	}

	/** 
	 * Gets the value of idConceptoNull
	 */
	public boolean isIdConceptoNull()
	{
		return idConceptoNull;
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
		
		if (!(_other instanceof ClientePrecioConceptoPk)) {
			return false;
		}
		
		final ClientePrecioConceptoPk _cast = (ClientePrecioConceptoPk) _other;
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (idClienteNull != _cast.idClienteNull) {
			return false;
		}
		
		if (idConceptoNull != _cast.idConceptoNull) {
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
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + idConcepto;
		_hashCode = 29 * _hashCode + (idClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.ClientePrecioConceptoPk: " );
		ret.append( "idCliente=" + idCliente );
		ret.append( ", idConcepto=" + idConcepto );
		return ret.toString();
	}

}
