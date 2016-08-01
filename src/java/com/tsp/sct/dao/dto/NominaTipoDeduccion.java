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

public class NominaTipoDeduccion implements Serializable
{
	/** 
	 * This attribute maps to the column ID_TIPO_DEDUCCION in the nomina_tipo_deduccion table.
	 */
	protected int idTipoDeduccion;

	/** 
	 * This attribute represents whether the attribute idTipoDeduccion has been modified since being read from the database.
	 */
	protected boolean idTipoDeduccionModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the nomina_tipo_deduccion table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column CLAVE in the nomina_tipo_deduccion table.
	 */
	protected String clave;

	/** 
	 * This attribute represents whether the attribute clave has been modified since being read from the database.
	 */
	protected boolean claveModified = false;

	/** 
	 * This attribute maps to the column COMENTARIO in the nomina_tipo_deduccion table.
	 */
	protected String comentario;

	/** 
	 * This attribute represents whether the attribute comentario has been modified since being read from the database.
	 */
	protected boolean comentarioModified = false;

	/**
	 * Method 'NominaTipoDeduccion'
	 * 
	 */
	public NominaTipoDeduccion()
	{
	}

	/**
	 * Method 'getIdTipoDeduccion'
	 * 
	 * @return int
	 */
	public int getIdTipoDeduccion()
	{
		return idTipoDeduccion;
	}

	/**
	 * Method 'setIdTipoDeduccion'
	 * 
	 * @param idTipoDeduccion
	 */
	public void setIdTipoDeduccion(int idTipoDeduccion)
	{
		this.idTipoDeduccion = idTipoDeduccion;
		this.idTipoDeduccionModified = true;
	}

	/** 
	 * Sets the value of idTipoDeduccionModified
	 */
	public void setIdTipoDeduccionModified(boolean idTipoDeduccionModified)
	{
		this.idTipoDeduccionModified = idTipoDeduccionModified;
	}

	/** 
	 * Gets the value of idTipoDeduccionModified
	 */
	public boolean isIdTipoDeduccionModified()
	{
		return idTipoDeduccionModified;
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
	 * Method 'getComentario'
	 * 
	 * @return String
	 */
	public String getComentario()
	{
		return comentario;
	}

	/**
	 * Method 'setComentario'
	 * 
	 * @param comentario
	 */
	public void setComentario(String comentario)
	{
		this.comentario = comentario;
		this.comentarioModified = true;
	}

	/** 
	 * Sets the value of comentarioModified
	 */
	public void setComentarioModified(boolean comentarioModified)
	{
		this.comentarioModified = comentarioModified;
	}

	/** 
	 * Gets the value of comentarioModified
	 */
	public boolean isComentarioModified()
	{
		return comentarioModified;
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
		
		if (!(_other instanceof NominaTipoDeduccion)) {
			return false;
		}
		
		final NominaTipoDeduccion _cast = (NominaTipoDeduccion) _other;
		if (idTipoDeduccion != _cast.idTipoDeduccion) {
			return false;
		}
		
		if (idTipoDeduccionModified != _cast.idTipoDeduccionModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (clave == null ? _cast.clave != clave : !clave.equals( _cast.clave )) {
			return false;
		}
		
		if (claveModified != _cast.claveModified) {
			return false;
		}
		
		if (comentario == null ? _cast.comentario != comentario : !comentario.equals( _cast.comentario )) {
			return false;
		}
		
		if (comentarioModified != _cast.comentarioModified) {
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
		_hashCode = 29 * _hashCode + idTipoDeduccion;
		_hashCode = 29 * _hashCode + (idTipoDeduccionModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		if (clave != null) {
			_hashCode = 29 * _hashCode + clave.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (claveModified ? 1 : 0);
		if (comentario != null) {
			_hashCode = 29 * _hashCode + comentario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (comentarioModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NominaTipoDeduccionPk
	 */
	public NominaTipoDeduccionPk createPk()
	{
		return new NominaTipoDeduccionPk(idTipoDeduccion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.NominaTipoDeduccion: " );
		ret.append( "idTipoDeduccion=" + idTipoDeduccion );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", clave=" + clave );
		ret.append( ", comentario=" + comentario );
		return ret.toString();
	}

}
