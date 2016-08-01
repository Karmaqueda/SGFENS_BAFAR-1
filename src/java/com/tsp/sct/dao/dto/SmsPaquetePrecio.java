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

public class SmsPaquetePrecio implements Serializable
{
	/** 
	 * This attribute maps to the column id_sms_paquete_precio in the sms_paquete_precio table.
	 */
	protected int idSmsPaquetePrecio;

	/** 
	 * This attribute represents whether the attribute idSmsPaquetePrecio has been modified since being read from the database.
	 */
	protected boolean idSmsPaquetePrecioModified = false;

	/** 
	 * This attribute maps to the column nombre_paquete in the sms_paquete_precio table.
	 */
	protected String nombrePaquete;

	/** 
	 * This attribute represents whether the attribute nombrePaquete has been modified since being read from the database.
	 */
	protected boolean nombrePaqueteModified = false;

	/** 
	 * This attribute maps to the column descripcion_paquete in the sms_paquete_precio table.
	 */
	protected String descripcionPaquete;

	/** 
	 * This attribute represents whether the attribute descripcionPaquete has been modified since being read from the database.
	 */
	protected boolean descripcionPaqueteModified = false;

	/** 
	 * This attribute maps to the column is_rango in the sms_paquete_precio table.
	 */
	protected int isRango;

	/** 
	 * This attribute represents whether the attribute isRango has been modified since being read from the database.
	 */
	protected boolean isRangoModified = false;

	/** 
	 * This attribute maps to the column rango_min in the sms_paquete_precio table.
	 */
	protected int rangoMin;

	/** 
	 * This attribute represents whether the primitive attribute rangoMin is null.
	 */
	protected boolean rangoMinNull = true;

	/** 
	 * This attribute represents whether the attribute rangoMin has been modified since being read from the database.
	 */
	protected boolean rangoMinModified = false;

	/** 
	 * This attribute maps to the column rango_max in the sms_paquete_precio table.
	 */
	protected int rangoMax;

	/** 
	 * This attribute represents whether the primitive attribute rangoMax is null.
	 */
	protected boolean rangoMaxNull = true;

	/** 
	 * This attribute represents whether the attribute rangoMax has been modified since being read from the database.
	 */
	protected boolean rangoMaxModified = false;

	/** 
	 * This attribute maps to the column rango_precio_unitario in the sms_paquete_precio table.
	 */
	protected double rangoPrecioUnitario;

	/** 
	 * This attribute represents whether the primitive attribute rangoPrecioUnitario is null.
	 */
	protected boolean rangoPrecioUnitarioNull = true;

	/** 
	 * This attribute represents whether the attribute rangoPrecioUnitario has been modified since being read from the database.
	 */
	protected boolean rangoPrecioUnitarioModified = false;

	/** 
	 * This attribute maps to the column paquete_cantidad in the sms_paquete_precio table.
	 */
	protected int paqueteCantidad;

	/** 
	 * This attribute represents whether the primitive attribute paqueteCantidad is null.
	 */
	protected boolean paqueteCantidadNull = true;

	/** 
	 * This attribute represents whether the attribute paqueteCantidad has been modified since being read from the database.
	 */
	protected boolean paqueteCantidadModified = false;

	/** 
	 * This attribute maps to the column paquete_precio_total in the sms_paquete_precio table.
	 */
	protected double paquetePrecioTotal;

	/** 
	 * This attribute represents whether the primitive attribute paquetePrecioTotal is null.
	 */
	protected boolean paquetePrecioTotalNull = true;

	/** 
	 * This attribute represents whether the attribute paquetePrecioTotal has been modified since being read from the database.
	 */
	protected boolean paquetePrecioTotalModified = false;

	/** 
	 * This attribute maps to the column id_estatus in the sms_paquete_precio table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/**
	 * Method 'SmsPaquetePrecio'
	 * 
	 */
	public SmsPaquetePrecio()
	{
	}

