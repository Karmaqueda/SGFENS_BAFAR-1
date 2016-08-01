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

public class ComprobanteImpuestoXConcepto implements Serializable
{
	/** 
	 * This attribute maps to the column ID_COMPROBANTE_IMPUESTO in the comprobante_impuesto_x_concepto table.
	 */
	protected int idComprobanteImpuesto;

	/** 
	 * This attribute represents whether the attribute idComprobanteImpuesto has been modified since being read from the database.
	 */
	protected boolean idComprobanteImpuestoModified = false;

	/** 
	 * This attribute maps to the column ID_COMPROBANTE_FISCAL in the comprobante_impuesto_x_concepto table.
	 */
	protected int idComprobanteFiscal;

	/** 
	 * This attribute represents whether the primitive attribute idComprobanteFiscal is null.
	 */
	protected boolean idComprobanteFiscalNull = true;

	/** 
	 * This attribute represents whether the attribute idComprobanteFiscal has been modified since being read from the database.
	 */
	protected boolean idComprobanteFiscalModified = false;

	/** 
	 * This attribute maps to the column ID_IMPUESTO in the comprobante_impuesto_x_concepto table.
	 */
	protected int idImpuesto;

	/** 
	 * This attribute represents whether the primitive attribute idImpuesto is null.
	 */
	protected boolean idImpuestoNull = true;

	/** 
	 * This attribute represents whether the attribute idImpuesto has been modified since being read from the database.
	 */
	protected boolean idImpuestoModified = false;

	/** 
	 * This attribute maps to the column NOMBRE in the comprobante_impuesto_x_concepto table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the comprobante_impuesto_x_concepto table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column PORCENTAJE in the comprobante_impuesto_x_concepto table.
	 */
	protected float porcentaje;

	/** 
	 * This attribute represents whether the attribute porcentaje has been modified since being read from the database.
	 */
	protected boolean porcentajeModified = false;

	/** 
	 * This attribute maps to the column TRASLADADO in the comprobante_impuesto_x_concepto table.
	 */
	protected short trasladado;

	/** 
	 * This attribute represents whether the primitive attribute trasladado is null.
	 */
	protected boolean trasladadoNull = true;

	/** 
	 * This attribute represents whether the attribute trasladado has been modified since being read from the database.
	 */
	protected boolean trasladadoModified = false;

	/** 
	 * This attribute maps to the column IMPUESTO_LOCAL in the comprobante_impuesto_x_concepto table.
	 */
	protected short impuestoLocal;

	/** 
	 * This attribute represents whether the primitive attribute impuestoLocal is null.
	 */
	protected boolean impuestoLocalNull = true;

	/** 
	 * This attribute represents whether the attribute impuestoLocal has been modified since being read from the database.
	 */
	protected boolean impuestoLocalModified = false;

	/**
	 * Method 'ComprobanteImpuestoXConcepto'
	 * 
	 */
	public ComprobanteImpuestoXConcepto()
	{
	}

	/**
	 * Method 'getIdComprobanteImpuesto'
	 * 
	 * @return int
	 */
	public int getIdComprobanteImpuesto()
	{
		return idComprobanteImpuesto;
	}

	/**
	 * Method 'setIdComprobanteImpuesto'
	 * 
	 * @param idComprobanteImpuesto
	 */
	public void setIdComprobanteImpuesto(int idComprobanteImpuesto)
	{
		this.idComprobanteImpuesto = idComprobanteImpuesto;
		this.idComprobanteImpuestoModified = true;
	}

	/** 
	 * Sets the value of idComprobanteImpuestoModified
	 */
	public void setIdComprobanteImpuestoModified(boolean idComprobanteImpuestoModified)
	{
		this.idComprobanteImpuestoModified = idComprobanteImpuestoModified;
	}

	/** 
	 * Gets the value of idComprobanteImpuestoModified
	 */
	public boolean isIdComprobanteImpuestoModified()
	{
		return idComprobanteImpuestoModified;
	}

	/**
	 * Method 'getIdComprobanteFiscal'
	 * 
	 * @return int
	 */
	public int getIdComprobanteFiscal()
	{
		return idComprobanteFiscal;
	}

