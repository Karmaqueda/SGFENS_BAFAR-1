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

public class Horario implements Serializable
{
	/** 
	 * This attribute maps to the column ID_HORARIO in the horario table.
	 */
	protected int idHorario;

	/** 
	 * This attribute represents whether the attribute idHorario has been modified since being read from the database.
	 */
	protected boolean idHorarioModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_HORARIO in the horario table.
	 */
	protected String nombreHorario;

	/** 
	 * This attribute represents whether the attribute nombreHorario has been modified since being read from the database.
	 */
	protected boolean nombreHorarioModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the horario table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the horario table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/**
	 * Method 'Horario'
	 * 
	 */
	public Horario()
	{
	}

	/**
	 * Method 'getIdHorario'
	 * 
	 * @return int
	 */
	public int getIdHorario()
	{
		return idHorario;
	}

	/**
	 * Method 'setIdHorario'
	 * 
	 * @param idHorario
	 */
	public void setIdHorario(int idHorario)
	{
		this.idHorario = idHorario;
		this.idHorarioModified = true;
	}

	/** 
	 * Sets the value of idHorarioModified
	 */
	public void setIdHorarioModified(boolean idHorarioModified)
	{
		this.idHorarioModified = idHorarioModified;
	}

	/** 
	 * Gets the value of idHorarioModified
	 */
	public boolean isIdHorarioModified()
	{
		return idHorarioModified;
	}

	/**
	 * Method 'getNombreHorario'
	 * 
	 * @return String
	 */
	public String getNombreHorario()
	{
		return nombreHorario;
	}

	/**
	 * Method 'setNombreHorario'
	 * 
	 * @param nombreHorario
	 */
	public void setNombreHorario(String nombreHorario)
	{
		this.nombreHorario = nombreHorario;
		this.nombreHorarioModified = true;
	}

	/** 
	 * Sets the value of nombreHorarioModified
	 */
	public void setNombreHorarioModified(boolean nombreHorarioModified)
	{
		this.nombreHorarioModified = nombreHorarioModified;
	}

	/** 
	 * Gets the value of nombreHorarioModified
	 */
	public boolean isNombreHorarioModified()
	{
		return nombreHorarioModified;
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaModified = true;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
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
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
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
		
		if (!(_other instanceof Horario)) {
			return false;
		}
		
		final Horario _cast = (Horario) _other;
		if (idHorario != _cast.idHorario) {
			return false;
		}
		
		if (idHorarioModified != _cast.idHorarioModified) {
			return false;
		}
		
		if (nombreHorario == null ? _cast.nombreHorario != nombreHorario : !nombreHorario.equals( _cast.nombreHorario )) {
			return false;
		}
		
		if (nombreHorarioModified != _cast.nombreHorarioModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
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
		_hashCode = 29 * _hashCode + idHorario;
		_hashCode = 29 * _hashCode + (idHorarioModified ? 1 : 0);
		if (nombreHorario != null) {
			_hashCode = 29 * _hashCode + nombreHorario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreHorarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return HorarioPk
	 */
	public HorarioPk createPk()
	{
		return new HorarioPk(idHorario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Horario: " );
		ret.append( "idHorario=" + idHorario );
		ret.append( ", nombreHorario=" + nombreHorario );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}
