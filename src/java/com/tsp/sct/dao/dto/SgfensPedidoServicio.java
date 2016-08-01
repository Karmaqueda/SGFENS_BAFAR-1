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

public class SgfensPedidoServicio implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PEDIDO in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected int idPedido;

	/** 
	 * This attribute represents whether the attribute idPedido has been modified since being read from the database.
	 */
	protected boolean idPedidoModified = false;

	/** 
	 * This attribute maps to the column ID_SERVICIO in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected int idServicio;

	/** 
	 * This attribute represents whether the attribute idServicio has been modified since being read from the database.
	 */
	protected boolean idServicioModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column UNIDAD in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected String unidad;

	/** 
	 * This attribute represents whether the attribute unidad has been modified since being read from the database.
	 */
	protected boolean unidadModified = false;

	/** 
	 * This attribute maps to the column IDENTIFICACION in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected String identificacion;

	/** 
	 * This attribute represents whether the attribute identificacion has been modified since being read from the database.
	 */
	protected boolean identificacionModified = false;

	/** 
	 * This attribute maps to the column CANTIDAD in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected double cantidad;

	/** 
	 * This attribute represents whether the attribute cantidad has been modified since being read from the database.
	 */
	protected boolean cantidadModified = false;

	/** 
	 * This attribute maps to the column PRECIO_UNITARIO in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected double precioUnitario;

	/** 
	 * This attribute represents whether the attribute precioUnitario has been modified since being read from the database.
	 */
	protected boolean precioUnitarioModified = false;

	/** 
	 * This attribute maps to the column DESCUENTO_PORCENTAJE in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected double descuentoPorcentaje;

	/** 
	 * This attribute represents whether the primitive attribute descuentoPorcentaje is null.
	 */
	protected boolean descuentoPorcentajeNull = true;

	/** 
	 * This attribute represents whether the attribute descuentoPorcentaje has been modified since being read from the database.
	 */
	protected boolean descuentoPorcentajeModified = false;

	/** 
	 * This attribute maps to the column DESCUENTO_MONTO in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected double descuentoMonto;

	/** 
	 * This attribute represents whether the primitive attribute descuentoMonto is null.
	 */
	protected boolean descuentoMontoNull = true;

	/** 
	 * This attribute represents whether the attribute descuentoMonto has been modified since being read from the database.
	 */
	protected boolean descuentoMontoModified = false;

	/** 
	 * This attribute maps to the column SUBTOTAL in the SGFENS_PEDIDO_SERVICIO table.
	 */
	protected double subtotal;

	/** 
	 * This attribute represents whether the attribute subtotal has been modified since being read from the database.
	 */
	protected boolean subtotalModified = false;

	/**
	 * Method 'SgfensPedidoServicio'
	 * 
	 */
	public SgfensPedidoServicio()
	{
	}

	/**
	 * Method 'getIdPedido'
	 * 
	 * @return int
	 */
	public int getIdPedido()
	{
		return idPedido;
	}

	/**
	 * Method 'setIdPedido'
	 * 
	 * @param idPedido
	 */
	public void setIdPedido(int idPedido)
	{
		this.idPedido = idPedido;
		this.idPedidoModified = true;
	}

	/** 
	 * Sets the value of idPedidoModified
	 */
	public void setIdPedidoModified(boolean idPedidoModified)
	{
		this.idPedidoModified = idPedidoModified;
	}

	/** 
	 * Gets the value of idPedidoModified
	 */
	public boolean isIdPedidoModified()
	{
		return idPedidoModified;
	}

	/**
	 * Method 'getIdServicio'
	 * 
	 * @return int
	 */
	public int getIdServicio()
	{
		return idServicio;
	}

	/**
	 * Method 'setIdServicio'
	 * 
	 * @param idServicio
	 */
	public void setIdServicio(int idServicio)
	{
		this.idServicio = idServicio;
		this.idServicioModified = true;
	}

	/** 
	 * Sets the value of idServicioModified
	 */
	public void setIdServicioModified(boolean idServicioModified)
	{
		this.idServicioModified = idServicioModified;
	}

	/** 
	 * Gets the value of idServicioModified
	 */
	public boolean isIdServicioModified()
	{
		return idServicioModified;
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
	 * Method 'getUnidad'
	 * 
	 * @return String
	 */
	public String getUnidad()
	{
		return unidad;
	}

	/**
	 * Method 'setUnidad'
	 * 
	 * @param unidad
	 */
	public void setUnidad(String unidad)
	{
		this.unidad = unidad;
		this.unidadModified = true;
	}

	/** 
	 * Sets the value of unidadModified
	 */
	public void setUnidadModified(boolean unidadModified)
	{
		this.unidadModified = unidadModified;
	}

	/** 
	 * Gets the value of unidadModified
	 */
	public boolean isUnidadModified()
	{
		return unidadModified;
	}

	/**
	 * Method 'getIdentificacion'
	 * 
	 * @return String
	 */
	public String getIdentificacion()
	{
		return identificacion;
	}

	/**
	 * Method 'setIdentificacion'
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(String identificacion)
	{
		this.identificacion = identificacion;
		this.identificacionModified = true;
	}

	/** 
	 * Sets the value of identificacionModified
	 */
	public void setIdentificacionModified(boolean identificacionModified)
	{
		this.identificacionModified = identificacionModified;
	}

	/** 
	 * Gets the value of identificacionModified
	 */
	public boolean isIdentificacionModified()
	{
		return identificacionModified;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return double
	 */
	public double getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(double cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadModified = true;
	}

	/** 
	 * Sets the value of cantidadModified
	 */
	public void setCantidadModified(boolean cantidadModified)
	{
		this.cantidadModified = cantidadModified;
	}

	/** 
	 * Gets the value of cantidadModified
	 */
	public boolean isCantidadModified()
	{
		return cantidadModified;
	}

	/**
	 * Method 'getPrecioUnitario'
	 * 
	 * @return double
	 */
	public double getPrecioUnitario()
	{
		return precioUnitario;
	}

	/**
	 * Method 'setPrecioUnitario'
	 * 
	 * @param precioUnitario
	 */
	public void setPrecioUnitario(double precioUnitario)
	{
		this.precioUnitario = precioUnitario;
		this.precioUnitarioModified = true;
	}

	/** 
	 * Sets the value of precioUnitarioModified
	 */
	public void setPrecioUnitarioModified(boolean precioUnitarioModified)
	{
		this.precioUnitarioModified = precioUnitarioModified;
	}

	/** 
	 * Gets the value of precioUnitarioModified
	 */
	public boolean isPrecioUnitarioModified()
	{
		return precioUnitarioModified;
	}

	/**
	 * Method 'getDescuentoPorcentaje'
	 * 
	 * @return double
	 */
	public double getDescuentoPorcentaje()
	{
		return descuentoPorcentaje;
	}

	/**
	 * Method 'setDescuentoPorcentaje'
	 * 
	 * @param descuentoPorcentaje
	 */
	public void setDescuentoPorcentaje(double descuentoPorcentaje)
	{
		this.descuentoPorcentaje = descuentoPorcentaje;
		this.descuentoPorcentajeNull = false;
		this.descuentoPorcentajeModified = true;
	}

	/**
	 * Method 'setDescuentoPorcentajeNull'
	 * 
	 * @param value
	 */
	public void setDescuentoPorcentajeNull(boolean value)
	{
		this.descuentoPorcentajeNull = value;
		this.descuentoPorcentajeModified = true;
	}

	/**
	 * Method 'isDescuentoPorcentajeNull'
	 * 
	 * @return boolean
	 */
	public boolean isDescuentoPorcentajeNull()
	{
		return descuentoPorcentajeNull;
	}

	/** 
	 * Sets the value of descuentoPorcentajeModified
	 */
	public void setDescuentoPorcentajeModified(boolean descuentoPorcentajeModified)
	{
		this.descuentoPorcentajeModified = descuentoPorcentajeModified;
	}

	/** 
	 * Gets the value of descuentoPorcentajeModified
	 */
	public boolean isDescuentoPorcentajeModified()
	{
		return descuentoPorcentajeModified;
	}

	/**
	 * Method 'getDescuentoMonto'
	 * 
	 * @return double
	 */
	public double getDescuentoMonto()
	{
		return descuentoMonto;
	}

	/**
	 * Method 'setDescuentoMonto'
	 * 
	 * @param descuentoMonto
	 */
	public void setDescuentoMonto(double descuentoMonto)
	{
		this.descuentoMonto = descuentoMonto;
		this.descuentoMontoNull = false;
		this.descuentoMontoModified = true;
	}

	/**
	 * Method 'setDescuentoMontoNull'
	 * 
	 * @param value
	 */
	public void setDescuentoMontoNull(boolean value)
	{
		this.descuentoMontoNull = value;
		this.descuentoMontoModified = true;
	}

	/**
	 * Method 'isDescuentoMontoNull'
	 * 
	 * @return boolean
	 */
	public boolean isDescuentoMontoNull()
	{
		return descuentoMontoNull;
	}

	/** 
	 * Sets the value of descuentoMontoModified
	 */
	public void setDescuentoMontoModified(boolean descuentoMontoModified)
	{
		this.descuentoMontoModified = descuentoMontoModified;
	}

	/** 
	 * Gets the value of descuentoMontoModified
	 */
	public boolean isDescuentoMontoModified()
	{
		return descuentoMontoModified;
	}

	/**
	 * Method 'getSubtotal'
	 * 
	 * @return double
	 */
	public double getSubtotal()
	{
		return subtotal;
	}

	/**
	 * Method 'setSubtotal'
	 * 
	 * @param subtotal
	 */
	public void setSubtotal(double subtotal)
	{
		this.subtotal = subtotal;
		this.subtotalModified = true;
	}

	/** 
	 * Sets the value of subtotalModified
	 */
	public void setSubtotalModified(boolean subtotalModified)
	{
		this.subtotalModified = subtotalModified;
	}

	/** 
	 * Gets the value of subtotalModified
	 */
	public boolean isSubtotalModified()
	{
		return subtotalModified;
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
		
		if (!(_other instanceof SgfensPedidoServicio)) {
			return false;
		}
		
		final SgfensPedidoServicio _cast = (SgfensPedidoServicio) _other;
		if (idPedido != _cast.idPedido) {
			return false;
		}
		
		if (idPedidoModified != _cast.idPedidoModified) {
			return false;
		}
		
		if (idServicio != _cast.idServicio) {
			return false;
		}
		
		if (idServicioModified != _cast.idServicioModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (unidad == null ? _cast.unidad != unidad : !unidad.equals( _cast.unidad )) {
			return false;
		}
		
		if (unidadModified != _cast.unidadModified) {
			return false;
		}
		
		if (identificacion == null ? _cast.identificacion != identificacion : !identificacion.equals( _cast.identificacion )) {
			return false;
		}
		
		if (identificacionModified != _cast.identificacionModified) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadModified != _cast.cantidadModified) {
			return false;
		}
		
		if (precioUnitario != _cast.precioUnitario) {
			return false;
		}
		
		if (precioUnitarioModified != _cast.precioUnitarioModified) {
			return false;
		}
		
		if (descuentoPorcentaje != _cast.descuentoPorcentaje) {
			return false;
		}
		
		if (descuentoPorcentajeNull != _cast.descuentoPorcentajeNull) {
			return false;
		}
		
		if (descuentoPorcentajeModified != _cast.descuentoPorcentajeModified) {
			return false;
		}
		
		if (descuentoMonto != _cast.descuentoMonto) {
			return false;
		}
		
		if (descuentoMontoNull != _cast.descuentoMontoNull) {
			return false;
		}
		
		if (descuentoMontoModified != _cast.descuentoMontoModified) {
			return false;
		}
		
		if (subtotal != _cast.subtotal) {
			return false;
		}
		
		if (subtotalModified != _cast.subtotalModified) {
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
		_hashCode = 29 * _hashCode + idPedido;
		_hashCode = 29 * _hashCode + (idPedidoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idServicio;
		_hashCode = 29 * _hashCode + (idServicioModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		if (unidad != null) {
			_hashCode = 29 * _hashCode + unidad.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (unidadModified ? 1 : 0);
		if (identificacion != null) {
			_hashCode = 29 * _hashCode + identificacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (identificacionModified ? 1 : 0);
		long temp_cantidad = Double.doubleToLongBits(cantidad);
		_hashCode = 29 * _hashCode + (int) (temp_cantidad ^ (temp_cantidad >>> 32));
		_hashCode = 29 * _hashCode + (cantidadModified ? 1 : 0);
		long temp_precioUnitario = Double.doubleToLongBits(precioUnitario);
		_hashCode = 29 * _hashCode + (int) (temp_precioUnitario ^ (temp_precioUnitario >>> 32));
		_hashCode = 29 * _hashCode + (precioUnitarioModified ? 1 : 0);
		long temp_descuentoPorcentaje = Double.doubleToLongBits(descuentoPorcentaje);
		_hashCode = 29 * _hashCode + (int) (temp_descuentoPorcentaje ^ (temp_descuentoPorcentaje >>> 32));
		_hashCode = 29 * _hashCode + (descuentoPorcentajeNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (descuentoPorcentajeModified ? 1 : 0);
		long temp_descuentoMonto = Double.doubleToLongBits(descuentoMonto);
		_hashCode = 29 * _hashCode + (int) (temp_descuentoMonto ^ (temp_descuentoMonto >>> 32));
		_hashCode = 29 * _hashCode + (descuentoMontoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (descuentoMontoModified ? 1 : 0);
		long temp_subtotal = Double.doubleToLongBits(subtotal);
		_hashCode = 29 * _hashCode + (int) (temp_subtotal ^ (temp_subtotal >>> 32));
		_hashCode = 29 * _hashCode + (subtotalModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensPedidoServicioPk
	 */
	public SgfensPedidoServicioPk createPk()
	{
		return new SgfensPedidoServicioPk(idPedido, idServicio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensPedidoServicio: " );
		ret.append( "idPedido=" + idPedido );
		ret.append( ", idServicio=" + idServicio );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", unidad=" + unidad );
		ret.append( ", identificacion=" + identificacion );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", precioUnitario=" + precioUnitario );
		ret.append( ", descuentoPorcentaje=" + descuentoPorcentaje );
		ret.append( ", descuentoMonto=" + descuentoMonto );
		ret.append( ", subtotal=" + subtotal );
		return ret.toString();
	}

}
