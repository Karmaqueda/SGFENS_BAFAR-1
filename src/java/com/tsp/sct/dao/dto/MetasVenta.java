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
import java.util.Date;

public class MetasVenta implements Serializable
{
	/** 
	 * This attribute maps to the column ID_META_VENTA in the metas_venta table.
	 */
	protected int idMetaVenta;

	/** 
	 * This attribute represents whether the attribute idMetaVenta has been modified since being read from the database.
	 */
	protected boolean idMetaVentaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the metas_venta table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column FECHA_CREACION in the metas_venta table.
	 */
	protected Date fechaCreacion;

	/** 
	 * This attribute represents whether the attribute fechaCreacion has been modified since being read from the database.
	 */
	protected boolean fechaCreacionModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_META in the metas_venta table.
	 */
	protected String nombreMeta;

	/** 
	 * This attribute represents whether the attribute nombreMeta has been modified since being read from the database.
	 */
	protected boolean nombreMetaModified = false;

	/** 
	 * This attribute maps to the column ID_COMPONENTE_META in the metas_venta table.
	 */
	protected int idComponenteMeta;

	/** 
	 * This attribute represents whether the attribute idComponenteMeta has been modified since being read from the database.
	 */
	protected boolean idComponenteMetaModified = false;

	/** 
	 * This attribute maps to the column PERIODO in the metas_venta table.
	 */
	protected int periodo;

	/** 
	 * This attribute represents whether the primitive attribute periodo is null.
	 */
	protected boolean periodoNull = true;

	/** 
	 * This attribute represents whether the attribute periodo has been modified since being read from the database.
	 */
	protected boolean periodoModified = false;

	/** 
	 * This attribute maps to the column DURACION in the metas_venta table.
	 */
	protected int duracion;

	/** 
	 * This attribute represents whether the primitive attribute duracion is null.
	 */
	protected boolean duracionNull = true;

	/** 
	 * This attribute represents whether the attribute duracion has been modified since being read from the database.
	 */
	protected boolean duracionModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the metas_venta table.
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
	 * Method 'MetasVenta'
	 * 
	 */
	public MetasVenta()
	{
	}

	/**
	 * Method 'getIdMetaVenta'
	 * 
	 * @return int
	 */
	public int getIdMetaVenta()
	{
		return idMetaVenta;
	}

	/**
	 * Method 'setIdMetaVenta'
	 * 
	 * @param idMetaVenta
	 */
	public void setIdMetaVenta(int idMetaVenta)
	{
		this.idMetaVenta = idMetaVenta;
		this.idMetaVentaModified = true;
	}

	/** 
	 * Sets the value of idMetaVentaModified
	 */
	public void setIdMetaVentaModified(boolean idMetaVentaModified)
	{
		this.idMetaVentaModified = idMetaVentaModified;
	}

