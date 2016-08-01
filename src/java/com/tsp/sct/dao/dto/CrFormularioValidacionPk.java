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
 * This class represents the primary key of the cr_formulario_validacion table.
 */
public class CrFormularioValidacionPk implements Serializable
{
	protected int idFormularioValidacion;

	/** 
	 * This attribute represents whether the primitive attribute idFormularioValidacion is null.
	 */
	protected boolean idFormularioValidacionNull;

	/** 
	 * Sets the value of idFormularioValidacion
	 */
	public void setIdFormularioValidacion(int idFormularioValidacion)
	{
		this.idFormularioValidacion = idFormularioValidacion;
	}

	/** 
	 * Gets the value of idFormularioValidacion
	 */
	public int getIdFormularioValidacion()
	{
		return idFormularioValidacion;
	}

	/**
	 * Method 'CrFormularioValidacionPk'
	 * 
	 */
	public CrFormularioValidacionPk()
	{
	}

	/**
	 * Method 'CrFormularioValidacionPk'
	 * 
	 * @param idFormularioValidacion
	 */
	public CrFormularioValidacionPk(final int idFormularioValidacion)
	{
		this.idFormularioValidacion = idFormularioValidacion;
	}

	/** 
	 * Sets the value of idFormularioValidacionNull
	 */
	public void setIdFormularioValidacionNull(boolean idFormularioValidacionNull)
	{
		this.idFormularioValidacionNull = idFormularioValidacionNull;
	}

	/** 
	 * Gets the value of idFormularioValidacionNull
	 */
	public boolean isIdFormularioValidacionNull()
	{
		return idFormularioValidacionNull;
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
		
		if (!(_other instanceof CrFormularioValidacionPk)) {
			return false;
		}
		
		final CrFormularioValidacionPk _cast = (CrFormularioValidacionPk) _other;
		if (idFormularioValidacion != _cast.idFormularioValidacion) {
			return false;
		}
		
		if (idFormularioValidacionNull != _cast.idFormularioValidacionNull) {
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
		_hashCode = 29 * _hashCode + idFormularioValidacion;
		_hashCode = 29 * _hashCode + (idFormularioValidacionNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrFormularioValidacionPk: " );
		ret.append( "idFormularioValidacion=" + idFormularioValidacion );
		return ret.toString();
	}

}