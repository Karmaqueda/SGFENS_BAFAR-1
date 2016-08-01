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

public class SgfensVisitaCliente implements Serializable
{
	/** 
	 * This attribute maps to the column ID_VISITA in the sgfens_visita_cliente table.
	 */
	protected int idVisita;

	/** 
	 * This attribute represents whether the attribute idVisita has been modified since being read from the database.
	 */
	protected boolean idVisitaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the sgfens_visita_cliente table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPLEADO_VENDEDOR in the sgfens_visita_cliente table.
	 */
	protected int idEmpleadoVendedor;

	/** 
	 * This attribute represents whether the attribute idEmpleadoVendedor has been modified since being read from the database.
	 */
	protected boolean idEmpleadoVendedorModified = false;

	/** 
	 * This attribute maps to the column ID_CLIENTE in the sgfens_visita_cliente table.
	 */
	protected int idCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCliente is null.
	 */
	protected boolean idClienteNull = true;

	/** 
	 * This attribute represents whether the attribute idCliente has been modified since being read from the database.
	 */
	protected boolean idClienteModified = false;

	/** 
	 * This attribute maps to the column FECHA_HORA in the sgfens_visita_cliente table.
	 */
	protected Date fechaHora;

	/** 
	 * This attribute represents whether the attribute fechaHora has been modified since being read from the database.
	 */
	protected boolean fechaHoraModified = false;

	/** 
	 * This attribute maps to the column LATITUD in the sgfens_visita_cliente table.
	 */
	protected double latitud;

	/** 
	 * This attribute represents whether the primitive attribute latitud is null.
	 */
	protected boolean latitudNull = true;

	/** 
	 * This attribute represents whether the attribute latitud has been modified since being read from the database.
	 */
	protected boolean latitudModified = false;

	/** 
	 * This attribute maps to the column LONGITUD in the sgfens_visita_cliente table.
	 */
	protected double longitud;

	/** 
	 * This attribute represents whether the primitive attribute longitud is null.
	 */
	protected boolean longitudNull = true;

	/** 
	 * This attribute represents whether the attribute longitud has been modified since being read from the database.
	 */
	protected boolean longitudModified = false;

	/** 
	 * This attribute maps to the column ID_OPCION in the sgfens_visita_cliente table.
	 */
	protected int idOpcion;

	/** 
	 * This attribute represents whether the primitive attribute idOpcion is null.
	 */
	protected boolean idOpcionNull = true;

	/** 
	 * This attribute represents whether the attribute idOpcion has been modified since being read from the database.
	 */
	protected boolean idOpcionModified = false;

	/** 
	 * This attribute maps to the column COMENTARIOS in the sgfens_visita_cliente table.
	 */
	protected String comentarios;

	/** 
	 * This attribute represents whether the attribute comentarios has been modified since being read from the database.
	 */
	protected boolean comentariosModified = false;

	/**
	 * Method 'SgfensVisitaCliente'
	 * 
	 */
	public SgfensVisitaCliente()
	{
	}

	/**
	 * Method 'getIdVisita'
	 * 
	 * @return int
	 */
	public int getIdVisita()
	{
		return idVisita;
	}

	/**
	 * Method 'setIdVisita'
	 * 
	 * @param idVisita
	 */
	public void setIdVisita(int idVisita)
	{
		this.idVisita = idVisita;
		this.idVisitaModified = true;
	}

	/** 
	 * Sets the value of idVisitaModified
	 */
	public void setIdVisitaModified(boolean idVisitaModified)
	{
		this.idVisitaModified = idVisitaModified;
	}

