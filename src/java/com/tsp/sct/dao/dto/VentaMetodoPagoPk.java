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
 * This class represents the primary key of the VENTA_METODO_PAGO table.
 */
public class VentaMetodoPagoPk implements Serializable
{
	protected int idVentaMetodoPago;

	/** 
	 * This attribute represents whether the primitive attribute idVentaMetodoPago is null.
	 */
	protected boolean idVentaMetodoPagoNull;

	/** 
	 * Sets the value of idVentaMetodoPago
	 */
	public void setIdVentaMetodoPago(int idVentaMetodoPago)
	{
		this.idVentaMetodoPago = idVentaMetodoPago;
	}

	/** 
	 * Gets the value of idVentaMetodoPago
	 */
	public int getIdVentaMetodoPago()
	{
		return idVentaMetodoPago;
	}

	/**
	 * Method 'VentaMetodoPagoPk'
	 * 
	 */
	public VentaMetodoPagoPk()
	{
	}

	/**
	 * Method 'VentaMetodoPagoPk'
	 * 
	 * @param idVentaMetodoPago
	 */
	public VentaMetodoPagoPk(final int idVentaMetodoPago)
	{
		this.idVentaMetodoPago = idVentaMetodoPago;
	}

	/** 
	 * Sets the value of idVentaMetodoPagoNull
	 */
	public void setIdVentaMetodoPagoNull(boolean idVentaMetodoPagoNull)
	{
		this.idVentaMetodoPagoNull = idVentaMetodoPagoNull;
	}

	/** 
	 * Gets the value of idVentaMetodoPagoNull
	 */
	public boolean isIdVentaMetodoPagoNull()
	{
		return idVentaMetodoPagoNull;
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
		
		if (!(_other instanceof VentaMetodoPagoPk)) {
			return false;
		}
		
		final VentaMetodoPagoPk _cast = (VentaMetodoPagoPk) _other;
		if (idVentaMetodoPago != _cast.idVentaMetodoPago) {
			return false;
		}
		
		if (idVentaMetodoPagoNull != _cast.idVentaMetodoPagoNull) {
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
		_hashCode = 29 * _hashCode + idVentaMetodoPago;
		_hashCode = 29 * _hashCode + (idVentaMetodoPagoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.VentaMetodoPagoPk: " );
		ret.append( "idVentaMetodoPago=" + idVentaMetodoPago );
		return ret.toString();
	}

}
