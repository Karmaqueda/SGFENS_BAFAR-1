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

public class SmsCompraBitacora implements Serializable
{
	/** 
	 * This attribute maps to the column id_sms_compra_bitacora in the sms_compra_bitacora table.
	 */
	protected int idSmsCompraBitacora;

	/** 
	 * This attribute represents whether the attribute idSmsCompraBitacora has been modified since being read from the database.
	 */
	protected boolean idSmsCompraBitacoraModified = false;

	/** 
	 * This attribute maps to the column is_auto_servicio in the sms_compra_bitacora table.
	 */
	protected int isAutoServicio;

	/** 
	 * This attribute represents whether the attribute isAutoServicio has been modified since being read from the database.
	 */
	protected boolean isAutoServicioModified = false;

	/** 
	 * This attribute maps to the column id_empresa in the sms_compra_bitacora table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column fecha_hr in the sms_compra_bitacora table.
	 */
	protected Date fechaHr;

	/** 
	 * This attribute represents whether the attribute fechaHr has been modified since being read from the database.
	 */
	protected boolean fechaHrModified = false;

	/** 
	 * This attribute maps to the column id_sms_paquete_precio in the sms_compra_bitacora table.
	 */
	protected int idSmsPaquetePrecio;

	/** 
	 * This attribute represents whether the primitive attribute idSmsPaquetePrecio is null.
	 */
	protected boolean idSmsPaquetePrecioNull = true;

	/** 
	 * This attribute represents whether the attribute idSmsPaquetePrecio has been modified since being read from the database.
	 */
	protected boolean idSmsPaquetePrecioModified = false;

	/** 
	 * This attribute maps to the column cantidad_agregada in the sms_compra_bitacora table.
	 */
	protected int cantidadAgregada;

	/** 
	 * This attribute represents whether the primitive attribute cantidadAgregada is null.
	 */
	protected boolean cantidadAgregadaNull = true;

	/** 
	 * This attribute represents whether the attribute cantidadAgregada has been modified since being read from the database.
	 */
	protected boolean cantidadAgregadaModified = false;

	/** 
	 * This attribute maps to the column cantidad_restada in the sms_compra_bitacora table.
	 */
	protected int cantidadRestada;

	/** 
	 * This attribute represents whether the primitive attribute cantidadRestada is null.
	 */
	protected boolean cantidadRestadaNull = true;

	/** 
	 * This attribute represents whether the attribute cantidadRestada has been modified since being read from the database.
	 */
	protected boolean cantidadRestadaModified = false;

	/** 
	 * This attribute maps to the column observaciones in the sms_compra_bitacora table.
	 */
	protected String observaciones;

	/** 
	 * This attribute represents whether the attribute observaciones has been modified since being read from the database.
	 */
	protected boolean observacionesModified = false;

	/** 
	 * This attribute maps to the column id_usuario_preto in the sms_compra_bitacora table.
	 */
	protected int idUsuarioPreto;

	/** 
	 * This attribute represents whether the primitive attribute idUsuarioPreto is null.
	 */
	protected boolean idUsuarioPretoNull = true;

	/** 
	 * This attribute represents whether the attribute idUsuarioPreto has been modified since being read from the database.
	 */
	protected boolean idUsuarioPretoModified = false;

	/** 
	 * This attribute maps to the column id_usuario_ventas in the sms_compra_bitacora table.
	 */
	protected int idUsuarioVentas;

	/** 
	 * This attribute represents whether the primitive attribute idUsuarioVentas is null.
	 */
	protected boolean idUsuarioVentasNull = true;

	/** 
	 * This attribute represents whether the attribute idUsuarioVentas has been modified since being read from the database.
	 */
	protected boolean idUsuarioVentasModified = false;

	/** 
	 * This attribute maps to the column dato_pago_1 in the sms_compra_bitacora table.
	 */
	protected String datoPago1;

	/** 
	 * This attribute represents whether the attribute datoPago1 has been modified since being read from the database.
	 */
	protected boolean datoPago1Modified = false;

	/** 
	 * This attribute maps to the column dato_pago_2 in the sms_compra_bitacora table.
	 */
	protected String datoPago2;

	/** 
	 * This attribute represents whether the attribute datoPago2 has been modified since being read from the database.
	 */
	protected boolean datoPago2Modified = false;

	/** 
	 * This attribute maps to the column dato_pago_3 in the sms_compra_bitacora table.
	 */
	protected String datoPago3;

