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

public class NominaDeduccion implements Serializable
{
	/** 
	 * This attribute maps to the column ID_NOMINA_DEDUCCION in the nomina_deduccion table.
	 */
	protected int idNominaDeduccion;

	/** 
	 * This attribute represents whether the attribute idNominaDeduccion has been modified since being read from the database.
	 */
	protected boolean idNominaDeduccionModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the nomina_deduccion table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the nomina_deduccion table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/** 
	 * This attribute maps to the column ID_NOMINA_TIPO_DEDUCCION in the nomina_deduccion table.
	 */
	protected int idNominaTipoDeduccion;

	/** 
	 * This attribute represents whether the primitive attribute idNominaTipoDeduccion is null.
	 */
	protected boolean idNominaTipoDeduccionNull = true;

	/** 
	 * This attribute represents whether the attribute idNominaTipoDeduccion has been modified since being read from the database.
	 */
	protected boolean idNominaTipoDeduccionModified = false;

	/** 
	 * This attribute maps to the column CLAVE in the nomina_deduccion table.
	 */
	protected String clave;

	/** 
	 * This attribute represents whether the attribute clave has been modified since being read from the database.
	 */
	protected boolean claveModified = false;

	/** 
	 * This attribute maps to the column CONCEPTO in the nomina_deduccion table.
	 */
	protected String concepto;

	/** 
	 * This attribute represents whether the attribute concepto has been modified since being read from the database.
	 */
	protected boolean conceptoModified = false;

	/** 
	 * This attribute maps to the column IMPORTE_GRAVADO in the nomina_deduccion table.
	 */
	protected double importeGravado;

	/** 
	 * This attribute represents whether the primitive attribute importeGravado is null.
	 */
	protected boolean importeGravadoNull = true;

	/** 
	 * This attribute represents whether the attribute importeGravado has been modified since being read from the database.
	 */
	protected boolean importeGravadoModified = false;

	/** 
	 * This attribute maps to the column IMPORTE_EXCEPTO in the nomina_deduccion table.
	 */
	protected double importeExcepto;

	/** 
	 * This attribute represents whether the primitive attribute importeExcepto is null.
	 */
	protected boolean importeExceptoNull = true;

	/** 
	 * This attribute represents whether the attribute importeExcepto has been modified since being read from the database.
	 */
	protected boolean importeExceptoModified = false;

	/**
	 * Method 'NominaDeduccion'
	 * 
	 */
	public NominaDeduccion()
	{
	}

	/**
	 * Method 'getIdNominaDeduccion'
	 * 
	 * @return int
	 */
	public int getIdNominaDeduccion()
	{
		return idNominaDeduccion;
	}

	/**
	 * Method 'setIdNominaDeduccion'
	 * 
	 * @param idNominaDeduccion
	 */
	public void setIdNominaDeduccion(int idNominaDeduccion)
	{
		this.idNominaDeduccion = idNominaDeduccion;
		this.idNominaDeduccionModified = true;
	}

	/** 
	 * Sets the value of idNominaDeduccionModified
	 */
	public void setIdNominaDeduccionModified(boolean idNominaDeduccionModified)
	{
		this.idNominaDeduccionModified = idNominaDeduccionModified;
	}

