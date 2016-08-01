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
 * This class represents the primary key of the nomina_empleado table.
 */
public class NominaEmpleadoPk implements Serializable
{
	protected int idEmpleado;

	/** 
	 * This attribute represents whether the primitive attribute idEmpleado is null.
	 */
	protected boolean idEmpleadoNull;

	/** 
	 * Sets the value of idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
	}

	/** 
	 * Gets the value of idEmpleado
	 */
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	/**
	 * Method 'NominaEmpleadoPk'
	 * 
	 */
	public NominaEmpleadoPk()
	{
	}

	/**
	 * Method 'NominaEmpleadoPk'
	 * 
	 * @param idEmpleado
	 */
	public NominaEmpleadoPk(final int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
	}

	/** 
	 * Sets the value of idEmpleadoNull
	 */
	public void setIdEmpleadoNull(boolean idEmpleadoNull)
	{
		this.idEmpleadoNull = idEmpleadoNull;
	}

	/** 
	 * Gets the value of idEmpleadoNull
	 */
	public boolean isIdEmpleadoNull()
	{
		return idEmpleadoNull;
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
		
		if (!(_other instanceof NominaEmpleadoPk)) {
			return false;
		}
		
		final NominaEmpleadoPk _cast = (NominaEmpleadoPk) _other;
		if (idEmpleado != _cast.idEmpleado) {
			return false;
		}
		
		if (idEmpleadoNull != _cast.idEmpleadoNull) {
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
		_hashCode = 29 * _hashCode + idEmpleado;
		_hashCode = 29 * _hashCode + (idEmpleadoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.NominaEmpleadoPk: " );
		ret.append( "idEmpleado=" + idEmpleado );
		return ret.toString();
	}

}