	/** 
	 * This attribute represents whether the attribute datoPago3 has been modified since being read from the database.
	 */
	protected boolean datoPago3Modified = false;

	/** 
	 * This attribute maps to the column dato_pago_4 in the sms_compra_bitacora table.
	 */
	protected String datoPago4;

	/** 
	 * This attribute represents whether the attribute datoPago4 has been modified since being read from the database.
	 */
	protected boolean datoPago4Modified = false;

	/** 
	 * This attribute maps to the column id_banco_operacion in the sms_compra_bitacora table.
	 */
	protected int idBancoOperacion;

	/** 
	 * This attribute represents whether the primitive attribute idBancoOperacion is null.
	 */
	protected boolean idBancoOperacionNull = true;

	/** 
	 * This attribute represents whether the attribute idBancoOperacion has been modified since being read from the database.
	 */
	protected boolean idBancoOperacionModified = false;

	/**
	 * Method 'SmsCompraBitacora'
	 * 
	 */
	public SmsCompraBitacora()
	{
	}

	/**
	 * Method 'getIdSmsCompraBitacora'
	 * 
	 * @return int
	 */
	public int getIdSmsCompraBitacora()
	{
		return idSmsCompraBitacora;
	}

	/**
	 * Method 'setIdSmsCompraBitacora'
	 * 
	 * @param idSmsCompraBitacora
	 */
	public void setIdSmsCompraBitacora(int idSmsCompraBitacora)
	{
		this.idSmsCompraBitacora = idSmsCompraBitacora;
		this.idSmsCompraBitacoraModified = true;
	}

	/** 
	 * Sets the value of idSmsCompraBitacoraModified
	 */
	public void setIdSmsCompraBitacoraModified(boolean idSmsCompraBitacoraModified)
	{
		this.idSmsCompraBitacoraModified = idSmsCompraBitacoraModified;
	}

	/** 
	 * Gets the value of idSmsCompraBitacoraModified
	 */
	public boolean isIdSmsCompraBitacoraModified()
	{
		return idSmsCompraBitacoraModified;
	}

	/**
	 * Method 'getIsAutoServicio'
	 * 
	 * @return int
	 */
	public int getIsAutoServicio()
	{
		return isAutoServicio;
	}

	/**
	 * Method 'setIsAutoServicio'
	 * 
	 * @param isAutoServicio
	 */
	public void setIsAutoServicio(int isAutoServicio)
	{
		this.isAutoServicio = isAutoServicio;
		this.isAutoServicioModified = true;
	}

	/** 
	 * Sets the value of isAutoServicioModified
	 */
	public void setIsAutoServicioModified(boolean isAutoServicioModified)
	{
		this.isAutoServicioModified = isAutoServicioModified;
	}

