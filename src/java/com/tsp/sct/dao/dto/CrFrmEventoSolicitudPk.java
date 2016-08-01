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
 * This class represents the primary key of the cr_frm_evento_solicitud table.
 */
public class CrFrmEventoSolicitudPk implements Serializable
{
	protected int idFrmEventoSolicitud;

	/** 
	 * This attribute represents whether the primitive attribute idFrmEventoSolicitud is null.
	 */
	protected boolean idFrmEventoSolicitudNull;

	/** 
	 * Sets the value of idFrmEventoSolicitud
	 */
	public void setIdFrmEventoSolicitud(int idFrmEventoSolicitud)
	{
		this.idFrmEventoSolicitud = idFrmEventoSolicitud;
	}

	/** 
	 * Gets the value of idFrmEventoSolicitud
	 */
	public int getIdFrmEventoSolicitud()
	{
		return idFrmEventoSolicitud;
	}

	/**
	 * Method 'CrFrmEventoSolicitudPk'
	 * 
	 */
	public CrFrmEventoSolicitudPk()
	{
	}

	/**
	 * Method 'CrFrmEventoSolicitudPk'
	 * 
	 * @param idFrmEventoSolicitud
	 */
	public CrFrmEventoSolicitudPk(final int idFrmEventoSolicitud)
	{
		this.idFrmEventoSolicitud = idFrmEventoSolicitud;
	}

	/** 
	 * Sets the value of idFrmEventoSolicitudNull
	 */
	public void setIdFrmEventoSolicitudNull(boolean idFrmEventoSolicitudNull)
	{
		this.idFrmEventoSolicitudNull = idFrmEventoSolicitudNull;
	}

	/** 
	 * Gets the value of idFrmEventoSolicitudNull
	 */
	public boolean isIdFrmEventoSolicitudNull()
	{
		return idFrmEventoSolicitudNull;
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
		
		if (!(_other instanceof CrFrmEventoSolicitudPk)) {
			return false;
		}
		
		final CrFrmEventoSolicitudPk _cast = (CrFrmEventoSolicitudPk) _other;
		if (idFrmEventoSolicitud != _cast.idFrmEventoSolicitud) {
			return false;
		}
		
		if (idFrmEventoSolicitudNull != _cast.idFrmEventoSolicitudNull) {
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
		_hashCode = 29 * _hashCode + idFrmEventoSolicitud;
		_hashCode = 29 * _hashCode + (idFrmEventoSolicitudNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.CrFrmEventoSolicitudPk: " );
		ret.append( "idFrmEventoSolicitud=" + idFrmEventoSolicitud );
		return ret.toString();
	}

}
