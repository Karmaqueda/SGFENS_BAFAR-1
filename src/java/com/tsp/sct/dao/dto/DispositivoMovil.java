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

public class DispositivoMovil implements Serializable
{
	/** 
	 * This attribute maps to the column ID_DISPOSITIVO in the dispositivo_movil table.
	 */
	protected int idDispositivo;

	/** 
	 * This attribute represents whether the attribute idDispositivo has been modified since being read from the database.
	 */
	protected boolean idDispositivoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the dispositivo_movil table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the dispositivo_movil table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column IMEI in the dispositivo_movil table.
	 */
	protected String imei;

	/** 
	 * This attribute represents whether the attribute imei has been modified since being read from the database.
	 */
	protected boolean imeiModified = false;

	/** 
	 * This attribute maps to the column MARCA in the dispositivo_movil table.
	 */
	protected String marca;

	/** 
	 * This attribute represents whether the attribute marca has been modified since being read from the database.
	 */
	protected boolean marcaModified = false;

	/** 
	 * This attribute maps to the column MODELO in the dispositivo_movil table.
	 */
	protected String modelo;

	/** 
	 * This attribute represents whether the attribute modelo has been modified since being read from the database.
	 */
	protected boolean modeloModified = false;

	/** 
	 * This attribute maps to the column NUMERO_SERIE in the dispositivo_movil table.
	 */
	protected String numeroSerie;

	/** 
	 * This attribute represents whether the attribute numeroSerie has been modified since being read from the database.
	 */
	protected boolean numeroSerieModified = false;

	/** 
	 * This attribute maps to the column ASIGNADO in the dispositivo_movil table.
	 */
	protected short asignado;

	/** 
	 * This attribute represents whether the primitive attribute asignado is null.
	 */
	protected boolean asignadoNull = true;

	/** 
	 * This attribute represents whether the attribute asignado has been modified since being read from the database.
	 */
	protected boolean asignadoModified = false;

	/** 
	 * This attribute maps to the column ALIAS_TELEFONO in the dispositivo_movil table.
	 */
	protected String aliasTelefono;

	/** 
	 * This attribute represents whether the attribute aliasTelefono has been modified since being read from the database.
	 */
	protected boolean aliasTelefonoModified = false;

	/** 
	 * This attribute maps to the column REPORTE_ROBO in the dispositivo_movil table.
	 */
	protected int reporteRobo;

	/** 
	 * This attribute represents whether the primitive attribute reporteRobo is null.
	 */
	protected boolean reporteRoboNull = true;

	/** 
	 * This attribute represents whether the attribute reporteRobo has been modified since being read from the database.
	 */
	protected boolean reporteRoboModified = false;

	/** 
	 * This attribute maps to the column PCT_PILA in the dispositivo_movil table.
	 */
	protected double pctPila;

	/** 
	 * This attribute represents whether the primitive attribute pctPila is null.
	 */
	protected boolean pctPilaNull = true;

	/** 
	 * This attribute represents whether the attribute pctPila has been modified since being read from the database.
	 */
	protected boolean pctPilaModified = false;

	/**
	 * Method 'DispositivoMovil'
	 * 
	 */
	public DispositivoMovil()
	{
	}

	/**
	 * Method 'getIdDispositivo'
	 * 
	 * @return int
	 */
	public int getIdDispositivo()
	{
		return idDispositivo;
	}

	/**
	 * Method 'setIdDispositivo'
	 * 
	 * @param idDispositivo
	 */
	public void setIdDispositivo(int idDispositivo)
	{
		this.idDispositivo = idDispositivo;
		this.idDispositivoModified = true;
	}

	/** 
	 * Sets the value of idDispositivoModified
	 */
	public void setIdDispositivoModified(boolean idDispositivoModified)
	{
		this.idDispositivoModified = idDispositivoModified;
	}