	/** 
	 * Gets the value of isAutoServicioModified
	 */
	public boolean isIsAutoServicioModified()
	{
		return isAutoServicioModified;
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
	 * Method 'getFechaHr'
	 * 
	 * @return Date
	 */
	public Date getFechaHr()
	{
		return fechaHr;
	}

	/**
	 * Method 'setFechaHr'
	 * 
	 * @param fechaHr
	 */
	public void setFechaHr(Date fechaHr)
	{
		this.fechaHr = fechaHr;
		this.fechaHrModified = true;
	}

	/** 
	 * Sets the value of fechaHrModified
	 */
	public void setFechaHrModified(boolean fechaHrModified)
	{
		this.fechaHrModified = fechaHrModified;
	}

	/** 
	 * Gets the value of fechaHrModified
	 */
	public boolean isFechaHrModified()
	{
		return fechaHrModified;
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
		this.idSmsPaquetePrecioNull = false;
		this.idSmsPaquetePrecioModified = true;
	}

	/**
	 * Method 'setIdSmsPaquetePrecioNull'
	 * 
	 * @param value
	 */
	public void setIdSmsPaquetePrecioNull(boolean value)
	{
		this.idSmsPaquetePrecioNull = value;
		this.idSmsPaquetePrecioModified = true;
	}

	/**
	 * Method 'isIdSmsPaquetePrecioNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdSmsPaquetePrecioNull()
	{
		return idSmsPaquetePrecioNull;
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
	 * Method 'getCantidadAgregada'
	 * 
	 * @return int
	 */
	public int getCantidadAgregada()
	{
		return cantidadAgregada;
	}

	/**
	 * Method 'setCantidadAgregada'
	 * 
	 * @param cantidadAgregada
	 */
	public void setCantidadAgregada(int cantidadAgregada)
	{
		this.cantidadAgregada = cantidadAgregada;
		this.cantidadAgregadaNull = false;
		this.cantidadAgregadaModified = true;
	}

	/**
	 * Method 'setCantidadAgregadaNull'
	 * 
	 * @param value
	 */
	public void setCantidadAgregadaNull(boolean value)
	{
		this.cantidadAgregadaNull = value;
		this.cantidadAgregadaModified = true;
	}

	/**
	 * Method 'isCantidadAgregadaNull'
	 * 
	 * @return boolean
	 */
	public boolean isCantidadAgregadaNull()
	{
		return cantidadAgregadaNull;
	}

	/** 
	 * Sets the value of cantidadAgregadaModified
	 */
	public void setCantidadAgregadaModified(boolean cantidadAgregadaModified)
	{
		this.cantidadAgregadaModified = cantidadAgregadaModified;
	}

	/** 
	 * Gets the value of cantidadAgregadaModified
	 */
	public boolean isCantidadAgregadaModified()
	{
		return cantidadAgregadaModified;
	}

	/**
	 * Method 'getCantidadRestada'
	 * 
	 * @return int
	 */
	public int getCantidadRestada()
	{
		return cantidadRestada;
	}

	/**
	 * Method 'setCantidadRestada'
	 * 
	 * @param cantidadRestada
	 */
	public void setCantidadRestada(int cantidadRestada)
	{
		this.cantidadRestada = cantidadRestada;
		this.cantidadRestadaNull = false;
		this.cantidadRestadaModified = true;
	}

	/**
	 * Method 'setCantidadRestadaNull'
	 * 
	 * @param value
	 */
	public void setCantidadRestadaNull(boolean value)
	{
		this.cantidadRestadaNull = value;
		this.cantidadRestadaModified = true;
	}

	/**
	 * Method 'isCantidadRestadaNull'
	 * 
	 * @return boolean
	 */
	public boolean isCantidadRestadaNull()
	{
		return cantidadRestadaNull;
	}

	/** 
	 * Sets the value of cantidadRestadaModified
	 */
	public void setCantidadRestadaModified(boolean cantidadRestadaModified)
	{
		this.cantidadRestadaModified = cantidadRestadaModified;
	}

	/** 
	 * Gets the value of cantidadRestadaModified
	 */
	public boolean isCantidadRestadaModified()
	{
		return cantidadRestadaModified;
	}

	/**
	 * Method 'getObservaciones'
	 * 
	 * @return String
	 */
	public String getObservaciones()
	{
		return observaciones;
	}

	/**
	 * Method 'setObservaciones'
	 * 
	 * @param observaciones
	 */
	public void setObservaciones(String observaciones)
	{
		this.observaciones = observaciones;
		this.observacionesModified = true;
	}

	/** 
	 * Sets the value of observacionesModified
	 */
	public void setObservacionesModified(boolean observacionesModified)
	{
		this.observacionesModified = observacionesModified;
	}

	/** 
	 * Gets the value of observacionesModified
	 */
	public boolean isObservacionesModified()
	{
		return observacionesModified;
	}

	/**
	 * Method 'getIdUsuarioPreto'
	 * 
	 * @return int
	 */
	public int getIdUsuarioPreto()
	{
		return idUsuarioPreto;
	}

	/**
	 * Method 'setIdUsuarioPreto'
	 * 
	 * @param idUsuarioPreto
	 */
	public void setIdUsuarioPreto(int idUsuarioPreto)
	{
		this.idUsuarioPreto = idUsuarioPreto;
		this.idUsuarioPretoNull = false;
		this.idUsuarioPretoModified = true;
	}

	/**
	 * Method 'setIdUsuarioPretoNull'
	 * 
	 * @param value
	 */
	public void setIdUsuarioPretoNull(boolean value)
	{
		this.idUsuarioPretoNull = value;
		this.idUsuarioPretoModified = true;
	}

	/**
	 * Method 'isIdUsuarioPretoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdUsuarioPretoNull()
	{
		return idUsuarioPretoNull;
	}

	/** 
	 * Sets the value of idUsuarioPretoModified
	 */
	public void setIdUsuarioPretoModified(boolean idUsuarioPretoModified)
	{
		this.idUsuarioPretoModified = idUsuarioPretoModified;
	}

	/** 
	 * Gets the value of idUsuarioPretoModified
	 */
	public boolean isIdUsuarioPretoModified()
	{
		return idUsuarioPretoModified;
	}

	/**
	 * Method 'getIdUsuarioVentas'
	 * 
	 * @return int
	 */
	public int getIdUsuarioVentas()
	{
		return idUsuarioVentas;
	}

	/**
	 * Method 'setIdUsuarioVentas'
	 * 
	 * @param idUsuarioVentas
	 */
	public void setIdUsuarioVentas(int idUsuarioVentas)
	{
		this.idUsuarioVentas = idUsuarioVentas;
		this.idUsuarioVentasNull = false;
		this.idUsuarioVentasModified = true;
	}

	/**
	 * Method 'setIdUsuarioVentasNull'
	 * 
	 * @param value
	 */
	public void setIdUsuarioVentasNull(boolean value)
	{
		this.idUsuarioVentasNull = value;
		this.idUsuarioVentasModified = true;
	}

	/**
	 * Method 'isIdUsuarioVentasNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdUsuarioVentasNull()
	{
		return idUsuarioVentasNull;
	}

	/** 
	 * Sets the value of idUsuarioVentasModified
	 */
	public void setIdUsuarioVentasModified(boolean idUsuarioVentasModified)
	{
		this.idUsuarioVentasModified = idUsuarioVentasModified;
	}

	/** 
	 * Gets the value of idUsuarioVentasModified
	 */
	public boolean isIdUsuarioVentasModified()
	{
		return idUsuarioVentasModified;
	}

	/**
	 * Method 'getDatoPago1'
	 * 
	 * @return String
	 */
	public String getDatoPago1()
	{
		return datoPago1;
	}

	/**
	 * Method 'setDatoPago1'
	 * 
	 * @param datoPago1
	 */
	public void setDatoPago1(String datoPago1)
	{
		this.datoPago1 = datoPago1;
		this.datoPago1Modified = true;
	}

	/** 
	 * Sets the value of datoPago1Modified
	 */
	public void setDatoPago1Modified(boolean datoPago1Modified)
	{
		this.datoPago1Modified = datoPago1Modified;
	}

	/** 
	 * Gets the value of datoPago1Modified
	 */
	public boolean isDatoPago1Modified()
	{
		return datoPago1Modified;
	}

	/**
	 * Method 'getDatoPago2'
	 * 
	 * @return String
	 */
	public String getDatoPago2()
	{
		return datoPago2;
	}

	/**
	 * Method 'setDatoPago2'
	 * 
	 * @param datoPago2
	 */
	public void setDatoPago2(String datoPago2)
	{
		this.datoPago2 = datoPago2;
		this.datoPago2Modified = true;
	}

	/** 
	 * Sets the value of datoPago2Modified
	 */
	public void setDatoPago2Modified(boolean datoPago2Modified)
	{
		this.datoPago2Modified = datoPago2Modified;
	}

	/** 
	 * Gets the value of datoPago2Modified
	 */
	public boolean isDatoPago2Modified()
	{
		return datoPago2Modified;
	}

	/**
	 * Method 'getDatoPago3'
	 * 
	 * @return String
	 */
	public String getDatoPago3()
	{
		return datoPago3;
	}

	/**
	 * Method 'setDatoPago3'
	 * 
	 * @param datoPago3
	 */
	public void setDatoPago3(String datoPago3)
	{
		this.datoPago3 = datoPago3;
		this.datoPago3Modified = true;
	}

	/** 
	 * Sets the value of datoPago3Modified
	 */
	public void setDatoPago3Modified(boolean datoPago3Modified)
	{
		this.datoPago3Modified = datoPago3Modified;
	}

	/** 
	 * Gets the value of datoPago3Modified
	 */
	public boolean isDatoPago3Modified()
	{
		return datoPago3Modified;
	}

	/**
	 * Method 'getDatoPago4'
	 * 
	 * @return String
	 */
	public String getDatoPago4()
	{
		return datoPago4;
	}

	/**
	 * Method 'setDatoPago4'
	 * 
	 * @param datoPago4
	 */
	public void setDatoPago4(String datoPago4)
	{
		this.datoPago4 = datoPago4;
		this.datoPago4Modified = true;
	}

	/** 
	 * Sets the value of datoPago4Modified
	 */
	public void setDatoPago4Modified(boolean datoPago4Modified)
	{
		this.datoPago4Modified = datoPago4Modified;
	}

	/** 
	 * Gets the value of datoPago4Modified
	 */
	public boolean isDatoPago4Modified()
	{
		return datoPago4Modified;
	}

	/**
	 * Method 'getIdBancoOperacion'
	 * 
	 * @return int
	 */
	public int getIdBancoOperacion()
	{
		return idBancoOperacion;
	}

	/**
	 * Method 'setIdBancoOperacion'
	 * 
	 * @param idBancoOperacion
	 */
	public void setIdBancoOperacion(int idBancoOperacion)
	{
		this.idBancoOperacion = idBancoOperacion;
		this.idBancoOperacionNull = false;
		this.idBancoOperacionModified = true;
	}

	/**
	 * Method 'setIdBancoOperacionNull'
	 * 
	 * @param value
	 */
	public void setIdBancoOperacionNull(boolean value)
	{
		this.idBancoOperacionNull = value;
		this.idBancoOperacionModified = true;
	}

	/**
	 * Method 'isIdBancoOperacionNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdBancoOperacionNull()
	{
		return idBancoOperacionNull;
	}

	/** 
	 * Sets the value of idBancoOperacionModified
	 */
	public void setIdBancoOperacionModified(boolean idBancoOperacionModified)
	{
		this.idBancoOperacionModified = idBancoOperacionModified;
	}

	/** 
	 * Gets the value of idBancoOperacionModified
	 */
	public boolean isIdBancoOperacionModified()
	{
		return idBancoOperacionModified;
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
		
		if (!(_other instanceof SmsCompraBitacora)) {
			return false;
		}
		
		final SmsCompraBitacora _cast = (SmsCompraBitacora) _other;
		if (idSmsCompraBitacora != _cast.idSmsCompraBitacora) {
			return false;
		}
		
		if (idSmsCompraBitacoraModified != _cast.idSmsCompraBitacoraModified) {
			return false;
		}
		
		if (isAutoServicio != _cast.isAutoServicio) {
			return false;
		}
		
		if (isAutoServicioModified != _cast.isAutoServicioModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (fechaHr == null ? _cast.fechaHr != fechaHr : !fechaHr.equals( _cast.fechaHr )) {
			return false;
		}
		
		if (fechaHrModified != _cast.fechaHrModified) {
			return false;
		}
		
		if (idSmsPaquetePrecio != _cast.idSmsPaquetePrecio) {
			return false;
		}
		
		if (idSmsPaquetePrecioNull != _cast.idSmsPaquetePrecioNull) {
			return false;
		}
		
		if (idSmsPaquetePrecioModified != _cast.idSmsPaquetePrecioModified) {
			return false;
		}
		
		if (cantidadAgregada != _cast.cantidadAgregada) {
			return false;
		}
		
		if (cantidadAgregadaNull != _cast.cantidadAgregadaNull) {
			return false;
		}
		
		if (cantidadAgregadaModified != _cast.cantidadAgregadaModified) {
			return false;
		}
		
		if (cantidadRestada != _cast.cantidadRestada) {
			return false;
		}
		
		if (cantidadRestadaNull != _cast.cantidadRestadaNull) {
			return false;
		}
		
		if (cantidadRestadaModified != _cast.cantidadRestadaModified) {
			return false;
		}
		
		if (observaciones == null ? _cast.observaciones != observaciones : !observaciones.equals( _cast.observaciones )) {
			return false;
		}
		
		if (observacionesModified != _cast.observacionesModified) {
			return false;
		}
		
		if (idUsuarioPreto != _cast.idUsuarioPreto) {
			return false;
		}
		
		if (idUsuarioPretoNull != _cast.idUsuarioPretoNull) {
			return false;
		}
		
		if (idUsuarioPretoModified != _cast.idUsuarioPretoModified) {
			return false;
		}
		
		if (idUsuarioVentas != _cast.idUsuarioVentas) {
			return false;
		}
		
		if (idUsuarioVentasNull != _cast.idUsuarioVentasNull) {
			return false;
		}
		
		if (idUsuarioVentasModified != _cast.idUsuarioVentasModified) {
			return false;
		}
		
		if (datoPago1 == null ? _cast.datoPago1 != datoPago1 : !datoPago1.equals( _cast.datoPago1 )) {
			return false;
		}
		
		if (datoPago1Modified != _cast.datoPago1Modified) {
			return false;
		}
		
		if (datoPago2 == null ? _cast.datoPago2 != datoPago2 : !datoPago2.equals( _cast.datoPago2 )) {
			return false;
		}
		
		if (datoPago2Modified != _cast.datoPago2Modified) {
			return false;
		}
		
		if (datoPago3 == null ? _cast.datoPago3 != datoPago3 : !datoPago3.equals( _cast.datoPago3 )) {
			return false;
		}
		
		if (datoPago3Modified != _cast.datoPago3Modified) {
			return false;
		}
		
		if (datoPago4 == null ? _cast.datoPago4 != datoPago4 : !datoPago4.equals( _cast.datoPago4 )) {
			return false;
		}
		
		if (datoPago4Modified != _cast.datoPago4Modified) {
			return false;
		}
		
		if (idBancoOperacion != _cast.idBancoOperacion) {
			return false;
		}
		
		if (idBancoOperacionNull != _cast.idBancoOperacionNull) {
			return false;
		}
		
		if (idBancoOperacionModified != _cast.idBancoOperacionModified) {
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
		_hashCode = 29 * _hashCode + idSmsCompraBitacora;
		_hashCode = 29 * _hashCode + (idSmsCompraBitacoraModified ? 1 : 0);
		_hashCode = 29 * _hashCode + isAutoServicio;
		_hashCode = 29 * _hashCode + (isAutoServicioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (fechaHr != null) {
			_hashCode = 29 * _hashCode + fechaHr.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaHrModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idSmsPaquetePrecio;
		_hashCode = 29 * _hashCode + (idSmsPaquetePrecioNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idSmsPaquetePrecioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + cantidadAgregada;
		_hashCode = 29 * _hashCode + (cantidadAgregadaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (cantidadAgregadaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + cantidadRestada;
		_hashCode = 29 * _hashCode + (cantidadRestadaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (cantidadRestadaModified ? 1 : 0);
		if (observaciones != null) {
			_hashCode = 29 * _hashCode + observaciones.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (observacionesModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioPreto;
		_hashCode = 29 * _hashCode + (idUsuarioPretoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idUsuarioPretoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idUsuarioVentas;
		_hashCode = 29 * _hashCode + (idUsuarioVentasNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idUsuarioVentasModified ? 1 : 0);
		if (datoPago1 != null) {
			_hashCode = 29 * _hashCode + datoPago1.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (datoPago1Modified ? 1 : 0);
		if (datoPago2 != null) {
			_hashCode = 29 * _hashCode + datoPago2.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (datoPago2Modified ? 1 : 0);
		if (datoPago3 != null) {
			_hashCode = 29 * _hashCode + datoPago3.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (datoPago3Modified ? 1 : 0);
		if (datoPago4 != null) {
			_hashCode = 29 * _hashCode + datoPago4.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (datoPago4Modified ? 1 : 0);
		_hashCode = 29 * _hashCode + idBancoOperacion;
		_hashCode = 29 * _hashCode + (idBancoOperacionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idBancoOperacionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SmsCompraBitacoraPk
	 */
	public SmsCompraBitacoraPk createPk()
	{
		return new SmsCompraBitacoraPk(idSmsCompraBitacora);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SmsCompraBitacora: " );
		ret.append( "idSmsCompraBitacora=" + idSmsCompraBitacora );
		ret.append( ", isAutoServicio=" + isAutoServicio );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", fechaHr=" + fechaHr );
		ret.append( ", idSmsPaquetePrecio=" + idSmsPaquetePrecio );
		ret.append( ", cantidadAgregada=" + cantidadAgregada );
		ret.append( ", cantidadRestada=" + cantidadRestada );
		ret.append( ", observaciones=" + observaciones );
		ret.append( ", idUsuarioPreto=" + idUsuarioPreto );
		ret.append( ", idUsuarioVentas=" + idUsuarioVentas );
		ret.append( ", datoPago1=" + datoPago1 );
		ret.append( ", datoPago2=" + datoPago2 );
		ret.append( ", datoPago3=" + datoPago3 );
		ret.append( ", datoPago4=" + datoPago4 );
		ret.append( ", idBancoOperacion=" + idBancoOperacion );
		return ret.toString();
	}

}