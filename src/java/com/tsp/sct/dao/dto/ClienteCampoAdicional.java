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

public class ClienteCampoAdicional implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CLIENTE_CAMPO in the cliente_campo_adicional table.
	 */
	protected int idClienteCampo;

	/** 
	 * This attribute represents whether the attribute idClienteCampo has been modified since being read from the database.
	 */
	protected boolean idClienteCampoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the cliente_campo_adicional table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the cliente_campo_adicional table.
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
	 * This attribute maps to the column LABEL_NOMBRE in the cliente_campo_adicional table.
	 */
	protected String labelNombre;

	/** 
	 * This attribute represents whether the attribute labelNombre has been modified since being read from the database.
	 */
	protected boolean labelNombreModified = false;

	/** 
	 * This attribute maps to the column TIPO_LABEL in the cliente_campo_adicional table.
	 */
	protected int tipoLabel;

	/** 
	 * This attribute represents whether the primitive attribute tipoLabel is null.
	 */
	protected boolean tipoLabelNull = true;

	/** 
	 * This attribute represents whether the attribute tipoLabel has been modified since being read from the database.
	 */
	protected boolean tipoLabelModified = false;

	/**
	 * Method 'ClienteCampoAdicional'
	 * 
	 */
	public ClienteCampoAdicional()
	{
	}

	/**
	 * Method 'getIdClienteCampo'
	 * 
	 * @return int
	 */
	public int getIdClienteCampo()
	{
		return idClienteCampo;
	}

	/**
	 * Method 'setIdClienteCampo'
	 * 
	 * @param idClienteCampo
	 */
	public void setIdClienteCampo(int idClienteCampo)
	{
		this.idClienteCampo = idClienteCampo;
		this.idClienteCampoModified = true;
	}

	/** 
	 * Sets the value of idClienteCampoModified
	 */
	public void setIdClienteCampoModified(boolean idClienteCampoModified)
	{
		this.idClienteCampoModified = idClienteCampoModified;
	}

	/** 
	 * Gets the value of idClienteCampoModified
	 */
	public boolean isIdClienteCampoModified()
	{
		return idClienteCampoModified;
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
	 * Method 'getLabelNombre'
	 * 
	 * @return String
	 */
	public String getLabelNombre()
	{
		return labelNombre;
	}

	/**
	 * Method 'setLabelNombre'
	 * 
	 * @param labelNombre
	 */
	public void setLabelNombre(String labelNombre)
	{
		this.labelNombre = labelNombre;
		this.labelNombreModified = true;
	}

	/** 
	 * Sets the value of labelNombreModified
	 */
	public void setLabelNombreModified(boolean labelNombreModified)
	{
		this.labelNombreModified = labelNombreModified;
	}

	/** 
	 * Gets the value of labelNombreModified
	 */
	public boolean isLabelNombreModified()
	{
		return labelNombreModified;
	}

	/**
	 * Method 'getTipoLabel'
	 * 
	 * @return int
	 */
	public int getTipoLabel()
	{
		return tipoLabel;
	}

	/**
	 * Method 'setTipoLabel'
	 * 
	 * @param tipoLabel
	 */
	public void setTipoLabel(int tipoLabel)
	{
		this.tipoLabel = tipoLabel;
		this.tipoLabelNull = false;
		this.tipoLabelModified = true;
	}

	/**
	 * Method 'setTipoLabelNull'
	 * 
	 * @param value
	 */
	public void setTipoLabelNull(boolean value)
	{
		this.tipoLabelNull = value;
		this.tipoLabelModified = true;
	}

	/**
	 * Method 'isTipoLabelNull'
	 * 
	 * @return boolean
	 */
	public boolean isTipoLabelNull()
	{
		return tipoLabelNull;
	}

	/** 
	 * Sets the value of tipoLabelModified
	 */
	public void setTipoLabelModified(boolean tipoLabelModified)
	{
		this.tipoLabelModified = tipoLabelModified;
	}

	/** 
	 * Gets the value of tipoLabelModified
	 */
	public boolean isTipoLabelModified()
	{
		return tipoLabelModified;
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
		
		if (!(_other instanceof ClienteCampoAdicional)) {
			return false;
		}
		
		final ClienteCampoAdicional _cast = (ClienteCampoAdicional) _other;
		if (idClienteCampo != _cast.idClienteCampo) {
			return false;
		}
		
		if (idClienteCampoModified != _cast.idClienteCampoModified) {
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
		
		if (labelNombre == null ? _cast.labelNombre != labelNombre : !labelNombre.equals( _cast.labelNombre )) {
			return false;
		}
		
		if (labelNombreModified != _cast.labelNombreModified) {
			return false;
		}
		
		if (tipoLabel != _cast.tipoLabel) {
			return false;
		}
		
		if (tipoLabelNull != _cast.tipoLabelNull) {
			return false;
		}
		
		if (tipoLabelModified != _cast.tipoLabelModified) {
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
		_hashCode = 29 * _hashCode + idClienteCampo;
		_hashCode = 29 * _hashCode + (idClienteCampoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (labelNombre != null) {
			_hashCode = 29 * _hashCode + labelNombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (labelNombreModified ? 1 : 0);
		_hashCode = 29 * _hashCode + tipoLabel;
		_hashCode = 29 * _hashCode + (tipoLabelNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (tipoLabelModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ClienteCampoAdicionalPk
	 */
	public ClienteCampoAdicionalPk createPk()
	{
		return new ClienteCampoAdicionalPk(idClienteCampo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.ClienteCampoAdicional: " );
		ret.append( "idClienteCampo=" + idClienteCampo );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", labelNombre=" + labelNombre );
		ret.append( ", tipoLabel=" + tipoLabel );
		return ret.toString();
	}

}