	/**
	 * Method 'setIdComprobanteFiscal'
	 * 
	 * @param idComprobanteFiscal
	 */
	public void setIdComprobanteFiscal(int idComprobanteFiscal)
	{
		this.idComprobanteFiscal = idComprobanteFiscal;
		this.idComprobanteFiscalNull = false;
		this.idComprobanteFiscalModified = true;
	}

	/**
	 * Method 'setIdComprobanteFiscalNull'
	 * 
	 * @param value
	 */
	public void setIdComprobanteFiscalNull(boolean value)
	{
		this.idComprobanteFiscalNull = value;
		this.idComprobanteFiscalModified = true;
	}

	/**
	 * Method 'isIdComprobanteFiscalNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdComprobanteFiscalNull()
	{
		return idComprobanteFiscalNull;
	}

	/** 
	 * Sets the value of idComprobanteFiscalModified
	 */
	public void setIdComprobanteFiscalModified(boolean idComprobanteFiscalModified)
	{
		this.idComprobanteFiscalModified = idComprobanteFiscalModified;
	}

	/** 
	 * Gets the value of idComprobanteFiscalModified
	 */
	public boolean isIdComprobanteFiscalModified()
	{
		return idComprobanteFiscalModified;
	}

	/**
	 * Method 'getIdImpuesto'
	 * 
	 * @return int
	 */
	public int getIdImpuesto()
	{
		return idImpuesto;
	}

	/**
	 * Method 'setIdImpuesto'
	 * 
	 * @param idImpuesto
	 */
	public void setIdImpuesto(int idImpuesto)
	{
		this.idImpuesto = idImpuesto;
		this.idImpuestoNull = false;
		this.idImpuestoModified = true;
	}

	/**
	 * Method 'setIdImpuestoNull'
	 * 
	 * @param value
	 */
	public void setIdImpuestoNull(boolean value)
	{
		this.idImpuestoNull = value;
		this.idImpuestoModified = true;
	}

	/**
	 * Method 'isIdImpuestoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdImpuestoNull()
	{
		return idImpuestoNull;
	}

	/** 
	 * Sets the value of idImpuestoModified
	 */
	public void setIdImpuestoModified(boolean idImpuestoModified)
	{
		this.idImpuestoModified = idImpuestoModified;
	}

	/** 
	 * Gets the value of idImpuestoModified
	 */
	public boolean isIdImpuestoModified()
	{
		return idImpuestoModified;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
	}

	/**
	 * Method 'getPorcentaje'
	 * 
	 * @return float
	 */
	public float getPorcentaje()
	{
		return porcentaje;
	}

	/**
	 * Method 'setPorcentaje'
	 * 
	 * @param porcentaje
	 */
	public void setPorcentaje(float porcentaje)
	{
		this.porcentaje = porcentaje;
		this.porcentajeModified = true;
	}

	/** 
	 * Sets the value of porcentajeModified
	 */
	public void setPorcentajeModified(boolean porcentajeModified)
	{
		this.porcentajeModified = porcentajeModified;
	}

	/** 
	 * Gets the value of porcentajeModified
	 */
	public boolean isPorcentajeModified()
	{
		return porcentajeModified;
	}

	/**
	 * Method 'getTrasladado'
	 * 
	 * @return short
	 */
	public short getTrasladado()
	{
		return trasladado;
	}

	/**
	 * Method 'setTrasladado'
	 * 
	 * @param trasladado
	 */
	public void setTrasladado(short trasladado)
	{
		this.trasladado = trasladado;
		this.trasladadoNull = false;
		this.trasladadoModified = true;
	}

	/**
	 * Method 'setTrasladadoNull'
	 * 
	 * @param value
	 */
	public void setTrasladadoNull(boolean value)
	{
		this.trasladadoNull = value;
		this.trasladadoModified = true;
	}

	/**
	 * Method 'isTrasladadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isTrasladadoNull()
	{
		return trasladadoNull;
	}

	/** 
	 * Sets the value of trasladadoModified
	 */
	public void setTrasladadoModified(boolean trasladadoModified)
	{
		this.trasladadoModified = trasladadoModified;
	}

	/** 
	 * Gets the value of trasladadoModified
	 */
	public boolean isTrasladadoModified()
	{
		return trasladadoModified;
	}

	/**
	 * Method 'getImpuestoLocal'
	 * 
	 * @return short
	 */
	public short getImpuestoLocal()
	{
		return impuestoLocal;
	}

