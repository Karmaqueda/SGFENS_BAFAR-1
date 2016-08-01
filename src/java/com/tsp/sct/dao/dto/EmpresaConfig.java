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

public class EmpresaConfig implements Serializable
{
	/** 
	 * This attribute maps to the column ID_EMPRESA in the empresa_config table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column DIAS_CORTE in the empresa_config table.
	 */
	protected String diasCorte;

	/** 
	 * This attribute represents whether the attribute diasCorte has been modified since being read from the database.
	 */
	protected boolean diasCorteModified = false;

	/** 
	 * This attribute maps to the column HORA_CORTE in the empresa_config table.
	 */
	protected Date horaCorte;

	/** 
	 * This attribute represents whether the attribute horaCorte has been modified since being read from the database.
	 */
	protected boolean horaCorteModified = false;

	/** 
	 * This attribute maps to the column INVENTARIO_INICIAL_AUTO in the empresa_config table.
	 */
	protected int inventarioInicialAuto;

	/** 
	 * This attribute represents whether the primitive attribute inventarioInicialAuto is null.
	 */
	protected boolean inventarioInicialAutoNull = true;

	/** 
	 * This attribute represents whether the attribute inventarioInicialAuto has been modified since being read from the database.
	 */
	protected boolean inventarioInicialAutoModified = false;

	/**
	 * Method 'EmpresaConfig'
	 * 
	 */
	public EmpresaConfig()
	{
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
	 * Method 'getDiasCorte'
	 * 
	 * @return String
	 */
	public String getDiasCorte()
	{
		return diasCorte;
	}

	/**
	 * Method 'setDiasCorte'
	 * 
	 * @param diasCorte
	 */
	public void setDiasCorte(String diasCorte)
	{
		this.diasCorte = diasCorte;
		this.diasCorteModified = true;
	}

	/** 
	 * Sets the value of diasCorteModified
	 */
	public void setDiasCorteModified(boolean diasCorteModified)
	{
		this.diasCorteModified = diasCorteModified;
	}

	/** 
	 * Gets the value of diasCorteModified
	 */
	public boolean isDiasCorteModified()
	{
		return diasCorteModified;
	}

	/**
	 * Method 'getHoraCorte'
	 * 
	 * @return Date
	 */
	public Date getHoraCorte()
	{
		return horaCorte;
	}

	/**
	 * Method 'setHoraCorte'
	 * 
	 * @param horaCorte
	 */
	public void setHoraCorte(Date horaCorte)
	{
		this.horaCorte = horaCorte;
		this.horaCorteModified = true;
	}

	/** 
	 * Sets the value of horaCorteModified
	 */
	public void setHoraCorteModified(boolean horaCorteModified)
	{
		this.horaCorteModified = horaCorteModified;
	}

	/** 
	 * Gets the value of horaCorteModified
	 */
	public boolean isHoraCorteModified()
	{
		return horaCorteModified;
	}

	/**
	 * Method 'getInventarioInicialAuto'
	 * 
	 * @return int
	 */
	public int getInventarioInicialAuto()
	{
		return inventarioInicialAuto;
	}

	/**
	 * Method 'setInventarioInicialAuto'
	 * 
	 * @param inventarioInicialAuto
	 */
	public void setInventarioInicialAuto(int inventarioInicialAuto)
	{
		this.inventarioInicialAuto = inventarioInicialAuto;
		this.inventarioInicialAutoNull = false;
		this.inventarioInicialAutoModified = true;
	}

	/**
	 * Method 'setInventarioInicialAutoNull'
	 * 
	 * @param value
	 */
	public void setInventarioInicialAutoNull(boolean value)
	{
		this.inventarioInicialAutoNull = value;
		this.inventarioInicialAutoModified = true;
	}

	/**
	 * Method 'isInventarioInicialAutoNull'
	 * 
	 * @return boolean
	 */
	public boolean isInventarioInicialAutoNull()
	{
		return inventarioInicialAutoNull;
	}

	/** 
	 * Sets the value of inventarioInicialAutoModified
	 */
	public void setInventarioInicialAutoModified(boolean inventarioInicialAutoModified)
	{
		this.inventarioInicialAutoModified = inventarioInicialAutoModified;
	}

	/** 
	 * Gets the value of inventarioInicialAutoModified
	 */
	public boolean isInventarioInicialAutoModified()
	{
		return inventarioInicialAutoModified;
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
		
		if (!(_other instanceof EmpresaConfig)) {
			return false;
		}
		
		final EmpresaConfig _cast = (EmpresaConfig) _other;
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (diasCorte == null ? _cast.diasCorte != diasCorte : !diasCorte.equals( _cast.diasCorte )) {
			return false;
		}
		
		if (diasCorteModified != _cast.diasCorteModified) {
			return false;
		}
		
		if (horaCorte == null ? _cast.horaCorte != horaCorte : !horaCorte.equals( _cast.horaCorte )) {
			return false;
		}
		
		if (horaCorteModified != _cast.horaCorteModified) {
			return false;
		}
		
		if (inventarioInicialAuto != _cast.inventarioInicialAuto) {
			return false;
		}
		
		if (inventarioInicialAutoNull != _cast.inventarioInicialAutoNull) {
			return false;
		}
		
		if (inventarioInicialAutoModified != _cast.inventarioInicialAutoModified) {
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
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (diasCorte != null) {
			_hashCode = 29 * _hashCode + diasCorte.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (diasCorteModified ? 1 : 0);
		if (horaCorte != null) {
			_hashCode = 29 * _hashCode + horaCorte.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (horaCorteModified ? 1 : 0);
		_hashCode = 29 * _hashCode + inventarioInicialAuto;
		_hashCode = 29 * _hashCode + (inventarioInicialAutoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (inventarioInicialAutoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpresaConfigPk
	 */
	public EmpresaConfigPk createPk()
	{
		return new EmpresaConfigPk(idEmpresa);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.EmpresaConfig: " );
		ret.append( "idEmpresa=" + idEmpresa );
		ret.append( ", diasCorte=" + diasCorte );
		ret.append( ", horaCorte=" + horaCorte );
		ret.append( ", inventarioInicialAuto=" + inventarioInicialAuto );
		return ret.toString();
	}

}
