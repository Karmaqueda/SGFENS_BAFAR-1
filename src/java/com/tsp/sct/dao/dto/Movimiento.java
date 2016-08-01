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

public class Movimiento implements Serializable
{
	/** 
	 * This attribute maps to the column ID_MOVIMIENTO in the movimiento table.
	 */
	protected int idMovimiento;

	/** 
	 * This attribute represents whether the attribute idMovimiento has been modified since being read from the database.
	 */
	protected boolean idMovimientoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the movimiento table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column TIPO_MOVIMIENTO in the movimiento table.
	 */
	protected String tipoMovimiento;

	/** 
	 * This attribute represents whether the attribute tipoMovimiento has been modified since being read from the database.
	 */
	protected boolean tipoMovimientoModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_PRODUCTO in the movimiento table.
	 */
	protected String nombreProducto;

	/** 
	 * This attribute represents whether the attribute nombreProducto has been modified since being read from the database.
	 */
	protected boolean nombreProductoModified = false;

	/** 
	 * This attribute maps to the column contabilidad in the movimiento table.
	 */
	protected double contabilidad;

	/** 
	 * This attribute represents whether the primitive attribute contabilidad is null.
	 */
	protected boolean contabilidadNull = true;

	/** 
	 * This attribute represents whether the attribute contabilidad has been modified since being read from the database.
	 */
	protected boolean contabilidadModified = false;

	/** 
	 * This attribute maps to the column FECHA_REGISTRO in the movimiento table.
	 */
	protected Date fechaRegistro;

	/** 
	 * This attribute represents whether the attribute fechaRegistro has been modified since being read from the database.
	 */
	protected boolean fechaRegistroModified = false;

	/** 
	 * This attribute maps to the column ID_PROVEEDOR in the movimiento table.
	 */
	protected int idProveedor;

	/** 
	 * This attribute represents whether the primitive attribute idProveedor is null.
	 */
	protected boolean idProveedorNull = true;

	/** 
	 * This attribute represents whether the attribute idProveedor has been modified since being read from the database.
	 */
	protected boolean idProveedorModified = false;

	/** 
	 * This attribute maps to the column ORDEN_COMPRA in the movimiento table.
	 */
	protected String ordenCompra;

	/** 
	 * This attribute represents whether the attribute ordenCompra has been modified since being read from the database.
	 */
	protected boolean ordenCompraModified = false;

	/** 
	 * This attribute maps to the column NUMERO_GUIA in the movimiento table.
	 */
	protected String numeroGuia;

	/** 
	 * This attribute represents whether the attribute numeroGuia has been modified since being read from the database.
	 */
	protected boolean numeroGuiaModified = false;

	/** 
	 * This attribute maps to the column ID_ALMACEN in the movimiento table.
	 */
	protected int idAlmacen;

	/** 
	 * This attribute represents whether the primitive attribute idAlmacen is null.
	 */
	protected boolean idAlmacenNull = true;

	/** 
	 * This attribute represents whether the attribute idAlmacen has been modified since being read from the database.
	 */
	protected boolean idAlmacenModified = false;

	/** 
	 * This attribute maps to the column CONCEPTO_MOVIMIENTO in the movimiento table.
	 */
	protected String conceptoMovimiento;

	/** 
	 * This attribute represents whether the attribute conceptoMovimiento has been modified since being read from the database.
	 */
	protected boolean conceptoMovimientoModified = false;

	/** 
	 * This attribute maps to the column ID_CONCEPTO in the movimiento table.
	 */
	protected int idConcepto;

	/** 
	 * This attribute represents whether the primitive attribute idConcepto is null.
	 */
	protected boolean idConceptoNull = true;

	/** 
	 * This attribute represents whether the attribute idConcepto has been modified since being read from the database.
	 */
	protected boolean idConceptoModified = false;

	/** 
	 * This attribute maps to the column ID_ALMACEN_DESTINO in the movimiento table.
	 */
	protected int idAlmacenDestino;

