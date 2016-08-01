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

public class CrSolicitudBitacora implements Serializable
{
	/** 
	 * This attribute maps to the column id_solicitud_bitacora in the cr_solicitud_bitacora table.
	 */
	protected int idSolicitudBitacora;

	/** 
	 * This attribute represents whether the attribute idSolicitudBitacora has been modified since being read from the database.
	 */
	protected boolean idSolicitudBitacoraModified = false;

	/** 
	 * This attribute maps to the column id_formulario_evento in the cr_solicitud_bitacora table.
	 */
	protected int idFormularioEvento;

	/** 
	 * This attribute represents whether the attribute idFormularioEvento has been modified since being read from the database.
	 */
	protected boolean idFormularioEventoModified = false;

	/** 
	 * This attribute maps to the column id_estado_solicitud in the cr_solicitud_bitacora table.
	 */
	protected int idEstadoSolicitud;

	/** 
	 * This attribute represents whether the attribute idEstadoSolicitud has been modified since being read from the database.
	 */
	protected boolean idEstadoSolicitudModified = false;

	/** 
	 * This attribute maps to the column id_usuario in the cr_solicitud_bitacora table.
	 */
	protected int idUsuario;

	/** 
	 * This attribute represents whether the attribute idUsuario has been modified since being read from the database.
	 */
	protected boolean idUsuarioModified = false;

	/** 
	 * This attribute maps to the column id_empresa in the cr_solicitud_bitacora table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the primitive attribute idEmpresa is null.
	 */
	protected boolean idEmpresaNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column descripcion_evento in the cr_solicitud_bitacora table.
	 */
	protected String descripcionEvento;

	/** 
	 * This attribute represents whether the attribute descripcionEvento has been modified since being read from the database.
	 */
	protected boolean descripcionEventoModified = false;

	/** 
	 * This attribute maps to the column fecha_hr_creacion in the cr_solicitud_bitacora table.
	 */
	protected Date fechaHrCreacion;

	/** 
	 * This attribute represents whether the attribute fechaHrCreacion has been modified since being read from the database.
	 */
	protected boolean fechaHrCreacionModified = false;

	/**
	 * Method 'CrSolicitudBitacora'
	 * 
	 */
	public CrSolicitudBitacora()
	{
	}

	/**
	 * Method 'getIdSolicitudBitacora'
	 * 
	 * @return int
	 */
	public int getIdSolicitudBitacora()
	{
		return idSolicitudBitacora;
	}

	/**
	 * Method 'setIdSolicitudBitacora'
	 * 
	 * @param idSolicitudBitacora
	 */
	public void setIdSolicitudBitacora(int idSolicitudBitacora)
	{
		this.idSolicitudBitacora = idSolicitudBitacora;
		this.idSolicitudBitacoraModified = true;
	}

	/** 
	 * Sets the value of idSolicitudBitacoraModified
	 */
	public void setIdSolicitudBitacoraModified(boolean idSolicitudBitacoraModified)
	{
		this.idSolicitudBitacoraModified = idSolicitudBitacoraModified;
	}

	/** 
	 * Gets the value of idSolicitudBitacoraModified
	 */
	public boolean isIdSolicitudBitacoraModified()
	{
		return idSolicitudBitacoraModified;
	}

	/**
	 * Method 'getIdFormularioEvento'
	 * 
	 * @return int
	 */
	public int getIdFormularioEvento()
	{
		return idFormularioEvento;
	}

	/**
	 * Method 'setIdFormularioEvento'
	 * 
	 * @param idFormularioEvento
	 */
	public void setIdFormularioEvento(int idFormularioEvento)
	{
		this.idFormularioEvento = idFormularioEvento;
		this.idFormularioEventoModified = true;
	}

	/** 
	 * Sets the value of idFormularioEventoModified
	 */
	public void setIdFormularioEventoModified(boolean idFormularioEventoModified)
	{
		this.idFormularioEventoModified = idFormularioEventoModified;
	}

	/** 
	 * Gets the value of idFormularioEventoModified
	 */
	public boolean isIdFormularioEventoModified()
	{
		return idFormularioEventoModified;
	}

	/**
	 * Method 'getIdEstadoSolicitud'
	 * 
	 * @return int
	 */
	public int getIdEstadoSolicitud()
	{
		return idEstadoSolicitud;
	}

	/**
	 * Method 'setIdEstadoSolicitud'
	 * 
	 * @param idEstadoSolicitud
	 */
	public void setIdEstadoSolicitud(int idEstadoSolicitud)
	{
		this.idEstadoSolicitud = idEstadoSolicitud;
		this.idEstadoSolicitudModified = true;
	}

	/** 
	 * Sets the value of idEstadoSolicitudModified
	 */
	public void setIdEstadoSolicitudModified(boolean idEstadoSolicitudModified)
	{
		this.idEstadoSolicitudModified = idEstadoSolicitudModified;
	}