	/**
	 * Method 'setImpuestoLocal'
	 * 
	 * @param impuestoLocal
	 */
	public void setImpuestoLocal(short impuestoLocal)
	{
		this.impuestoLocal = impuestoLocal;
		this.impuestoLocalNull = false;
		this.impuestoLocalModified = true;
	}

	/**
	 * Method 'setImpuestoLocalNull'
	 * 
	 * @param value
	 */
	public void setImpuestoLocalNull(boolean value)
	{
		this.impuestoLocalNull = value;
		this.impuestoLocalModified = true;
	}

	/**
	 * Method 'isImpuestoLocalNull'
	 * 
	 * @return boolean
	 */
	public boolean isImpuestoLocalNull()
	{
		return impuestoLocalNull;
	}

	/** 
	 * Sets the value of impuestoLocalModified
	 */
	public void setImpuestoLocalModified(boolean impuestoLocalModified)
	{
		this.impuestoLocalModified = impuestoLocalModified;
	}

	/** 
	 * Gets the value of impuestoLocalModified
	 */
	public boolean isImpuestoLocalModified()
	{
		return impuestoLocalModified;
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
		
		if (!(_other instanceof ComprobanteImpuestoXConcepto)) {
			return false;
		}
		
		final ComprobanteImpuestoXConcepto _cast = (ComprobanteImpuestoXConcepto) _other;
		if (idComprobanteImpuesto != _cast.idComprobanteImpuesto) {
			return false;
		}
		
		if (idComprobanteImpuestoModified != _cast.idComprobanteImpuestoModified) {
			return false;
		}
		
		if (idComprobanteFiscal != _cast.idComprobanteFiscal) {
			return false;
		}
		
		if (idComprobanteFiscalNull != _cast.idComprobanteFiscalNull) {
			return false;
		}
		
		if (idComprobanteFiscalModified != _cast.idComprobanteFiscalModified) {
			return false;
		}
		
		if (idImpuesto != _cast.idImpuesto) {
			return false;
		}
		
		if (idImpuestoNull != _cast.idImpuestoNull) {
			return false;
		}
		
		if (idImpuestoModified != _cast.idImpuestoModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (porcentaje != _cast.porcentaje) {
			return false;
		}
		
		if (porcentajeModified != _cast.porcentajeModified) {
			return false;
		}
		
		if (trasladado != _cast.trasladado) {
			return false;
		}
		
		if (trasladadoNull != _cast.trasladadoNull) {
			return false;
		}
		
		if (trasladadoModified != _cast.trasladadoModified) {
			return false;
		}
		
		if (impuestoLocal != _cast.impuestoLocal) {
			return false;
		}
		
		if (impuestoLocalNull != _cast.impuestoLocalNull) {
			return false;
		}
		
		if (impuestoLocalModified != _cast.impuestoLocalModified) {
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
		_hashCode = 29 * _hashCode + idComprobanteImpuesto;
		_hashCode = 29 * _hashCode + (idComprobanteImpuestoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idComprobanteFiscal;
		_hashCode = 29 * _hashCode + (idComprobanteFiscalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idComprobanteFiscalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idImpuesto;
		_hashCode = 29 * _hashCode + (idImpuestoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idImpuestoModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(porcentaje);
		_hashCode = 29 * _hashCode + (porcentajeModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) trasladado;
		_hashCode = 29 * _hashCode + (trasladadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (trasladadoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) impuestoLocal;
		_hashCode = 29 * _hashCode + (impuestoLocalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (impuestoLocalModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ComprobanteImpuestoXConceptoPk
	 */
	public ComprobanteImpuestoXConceptoPk createPk()
	{
		return new ComprobanteImpuestoXConceptoPk(idComprobanteImpuesto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ComprobanteImpuestoXConcepto: " );
		ret.append( "idComprobanteImpuesto=" + idComprobanteImpuesto );
		ret.append( ", idComprobanteFiscal=" + idComprobanteFiscal );
		ret.append( ", idImpuesto=" + idImpuesto );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", porcentaje=" + porcentaje );
		ret.append( ", trasladado=" + trasladado );
		ret.append( ", impuestoLocal=" + impuestoLocal );
		return ret.toString();
	}

}