	/** 
	 * This attribute represents whether the primitive attribute idAlmacenDestino is null.
	 */
	protected boolean idAlmacenDestinoNull = true;

	/** 
	 * This attribute represents whether the attribute idAlmacenDestino has been modified since being read from the database.
	 */
	protected boolean idAlmacenDestinoModified = false;

	/** 
	 * This attribute maps to the column SINCRONIZACION_MICROSIP in the movimiento table.
	 */
	protected int sincronizacionMicrosip;

	/** 
	 * This attribute represents whether the primitive attribute sincronizacionMicrosip is null.
	 */
	protected boolean sincronizacionMicrosipNull = true;

	/** 
	 * This attribute represents whether the attribute sincronizacionMicrosip has been modified since being read from the database.
	 */
	protected boolean sincronizacionMicrosipModified = false;

	/** 
	 * This attribute maps to the column idEmpleado in the movimiento table.
	 */
	protected int idEmpleado;

	/** 
	 * This attribute represents whether the primitive attribute idEmpleado is null.
	 */
	protected boolean idEmpleadoNull = true;

	/** 
	 * This attribute represents whether the attribute idEmpleado has been modified since being read from the database.
	 */
	protected boolean idEmpleadoModified = false;

	/** 
	 * This attribute maps to the column CONTABILIDAD_PESO in the movimiento table.
	 */
	protected double contabilidadPeso;

	/** 
	 * This attribute represents whether the primitive attribute contabilidadPeso is null.
	 */
	protected boolean contabilidadPesoNull = true;

	/** 
	 * This attribute represents whether the attribute contabilidadPeso has been modified since being read from the database.
	 */
	protected boolean contabilidadPesoModified = false;

	/** 
	 * This attribute maps to the column NUMERO_LOTE in the movimiento table.
	 */
	protected String numeroLote;

	/** 
	 * This attribute represents whether the attribute numeroLote has been modified since being read from the database.
	 */
	protected boolean numeroLoteModified = false;

	/** 
	 * This attribute maps to the column FECHA_CADUCIDAD in the movimiento table.
	 */
	protected Date fechaCaducidad;

	/** 
	 * This attribute represents whether the attribute fechaCaducidad has been modified since being read from the database.
	 */
	protected boolean fechaCaducidadModified = false;

	/**
	 * Method 'Movimiento'
	 * 
	 */
	public Movimiento()
	{
	}

	/**
	 * Method 'getIdMovimiento'
	 * 
	 * @return int
	 */
	public int getIdMovimiento()
	{
		return idMovimiento;
	}

	/**
	 * Method 'setIdMovimiento'
	 * 
	 * @param idMovimiento
	 */
	public void setIdMovimiento(int idMovimiento)
	{
		this.idMovimiento = idMovimiento;
		this.idMovimientoModified = true;
	}

	/** 
	 * Sets the value of idMovimientoModified
	 */
	public void setIdMovimientoModified(boolean idMovimientoModified)
	{
		this.idMovimientoModified = idMovimientoModified;
	}