	/** 
	 * Gets the value of idNominaDeduccionModified
	 */
	public boolean isIdNominaDeduccionModified()
	{
		return idNominaDeduccionModified;
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
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
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
	 * Method 'getIdNominaTipoDeduccion'
	 * 
	 * @return int
	 */
	public int getIdNominaTipoDeduccion()
	{
		return idNominaTipoDeduccion;
	}

	/**
	 * Method 'setIdNominaTipoDeduccion'
	 * 
	 * @param idNominaTipoDeduccion
	 */
	public void setIdNominaTipoDeduccion(int idNominaTipoDeduccion)
	{
		this.idNominaTipoDeduccion = idNominaTipoDeduccion;
		this.idNominaTipoDeduccionNull = false;
		this.idNominaTipoDeduccionModified = true;
	}

	/**
	 * Method 'setIdNominaTipoDeduccionNull'
	 * 
	 * @param value
	 */
	public void setIdNominaTipoDeduccionNull(boolean value)
	{
		this.idNominaTipoDeduccionNull = value;
		this.idNominaTipoDeduccionModified = true;
	}

	/**
	 * Method 'isIdNominaTipoDeduccionNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdNominaTipoDeduccionNull()
	{
		return idNominaTipoDeduccionNull;
	}

	/** 
	 * Sets the value of idNominaTipoDeduccionModified
	 */
	public void setIdNominaTipoDeduccionModified(boolean idNominaTipoDeduccionModified)
	{
		this.idNominaTipoDeduccionModified = idNominaTipoDeduccionModified;
	}

	/** 
	 * Gets the value of idNominaTipoDeduccionModified
	 */
	public boolean isIdNominaTipoDeduccionModified()
	{
		return idNominaTipoDeduccionModified;
	}

	/**
	 * Method 'getClave'
	 * 
	 * @return String
	 */
	public String getClave()
	{
		return clave;
	}

	/**
	 * Method 'setClave'
	 * 
	 * @param clave
	 */
	public void setClave(String clave)
	{
		this.clave = clave;
		this.claveModified = true;
	}

	/** 
	 * Sets the value of claveModified
	 */
	public void setClaveModified(boolean claveModified)
	{
		this.claveModified = claveModified;
	}

	/** 
	 * Gets the value of claveModified
	 */
	public boolean isClaveModified()
	{
		return claveModified;
	}

	/**
	 * Method 'getConcepto'
	 * 
	 * @return String
	 */
	public String getConcepto()
	{
		return concepto;
	}

	/**
	 * Method 'setConcepto'
	 * 
	 * @param concepto
	 */
	public void setConcepto(String concepto)
	{
		this.concepto = concepto;
		this.conceptoModified = true;
	}

	/** 
	 * Sets the value of conceptoModified
	 */
	public void setConceptoModified(boolean conceptoModified)
	{
		this.conceptoModified = conceptoModified;
	}

	/** 
	 * Gets the value of conceptoModified
	 */
	public boolean isConceptoModified()
	{
		return conceptoModified;
	}

	/**
	 * Method 'getImporteGravado'
	 * 
	 * @return double
	 */
	public double getImporteGravado()
	{
		return importeGravado;
	}

	/**
	 * Method 'setImporteGravado'
	 * 
	 * @param importeGravado
	 */
	public void setImporteGravado(double importeGravado)
	{
		this.importeGravado = importeGravado;
		this.importeGravadoNull = false;
		this.importeGravadoModified = true;
	}

	/**
	 * Method 'setImporteGravadoNull'
	 * 
	 * @param value
	 */
	public void setImporteGravadoNull(boolean value)
	{
		this.importeGravadoNull = value;
		this.importeGravadoModified = true;
	}

	/**
	 * Method 'isImporteGravadoNull'
	 * 
	 * @return boolean
	 */
	public boolean isImporteGravadoNull()
	{
		return importeGravadoNull;
	}

	/** 
	 * Sets the value of importeGravadoModified
	 */
	public void setImporteGravadoModified(boolean importeGravadoModified)
	{
		this.importeGravadoModified = importeGravadoModified;
	}

	/** 
	 * Gets the value of importeGravadoModified
	 */
	public boolean isImporteGravadoModified()
	{
		return importeGravadoModified;
	}

	/**
	 * Method 'getImporteExcepto'
	 * 
	 * @return double
	 */
	public double getImporteExcepto()
	{
		return importeExcepto;
	}

	/**
	 * Method 'setImporteExcepto'
	 * 
	 * @param importeExcepto
	 */
	public void setImporteExcepto(double importeExcepto)
	{
		this.importeExcepto = importeExcepto;
		this.importeExceptoNull = false;
		this.importeExceptoModified = true;
	}

	/**
	 * Method 'setImporteExceptoNull'
	 * 
	 * @param value
	 */
	public void setImporteExceptoNull(boolean value)
	{
		this.importeExceptoNull = value;
		this.importeExceptoModified = true;
	}

	/**
	 * Method 'isImporteExceptoNull'
	 * 
	 * @return boolean
	 */
	public boolean isImporteExceptoNull()
	{
		return importeExceptoNull;
	}

	/** 
	 * Sets the value of importeExceptoModified
	 */
	public void setImporteExceptoModified(boolean importeExceptoModified)
	{
		this.importeExceptoModified = importeExceptoModified;
	}

	/** 
	 * Gets the value of importeExceptoModified
	 */
	public boolean isImporteExceptoModified()
	{
		return importeExceptoModified;
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
		
		if (!(_other instanceof NominaDeduccion)) {
			return false;
		}
		
		final NominaDeduccion _cast = (NominaDeduccion) _other;
		if (idNominaDeduccion != _cast.idNominaDeduccion) {
			return false;
		}
		
		if (idNominaDeduccionModified != _cast.idNominaDeduccionModified) {
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
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
			return false;
		}
		
		if (idNominaTipoDeduccion != _cast.idNominaTipoDeduccion) {
			return false;
		}
		
		if (idNominaTipoDeduccionNull != _cast.idNominaTipoDeduccionNull) {
			return false;
		}
		
		if (idNominaTipoDeduccionModified != _cast.idNominaTipoDeduccionModified) {
			return false;
		}
		
		if (clave == null ? _cast.clave != clave : !clave.equals( _cast.clave )) {
			return false;
		}
		
		if (claveModified != _cast.claveModified) {
			return false;
		}
		
		if (concepto == null ? _cast.concepto != concepto : !concepto.equals( _cast.concepto )) {
			return false;
		}
		
		if (conceptoModified != _cast.conceptoModified) {
			return false;
		}
		
		if (importeGravado != _cast.importeGravado) {
			return false;
		}
		
		if (importeGravadoNull != _cast.importeGravadoNull) {
			return false;
		}
		
		if (importeGravadoModified != _cast.importeGravadoModified) {
			return false;
		}
		
		if (importeExcepto != _cast.importeExcepto) {
			return false;
		}
		
		if (importeExceptoNull != _cast.importeExceptoNull) {
			return false;
		}
		
		if (importeExceptoModified != _cast.importeExceptoModified) {
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
		_hashCode = 29 * _hashCode + idNominaDeduccion;
		_hashCode = 29 * _hashCode + (idNominaDeduccionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idNominaTipoDeduccion;
		_hashCode = 29 * _hashCode + (idNominaTipoDeduccionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idNominaTipoDeduccionModified ? 1 : 0);
		if (clave != null) {
			_hashCode = 29 * _hashCode + clave.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (claveModified ? 1 : 0);
		if (concepto != null) {
			_hashCode = 29 * _hashCode + concepto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (conceptoModified ? 1 : 0);
		long temp_importeGravado = Double.doubleToLongBits(importeGravado);
		_hashCode = 29 * _hashCode + (int) (temp_importeGravado ^ (temp_importeGravado >>> 32));
		_hashCode = 29 * _hashCode + (importeGravadoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (importeGravadoModified ? 1 : 0);
		long temp_importeExcepto = Double.doubleToLongBits(importeExcepto);
		_hashCode = 29 * _hashCode + (int) (temp_importeExcepto ^ (temp_importeExcepto >>> 32));
		_hashCode = 29 * _hashCode + (importeExceptoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (importeExceptoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NominaDeduccionPk
	 */
	public NominaDeduccionPk createPk()
	{
		return new NominaDeduccionPk(idNominaDeduccion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.NominaDeduccion: " );
		ret.append( "idNominaDeduccion=" + idNominaDeduccion );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", idNominaTipoDeduccion=" + idNominaTipoDeduccion );
		ret.append( ", clave=" + clave );
		ret.append( ", concepto=" + concepto );
		ret.append( ", importeGravado=" + importeGravado );
		ret.append( ", importeExcepto=" + importeExcepto );
		return ret.toString();
	}

}
