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

public class ZonaHorariaCatalogo implements Serializable
{
	/** 
	 * This attribute maps to the column ID_ZONA_HORARIA_CATALOGO in the zona_horaria_catalogo table.
	 */
	protected int idZonaHorariaCatalogo;

	/** 
	 * This attribute represents whether the attribute idZonaHorariaCatalogo has been modified since being read from the database.
	 */
	protected boolean idZonaHorariaCatalogoModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the zona_horaria_catalogo table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column ZONA_HORARIA in the zona_horaria_catalogo table.
	 */
	protected String zonaHoraria;

	/** 
	 * This attribute represents whether the attribute zonaHoraria has been modified since being read from the database.
	 */
	protected boolean zonaHorariaModified = false;

	/**
	 * Method 'ZonaHorariaCatalogo'
	 * 
	 */
	public ZonaHorariaCatalogo()
	{
	}

	/**
	 * Method 'getIdZonaHorariaCatalogo'
	 * 
	 * @return int
	 */
	public int getIdZonaHorariaCatalogo()
	{
		return idZonaHorariaCatalogo;
	}

	/**
	 * Method 'setIdZonaHorariaCatalogo'
	 * 
	 * @param idZonaHorariaCatalogo
	 */
	public void setIdZonaHorariaCatalogo(int idZonaHorariaCatalogo)
	{
		this.idZonaHorariaCatalogo = idZonaHorariaCatalogo;
		this.idZonaHorariaCatalogoModified = true;
	}

	/** 
	 * Sets the value of idZonaHorariaCatalogoModified
	 */
	public void setIdZonaHorariaCatalogoModified(boolean idZonaHorariaCatalogoModified)
	{
		this.idZonaHorariaCatalogoModified = idZonaHorariaCatalogoModified;
	}

	/** 
	 * Gets the value of idZonaHorariaCatalogoModified
	 */
	public boolean isIdZonaHorariaCatalogoModified()
	{
		return idZonaHorariaCatalogoModified;
	}

	/**
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
		this.idEstatusModified = true;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
	}

	/**
	 * Method 'getZonaHoraria'
	 * 
	 * @return String
	 */
	public String getZonaHoraria()
	{
		return zonaHoraria;
	}

	/**
	 * Method 'setZonaHoraria'
	 * 
	 * @param zonaHoraria
	 */
	public void setZonaHoraria(String zonaHoraria)
	{
		this.zonaHoraria = zonaHoraria;
		this.zonaHorariaModified = true;
	}

	/** 
	 * Sets the value of zonaHorariaModified
	 */
	public void setZonaHorariaModified(boolean zonaHorariaModified)
	{
		this.zonaHorariaModified = zonaHorariaModified;
	}

	/** 
	 * Gets the value of zonaHorariaModified
	 */
	public boolean isZonaHorariaModified()
	{
		return zonaHorariaModified;
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
		
		if (!(_other instanceof ZonaHorariaCatalogo)) {
			return false;
		}
		
		final ZonaHorariaCatalogo _cast = (ZonaHorariaCatalogo) _other;
		if (idZonaHorariaCatalogo != _cast.idZonaHorariaCatalogo) {
			return false;
		}
		
		if (idZonaHorariaCatalogoModified != _cast.idZonaHorariaCatalogoModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (zonaHoraria == null ? _cast.zonaHoraria != zonaHoraria : !zonaHoraria.equals( _cast.zonaHoraria )) {
			return false;
		}
		
		if (zonaHorariaModified != _cast.zonaHorariaModified) {
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
		_hashCode = 29 * _hashCode + idZonaHorariaCatalogo;
		_hashCode = 29 * _hashCode + (idZonaHorariaCatalogoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (zonaHoraria != null) {
			_hashCode = 29 * _hashCode + zonaHoraria.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (zonaHorariaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ZonaHorariaCatalogoPk
	 */
	public ZonaHorariaCatalogoPk createPk()
	{
		return new ZonaHorariaCatalogoPk(idZonaHorariaCatalogo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ZonaHorariaCatalogo: " );
		ret.append( "idZonaHorariaCatalogo=" + idZonaHorariaCatalogo );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", zonaHoraria=" + zonaHoraria );
		return ret.toString();
	}

}
