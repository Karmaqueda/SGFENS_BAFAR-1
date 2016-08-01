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

public class CargaXls implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CARGA in the carga_xls table.
	 */
	protected int idCarga;

	/** 
	 * This attribute represents whether the attribute idCarga has been modified since being read from the database.
	 */
	protected boolean idCargaModified = false;

	/** 
	 * This attribute maps to the column ID_TIPO_CARGA in the carga_xls table.
	 */
	protected int idTipoCarga;

	/** 
	 * This attribute represents whether the attribute idTipoCarga has been modified since being read from the database.
	 */
	protected boolean idTipoCargaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the carga_xls table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_USUARIO in the carga_xls table.
	 */
	protected int idUsuario;

	/** 
	 * This attribute represents whether the attribute idUsuario has been modified since being read from the database.
	 */
	protected boolean idUsuarioModified = false;

	/** 
	 * This attribute maps to the column FECHA in the carga_xls table.
	 */
	protected Date fecha;

	/** 
	 * This attribute represents whether the attribute fecha has been modified since being read from the database.
	 */
	protected boolean fechaModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_ARCHIVO in the carga_xls table.
	 */
	protected String nombreArchivo;

	/** 
	 * This attribute represents whether the attribute nombreArchivo has been modified since being read from the database.
	 */
	protected boolean nombreArchivoModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS_CARGA in the carga_xls table.
	 */
	protected int idEstatusCarga;

	/** 
	 * This attribute represents whether the primitive attribute idEstatusCarga is null.
	 */
	protected boolean idEstatusCargaNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatusCarga has been modified since being read from the database.
	 */
	protected boolean idEstatusCargaModified = false;

	/** 
	 * This attribute maps to the column LOG_TEXT in the carga_xls table.
	 */
	protected String logText;

	/** 
	 * This attribute represents whether the attribute logText has been modified since being read from the database.
	 */
	protected boolean logTextModified = false;

	/**
	 * Method 'CargaXls'
	 * 
	 */
	public CargaXls()
	{
	}

	/**
	 * Method 'getIdCarga'
	 * 
	 * @return int
	 */
	public int getIdCarga()
	{
		return idCarga;
	}

	/**
	 * Method 'setIdCarga'
	 * 
	 * @param idCarga
	 */
	public void setIdCarga(int idCarga)
	{
		this.idCarga = idCarga;
		this.idCargaModified = true;
	}

	/** 
	 * Sets the value of idCargaModified
	 */
	public void setIdCargaModified(boolean idCargaModified)
	{
		this.idCargaModified = idCargaModified;
	}

	/** 
	 * Gets the value of idCargaModified
	 */
	public boolean isIdCargaModified()
	{
		return idCargaModified;
	}

	/**
	 * Method 'getIdTipoCarga'
	 * 
	 * @return int
	 */
	public int getIdTipoCarga()
	{
		return idTipoCarga;
	}

	/**
	 * Method 'setIdTipoCarga'
	 * 
	 * @param idTipoCarga
	 */
	public void setIdTipoCarga(int idTipoCarga)
	{
		this.idTipoCarga = idTipoCarga;
		this.idTipoCargaModified = true;
	}

	/** 
	 * Sets the value of idTipoCargaModified
	 */
	public void setIdTipoCargaModified(boolean idTipoCargaModified)
	{
		this.idTipoCargaModified = idTipoCargaModified;
	}

	/** 
	 * Gets the value of idTipoCargaModified
	 */
	public boolean isIdTipoCargaModified()
	{
		return idTipoCargaModified;
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
	 * Method 'getIdUsuario'
	 * 
	 * @return int
	 */
	public int getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'setIdUsuario'
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario)
	{
		this.idUsuario = idUsuario;
		this.idUsuarioModified = true;
	}

	/** 
	 * Sets the value of idUsuarioModified
	 */
	public void setIdUsuarioModified(boolean idUsuarioModified)
	{
		this.idUsuarioModified = idUsuarioModified;
	}

	/** 
	 * Gets the value of idUsuarioModified
	 */
	public boolean isIdUsuarioModified()
	{
		return idUsuarioModified;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
		this.fechaModified = true;
	}

	/** 
	 * Sets the value of fechaModified
	 */
	public void setFechaModified(boolean fechaModified)
	{
		this.fechaModified = fechaModified;
	}

	/** 
	 * Gets the value of fechaModified
	 */
	public boolean isFechaModified()
	{
		return fechaModified;
	}

	/**
	 * Method 'getNombreArchivo'
	 * 
	 * @return String
	 */
	public String getNombreArchivo()
	{
		return nombreArchivo;
	}

	/**
	 * Method 'setNombreArchivo'
	 * 
	 * @param nombreArchivo
	 */
	public void setNombreArchivo(String nombreArchivo)
	{
		this.nombreArchivo = nombreArchivo;
		this.nombreArchivoModified = true;
	}

	/** 
	 * Sets the value of nombreArchivoModified
	 */
	public void setNombreArchivoModified(boolean nombreArchivoModified)
	{
		this.nombreArchivoModified = nombreArchivoModified;
	}

	/** 
	 * Gets the value of nombreArchivoModified
	 */
	public boolean isNombreArchivoModified()
	{
		return nombreArchivoModified;
	}

	/**
	 * Method 'getIdEstatusCarga'
	 * 
	 * @return int
	 */
	public int getIdEstatusCarga()
	{
		return idEstatusCarga;
	}

	/**
	 * Method 'setIdEstatusCarga'
	 * 
	 * @param idEstatusCarga
	 */
	public void setIdEstatusCarga(int idEstatusCarga)
	{
		this.idEstatusCarga = idEstatusCarga;
		this.idEstatusCargaNull = false;
		this.idEstatusCargaModified = true;
	}

	/**
	 * Method 'setIdEstatusCargaNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusCargaNull(boolean value)
	{
		this.idEstatusCargaNull = value;
		this.idEstatusCargaModified = true;
	}

	/**
	 * Method 'isIdEstatusCargaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusCargaNull()
	{
		return idEstatusCargaNull;
	}

	/** 
	 * Sets the value of idEstatusCargaModified
	 */
	public void setIdEstatusCargaModified(boolean idEstatusCargaModified)
	{
		this.idEstatusCargaModified = idEstatusCargaModified;
	}

	/** 
	 * Gets the value of idEstatusCargaModified
	 */
	public boolean isIdEstatusCargaModified()
	{
		return idEstatusCargaModified;
	}

	/**
	 * Method 'getLogText'
	 * 
	 * @return String
	 */
	public String getLogText()
	{
		return logText;
	}

	/**
	 * Method 'setLogText'
	 * 
	 * @param logText
	 */
	public void setLogText(String logText)
	{
		this.logText = logText;
		this.logTextModified = true;
	}

	/** 
	 * Sets the value of logTextModified
	 */
	public void setLogTextModified(boolean logTextModified)
	{
		this.logTextModified = logTextModified;
	}

	/** 
	 * Gets the value of logTextModified
	 */
	public boolean isLogTextModified()
	{
		return logTextModified;
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
		
		if (!(_other instanceof CargaXls)) {
			return false;
		}
		
		final CargaXls _cast = (CargaXls) _other;
		if (idCarga != _cast.idCarga) {
			return false;
		}
		
		if (idCargaModified != _cast.idCargaModified) {
			return false;
		}
		
		if (idTipoCarga != _cast.idTipoCarga) {
			return false;
		}
		
		if (idTipoCargaModified != _cast.idTipoCargaModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idUsuario != _cast.idUsuario) {
			return false;
		}
		
		if (idUsuarioModified != _cast.idUsuarioModified) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (fechaModified != _cast.fechaModified) {
			return false;
		}
		
		if (nombreArchivo == null ? _cast.nombreArchivo != nombreArchivo : !nombreArchivo.equals( _cast.nombreArchivo )) {
			return false;
		}
		
		if (nombreArchivoModified != _cast.nombreArchivoModified) {
			return false;
		}
		
		if (idEstatusCarga != _cast.idEstatusCarga) {
			return false;
		}
		
		if (idEstatusCargaNull != _cast.idEstatusCargaNull) {
			return false;
		}
		
		if (idEstatusCargaModified != _cast.idEstatusCargaModified) {
			return false;
		}
		
		if (logText == null ? _cast.logText != logText : !logText.equals( _cast.logText )) {
			return false;
		}
		
		if (logTextModified != _cast.logTextModified) {
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
		_hashCode = 29 * _hashCode + idCarga;
		_hashCode = 29 * _hashCode + (idCargaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idTipoCarga;
		_hashCode = 29 * _hashCode + (idTipoCargaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuario;
		_hashCode = 29 * _hashCode + (idUsuarioModified ? 1 : 0);
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaModified ? 1 : 0);
		if (nombreArchivo != null) {
			_hashCode = 29 * _hashCode + nombreArchivo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreArchivoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatusCarga;
		_hashCode = 29 * _hashCode + (idEstatusCargaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusCargaModified ? 1 : 0);
		if (logText != null) {
			_hashCode = 29 * _hashCode + logText.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (logTextModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CargaXlsPk
	 */
	public CargaXlsPk createPk()
	{
		return new CargaXlsPk(idCarga);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.CargaXls: " );
		ret.append( "idCarga=" + idCarga );
		ret.append( ", idTipoCarga=" + idTipoCarga );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idUsuario=" + idUsuario );
		ret.append( ", fecha=" + fecha );
		ret.append( ", nombreArchivo=" + nombreArchivo );
		ret.append( ", idEstatusCarga=" + idEstatusCarga );
		ret.append( ", logText=" + logText );
		return ret.toString();
	}

}