	/** 
	 * Gets the value of idVisitaModified
	 */
	public boolean isIdVisitaModified()
	{
		return idVisitaModified;
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
	 * Method 'getIdEmpleadoVendedor'
	 * 
	 * @return int
	 */
	public int getIdEmpleadoVendedor()
	{
		return idEmpleadoVendedor;
	}

	/**
	 * Method 'setIdEmpleadoVendedor'
	 * 
	 * @param idEmpleadoVendedor
	 */
	public void setIdEmpleadoVendedor(int idEmpleadoVendedor)
	{
		this.idEmpleadoVendedor = idEmpleadoVendedor;
		this.idEmpleadoVendedorModified = true;
	}

	/** 
	 * Sets the value of idEmpleadoVendedorModified
	 */
	public void setIdEmpleadoVendedorModified(boolean idEmpleadoVendedorModified)
	{
		this.idEmpleadoVendedorModified = idEmpleadoVendedorModified;
	}

	/** 
	 * Gets the value of idEmpleadoVendedorModified
	 */
	public boolean isIdEmpleadoVendedorModified()
	{
		return idEmpleadoVendedorModified;
	}

	/**
	 * Method 'getIdCliente'
	 * 
	 * @return int
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'setIdCliente'
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
		this.idClienteNull = false;
		this.idClienteModified = true;
	}

	/**
	 * Method 'setIdClienteNull'
	 * 
	 * @param value
	 */
	public void setIdClienteNull(boolean value)
	{
		this.idClienteNull = value;
		this.idClienteModified = true;
	}

	/**
	 * Method 'isIdClienteNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdClienteNull()
	{
		return idClienteNull;
	}

	/** 
	 * Sets the value of idClienteModified
	 */
	public void setIdClienteModified(boolean idClienteModified)
	{
		this.idClienteModified = idClienteModified;
	}

	/** 
	 * Gets the value of idClienteModified
	 */
	public boolean isIdClienteModified()
	{
		return idClienteModified;
	}

	/**
	 * Method 'getFechaHora'
	 * 
	 * @return Date
	 */
	public Date getFechaHora()
	{
		return fechaHora;
	}

	/**
	 * Method 'setFechaHora'
	 * 
	 * @param fechaHora
	 */
	public void setFechaHora(Date fechaHora)
	{
		this.fechaHora = fechaHora;
		this.fechaHoraModified = true;
	}

	/** 
	 * Sets the value of fechaHoraModified
	 */
	public void setFechaHoraModified(boolean fechaHoraModified)
	{
		this.fechaHoraModified = fechaHoraModified;
	}

	/** 
	 * Gets the value of fechaHoraModified
	 */
	public boolean isFechaHoraModified()
	{
		return fechaHoraModified;
	}

	/**
	 * Method 'getLatitud'
	 * 
	 * @return double
	 */
	public double getLatitud()
	{
		return latitud;
	}

	/**
	 * Method 'setLatitud'
	 * 
	 * @param latitud
	 */
	public void setLatitud(double latitud)
	{
		this.latitud = latitud;
		this.latitudNull = false;
		this.latitudModified = true;
	}

	/**
	 * Method 'setLatitudNull'
	 * 
	 * @param value
	 */
	public void setLatitudNull(boolean value)
	{
		this.latitudNull = value;
		this.latitudModified = true;
	}

	/**
	 * Method 'isLatitudNull'
	 * 
	 * @return boolean
	 */
	public boolean isLatitudNull()
	{
		return latitudNull;
	}

	/** 
	 * Sets the value of latitudModified
	 */
	public void setLatitudModified(boolean latitudModified)
	{
		this.latitudModified = latitudModified;
	}

	/** 
	 * Gets the value of latitudModified
	 */
	public boolean isLatitudModified()
	{
		return latitudModified;
	}

	/**
	 * Method 'getLongitud'
	 * 
	 * @return double
	 */
	public double getLongitud()
	{
		return longitud;
	}

	/**
	 * Method 'setLongitud'
	 * 
	 * @param longitud
	 */
	public void setLongitud(double longitud)
	{
		this.longitud = longitud;
		this.longitudNull = false;
		this.longitudModified = true;
	}

	/**
	 * Method 'setLongitudNull'
	 * 
	 * @param value
	 */
	public void setLongitudNull(boolean value)
	{
		this.longitudNull = value;
		this.longitudModified = true;
	}

	/**
	 * Method 'isLongitudNull'
	 * 
	 * @return boolean
	 */
	public boolean isLongitudNull()
	{
		return longitudNull;
	}

	/** 
	 * Sets the value of longitudModified
	 */
	public void setLongitudModified(boolean longitudModified)
	{
		this.longitudModified = longitudModified;
	}

	/** 
	 * Gets the value of longitudModified
	 */
	public boolean isLongitudModified()
	{
		return longitudModified;
	}

	/**
	 * Method 'getIdOpcion'
	 * 
	 * @return int
	 */
	public int getIdOpcion()
	{
		return idOpcion;
	}

	/**
	 * Method 'setIdOpcion'
	 * 
	 * @param idOpcion
	 */
	public void setIdOpcion(int idOpcion)
	{
		this.idOpcion = idOpcion;
		this.idOpcionNull = false;
		this.idOpcionModified = true;
	}

	/**
	 * Method 'setIdOpcionNull'
	 * 
	 * @param value
	 */
	public void setIdOpcionNull(boolean value)
	{
		this.idOpcionNull = value;
		this.idOpcionModified = true;
	}

	/**
	 * Method 'isIdOpcionNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdOpcionNull()
	{
		return idOpcionNull;
	}

	/** 
	 * Sets the value of idOpcionModified
	 */
	public void setIdOpcionModified(boolean idOpcionModified)
	{
		this.idOpcionModified = idOpcionModified;
	}

	/** 
	 * Gets the value of idOpcionModified
	 */
	public boolean isIdOpcionModified()
	{
		return idOpcionModified;
	}

	/**
	 * Method 'getComentarios'
	 * 
	 * @return String
	 */
	public String getComentarios()
	{
		return comentarios;
	}

	/**
	 * Method 'setComentarios'
	 * 
	 * @param comentarios
	 */
	public void setComentarios(String comentarios)
	{
		this.comentarios = comentarios;
		this.comentariosModified = true;
	}

	/** 
	 * Sets the value of comentariosModified
	 */
	public void setComentariosModified(boolean comentariosModified)
	{
		this.comentariosModified = comentariosModified;
	}

	/** 
	 * Gets the value of comentariosModified
	 */
	public boolean isComentariosModified()
	{
		return comentariosModified;
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
		
		if (!(_other instanceof SgfensVisitaCliente)) {
			return false;
		}
		
		final SgfensVisitaCliente _cast = (SgfensVisitaCliente) _other;
		if (idVisita != _cast.idVisita) {
			return false;
		}
		
		if (idVisitaModified != _cast.idVisitaModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idEmpleadoVendedor != _cast.idEmpleadoVendedor) {
			return false;
		}
		
		if (idEmpleadoVendedorModified != _cast.idEmpleadoVendedorModified) {
			return false;
		}
		
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteNull != _cast.idClienteNull) {
			return false;
		}
		
		if (idClienteModified != _cast.idClienteModified) {
			return false;
		}
		
		if (fechaHora == null ? _cast.fechaHora != fechaHora : !fechaHora.equals( _cast.fechaHora )) {
			return false;
		}
		
		if (fechaHoraModified != _cast.fechaHoraModified) {
			return false;
		}
		
		if (latitud != _cast.latitud) {
			return false;
		}
		
		if (latitudNull != _cast.latitudNull) {
			return false;
		}
		
		if (latitudModified != _cast.latitudModified) {
			return false;
		}
		
		if (longitud != _cast.longitud) {
			return false;
		}
		
		if (longitudNull != _cast.longitudNull) {
			return false;
		}
		
		if (longitudModified != _cast.longitudModified) {
			return false;
		}
		
		if (idOpcion != _cast.idOpcion) {
			return false;
		}
		
		if (idOpcionNull != _cast.idOpcionNull) {
			return false;
		}
		
		if (idOpcionModified != _cast.idOpcionModified) {
			return false;
		}
		
		if (comentarios == null ? _cast.comentarios != comentarios : !comentarios.equals( _cast.comentarios )) {
			return false;
		}
		
		if (comentariosModified != _cast.comentariosModified) {
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
		_hashCode = 29 * _hashCode + idVisita;
		_hashCode = 29 * _hashCode + (idVisitaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpleadoVendedor;
		_hashCode = 29 * _hashCode + (idEmpleadoVendedorModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + (idClienteNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idClienteModified ? 1 : 0);
		if (fechaHora != null) {
			_hashCode = 29 * _hashCode + fechaHora.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHoraModified ? 1 : 0);
		long temp_latitud = Double.doubleToLongBits(latitud);
		_hashCode = 29 * _hashCode + (int) (temp_latitud ^ (temp_latitud >>> 32));
		_hashCode = 29 * _hashCode + (latitudNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (latitudModified ? 1 : 0);
		long temp_longitud = Double.doubleToLongBits(longitud);
		_hashCode = 29 * _hashCode + (int) (temp_longitud ^ (temp_longitud >>> 32));
		_hashCode = 29 * _hashCode + (longitudNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (longitudModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idOpcion;
		_hashCode = 29 * _hashCode + (idOpcionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idOpcionModified ? 1 : 0);
		if (comentarios != null) {
			_hashCode = 29 * _hashCode + comentarios.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (comentariosModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensVisitaClientePk
	 */
	public SgfensVisitaClientePk createPk()
	{
		return new SgfensVisitaClientePk(idVisita);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensVisitaCliente: " );
		ret.append( "idVisita=" + idVisita );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEmpleadoVendedor=" + idEmpleadoVendedor );
		ret.append( ", idCliente=" + idCliente );
		ret.append( ", fechaHora=" + fechaHora );
		ret.append( ", latitud=" + latitud );
		ret.append( ", longitud=" + longitud );
		ret.append( ", idOpcion=" + idOpcion );
		ret.append( ", comentarios=" + comentarios );
		return ret.toString();
	}

}