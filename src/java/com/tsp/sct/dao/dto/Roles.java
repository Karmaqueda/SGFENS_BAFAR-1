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

public class Roles implements Serializable
{
	/** 
	 * This attribute maps to the column ID_ROLES in the roles table.
	 */
	protected int idRoles;

	/** 
	 * This attribute represents whether the attribute idRoles has been modified since being read from the database.
	 */
	protected boolean idRolesModified = false;

	/** 
	 * This attribute maps to the column NOMBRE in the roles table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column DESCRIPCION in the roles table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column OCULTO in the roles table.
	 */
	protected short oculto;

	/** 
	 * This attribute represents whether the primitive attribute oculto is null.
	 */
	protected boolean ocultoNull = true;

	/** 
	 * This attribute represents whether the attribute oculto has been modified since being read from the database.
	 */
	protected boolean ocultoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the roles table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column MOSTRAR_PRETORIANO in the roles table.
	 */
	protected int mostrarPretoriano;

	/** 
	 * This attribute represents whether the primitive attribute mostrarPretoriano is null.
	 */
	protected boolean mostrarPretorianoNull = true;

	/** 
	 * This attribute represents whether the attribute mostrarPretoriano has been modified since being read from the database.
	 */
	protected boolean mostrarPretorianoModified = false;

	/**
	 * Method 'Roles'
	 * 
	 */
	public Roles()
	{
	}

	/**
	 * Method 'getIdRoles'
	 * 
	 * @return int
	 */
	public int getIdRoles()
	{
		return idRoles;
	}

	/**
	 * Method 'setIdRoles'
	 * 
	 * @param idRoles
	 */
	public void setIdRoles(int idRoles)
	{
		this.idRoles = idRoles;
		this.idRolesModified = true;
	}

	/** 
	 * Sets the value of idRolesModified
	 */
	public void setIdRolesModified(boolean idRolesModified)
	{
		this.idRolesModified = idRolesModified;
	}

	/** 
	 * Gets the value of idRolesModified
	 */
	public boolean isIdRolesModified()
	{
		return idRolesModified;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
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
	 * Method 'getOculto'
	 * 
	 * @return short
	 */
	public short getOculto()
	{
		return oculto;
	}

	/**
	 * Method 'setOculto'
	 * 
	 * @param oculto
	 */
	public void setOculto(short oculto)
	{
		this.oculto = oculto;
		this.ocultoNull = false;
		this.ocultoModified = true;
	}

	/**
	 * Method 'setOcultoNull'
	 * 
	 * @param value
	 */
	public void setOcultoNull(boolean value)
	{
		this.ocultoNull = value;
		this.ocultoModified = true;
	}

	/**
	 * Method 'isOcultoNull'
	 * 
	 * @return boolean
	 */
	public boolean isOcultoNull()
	{
		return ocultoNull;
	}

	/** 
	 * Sets the value of ocultoModified
	 */
	public void setOcultoModified(boolean ocultoModified)
	{
		this.ocultoModified = ocultoModified;
	}

	/** 
	 * Gets the value of ocultoModified
	 */
	public boolean isOcultoModified()
	{
		return ocultoModified;
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
	 * Method 'getMostrarPretoriano'
	 * 
	 * @return int
	 */
	public int getMostrarPretoriano()
	{
		return mostrarPretoriano;
	}

	/**
	 * Method 'setMostrarPretoriano'
	 * 
	 * @param mostrarPretoriano
	 */
	public void setMostrarPretoriano(int mostrarPretoriano)
	{
		this.mostrarPretoriano = mostrarPretoriano;
		this.mostrarPretorianoNull = false;
		this.mostrarPretorianoModified = true;
	}

	/**
	 * Method 'setMostrarPretorianoNull'
	 * 
	 * @param value
	 */
	public void setMostrarPretorianoNull(boolean value)
	{
		this.mostrarPretorianoNull = value;
		this.mostrarPretorianoModified = true;
	}

	/**
	 * Method 'isMostrarPretorianoNull'
	 * 
	 * @return boolean
	 */
	public boolean isMostrarPretorianoNull()
	{
		return mostrarPretorianoNull;
	}

	/** 
	 * Sets the value of mostrarPretorianoModified
	 */
	public void setMostrarPretorianoModified(boolean mostrarPretorianoModified)
	{
		this.mostrarPretorianoModified = mostrarPretorianoModified;
	}

	/** 
	 * Gets the value of mostrarPretorianoModified
	 */
	public boolean isMostrarPretorianoModified()
	{
		return mostrarPretorianoModified;
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
		
		if (!(_other instanceof Roles)) {
			return false;
		}
		
		final Roles _cast = (Roles) _other;
		if (idRoles != _cast.idRoles) {
			return false;
		}
		
		if (idRolesModified != _cast.idRolesModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (oculto != _cast.oculto) {
			return false;
		}
		
		if (ocultoNull != _cast.ocultoNull) {
			return false;
		}
		
		if (ocultoModified != _cast.ocultoModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (mostrarPretoriano != _cast.mostrarPretoriano) {
			return false;
		}
		
		if (mostrarPretorianoNull != _cast.mostrarPretorianoNull) {
			return false;
		}
		
		if (mostrarPretorianoModified != _cast.mostrarPretorianoModified) {
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
		_hashCode = 29 * _hashCode + idRoles;
		_hashCode = 29 * _hashCode + (idRolesModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) oculto;
		_hashCode = 29 * _hashCode + (ocultoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (ocultoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + mostrarPretoriano;
		_hashCode = 29 * _hashCode + (mostrarPretorianoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (mostrarPretorianoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RolesPk
	 */
	public RolesPk createPk()
	{
		return new RolesPk(idRoles);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Roles: " );
		ret.append( "idRoles=" + idRoles );
		ret.append( ", nombre=" + nombre );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", oculto=" + oculto );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", mostrarPretoriano=" + mostrarPretoriano );
		return ret.toString();
	}

}
