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

public class ReporteMensual implements Serializable
{
	/** 
	 * This attribute maps to the column ID_REPORTE_MENSUAL in the reporte_mensual table.
	 */
	protected int idReporteMensual;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the reporte_mensual table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute maps to the column NOMBRE_ARCHIVO in the reporte_mensual table.
	 */
	protected String nombreArchivo;

	/** 
	 * This attribute maps to the column MES in the reporte_mensual table.
	 */
	protected String mes;

	/** 
	 * This attribute maps to the column ANIO in the reporte_mensual table.
	 */
	protected int anio;

	/**
	 * Method 'ReporteMensual'
	 * 
	 */
	public ReporteMensual()
	{
	}

	/**
	 * Method 'getIdReporteMensual'
	 * 
	 * @return int
	 */
	public int getIdReporteMensual()
	{
		return idReporteMensual;
	}

	/**
	 * Method 'setIdReporteMensual'
	 * 
	 * @param idReporteMensual
	 */
	public void setIdReporteMensual(int idReporteMensual)
	{
		this.idReporteMensual = idReporteMensual;
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
	}

	/**
	 * Method 'getMes'
	 * 
	 * @return String
	 */
	public String getMes()
	{
		return mes;
	}

	/**
	 * Method 'setMes'
	 * 
	 * @param mes
	 */
	public void setMes(String mes)
	{
		this.mes = mes;
	}

	/**
	 * Method 'getAnio'
	 * 
	 * @return int
	 */
	public int getAnio()
	{
		return anio;
	}

	/**
	 * Method 'setAnio'
	 * 
	 * @param anio
	 */
	public void setAnio(int anio)
	{
		this.anio = anio;
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
		
		if (!(_other instanceof ReporteMensual)) {
			return false;
		}
		
		final ReporteMensual _cast = (ReporteMensual) _other;
		if (idReporteMensual != _cast.idReporteMensual) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (nombreArchivo == null ? _cast.nombreArchivo != nombreArchivo : !nombreArchivo.equals( _cast.nombreArchivo )) {
			return false;
		}
		
		if (mes == null ? _cast.mes != mes : !mes.equals( _cast.mes )) {
			return false;
		}
		
		if (anio != _cast.anio) {
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
		_hashCode = 29 * _hashCode + idReporteMensual;
		_hashCode = 29 * _hashCode + idEmpresa;
		if (nombreArchivo != null) {
			_hashCode = 29 * _hashCode + nombreArchivo.hashCode();
		}
		
		if (mes != null) {
			_hashCode = 29 * _hashCode + mes.hashCode();
		}
		
		_hashCode = 29 * _hashCode + anio;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ReporteMensualPk
	 */
	public ReporteMensualPk createPk()
	{
		return new ReporteMensualPk(idReporteMensual);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ReporteMensual: " );
		ret.append( "idReporteMensual=" + idReporteMensual );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", nombreArchivo=" + nombreArchivo );
		ret.append( ", mes=" + mes );
		ret.append( ", anio=" + anio );
		return ret.toString();
	}

}