	/**
	 * Method 'getIdSmsPaquetePrecio'
	 * 
	 * @return int
	 */
	public int getIdSmsPaquetePrecio()
	{
		return idSmsPaquetePrecio;
	}

	/**
	 * Method 'setIdSmsPaquetePrecio'
	 * 
	 * @param idSmsPaquetePrecio
	 */
	public void setIdSmsPaquetePrecio(int idSmsPaquetePrecio)
	{
		this.idSmsPaquetePrecio = idSmsPaquetePrecio;
		this.idSmsPaquetePrecioModified = true;
	}

	/** 
	 * Sets the value of idSmsPaquetePrecioModified
	 */
	public void setIdSmsPaquetePrecioModified(boolean idSmsPaquetePrecioModified)
	{
		this.idSmsPaquetePrecioModified = idSmsPaquetePrecioModified;
	}

	/** 
	 * Gets the value of idSmsPaquetePrecioModified
	 */
	public boolean isIdSmsPaquetePrecioModified()
	{
		return idSmsPaquetePrecioModified;
	}

	/**
	 * Method 'getNombrePaquete'
	 * 
	 * @return String
	 */
	public String getNombrePaquete()
	{
		return nombrePaquete;
	}

	/**
	 * Method 'setNombrePaquete'
	 * 
	 * @param nombrePaquete
	 */
	public void setNombrePaquete(String nombrePaquete)
	{
		this.nombrePaquete = nombrePaquete;
		this.nombrePaqueteModified = true;
	}

	/** 
	 * Sets the value of nombrePaqueteModified
	 */
	public void setNombrePaqueteModified(boolean nombrePaqueteModified)
	{
		this.nombrePaqueteModified = nombrePaqueteModified;
	}

	/** 
	 * Gets the value of nombrePaqueteModified
	 */
	public boolean isNombrePaqueteModified()
	{
		return nombrePaqueteModified;
	}

	/**
	 * Method 'getDescripcionPaquete'
	 * 
	 * @return String
	 */
	public String getDescripcionPaquete()
	{
		return descripcionPaquete;
	}

	/**
	 * Method 'setDescripcionPaquete'
	 * 
	 * @param descripcionPaquete
	 */
	public void setDescripcionPaquete(String descripcionPaquete)
	{
		this.descripcionPaquete = descripcionPaquete;
		this.descripcionPaqueteModified = true;
	}

	/** 
	 * Sets the value of descripcionPaqueteModified
	 */
	public void setDescripcionPaqueteModified(boolean descripcionPaqueteModified)
	{
		this.descripcionPaqueteModified = descripcionPaqueteModified;
	}

	/** 
	 * Gets the value of descripcionPaqueteModified
	 */
	public boolean isDescripcionPaqueteModified()
	{
		return descripcionPaqueteModified;
	}

	/**
	 * Method 'getIsRango'
	 * 
	 * @return int
	 */
	public int getIsRango()
	{
		return isRango;
	}

	/**
	 * Method 'setIsRango'
	 * 
	 * @param isRango
	 */
	public void setIsRango(int isRango)
	{
		this.isRango = isRango;
		this.isRangoModified = true;
	}

	/** 
	 * Sets the value of isRangoModified
	 */
	public void setIsRangoModified(boolean isRangoModified)
	{
		this.isRangoModified = isRangoModified;
	}

	/** 
	 * Gets the value of isRangoModified
	 */
	public boolean isIsRangoModified()
	{
		return isRangoModified;
	}

	/**
	 * Method 'getRangoMin'
	 * 
	 * @return int
	 */
	public int getRangoMin()
	{
		return rangoMin;
	}

	/**
	 * Method 'setRangoMin'
	 * 
	 * @param rangoMin
	 */
	public void setRangoMin(int rangoMin)
	{
		this.rangoMin = rangoMin;
		this.rangoMinNull = false;
		this.rangoMinModified = true;
	}

