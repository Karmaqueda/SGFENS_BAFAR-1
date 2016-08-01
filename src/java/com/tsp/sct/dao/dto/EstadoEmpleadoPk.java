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
 * This class represents the primary key of the estado_empleado table.
 */
public class EstadoEmpleadoPk implements Serializable
{
	protected int idEstado;

	/** 
	 * This attribute represents whether the primitive attribute idEstado is null.
	 */
	protected boolean idEstadoNull;

	/** 
	 * Sets the value of idEstado
	 */
	public void setIdEstado(int idEstado)
	{
		this.idEstado = idEstado;
	}

	/** 
	 * Gets the value of idEstado
	 */
	public int getIdEstado()
	{
		return idEstado;
	}

	/**
	 * Method 'EstadoEmpleadoPk'
	 * 
	 */
	public EstadoEmpleadoPk()
	{
	}

	/**
	 * Method 'EstadoEmpleadoPk'
	 * 
	 * @param idEstado
	 */
	public EstadoEmpleadoPk(final int idEstado)
	{
		this.idEstado = idEstado;
	}

	/** 
	 * Sets the value of idEstadoNull
	 */
	public void setIdEstadoNull(boolean idEstadoNull)
	{
		this.idEstadoNull = idEstadoNull;
	}

	/** 
	 * Gets the value of idEstadoNull
	 */
	public boolean isIdEstadoNull()
	{
		return idEstadoNull;
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
		
		if (!(_other instanceof EstadoEmpleadoPk)) {
			return false;
		}
		
		final EstadoEmpleadoPk _cast = (EstadoEmpleadoPk) _other;
		if (idEstado != _cast.idEstado) {
			return false;
		}
		
		if (idEstadoNull != _cast.idEstadoNull) {
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
		_hashCode = 29 * _hashCode + idEstado;
		_hashCode = 29 * _hashCode + (idEstadoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.EstadoEmpleadoPk: " );
		ret.append( "idEstado=" + idEstado );
		return ret.toString();
	}

}