	/** 
	 * Gets the value of idMovimientoModified
	 */
	public boolean isIdMovimientoModified()
	{
		return idMovimientoModified;
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
	 * Method 'getTipoMovimiento'
	 * 
	 * @return String
	 */
	public String getTipoMovimiento()
	{
		return tipoMovimiento;
	}

	/**
	 * Method 'setTipoMovimiento'
	 * 
	 * @param tipoMovimiento
	 */
	public void setTipoMovimiento(String tipoMovimiento)
	{
		this.tipoMovimiento = tipoMovimiento;
		this.tipoMovimientoModified = true;
	}

	/** 
	 * Sets the value of tipoMovimientoModified
	 */
	public void setTipoMovimientoModified(boolean tipoMovimientoModified)
	{
		this.tipoMovimientoModified = tipoMovimientoModified;
	}

	/** 
	 * Gets the value of tipoMovimientoModified
	 */
	public boolean isTipoMovimientoModified()
	{
		return tipoMovimientoModified;
	}

	/**
	 * Method 'getNombreProducto'
	 * 
	 * @return String
	 */
	public String getNombreProducto()
	{
		return nombreProducto;
	}

	/**
	 * Method 'setNombreProducto'
	 * 
	 * @param nombreProducto
	 */
	public void setNombreProducto(String nombreProducto)
	{
		this.nombreProducto = nombreProducto;
		this.nombreProductoModified = true;
	}

	/** 
	 * Sets the value of nombreProductoModified
	 */
	public void setNombreProductoModified(boolean nombreProductoModified)
	{
		this.nombreProductoModified = nombreProductoModified;
	}

	/** 
	 * Gets the value of nombreProductoModified
	 */
	public boolean isNombreProductoModified()
	{
		return nombreProductoModified;
	}

	/**
	 * Method 'getContabilidad'
	 * 
	 * @return double
	 */
	public double getContabilidad()
	{
		return contabilidad;
	}

	/**
	 * Method 'setContabilidad'
	 * 
	 * @param contabilidad
	 */
	public void setContabilidad(double contabilidad)
	{
		this.contabilidad = contabilidad;
		this.contabilidadNull = false;
		this.contabilidadModified = true;
	}

	/**
	 * Method 'setContabilidadNull'
	 * 
	 * @param value
	 */
	public void setContabilidadNull(boolean value)
	{
		this.contabilidadNull = value;
		this.contabilidadModified = true;
	}

	/**
	 * Method 'isContabilidadNull'
	 * 
	 * @return boolean
	 */
	public boolean isContabilidadNull()
	{
		return contabilidadNull;
	}

	/** 
	 * Sets the value of contabilidadModified
	 */
	public void setContabilidadModified(boolean contabilidadModified)
	{
		this.contabilidadModified = contabilidadModified;
	}

	/** 
	 * Gets the value of contabilidadModified
	 */
	public boolean isContabilidadModified()
	{
		return contabilidadModified;
	}

	/**
	 * Method 'getFechaRegistro'
	 * 
	 * @return Date
	 */
	public Date getFechaRegistro()
	{
		return fechaRegistro;
	}

	/**
	 * Method 'setFechaRegistro'
	 * 
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(Date fechaRegistro)
	{
		this.fechaRegistro = fechaRegistro;
		this.fechaRegistroModified = true;
	}

	/** 
	 * Sets the value of fechaRegistroModified
	 */
	public void setFechaRegistroModified(boolean fechaRegistroModified)
	{
		this.fechaRegistroModified = fechaRegistroModified;
	}

	/** 
	 * Gets the value of fechaRegistroModified
	 */
	public boolean isFechaRegistroModified()
	{
		return fechaRegistroModified;
	}

	/**
	 * Method 'getIdProveedor'
	 * 
	 * @return int
	 */
	public int getIdProveedor()
	{
		return idProveedor;
	}

	/**
	 * Method 'setIdProveedor'
	 * 
	 * @param idProveedor
	 */
	public void setIdProveedor(int idProveedor)
	{
		this.idProveedor = idProveedor;
		this.idProveedorNull = false;
		this.idProveedorModified = true;
	}

	/**
	 * Method 'setIdProveedorNull'
	 * 
	 * @param value
	 */
	public void setIdProveedorNull(boolean value)
	{
		this.idProveedorNull = value;
		this.idProveedorModified = true;
	}

	/**
	 * Method 'isIdProveedorNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdProveedorNull()
	{
		return idProveedorNull;
	}

	/** 
	 * Sets the value of idProveedorModified
	 */
	public void setIdProveedorModified(boolean idProveedorModified)
	{
		this.idProveedorModified = idProveedorModified;
	}

	/** 
	 * Gets the value of idProveedorModified
	 */
	public boolean isIdProveedorModified()
	{
		return idProveedorModified;
	}

	/**
	 * Method 'getOrdenCompra'
	 * 
	 * @return String
	 */
	public String getOrdenCompra()
	{
		return ordenCompra;
	}

	/**
	 * Method 'setOrdenCompra'
	 * 
	 * @param ordenCompra
	 */
	public void setOrdenCompra(String ordenCompra)
	{
		this.ordenCompra = ordenCompra;
		this.ordenCompraModified = true;
	}

	/** 
	 * Sets the value of ordenCompraModified
	 */
	public void setOrdenCompraModified(boolean ordenCompraModified)
	{
		this.ordenCompraModified = ordenCompraModified;
	}

	/** 
	 * Gets the value of ordenCompraModified
	 */
	public boolean isOrdenCompraModified()
	{
		return ordenCompraModified;
	}

	/**
	 * Method 'getNumeroGuia'
	 * 
	 * @return String
	 */
	public String getNumeroGuia()
	{
		return numeroGuia;
	}

	/**
	 * Method 'setNumeroGuia'
	 * 
	 * @param numeroGuia
	 */
	public void setNumeroGuia(String numeroGuia)
	{
		this.numeroGuia = numeroGuia;
		this.numeroGuiaModified = true;
	}

	/** 
	 * Sets the value of numeroGuiaModified
	 */
	public void setNumeroGuiaModified(boolean numeroGuiaModified)
	{
		this.numeroGuiaModified = numeroGuiaModified;
	}

	/** 
	 * Gets the value of numeroGuiaModified
	 */
	public boolean isNumeroGuiaModified()
	{
		return numeroGuiaModified;
	}

	/**
	 * Method 'getIdAlmacen'
	 * 
	 * @return int
	 */
	public int getIdAlmacen()
	{
		return idAlmacen;
	}

	/**
	 * Method 'setIdAlmacen'
	 * 
	 * @param idAlmacen
	 */
	public void setIdAlmacen(int idAlmacen)
	{
		this.idAlmacen = idAlmacen;
		this.idAlmacenNull = false;
		this.idAlmacenModified = true;
	}

	/**
	 * Method 'setIdAlmacenNull'
	 * 
	 * @param value
	 */
	public void setIdAlmacenNull(boolean value)
	{
		this.idAlmacenNull = value;
		this.idAlmacenModified = true;
	}

	/**
	 * Method 'isIdAlmacenNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdAlmacenNull()
	{
		return idAlmacenNull;
	}

	/** 
	 * Sets the value of idAlmacenModified
	 */
	public void setIdAlmacenModified(boolean idAlmacenModified)
	{
		this.idAlmacenModified = idAlmacenModified;
	}

	/** 
	 * Gets the value of idAlmacenModified
	 */
	public boolean isIdAlmacenModified()
	{
		return idAlmacenModified;
	}

	/**
	 * Method 'getConceptoMovimiento'
	 * 
	 * @return String
	 */
	public String getConceptoMovimiento()
	{
		return conceptoMovimiento;
	}

	/**
	 * Method 'setConceptoMovimiento'
	 * 
	 * @param conceptoMovimiento
	 */
	public void setConceptoMovimiento(String conceptoMovimiento)
	{
		this.conceptoMovimiento = conceptoMovimiento;
		this.conceptoMovimientoModified = true;
	}

	/** 
	 * Sets the value of conceptoMovimientoModified
	 */
	public void setConceptoMovimientoModified(boolean conceptoMovimientoModified)
	{
		this.conceptoMovimientoModified = conceptoMovimientoModified;
	}

	/** 
	 * Gets the value of conceptoMovimientoModified
	 */
	public boolean isConceptoMovimientoModified()
	{
		return conceptoMovimientoModified;
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
		this.idConceptoNull = false;
		this.idConceptoModified = true;
	}

	/**
	 * Method 'setIdConceptoNull'
	 * 
	 * @param value
	 */
	public void setIdConceptoNull(boolean value)
	{
		this.idConceptoNull = value;
		this.idConceptoModified = true;
	}

	/**
	 * Method 'isIdConceptoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdConceptoNull()
	{
		return idConceptoNull;
	}

	/** 
	 * Sets the value of idConceptoModified
	 */
	public void setIdConceptoModified(boolean idConceptoModified)
	{
		this.idConceptoModified = idConceptoModified;
	}

	/** 
	 * Gets the value of idConceptoModified
	 */
	public boolean isIdConceptoModified()
	{
		return idConceptoModified;
	}

	/**
	 * Method 'getIdAlmacenDestino'
	 * 
	 * @return int
	 */
	public int getIdAlmacenDestino()
	{
		return idAlmacenDestino;
	}

	/**
	 * Method 'setIdAlmacenDestino'
	 * 
	 * @param idAlmacenDestino
	 */
	public void setIdAlmacenDestino(int idAlmacenDestino)
	{
		this.idAlmacenDestino = idAlmacenDestino;
		this.idAlmacenDestinoNull = false;
		this.idAlmacenDestinoModified = true;
	}

	/**
	 * Method 'setIdAlmacenDestinoNull'
	 * 
	 * @param value
	 */
	public void setIdAlmacenDestinoNull(boolean value)
	{
		this.idAlmacenDestinoNull = value;
		this.idAlmacenDestinoModified = true;
	}

	/**
	 * Method 'isIdAlmacenDestinoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdAlmacenDestinoNull()
	{
		return idAlmacenDestinoNull;
	}

	/** 
	 * Sets the value of idAlmacenDestinoModified
	 */
	public void setIdAlmacenDestinoModified(boolean idAlmacenDestinoModified)
	{
		this.idAlmacenDestinoModified = idAlmacenDestinoModified;
	}

	/** 
	 * Gets the value of idAlmacenDestinoModified
	 */
	public boolean isIdAlmacenDestinoModified()
	{
		return idAlmacenDestinoModified;
	}

	/**
	 * Method 'getSincronizacionMicrosip'
	 * 
	 * @return int
	 */
	public int getSincronizacionMicrosip()
	{
		return sincronizacionMicrosip;
	}

	/**
	 * Method 'setSincronizacionMicrosip'
	 * 
	 * @param sincronizacionMicrosip
	 */
	public void setSincronizacionMicrosip(int sincronizacionMicrosip)
	{
		this.sincronizacionMicrosip = sincronizacionMicrosip;
		this.sincronizacionMicrosipNull = false;
		this.sincronizacionMicrosipModified = true;
	}

	/**
	 * Method 'setSincronizacionMicrosipNull'
	 * 
	 * @param value
	 */
	public void setSincronizacionMicrosipNull(boolean value)
	{
		this.sincronizacionMicrosipNull = value;
		this.sincronizacionMicrosipModified = true;
	}

	/**
	 * Method 'isSincronizacionMicrosipNull'
	 * 
	 * @return boolean
	 */
	public boolean isSincronizacionMicrosipNull()
	{
		return sincronizacionMicrosipNull;
	}

	/** 
	 * Sets the value of sincronizacionMicrosipModified
	 */
	public void setSincronizacionMicrosipModified(boolean sincronizacionMicrosipModified)
	{
		this.sincronizacionMicrosipModified = sincronizacionMicrosipModified;
	}

	/** 
	 * Gets the value of sincronizacionMicrosipModified
	 */
	public boolean isSincronizacionMicrosipModified()
	{
		return sincronizacionMicrosipModified;
	}

	/**
	 * Method 'getIdEmpleado'
	 * 
	 * @return int
	 */
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	/**
	 * Method 'setIdEmpleado'
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
		this.idEmpleadoNull = false;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'setIdEmpleadoNull'
	 * 
	 * @param value
	 */
	public void setIdEmpleadoNull(boolean value)
	{
		this.idEmpleadoNull = value;
		this.idEmpleadoModified = true;
	}

	/**
	 * Method 'isIdEmpleadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEmpleadoNull()
	{
		return idEmpleadoNull;
	}

	/** 
	 * Sets the value of idEmpleadoModified
	 */
	public void setIdEmpleadoModified(boolean idEmpleadoModified)
	{
		this.idEmpleadoModified = idEmpleadoModified;
	}

	/** 
	 * Gets the value of idEmpleadoModified
	 */
	public boolean isIdEmpleadoModified()
	{
		return idEmpleadoModified;
	}

	/**
	 * Method 'getContabilidadPeso'
	 * 
	 * @return double
	 */
	public double getContabilidadPeso()
	{
		return contabilidadPeso;
	}

	/**
	 * Method 'setContabilidadPeso'
	 * 
	 * @param contabilidadPeso
	 */
	public void setContabilidadPeso(double contabilidadPeso)
	{
		this.contabilidadPeso = contabilidadPeso;
		this.contabilidadPesoNull = false;
		this.contabilidadPesoModified = true;
	}

	/**
	 * Method 'setContabilidadPesoNull'
	 * 
	 * @param value
	 */
	public void setContabilidadPesoNull(boolean value)
	{
		this.contabilidadPesoNull = value;
		this.contabilidadPesoModified = true;
	}

	/**
	 * Method 'isContabilidadPesoNull'
	 * 
	 * @return boolean
	 */
	public boolean isContabilidadPesoNull()
	{
		return contabilidadPesoNull;
	}

	/** 
	 * Sets the value of contabilidadPesoModified
	 */
	public void setContabilidadPesoModified(boolean contabilidadPesoModified)
	{
		this.contabilidadPesoModified = contabilidadPesoModified;
	}

	/** 
	 * Gets the value of contabilidadPesoModified
	 */
	public boolean isContabilidadPesoModified()
	{
		return contabilidadPesoModified;
	}

	/**
	 * Method 'getNumeroLote'
	 * 
	 * @return String
	 */
	public String getNumeroLote()
	{
		return numeroLote;
	}

	/**
	 * Method 'setNumeroLote'
	 * 
	 * @param numeroLote
	 */
	public void setNumeroLote(String numeroLote)
	{
		this.numeroLote = numeroLote;
		this.numeroLoteModified = true;
	}

	/** 
	 * Sets the value of numeroLoteModified
	 */
	public void setNumeroLoteModified(boolean numeroLoteModified)
	{
		this.numeroLoteModified = numeroLoteModified;
	}

	/** 
	 * Gets the value of numeroLoteModified
	 */
	public boolean isNumeroLoteModified()
	{
		return numeroLoteModified;
	}

	/**
	 * Method 'getFechaCaducidad'
	 * 
	 * @return Date
	 */
	public Date getFechaCaducidad()
	{
		return fechaCaducidad;
	}

	/**
	 * Method 'setFechaCaducidad'
	 * 
	 * @param fechaCaducidad
	 */
	public void setFechaCaducidad(Date fechaCaducidad)
	{
		this.fechaCaducidad = fechaCaducidad;
		this.fechaCaducidadModified = true;
	}

	/** 
	 * Sets the value of fechaCaducidadModified
	 */
	public void setFechaCaducidadModified(boolean fechaCaducidadModified)
	{
		this.fechaCaducidadModified = fechaCaducidadModified;
	}

	/** 
	 * Gets the value of fechaCaducidadModified
	 */
	public boolean isFechaCaducidadModified()
	{
		return fechaCaducidadModified;
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
		
		if (!(_other instanceof Movimiento)) {
			return false;
		}
		
		final Movimiento _cast = (Movimiento) _other;
		if (idMovimiento != _cast.idMovimiento) {
			return false;
		}
		
		if (idMovimientoModified != _cast.idMovimientoModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (tipoMovimiento == null ? _cast.tipoMovimiento != tipoMovimiento : !tipoMovimiento.equals( _cast.tipoMovimiento )) {
			return false;
		}
		
		if (tipoMovimientoModified != _cast.tipoMovimientoModified) {
			return false;
		}
		
		if (nombreProducto == null ? _cast.nombreProducto != nombreProducto : !nombreProducto.equals( _cast.nombreProducto )) {
			return false;
		}
		
		if (nombreProductoModified != _cast.nombreProductoModified) {
			return false;
		}
		
		if (contabilidad != _cast.contabilidad) {
			return false;
		}
		
		if (contabilidadNull != _cast.contabilidadNull) {
			return false;
		}
		
		if (contabilidadModified != _cast.contabilidadModified) {
			return false;
		}
		
		if (fechaRegistro == null ? _cast.fechaRegistro != fechaRegistro : !fechaRegistro.equals( _cast.fechaRegistro )) {
			return false;
		}
		
		if (fechaRegistroModified != _cast.fechaRegistroModified) {
			return false;
		}
		
		if (idProveedor != _cast.idProveedor) {
			return false;
		}
		
		if (idProveedorNull != _cast.idProveedorNull) {
			return false;
		}
		
		if (idProveedorModified != _cast.idProveedorModified) {
			return false;
		}
		
		if (ordenCompra == null ? _cast.ordenCompra != ordenCompra : !ordenCompra.equals( _cast.ordenCompra )) {
			return false;
		}
		
		if (ordenCompraModified != _cast.ordenCompraModified) {
			return false;
		}
		
		if (numeroGuia == null ? _cast.numeroGuia != numeroGuia : !numeroGuia.equals( _cast.numeroGuia )) {
			return false;
		}
		
		if (numeroGuiaModified != _cast.numeroGuiaModified) {
			return false;
		}
		
		if (idAlmacen != _cast.idAlmacen) {
			return false;
		}
		
		if (idAlmacenNull != _cast.idAlmacenNull) {
			return false;
		}
		
		if (idAlmacenModified != _cast.idAlmacenModified) {
			return false;
		}
		
		if (conceptoMovimiento == null ? _cast.conceptoMovimiento != conceptoMovimiento : !conceptoMovimiento.equals( _cast.conceptoMovimiento )) {
			return false;
		}
		
		if (conceptoMovimientoModified != _cast.conceptoMovimientoModified) {
			return false;
		}
		
		if (idConcepto != _cast.idConcepto) {
			return false;
		}
		
		if (idConceptoNull != _cast.idConceptoNull) {
			return false;
		}
		
		if (idConceptoModified != _cast.idConceptoModified) {
			return false;
		}
		
		if (idAlmacenDestino != _cast.idAlmacenDestino) {
			return false;
		}
		
		if (idAlmacenDestinoNull != _cast.idAlmacenDestinoNull) {
			return false;
		}
		
		if (idAlmacenDestinoModified != _cast.idAlmacenDestinoModified) {
			return false;
		}
		
		if (sincronizacionMicrosip != _cast.sincronizacionMicrosip) {
			return false;
		}
		
		if (sincronizacionMicrosipNull != _cast.sincronizacionMicrosipNull) {
			return false;
		}
		
		if (sincronizacionMicrosipModified != _cast.sincronizacionMicrosipModified) {
			return false;
		}
		
		if (idEmpleado != _cast.idEmpleado) {
			return false;
		}
		
		if (idEmpleadoNull != _cast.idEmpleadoNull) {
			return false;
		}
		
		if (idEmpleadoModified != _cast.idEmpleadoModified) {
			return false;
		}
		
		if (contabilidadPeso != _cast.contabilidadPeso) {
			return false;
		}
		
		if (contabilidadPesoNull != _cast.contabilidadPesoNull) {
			return false;
		}
		
		if (contabilidadPesoModified != _cast.contabilidadPesoModified) {
			return false;
		}
		
		if (numeroLote == null ? _cast.numeroLote != numeroLote : !numeroLote.equals( _cast.numeroLote )) {
			return false;
		}
		
		if (numeroLoteModified != _cast.numeroLoteModified) {
			return false;
		}
		
		if (fechaCaducidad == null ? _cast.fechaCaducidad != fechaCaducidad : !fechaCaducidad.equals( _cast.fechaCaducidad )) {
			return false;
		}
		
		if (fechaCaducidadModified != _cast.fechaCaducidadModified) {
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
		_hashCode = 29 * _hashCode + idMovimiento;
		_hashCode = 29 * _hashCode + (idMovimientoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (tipoMovimiento != null) {
			_hashCode = 29 * _hashCode + tipoMovimiento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (tipoMovimientoModified ? 1 : 0);
		if (nombreProducto != null) {
			_hashCode = 29 * _hashCode + nombreProducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreProductoModified ? 1 : 0);
		long temp_contabilidad = Double.doubleToLongBits(contabilidad);
		_hashCode = 29 * _hashCode + (int) (temp_contabilidad ^ (temp_contabilidad >>> 32));
		_hashCode = 29 * _hashCode + (contabilidadNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (contabilidadModified ? 1 : 0);
		if (fechaRegistro != null) {
			_hashCode = 29 * _hashCode + fechaRegistro.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaRegistroModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idProveedor;
		_hashCode = 29 * _hashCode + (idProveedorNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idProveedorModified ? 1 : 0);
		if (ordenCompra != null) {
			_hashCode = 29 * _hashCode + ordenCompra.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (ordenCompraModified ? 1 : 0);
		if (numeroGuia != null) {
			_hashCode = 29 * _hashCode + numeroGuia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroGuiaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idAlmacen;
		_hashCode = 29 * _hashCode + (idAlmacenNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idAlmacenModified ? 1 : 0);
		if (conceptoMovimiento != null) {
			_hashCode = 29 * _hashCode + conceptoMovimiento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (conceptoMovimientoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idConcepto;
		_hashCode = 29 * _hashCode + (idConceptoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idAlmacenDestino;
		_hashCode = 29 * _hashCode + (idAlmacenDestinoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idAlmacenDestinoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + sincronizacionMicrosip;
		_hashCode = 29 * _hashCode + (sincronizacionMicrosipNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (sincronizacionMicrosipModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpleado;
		_hashCode = 29 * _hashCode + (idEmpleadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEmpleadoModified ? 1 : 0);
		long temp_contabilidadPeso = Double.doubleToLongBits(contabilidadPeso);
		_hashCode = 29 * _hashCode + (int) (temp_contabilidadPeso ^ (temp_contabilidadPeso >>> 32));
		_hashCode = 29 * _hashCode + (contabilidadPesoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (contabilidadPesoModified ? 1 : 0);
		if (numeroLote != null) {
			_hashCode = 29 * _hashCode + numeroLote.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroLoteModified ? 1 : 0);
		if (fechaCaducidad != null) {
			_hashCode = 29 * _hashCode + fechaCaducidad.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaCaducidadModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return MovimientoPk
	 */
	public MovimientoPk createPk()
	{
		return new MovimientoPk(idMovimiento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Movimiento: " );
		ret.append( "idMovimiento=" + idMovimiento );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", tipoMovimiento=" + tipoMovimiento );
		ret.append( ", nombreProducto=" + nombreProducto );
		ret.append( ", contabilidad=" + contabilidad );
		ret.append( ", fechaRegistro=" + fechaRegistro );
		ret.append( ", idProveedor=" + idProveedor );
		ret.append( ", ordenCompra=" + ordenCompra );
		ret.append( ", numeroGuia=" + numeroGuia );
		ret.append( ", idAlmacen=" + idAlmacen );
		ret.append( ", conceptoMovimiento=" + conceptoMovimiento );
		ret.append( ", idConcepto=" + idConcepto );
		ret.append( ", idAlmacenDestino=" + idAlmacenDestino );
		ret.append( ", sincronizacionMicrosip=" + sincronizacionMicrosip );
		ret.append( ", idEmpleado=" + idEmpleado );
		ret.append( ", contabilidadPeso=" + contabilidadPeso );
		ret.append( ", numeroLote=" + numeroLote );
		ret.append( ", fechaCaducidad=" + fechaCaducidad );
		return ret.toString();
	}

}