	/**
	 * Method 'setRangoMinNull'
	 * 
	 * @param value
	 */
	public void setRangoMinNull(boolean value)
	{
		this.rangoMinNull = value;
		this.rangoMinModified = true;
	}

	/**
	 * Method 'isRangoMinNull'
	 * 
	 * @return boolean
	 */
	public boolean isRangoMinNull()
	{
		return rangoMinNull;
	}

	/** 
	 * Sets the value of rangoMinModified
	 */
	public void setRangoMinModified(boolean rangoMinModified)
	{
		this.rangoMinModified = rangoMinModified;
	}

	/** 
	 * Gets the value of rangoMinModified
	 */
	public boolean isRangoMinModified()
	{
		return rangoMinModified;
	}

	/**
	 * Method 'getRangoMax'
	 * 
	 * @return int
	 */
	public int getRangoMax()
	{
		return rangoMax;
	}

	/**
	 * Method 'setRangoMax'
	 * 
	 * @param rangoMax
	 */
	public void setRangoMax(int rangoMax)
	{
		this.rangoMax = rangoMax;
		this.rangoMaxNull = false;
		this.rangoMaxModified = true;
	}

	/**
	 * Method 'setRangoMaxNull'
	 * 
	 * @param value
	 */
	public void setRangoMaxNull(boolean value)
	{
		this.rangoMaxNull = value;
		this.rangoMaxModified = true;
	}

	/**
	 * Method 'isRangoMaxNull'
	 * 
	 * @return boolean
	 */
	public boolean isRangoMaxNull()
	{
		return rangoMaxNull;
	}

	/** 
	 * Sets the value of rangoMaxModified
	 */
	public void setRangoMaxModified(boolean rangoMaxModified)
	{
		this.rangoMaxModified = rangoMaxModified;
	}

	/** 
	 * Gets the value of rangoMaxModified
	 */
	public boolean isRangoMaxModified()
	{
		return rangoMaxModified;
	}

	/**
	 * Method 'getRangoPrecioUnitario'
	 * 
	 * @return double
	 */
	public double getRangoPrecioUnitario()
	{
		return rangoPrecioUnitario;
	}

	/**
	 * Method 'setRangoPrecioUnitario'
	 * 
	 * @param rangoPrecioUnitario
	 */
	public void setRangoPrecioUnitario(double rangoPrecioUnitario)
	{
		this.rangoPrecioUnitario = rangoPrecioUnitario;
		this.rangoPrecioUnitarioNull = false;
		this.rangoPrecioUnitarioModified = true;
	}

	/**
	 * Method 'setRangoPrecioUnitarioNull'
	 * 
	 * @param value
	 */
	public void setRangoPrecioUnitarioNull(boolean value)
	{
		this.rangoPrecioUnitarioNull = value;
		this.rangoPrecioUnitarioModified = true;
	}

	/**
	 * Method 'isRangoPrecioUnitarioNull'
	 * 
	 * @return boolean
	 */
	public boolean isRangoPrecioUnitarioNull()
	{
		return rangoPrecioUnitarioNull;
	}

	/** 
	 * Sets the value of rangoPrecioUnitarioModified
	 */
	public void setRangoPrecioUnitarioModified(boolean rangoPrecioUnitarioModified)
	{
		this.rangoPrecioUnitarioModified = rangoPrecioUnitarioModified;
	}

	/** 
	 * Gets the value of rangoPrecioUnitarioModified
	 */
	public boolean isRangoPrecioUnitarioModified()
	{
		return rangoPrecioUnitarioModified;
	}

	/**
	 * Method 'getPaqueteCantidad'
	 * 
	 * @return int
	 */
	public int getPaqueteCantidad()
	{
		return paqueteCantidad;
	}