	/** 
	 * Gets the value of idDispositivoModified
	 */
	public boolean isIdDispositivoModified()
	{
		return idDispositivoModified;
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
	 * Method 'getImei'
	 * 
	 * @return String
	 */
	public String getImei()
	{
		return imei;
	}

	/**
	 * Method 'setImei'
	 * 
	 * @param imei
	 */
	public void setImei(String imei)
	{
		this.imei = imei;
		this.imeiModified = true;
	}

	/** 
	 * Sets the value of imeiModified
	 */
	public void setImeiModified(boolean imeiModified)
	{
		this.imeiModified = imeiModified;
	}

	/** 
	 * Gets the value of imeiModified
	 */
	public boolean isImeiModified()
	{
		return imeiModified;
	}

	/**
	 * Method 'getMarca'
	 * 
	 * @return String
	 */
	public String getMarca()
	{
		return marca;
	}

	/**
	 * Method 'setMarca'
	 * 
	 * @param marca
	 */
	public void setMarca(String marca)
	{
		this.marca = marca;
		this.marcaModified = true;
	}

	/** 
	 * Sets the value of marcaModified
	 */
	public void setMarcaModified(boolean marcaModified)
	{
		this.marcaModified = marcaModified;
	}

	/** 
	 * Gets the value of marcaModified
	 */
	public boolean isMarcaModified()
	{
		return marcaModified;
	}

	/**
	 * Method 'getModelo'
	 * 
	 * @return String
	 */
	public String getModelo()
	{
		return modelo;
	}

	/**
	 * Method 'setModelo'
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
		this.modeloModified = true;
	}

	/** 
	 * Sets the value of modeloModified
	 */
	public void setModeloModified(boolean modeloModified)
	{
		this.modeloModified = modeloModified;
	}

	/** 
	 * Gets the value of modeloModified
	 */
	public boolean isModeloModified()
	{
		return modeloModified;
	}

	/**
	 * Method 'getNumeroSerie'
	 * 
	 * @return String
	 */
	public String getNumeroSerie()
	{
		return numeroSerie;
	}

	/**
	 * Method 'setNumeroSerie'
	 * 
	 * @param numeroSerie
	 */
	public void setNumeroSerie(String numeroSerie)
	{
		this.numeroSerie = numeroSerie;
		this.numeroSerieModified = true;
	}

	/** 
	 * Sets the value of numeroSerieModified
	 */
	public void setNumeroSerieModified(boolean numeroSerieModified)
	{
		this.numeroSerieModified = numeroSerieModified;
	}

	/** 
	 * Gets the value of numeroSerieModified
	 */
	public boolean isNumeroSerieModified()
	{
		return numeroSerieModified;
	}

	/**
	 * Method 'getAsignado'
	 * 
	 * @return short
	 */
	public short getAsignado()
	{
		return asignado;
	}

	/**
	 * Method 'setAsignado'
	 * 
	 * @param asignado
	 */
	public void setAsignado(short asignado)
	{
		this.asignado = asignado;
		this.asignadoNull = false;
		this.asignadoModified = true;
	}

	/**
	 * Method 'setAsignadoNull'
	 * 
	 * @param value
	 */
	public void setAsignadoNull(boolean value)
	{
		this.asignadoNull = value;
		this.asignadoModified = true;
	}

	/**
	 * Method 'isAsignadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isAsignadoNull()
	{
		return asignadoNull;
	}

	/** 
	 * Sets the value of asignadoModified
	 */
	public void setAsignadoModified(boolean asignadoModified)
	{
		this.asignadoModified = asignadoModified;
	}

	/** 
	 * Gets the value of asignadoModified
	 */
	public boolean isAsignadoModified()
	{
		return asignadoModified;
	}

	/**
	 * Method 'getAliasTelefono'
	 * 
	 * @return String
	 */
	public String getAliasTelefono()
	{
		return aliasTelefono;
	}

	/**
	 * Method 'setAliasTelefono'
	 * 
	 * @param aliasTelefono
	 */
	public void setAliasTelefono(String aliasTelefono)
	{
		this.aliasTelefono = aliasTelefono;
		this.aliasTelefonoModified = true;
	}

	/** 
	 * Sets the value of aliasTelefonoModified
	 */
	public void setAliasTelefonoModified(boolean aliasTelefonoModified)
	{
		this.aliasTelefonoModified = aliasTelefonoModified;
	}

	/** 
	 * Gets the value of aliasTelefonoModified
	 */
	public boolean isAliasTelefonoModified()
	{
		return aliasTelefonoModified;
	}

	/**
	 * Method 'getReporteRobo'
	 * 
	 * @return int
	 */
	public int getReporteRobo()
	{
		return reporteRobo;
	}

	/**
	 * Method 'setReporteRobo'
	 * 
	 * @param reporteRobo
	 */
	public void setReporteRobo(int reporteRobo)
	{
		this.reporteRobo = reporteRobo;
		this.reporteRoboNull = false;
		this.reporteRoboModified = true;
	}

	/**
	 * Method 'setReporteRoboNull'
	 * 
	 * @param value
	 */
	public void setReporteRoboNull(boolean value)
	{
		this.reporteRoboNull = value;
		this.reporteRoboModified = true;
	}

	/**
	 * Method 'isReporteRoboNull'
	 * 
	 * @return boolean
	 */
	public boolean isReporteRoboNull()
	{
		return reporteRoboNull;
	}

	/** 
	 * Sets the value of reporteRoboModified
	 */
	public void setReporteRoboModified(boolean reporteRoboModified)
	{
		this.reporteRoboModified = reporteRoboModified;
	}

	/** 
	 * Gets the value of reporteRoboModified
	 */
	public boolean isReporteRoboModified()
	{
		return reporteRoboModified;
	}

	/**
	 * Method 'getPctPila'
	 * 
	 * @return double
	 */
	public double getPctPila()
	{
		return pctPila;
	}

	/**
	 * Method 'setPctPila'
	 * 
	 * @param pctPila
	 */
	public void setPctPila(double pctPila)
	{
		this.pctPila = pctPila;
		this.pctPilaNull = false;
		this.pctPilaModified = true;
	}

	/**
	 * Method 'setPctPilaNull'
	 * 
	 * @param value
	 */
	public void setPctPilaNull(boolean value)
	{
		this.pctPilaNull = value;
		this.pctPilaModified = true;
	}

	/**
	 * Method 'isPctPilaNull'
	 * 
	 * @return boolean
	 */
	public boolean isPctPilaNull()
	{
		return pctPilaNull;
	}

	/** 
	 * Sets the value of pctPilaModified
	 */
	public void setPctPilaModified(boolean pctPilaModified)
	{
		this.pctPilaModified = pctPilaModified;
	}

	/** 
	 * Gets the value of pctPilaModified
	 */
	public boolean isPctPilaModified()
	{
		return pctPilaModified;
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
		
		if (!(_other instanceof DispositivoMovil)) {
			return false;
		}
		
		final DispositivoMovil _cast = (DispositivoMovil) _other;
		if (idDispositivo != _cast.idDispositivo) {
			return false;
		}
		
		if (idDispositivoModified != _cast.idDispositivoModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (imei == null ? _cast.imei != imei : !imei.equals( _cast.imei )) {
			return false;
		}
		
		if (imeiModified != _cast.imeiModified) {
			return false;
		}
		
		if (marca == null ? _cast.marca != marca : !marca.equals( _cast.marca )) {
			return false;
		}
		
		if (marcaModified != _cast.marcaModified) {
			return false;
		}
		
		if (modelo == null ? _cast.modelo != modelo : !modelo.equals( _cast.modelo )) {
			return false;
		}
		
		if (modeloModified != _cast.modeloModified) {
			return false;
		}
		
		if (numeroSerie == null ? _cast.numeroSerie != numeroSerie : !numeroSerie.equals( _cast.numeroSerie )) {
			return false;
		}
		
		if (numeroSerieModified != _cast.numeroSerieModified) {
			return false;
		}
		
		if (asignado != _cast.asignado) {
			return false;
		}
		
		if (asignadoNull != _cast.asignadoNull) {
			return false;
		}
		
		if (asignadoModified != _cast.asignadoModified) {
			return false;
		}
		
		if (aliasTelefono == null ? _cast.aliasTelefono != aliasTelefono : !aliasTelefono.equals( _cast.aliasTelefono )) {
			return false;
		}
		
		if (aliasTelefonoModified != _cast.aliasTelefonoModified) {
			return false;
		}
		
		if (reporteRobo != _cast.reporteRobo) {
			return false;
		}
		
		if (reporteRoboNull != _cast.reporteRoboNull) {
			return false;
		}
		
		if (reporteRoboModified != _cast.reporteRoboModified) {
			return false;
		}
		
		if (pctPila != _cast.pctPila) {
			return false;
		}
		
		if (pctPilaNull != _cast.pctPilaNull) {
			return false;
		}
		
		if (pctPilaModified != _cast.pctPilaModified) {
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
		_hashCode = 29 * _hashCode + idDispositivo;
		_hashCode = 29 * _hashCode + (idDispositivoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (imei != null) {
			_hashCode = 29 * _hashCode + imei.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (imeiModified ? 1 : 0);
		if (marca != null) {
			_hashCode = 29 * _hashCode + marca.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (marcaModified ? 1 : 0);
		if (modelo != null) {
			_hashCode = 29 * _hashCode + modelo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (modeloModified ? 1 : 0);
		if (numeroSerie != null) {
			_hashCode = 29 * _hashCode + numeroSerie.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroSerieModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) asignado;
		_hashCode = 29 * _hashCode + (asignadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (asignadoModified ? 1 : 0);
		if (aliasTelefono != null) {
			_hashCode = 29 * _hashCode + aliasTelefono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (aliasTelefonoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + reporteRobo;
		_hashCode = 29 * _hashCode + (reporteRoboNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (reporteRoboModified ? 1 : 0);
		long temp_pctPila = Double.doubleToLongBits(pctPila);
		_hashCode = 29 * _hashCode + (int) (temp_pctPila ^ (temp_pctPila >>> 32));
		_hashCode = 29 * _hashCode + (pctPilaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (pctPilaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DispositivoMovilPk
	 */
	public DispositivoMovilPk createPk()
	{
		return new DispositivoMovilPk(idDispositivo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.DispositivoMovil: " );
		ret.append( "idDispositivo=" + idDispositivo );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", imei=" + imei );
		ret.append( ", marca=" + marca );
		ret.append( ", modelo=" + modelo );
		ret.append( ", numeroSerie=" + numeroSerie );
		ret.append( ", asignado=" + asignado );
		ret.append( ", aliasTelefono=" + aliasTelefono );
		ret.append( ", reporteRobo=" + reporteRobo );
		ret.append( ", pctPila=" + pctPila );
		return ret.toString();
	}

}
