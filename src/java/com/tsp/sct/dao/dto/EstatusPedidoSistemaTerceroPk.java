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
 * This class represents the primary key of the estatus_pedido_sistema_tercero table.
 */
public class EstatusPedidoSistemaTerceroPk implements Serializable
{
	protected int idEstatusPedidoTercero;

	/** 
	 * This attribute represents whether the primitive attribute idEstatusPedidoTercero is null.
	 */
	protected boolean idEstatusPedidoTerceroNull;

	/** 
	 * Sets the value of idEstatusPedidoTercero
	 */
	public void setIdEstatusPedidoTercero(int idEstatusPedidoTercero)
	{
		this.idEstatusPedidoTercero = idEstatusPedidoTercero;
	}

	/** 
	 * Gets the value of idEstatusPedidoTercero
	 */
	public int getIdEstatusPedidoTercero()
	{
		return idEstatusPedidoTercero;
	}

	/**
	 * Method 'EstatusPedidoSistemaTerceroPk'
	 * 
	 */
	public EstatusPedidoSistemaTerceroPk()
	{
	}

	/**
	 * Method 'EstatusPedidoSistemaTerceroPk'
	 * 
	 * @param idEstatusPedidoTercero
	 */
	public EstatusPedidoSistemaTerceroPk(final int idEstatusPedidoTercero)
	{
		this.idEstatusPedidoTercero = idEstatusPedidoTercero;
	}

	/** 
	 * Sets the value of idEstatusPedidoTerceroNull
	 */
	public void setIdEstatusPedidoTerceroNull(boolean idEstatusPedidoTerceroNull)
	{
		this.idEstatusPedidoTerceroNull = idEstatusPedidoTerceroNull;
	}

	/** 
	 * Gets the value of idEstatusPedidoTerceroNull
	 */
	public boolean isIdEstatusPedidoTerceroNull()
	{
		return idEstatusPedidoTerceroNull;
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
		
		if (!(_other instanceof EstatusPedidoSistemaTerceroPk)) {
			return false;
		}
		
		final EstatusPedidoSistemaTerceroPk _cast = (EstatusPedidoSistemaTerceroPk) _other;
		if (idEstatusPedidoTercero != _cast.idEstatusPedidoTercero) {
			return false;
		}
		
		if (idEstatusPedidoTerceroNull != _cast.idEstatusPedidoTerceroNull) {
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
		_hashCode = 29 * _hashCode + idEstatusPedidoTercero;
		_hashCode = 29 * _hashCode + (idEstatusPedidoTerceroNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.EstatusPedidoSistemaTerceroPk: " );
		ret.append( "idEstatusPedidoTercero=" + idEstatusPedidoTercero );
		return ret.toString();
	}

}