	/**
	 * Method 'setPaqueteCantidad'
	 * 
	 * @param paqueteCantidad
	 */
	public void setPaqueteCantidad(int paqueteCantidad)
	{
		this.paqueteCantidad = paqueteCantidad;
		this.paqueteCantidadNull = false;
		this.paqueteCantidadModified = true;
	}

	/**
	 * Method 'setPaqueteCantidadNull'
	 * 
	 * @param value
	 */
	public void setPaqueteCantidadNull(boolean value)
	{
		this.paqueteCantidadNull = value;
		this.paqueteCantidadModified = true;
	}

	/**
	 * Method 'isPaqueteCantidadNull'
	 * 
	 * @return boolean
	 */
	public boolean isPaqueteCantidadNull()
	{
		return paqueteCantidadNull;
	}

	/** 
	 * Sets the value of paqueteCantidadModified
	 */
	public void setPaqueteCantidadModified(boolean paqueteCantidadModified)
	{
		this.paqueteCantidadModified = paqueteCantidadModified;
	}

	/** 
	 * Gets the value of paqueteCantidadModified
	 */
	public boolean isPaqueteCantidadModified()
	{
		return paqueteCantidadModified;
	}

	/**
	 * Method 'getPaquetePrecioTotal'
	 * 
	 * @return double
	 */
	public double getPaquetePrecioTotal()
	{
		return paquetePrecioTotal;
	}

	/**
	 * Method 'setPaquetePrecioTotal'
	 * 
	 * @param paquetePrecioTotal
	 */
	public void setPaquetePrecioTotal(double paquetePrecioTotal)
	{
		this.paquetePrecioTotal = paquetePrecioTotal;
		this.paquetePrecioTotalNull = false;
		this.paquetePrecioTotalModified = true;
	}

	/**
	 * Method 'setPaquetePrecioTotalNull'
	 * 
	 * @param value
	 */
	public void setPaquetePrecioTotalNull(boolean value)
	{
		this.paquetePrecioTotalNull = value;
		this.paquetePrecioTotalModified = true;
	}

	/**
	 * Method 'isPaquetePrecioTotalNull'
	 * 
	 * @return boolean
	 */
	public boolean isPaquetePrecioTotalNull()
	{
		return paquetePrecioTotalNull;
	}

	/** 
	 * Sets the value of paquetePrecioTotalModified
	 */
	public void setPaquetePrecioTotalModified(boolean paquetePrecioTotalModified)
	{
		this.paquetePrecioTotalModified = paquetePrecioTotalModified;
	}

