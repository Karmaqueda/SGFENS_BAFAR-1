/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class ComprobanteDescripcionCampos implements Serializable
{
	/** 
	 * This attribute maps to the column ID_COMPROBANTE_DESCRIPCION in the comprobante_descripcion_campos table.
	 */
	protected int idComprobanteDescripcion;

	/** 
	 * This attribute maps to the column ID_CAMPO in the comprobante_descripcion_campos table.
	 */
	protected int idCampo;

	/**
	 * Method 'ComprobanteDescripcionCampos'
	 * 
	 */
	public ComprobanteDescripcionCampos()
	{
	}

	/**
	 * Method 'getIdComprobanteDescripcion'
	 * 
	 * @return int
	 */
	public int getIdComprobanteDescripcion()
	{
		return idComprobanteDescripcion;
	}

	/**
	 * Method 'setIdComprobanteDescripcion'
	 * 
	 * @param idComprobanteDescripcion
	 */
	public void setIdComprobanteDescripcion(int idComprobanteDescripcion)
	{
		this.idComprobanteDescripcion = idComprobanteDescripcion;
	}

	/**
	 * Method 'getIdCampo'
	 * 
	 * @return int
	 */
	public int getIdCampo()
	{
		return idCampo;
	}

	/**
	 * Method 'setIdCampo'
	 * 
	 * @param idCampo
	 */
	public void setIdCampo(int idCampo)
	{
		this.idCampo = idCampo;
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
		
		if (!(_other instanceof ComprobanteDescripcionCampos)) {
			return false;
		}
		
		final ComprobanteDescripcionCampos _cast = (ComprobanteDescripcionCampos) _other;
		if (idComprobanteDescripcion != _cast.idComprobanteDescripcion) {
			return false;
		}
		
		if (idCampo != _cast.idCampo) {
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
		_hashCode = 29 * _hashCode + idComprobanteDescripcion;
		_hashCode = 29 * _hashCode + idCampo;
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
		ret.append( "com.tsp.sct.dao.dto.ComprobanteDescripcionCampos: " );
		ret.append( "idComprobanteDescripcion=" + idComprobanteDescripcion );
		ret.append( ", idCampo=" + idCampo );
		return ret.toString();
	}

}
