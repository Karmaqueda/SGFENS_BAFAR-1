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

public class ComprobanteDescripcionPerflores implements Serializable
{
	/** 
	 * This attribute maps to the column ID_COMPROBANTE_DESCRIPCION in the comprobante_descripcion_perflores table.
	 */
	protected int idComprobanteDescripcion;

	/** 
	 * This attribute maps to the column ID_COMPROBANTE_FISCAL in the comprobante_descripcion_perflores table.
	 */
	protected int idComprobanteFiscal;

	/** 
	 * This attribute maps to the column ID_CONCEPTO in the comprobante_descripcion_perflores table.
	 */
	protected int idConcepto;

	/** 
	 * This attribute maps to the column DESCRIPCION in the comprobante_descripcion_perflores table.
	 */
	protected String descripcion;

	/** 
	 * This attribute maps to the column CANTIDAD in the comprobante_descripcion_perflores table.
	 */
	protected float cantidad;

	/** 
	 * This attribute represents whether the primitive attribute cantidad is null.
	 */
	protected boolean cantidadNull = true;

	/** 
	 * This attribute maps to the column PRECIO_UNITARIO in the comprobante_descripcion_perflores table.
	 */
	protected float precioUnitario;

	/** 
	 * This attribute represents whether the primitive attribute precioUnitario is null.
	 */
	protected boolean precioUnitarioNull = true;

	/** 
	 * This attribute maps to the column UNIDAD in the comprobante_descripcion_perflores table.
	 */
	protected String unidad;

	/** 
	 * This attribute maps to the column PORCENTAJE in the comprobante_descripcion_perflores table.
	 */
	protected String porcentaje;

	/** 
	 * This attribute maps to the column TOTAL_OBRA in the comprobante_descripcion_perflores table.
	 */
	protected String totalObra;

	/** 
	 * This attribute maps to the column AMORTIZACION in the comprobante_descripcion_perflores table.
	 */
	protected String amortizacion;

	/** 
	 * This attribute maps to the column SUMA in the comprobante_descripcion_perflores table.
	 */
	protected String suma;

	/** 
	 * This attribute maps to the column SUBTOTAL1 in the comprobante_descripcion_perflores table.
	 */
	protected String subtotal1;

	/** 
	 * This attribute maps to the column INSP_Y_VIGI in the comprobante_descripcion_perflores table.
	 */
	protected String inspYVigi;

	/** 
	 * This attribute maps to the column CAPA_ICIC in the comprobante_descripcion_perflores table.
	 */
	protected String capaIcic;

	/** 
	 * This attribute maps to the column FONDO_SEGURIDAD in the comprobante_descripcion_perflores table.
	 */
	protected String fondoSeguridad;

	/** 
	 * This attribute maps to the column SUBTOTAL2 in the comprobante_descripcion_perflores table.
	 */
	protected String subtotal2;

	/** 
	 * This attribute maps to the column ALCANCE_LIQUIDO in the comprobante_descripcion_perflores table.
	 */
	protected String alcanceLiquido;