	/** 
	 * Gets the value of idEstadoSolicitudModified
	 */
	public boolean isIdEstadoSolicitudModified()
	{
		return idEstadoSolicitudModified;
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
		this.idEmpresaNull = false;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'setIdEmpresaNull'
	 * 
	 * @param value
	 */
	public void setIdEmpresaNull(boolean value)
	{
		this.idEmpresaNull = value;
		this.idEmpresaModified = true;
	}

	/**
	 * Method 'isIdEmpresaNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpresaNull()
	{
		return idEmpresaNull;
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
	 * Method 'getDescripcionEvento'
	 * 
	 * @return String
	 */
	public String getDescripcionEvento()
	{
		return descripcionEvento;
	}

	/**
	 * Method 'setDescripcionEvento'
	 * 
	 * @param descripcionEvento
	 */
	public void setDescripcionEvento(String descripcionEvento)
	{
		this.descripcionEvento = descripcionEvento;
		this.descripcionEventoModified = true;
	}

	/** 
	 * Sets the value of descripcionEventoModified
	 */
	public void setDescripcionEventoModified(boolean descripcionEventoModified)
	{
		this.descripcionEventoModified = descripcionEventoModified;
	}

	/** 
	 * Gets the value of descripcionEventoModified
	 */
	public boolean isDescripcionEventoModified()
	{
		return descripcionEventoModified;
	}

	/**
	 * Method 'getFechaHrCreacion'
	 * 
	 * @return Date
	 */
	public Date getFechaHrCreacion()
	{
		return fechaHrCreacion;
	}

	/**
	 * Method 'setFechaHrCreacion'
	 * 
	 * @param fechaHrCreacion
	 */
	public void setFechaHrCreacion(Date fechaHrCreacion)
	{
		this.fechaHrCreacion = fechaHrCreacion;
		this.fechaHrCreacionModified = true;
	}

	/** 
	 * Sets the value of fechaHrCreacionModified
	 */
	public void setFechaHrCreacionModified(boolean fechaHrCreacionModified)
	{
		this.fechaHrCreacionModified = fechaHrCreacionModified;
	}

	/** 
	 * Gets the value of fechaHrCreacionModified
	 */
	public boolean isFechaHrCreacionModified()
	{
		return fechaHrCreacionModified;
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
		
		if (!(_other instanceof CrSolicitudBitacora)) {
			return false;
		}
		
		final CrSolicitudBitacora _cast = (CrSolicitudBitacora) _other;
		if (idSolicitudBitacora != _cast.idSolicitudBitacora) {
			return false;
		}
		
		if (idSolicitudBitacoraModified != _cast.idSolicitudBitacoraModified) {
			return false;
		}
		
		if (idFormularioEvento != _cast.idFormularioEvento) {
			return false;
		}
		
		if (idFormularioEventoModified != _cast.idFormularioEventoModified) {
			return false;
		}
		
		if (idEstadoSolicitud != _cast.idEstadoSolicitud) {
			return false;
		}
		
		if (idEstadoSolicitudModified != _cast.idEstadoSolicitudModified) {
			return false;
		}
		
		if (idUsuario != _cast.idUsuario) {
			return false;
		}
		
		if (idUsuarioModified != _cast.idUsuarioModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaNull != _cast.idEmpresaNull) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (descripcionEvento == null ? _cast.descripcionEvento != descripcionEvento : !descripcionEvento.equals( _cast.descripcionEvento )) {
			return false;
		}
		
		if (descripcionEventoModified != _cast.descripcionEventoModified) {
			return false;
		}
		
		if (fechaHrCreacion == null ? _cast.fechaHrCreacion != fechaHrCreacion : !fechaHrCreacion.equals( _cast.fechaHrCreacion )) {
			return false;
		}
		
		if (fechaHrCreacionModified != _cast.fechaHrCreacionModified) {
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
		_hashCode = 29 * _hashCode + idSolicitudBitacora;
		_hashCode = 29 * _hashCode + (idSolicitudBitacoraModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idFormularioEvento;
		_hashCode = 29 * _hashCode + (idFormularioEventoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstadoSolicitud;
		_hashCode = 29 * _hashCode + (idEstadoSolicitudModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuario;
		_hashCode = 29 * _hashCode + (idUsuarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (descripcionEvento != null) {
			_hashCode = 29 * _hashCode + descripcionEvento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionEventoModified ? 1 : 0);
		if (fechaHrCreacion != null) {
			_hashCode = 29 * _hashCode + fechaHrCreacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHrCreacionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CrSolicitudBitacoraPk
	 */
	public CrSolicitudBitacoraPk createPk()
	{
		return new CrSolicitudBitacoraPk(idSolicitudBitacora);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.CrSolicitudBitacora: " );
		ret.append( "idSolicitudBitacora=" + idSolicitudBitacora );
		ret.append( ", idFormularioEvento=" + idFormularioEvento );
		ret.append( ", idEstadoSolicitud=" + idEstadoSolicitud );
		ret.append( ", idUsuario=" + idUsuario );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", descripcionEvento=" + descripcionEvento );
		ret.append( ", fechaHrCreacion=" + fechaHrCreacion );
		return ret.toString();
	}

}