	/** 
	 * Gets the value of idMetaVentaModified
	 */
	public boolean isIdMetaVentaModified()
	{
		return idMetaVentaModified;
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
	 * Method 'getFechaCreacion'
	 * 
	 * @return Date
	 */
	public Date getFechaCreacion()
	{
		return fechaCreacion;
	}

	/**
	 * Method 'setFechaCreacion'
	 * 
	 * @param fechaCreacion
	 */
	public void setFechaCreacion(Date fechaCreacion)
	{
		this.fechaCreacion = fechaCreacion;
		this.fechaCreacionModified = true;
	}

	/** 
	 * Sets the value of fechaCreacionModified
	 */
	public void setFechaCreacionModified(boolean fechaCreacionModified)
	{
		this.fechaCreacionModified = fechaCreacionModified;
	}

	/** 
	 * Gets the value of fechaCreacionModified
	 */
	public boolean isFechaCreacionModified()
	{
		return fechaCreacionModified;
	}

	/**
	 * Method 'getNombreMeta'
	 * 
	 * @return String
	 */
	public String getNombreMeta()
	{
		return nombreMeta;
	}

	/**
	 * Method 'setNombreMeta'
	 * 
	 * @param nombreMeta
	 */
	public void setNombreMeta(String nombreMeta)
	{
		this.nombreMeta = nombreMeta;
		this.nombreMetaModified = true;
	}

	/** 
	 * Sets the value of nombreMetaModified
	 */
	public void setNombreMetaModified(boolean nombreMetaModified)
	{
		this.nombreMetaModified = nombreMetaModified;
	}

	/** 
	 * Gets the value of nombreMetaModified
	 */
	public boolean isNombreMetaModified()
	{
		return nombreMetaModified;
	}

	/**
	 * Method 'getIdComponenteMeta'
	 * 
	 * @return int
	 */
	public int getIdComponenteMeta()
	{
		return idComponenteMeta;
	}

	/**
	 * Method 'setIdComponenteMeta'
	 * 
	 * @param idComponenteMeta
	 */
	public void setIdComponenteMeta(int idComponenteMeta)
	{
		this.idComponenteMeta = idComponenteMeta;
		this.idComponenteMetaModified = true;
	}

	/** 
	 * Sets the value of idComponenteMetaModified
	 */
	public void setIdComponenteMetaModified(boolean idComponenteMetaModified)
	{
		this.idComponenteMetaModified = idComponenteMetaModified;
	}

	/** 
	 * Gets the value of idComponenteMetaModified
	 */
	public boolean isIdComponenteMetaModified()
	{
		return idComponenteMetaModified;
	}

	/**
	 * Method 'getPeriodo'
	 * 
	 * @return int
	 */
	public int getPeriodo()
	{
		return periodo;
	}

	/**
	 * Method 'setPeriodo'
	 * 
	 * @param periodo
	 */
	public void setPeriodo(int periodo)
	{
		this.periodo = periodo;
		this.periodoNull = false;
		this.periodoModified = true;
	}

	/**
	 * Method 'setPeriodoNull'
	 * 
	 * @param value
	 */
	public void setPeriodoNull(boolean value)
	{
		this.periodoNull = value;
		this.periodoModified = true;
	}

	/**
	 * Method 'isPeriodoNull'
	 * 
	 * @return boolean
	 */
	public boolean isPeriodoNull()
	{
		return periodoNull;
	}

	/** 
	 * Sets the value of periodoModified
	 */
	public void setPeriodoModified(boolean periodoModified)
	{
		this.periodoModified = periodoModified;
	}

	/** 
	 * Gets the value of periodoModified
	 */
	public boolean isPeriodoModified()
	{
		return periodoModified;
	}

	/**
	 * Method 'getDuracion'
	 * 
	 * @return int
	 */
	public int getDuracion()
	{
		return duracion;
	}

	/**
	 * Method 'setDuracion'
	 * 
	 * @param duracion
	 */
	public void setDuracion(int duracion)
	{
		this.duracion = duracion;
		this.duracionNull = false;
		this.duracionModified = true;
	}

	/**
	 * Method 'setDuracionNull'
	 * 
	 * @param value
	 */
	public void setDuracionNull(boolean value)
	{
		this.duracionNull = value;
		this.duracionModified = true;
	}

	/**
	 * Method 'isDuracionNull'
	 * 
	 * @return boolean
	 */
	public boolean isDuracionNull()
	{
		return duracionNull;
	}

	/** 
	 * Sets the value of duracionModified
	 */
	public void setDuracionModified(boolean duracionModified)
	{
		this.duracionModified = duracionModified;
	}

	/** 
	 * Gets the value of duracionModified
	 */
	public boolean isDuracionModified()
	{
		return duracionModified;
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
		
		if (!(_other instanceof MetasVenta)) {
			return false;
		}
		
		final MetasVenta _cast = (MetasVenta) _other;
		if (idMetaVenta != _cast.idMetaVenta) {
			return false;
		}
		
		if (idMetaVentaModified != _cast.idMetaVentaModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (fechaCreacion == null ? _cast.fechaCreacion != fechaCreacion : !fechaCreacion.equals( _cast.fechaCreacion )) {
			return false;
		}
		
		if (fechaCreacionModified != _cast.fechaCreacionModified) {
			return false;
		}
		
		if (nombreMeta == null ? _cast.nombreMeta != nombreMeta : !nombreMeta.equals( _cast.nombreMeta )) {
			return false;
		}
		
		if (nombreMetaModified != _cast.nombreMetaModified) {
			return false;
		}
		
		if (idComponenteMeta != _cast.idComponenteMeta) {
			return false;
		}
		
		if (idComponenteMetaModified != _cast.idComponenteMetaModified) {
			return false;
		}
		
		if (periodo != _cast.periodo) {
			return false;
		}
		
		if (periodoNull != _cast.periodoNull) {
			return false;
		}
		
		if (periodoModified != _cast.periodoModified) {
			return false;
		}
		
		if (duracion != _cast.duracion) {
			return false;
		}
		
		if (duracionNull != _cast.duracionNull) {
			return false;
		}
		
		if (duracionModified != _cast.duracionModified) {
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
		_hashCode = 29 * _hashCode + idMetaVenta;
		_hashCode = 29 * _hashCode + (idMetaVentaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (fechaCreacion != null) {
			_hashCode = 29 * _hashCode + fechaCreacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaCreacionModified ? 1 : 0);
		if (nombreMeta != null) {
			_hashCode = 29 * _hashCode + nombreMeta.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreMetaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idComponenteMeta;
		_hashCode = 29 * _hashCode + (idComponenteMetaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + periodo;
		_hashCode = 29 * _hashCode + (periodoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (periodoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + duracion;
		_hashCode = 29 * _hashCode + (duracionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (duracionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return MetasVentaPk
	 */
	public MetasVentaPk createPk()
	{
		return new MetasVentaPk(idMetaVenta);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.MetasVenta: " );
		ret.append( "idMetaVenta=" + idMetaVenta );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", fechaCreacion=" + fechaCreacion );
		ret.append( ", nombreMeta=" + nombreMeta );
		ret.append( ", idComponenteMeta=" + idComponenteMeta );
		ret.append( ", periodo=" + periodo );
		ret.append( ", duracion=" + duracion );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}