	/**
	 * Method 'ComprobanteDescripcionPerflores'
	 * 
	 */
	public ComprobanteDescripcionPerflores()
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
	}

	/**
	 * Method 'getIdConcepto'
	 * 
	 * @return int
	 */
	public int getIdConcepto()
	{
		return idConcepto;
	}

	/**
	 * Method 'setIdConcepto'
	 * 
	 * @param idConcepto
	 */
	public void setIdConcepto(int idConcepto)
	{
		this.idConcepto = idConcepto;
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
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return float
	 */
	public float getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(float cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadNull = false;
	}

	/**
	 * Method 'setCantidadNull'
	 * 
	 * @param value
	 */
	public void setCantidadNull(boolean value)
	{
		this.cantidadNull = value;
	}

	/**
	 * Method 'isCantidadNull'
	 * 
	 * @return boolean
	 */
	public boolean isCantidadNull()
	{
		return cantidadNull;
	}

	/**
	 * Method 'getPrecioUnitario'
	 * 
	 * @return float
	 */
	public float getPrecioUnitario()
	{
		return precioUnitario;
	}

	/**
	 * Method 'setPrecioUnitario'
	 * 
	 * @param precioUnitario
	 */
	public void setPrecioUnitario(float precioUnitario)
	{
		this.precioUnitario = precioUnitario;
		this.precioUnitarioNull = false;
	}

	/**
	 * Method 'setPrecioUnitarioNull'
	 * 
	 * @param value
	 */
	public void setPrecioUnitarioNull(boolean value)
	{
		this.precioUnitarioNull = value;
	}

	/**
	 * Method 'isPrecioUnitarioNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioUnitarioNull()
	{
		return precioUnitarioNull;
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
	}

	/**
	 * Method 'getPorcentaje'
	 * 
	 * @return String
	 */
	public String getPorcentaje()
	{
		return porcentaje;
	}

	/**
	 * Method 'setPorcentaje'
	 * 
	 * @param porcentaje
	 */
	public void setPorcentaje(String porcentaje)
	{
		this.porcentaje = porcentaje;
	}

	/**
	 * Method 'getTotalObra'
	 * 
	 * @return String
	 */
	public String getTotalObra()
	{
		return totalObra;
	}

	/**
	 * Method 'setTotalObra'
	 * 
	 * @param totalObra
	 */
	public void setTotalObra(String totalObra)
	{
		this.totalObra = totalObra;
	}

	/**
	 * Method 'getAmortizacion'
	 * 
	 * @return String
	 */
	public String getAmortizacion()
	{
		return amortizacion;
	}

	/**
	 * Method 'setAmortizacion'
	 * 
	 * @param amortizacion
	 */
	public void setAmortizacion(String amortizacion)
	{
		this.amortizacion = amortizacion;
	}

	/**
	 * Method 'getSuma'
	 * 
	 * @return String
	 */
	public String getSuma()
	{
		return suma;
	}

	/**
	 * Method 'setSuma'
	 * 
	 * @param suma
	 */
	public void setSuma(String suma)
	{
		this.suma = suma;
	}

	/**
	 * Method 'getSubtotal1'
	 * 
	 * @return String
	 */
	public String getSubtotal1()
	{
		return subtotal1;
	}

	/**
	 * Method 'setSubtotal1'
	 * 
	 * @param subtotal1
	 */
	public void setSubtotal1(String subtotal1)
	{
		this.subtotal1 = subtotal1;
	}

	/**
	 * Method 'getInspYVigi'
	 * 
	 * @return String
	 */
	public String getInspYVigi()
	{
		return inspYVigi;
	}

	/**
	 * Method 'setInspYVigi'
	 * 
	 * @param inspYVigi
	 */
	public void setInspYVigi(String inspYVigi)
	{
		this.inspYVigi = inspYVigi;
	}

	/**
	 * Method 'getCapaIcic'
	 * 
	 * @return String
	 */
	public String getCapaIcic()
	{
		return capaIcic;
	}

	/**
	 * Method 'setCapaIcic'
	 * 
	 * @param capaIcic
	 */
	public void setCapaIcic(String capaIcic)
	{
		this.capaIcic = capaIcic;
	}

	/**
	 * Method 'getFondoSeguridad'
	 * 
	 * @return String
	 */
	public String getFondoSeguridad()
	{
		return fondoSeguridad;
	}

	/**
	 * Method 'setFondoSeguridad'
	 * 
	 * @param fondoSeguridad
	 */
	public void setFondoSeguridad(String fondoSeguridad)
	{
		this.fondoSeguridad = fondoSeguridad;
	}

	/**
	 * Method 'getSubtotal2'
	 * 
	 * @return String
	 */
	public String getSubtotal2()
	{
		return subtotal2;
	}

	/**
	 * Method 'setSubtotal2'
	 * 
	 * @param subtotal2
	 */
	public void setSubtotal2(String subtotal2)
	{
		this.subtotal2 = subtotal2;
	}

	/**
	 * Method 'getAlcanceLiquido'
	 * 
	 * @return String
	 */
	public String getAlcanceLiquido()
	{
		return alcanceLiquido;
	}

	/**
	 * Method 'setAlcanceLiquido'
	 * 
	 * @param alcanceLiquido
	 */
	public void setAlcanceLiquido(String alcanceLiquido)
	{
		this.alcanceLiquido = alcanceLiquido;
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
		
		if (!(_other instanceof ComprobanteDescripcionPerflores)) {
			return false;
		}
		
		final ComprobanteDescripcionPerflores _cast = (ComprobanteDescripcionPerflores) _other;
		if (idComprobanteDescripcion != _cast.idComprobanteDescripcion) {
			return false;
		}
		
		if (idComprobanteFiscal != _cast.idComprobanteFiscal) {
			return false;
		}
		
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadNull != _cast.cantidadNull) {
			return false;
		}
		
		if (precioUnitario != _cast.precioUnitario) {
			return false;
		}
		
		if (precioUnitarioNull != _cast.precioUnitarioNull) {
			return false;
		}
		
		if (unidad == null ? _cast.unidad != unidad : !unidad.equals( _cast.unidad )) {
			return false;
		}
		
		if (porcentaje == null ? _cast.porcentaje != porcentaje : !porcentaje.equals( _cast.porcentaje )) {
			return false;
		}
		
		if (totalObra == null ? _cast.totalObra != totalObra : !totalObra.equals( _cast.totalObra )) {
			return false;
		}
		
		if (amortizacion == null ? _cast.amortizacion != amortizacion : !amortizacion.equals( _cast.amortizacion )) {
			return false;
		}
		
		if (suma == null ? _cast.suma != suma : !suma.equals( _cast.suma )) {
			return false;
		}
		
		if (subtotal1 == null ? _cast.subtotal1 != subtotal1 : !subtotal1.equals( _cast.subtotal1 )) {
			return false;
		}
		
		if (inspYVigi == null ? _cast.inspYVigi != inspYVigi : !inspYVigi.equals( _cast.inspYVigi )) {
			return false;
		}
		
		if (capaIcic == null ? _cast.capaIcic != capaIcic : !capaIcic.equals( _cast.capaIcic )) {
			return false;
		}
		
		if (fondoSeguridad == null ? _cast.fondoSeguridad != fondoSeguridad : !fondoSeguridad.equals( _cast.fondoSeguridad )) {
			return false;
		}
		
		if (subtotal2 == null ? _cast.subtotal2 != subtotal2 : !subtotal2.equals( _cast.subtotal2 )) {
			return false;
		}
		
		if (alcanceLiquido == null ? _cast.alcanceLiquido != alcanceLiquido : !alcanceLiquido.equals( _cast.alcanceLiquido )) {
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
		_hashCode = 29 * _hashCode + idComprobanteFiscal;
		_hashCode = 29 * _hashCode + idConcepto;
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(cantidad);
		_hashCode = 29 * _hashCode + (cantidadNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precioUnitario);
		_hashCode = 29 * _hashCode + (precioUnitarioNull ? 1 : 0);
		if (unidad != null) {
			_hashCode = 29 * _hashCode + unidad.hashCode();
		}
		
		if (porcentaje != null) {
			_hashCode = 29 * _hashCode + porcentaje.hashCode();
		}
		
		if (totalObra != null) {
			_hashCode = 29 * _hashCode + totalObra.hashCode();
		}
		
		if (amortizacion != null) {
			_hashCode = 29 * _hashCode + amortizacion.hashCode();
		}
		
		if (suma != null) {
			_hashCode = 29 * _hashCode + suma.hashCode();
		}
		
		if (subtotal1 != null) {
			_hashCode = 29 * _hashCode + subtotal1.hashCode();
		}
		
		if (inspYVigi != null) {
			_hashCode = 29 * _hashCode + inspYVigi.hashCode();
		}
		
		if (capaIcic != null) {
			_hashCode = 29 * _hashCode + capaIcic.hashCode();
		}
		
		if (fondoSeguridad != null) {
			_hashCode = 29 * _hashCode + fondoSeguridad.hashCode();
		}
		
		if (subtotal2 != null) {
			_hashCode = 29 * _hashCode + subtotal2.hashCode();
		}
		
		if (alcanceLiquido != null) {
			_hashCode = 29 * _hashCode + alcanceLiquido.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ComprobanteDescripcionPerfloresPk
	 */
	public ComprobanteDescripcionPerfloresPk createPk()
	{
		return new ComprobanteDescripcionPerfloresPk(idComprobanteDescripcion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ComprobanteDescripcionPerflores: " );
		ret.append( "idComprobanteDescripcion=" + idComprobanteDescripcion );
		ret.append( ", idComprobanteFiscal=" + idComprobanteFiscal );
		ret.append( ", idConcepto=" + idConcepto );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", precioUnitario=" + precioUnitario );
		ret.append( ", unidad=" + unidad );
		ret.append( ", porcentaje=" + porcentaje );
		ret.append( ", totalObra=" + totalObra );
		ret.append( ", amortizacion=" + amortizacion );
		ret.append( ", suma=" + suma );
		ret.append( ", subtotal1=" + subtotal1 );
		ret.append( ", inspYVigi=" + inspYVigi );
		ret.append( ", capaIcic=" + capaIcic );
		ret.append( ", fondoSeguridad=" + fondoSeguridad );
		ret.append( ", subtotal2=" + subtotal2 );
		ret.append( ", alcanceLiquido=" + alcanceLiquido );
		return ret.toString();
	}

}