	/** 
	 * Gets the value of paquetePrecioTotalModified
	 */
	public boolean isPaquetePrecioTotalModified()
	{
		return paquetePrecioTotalModified;
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
		
		if (!(_other instanceof SmsPaquetePrecio)) {
			return false;
		}
		
		final SmsPaquetePrecio _cast = (SmsPaquetePrecio) _other;
		if (idSmsPaquetePrecio != _cast.idSmsPaquetePrecio) {
			return false;
		}
		
		if (idSmsPaquetePrecioModified != _cast.idSmsPaquetePrecioModified) {
			return false;
		}
		
		if (nombrePaquete == null ? _cast.nombrePaquete != nombrePaquete : !nombrePaquete.equals( _cast.nombrePaquete )) {
			return false;
		}
		
		if (nombrePaqueteModified != _cast.nombrePaqueteModified) {
			return false;
		}
		
		if (descripcionPaquete == null ? _cast.descripcionPaquete != descripcionPaquete : !descripcionPaquete.equals( _cast.descripcionPaquete )) {
			return false;
		}
		
		if (descripcionPaqueteModified != _cast.descripcionPaqueteModified) {
			return false;
		}
		
		if (isRango != _cast.isRango) {
			return false;
		}
		
		if (isRangoModified != _cast.isRangoModified) {
			return false;
		}
		
		if (rangoMin != _cast.rangoMin) {
			return false;
		}
		
		if (rangoMinNull != _cast.rangoMinNull) {
			return false;
		}
		
		if (rangoMinModified != _cast.rangoMinModified) {
			return false;
		}
		
		if (rangoMax != _cast.rangoMax) {
			return false;
		}
		
		if (rangoMaxNull != _cast.rangoMaxNull) {
			return false;
		}
		
		if (rangoMaxModified != _cast.rangoMaxModified) {
			return false;
		}
		
		if (rangoPrecioUnitario != _cast.rangoPrecioUnitario) {
			return false;
		}
		
		if (rangoPrecioUnitarioNull != _cast.rangoPrecioUnitarioNull) {
			return false;
		}
		
		if (rangoPrecioUnitarioModified != _cast.rangoPrecioUnitarioModified) {
			return false;
		}
		
		if (paqueteCantidad != _cast.paqueteCantidad) {
			return false;
		}
		
		if (paqueteCantidadNull != _cast.paqueteCantidadNull) {
			return false;
		}
		
		if (paqueteCantidadModified != _cast.paqueteCantidadModified) {
			return false;
		}
		
		if (paquetePrecioTotal != _cast.paquetePrecioTotal) {
			return false;
		}
		
		if (paquetePrecioTotalNull != _cast.paquetePrecioTotalNull) {
			return false;
		}
		
		if (paquetePrecioTotalModified != _cast.paquetePrecioTotalModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
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
		_hashCode = 29 * _hashCode + idSmsPaquetePrecio;
		_hashCode = 29 * _hashCode + (idSmsPaquetePrecioModified ? 1 : 0);
		if (nombrePaquete != null) {
			_hashCode = 29 * _hashCode + nombrePaquete.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombrePaqueteModified ? 1 : 0);
		if (descripcionPaquete != null) {
			_hashCode = 29 * _hashCode + descripcionPaquete.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionPaqueteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + isRango;
		_hashCode = 29 * _hashCode + (isRangoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + rangoMin;
		_hashCode = 29 * _hashCode + (rangoMinNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (rangoMinModified ? 1 : 0);
		_hashCode = 29 * _hashCode + rangoMax;
		_hashCode = 29 * _hashCode + (rangoMaxNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (rangoMaxModified ? 1 : 0);
		long temp_rangoPrecioUnitario = Double.doubleToLongBits(rangoPrecioUnitario);
		_hashCode = 29 * _hashCode + (int) (temp_rangoPrecioUnitario ^ (temp_rangoPrecioUnitario >>> 32));
		_hashCode = 29 * _hashCode + (rangoPrecioUnitarioNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (rangoPrecioUnitarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + paqueteCantidad;
		_hashCode = 29 * _hashCode + (paqueteCantidadNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (paqueteCantidadModified ? 1 : 0);
		long temp_paquetePrecioTotal = Double.doubleToLongBits(paquetePrecioTotal);
		_hashCode = 29 * _hashCode + (int) (temp_paquetePrecioTotal ^ (temp_paquetePrecioTotal >>> 32));
		_hashCode = 29 * _hashCode + (paquetePrecioTotalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (paquetePrecioTotalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SmsPaquetePrecioPk
	 */
	public SmsPaquetePrecioPk createPk()
	{
		return new SmsPaquetePrecioPk(idSmsPaquetePrecio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SmsPaquetePrecio: " );
		ret.append( "idSmsPaquetePrecio=" + idSmsPaquetePrecio );
		ret.append( ", nombrePaquete=" + nombrePaquete );
		ret.append( ", descripcionPaquete=" + descripcionPaquete );
		ret.append( ", isRango=" + isRango );
		ret.append( ", rangoMin=" + rangoMin );
		ret.append( ", rangoMax=" + rangoMax );
		ret.append( ", rangoPrecioUnitario=" + rangoPrecioUnitario );
		ret.append( ", paqueteCantidad=" + paqueteCantidad );
		ret.append( ", paquetePrecioTotal=" + paquetePrecioTotal );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}