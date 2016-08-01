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

public class SgfensCorreoBandejaEnvio implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CORREO in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected int idCorreo;

	/** 
	 * This attribute represents whether the attribute idCorreo has been modified since being read from the database.
	 */
	protected boolean idCorreoModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column DESTINATARIO in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected String destinatario;

	/** 
	 * This attribute represents whether the attribute destinatario has been modified since being read from the database.
	 */
	protected boolean destinatarioModified = false;

	/** 
	 * This attribute maps to the column DESTINATARIO_CC in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected String destinatarioCc;

	/** 
	 * This attribute represents whether the attribute destinatarioCc has been modified since being read from the database.
	 */
	protected boolean destinatarioCcModified = false;

	/** 
	 * This attribute maps to the column DESTINATARIO_CCO in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected String destinatarioCco;

	/** 
	 * This attribute represents whether the attribute destinatarioCco has been modified since being read from the database.
	 */
	protected boolean destinatarioCcoModified = false;

	/** 
	 * This attribute maps to the column ASUNTO in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected String asunto;

	/** 
	 * This attribute represents whether the attribute asunto has been modified since being read from the database.
	 */
	protected boolean asuntoModified = false;

	/** 
	 * This attribute maps to the column CONTENIDO in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected String contenido;

	/** 
	 * This attribute represents whether the attribute contenido has been modified since being read from the database.
	 */
	protected boolean contenidoModified = false;

	/** 
	 * This attribute maps to the column ARCHIVOS_ADJUNTOS_ID in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected String archivosAdjuntosId;

	/** 
	 * This attribute represents whether the attribute archivosAdjuntosId has been modified since being read from the database.
	 */
	protected boolean archivosAdjuntosIdModified = false;

	/** 
	 * This attribute maps to the column FECHA_ORIGINAL in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected Date fechaOriginal;

	/** 
	 * This attribute represents whether the attribute fechaOriginal has been modified since being read from the database.
	 */
	protected boolean fechaOriginalModified = false;

	/** 
	 * This attribute maps to the column IS_ENVIADO in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected short isEnviado;

	/** 
	 * This attribute represents whether the attribute isEnviado has been modified since being read from the database.
	 */
	protected boolean isEnviadoModified = false;

	/** 
	 * This attribute maps to the column FECHA_ENVIO in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	protected Date fechaEnvio;

	/** 
	 * This attribute represents whether the attribute fechaEnvio has been modified since being read from the database.
	 */
	protected boolean fechaEnvioModified = false;

	/**
	 * Method 'SgfensCorreoBandejaEnvio'
	 * 
	 */
	public SgfensCorreoBandejaEnvio()
	{
	}

	/**
	 * Method 'getIdCorreo'
	 * 
	 * @return int
	 */
	public int getIdCorreo()
	{
		return idCorreo;
	}

	/**
	 * Method 'setIdCorreo'
	 * 
	 * @param idCorreo
	 */
	public void setIdCorreo(int idCorreo)
	{
		this.idCorreo = idCorreo;
		this.idCorreoModified = true;
	}

	/** 
	 * Sets the value of idCorreoModified
	 */
	public void setIdCorreoModified(boolean idCorreoModified)
	{
		this.idCorreoModified = idCorreoModified;
	}

	/** 
	 * Gets the value of idCorreoModified
	 */
	public boolean isIdCorreoModified()
	{
		return idCorreoModified;
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
	 * Method 'getDestinatario'
	 * 
	 * @return String
	 */
	public String getDestinatario()
	{
		return destinatario;
	}

	/**
	 * Method 'setDestinatario'
	 * 
	 * @param destinatario
	 */
	public void setDestinatario(String destinatario)
	{
		this.destinatario = destinatario;
		this.destinatarioModified = true;
	}

	/** 
	 * Sets the value of destinatarioModified
	 */
	public void setDestinatarioModified(boolean destinatarioModified)
	{
		this.destinatarioModified = destinatarioModified;
	}

	/** 
	 * Gets the value of destinatarioModified
	 */
	public boolean isDestinatarioModified()
	{
		return destinatarioModified;
	}

	/**
	 * Method 'getDestinatarioCc'
	 * 
	 * @return String
	 */
	public String getDestinatarioCc()
	{
		return destinatarioCc;
	}

	/**
	 * Method 'setDestinatarioCc'
	 * 
	 * @param destinatarioCc
	 */
	public void setDestinatarioCc(String destinatarioCc)
	{
		this.destinatarioCc = destinatarioCc;
		this.destinatarioCcModified = true;
	}

	/** 
	 * Sets the value of destinatarioCcModified
	 */
	public void setDestinatarioCcModified(boolean destinatarioCcModified)
	{
		this.destinatarioCcModified = destinatarioCcModified;
	}

	/** 
	 * Gets the value of destinatarioCcModified
	 */
	public boolean isDestinatarioCcModified()
	{
		return destinatarioCcModified;
	}

	/**
	 * Method 'getDestinatarioCco'
	 * 
	 * @return String
	 */
	public String getDestinatarioCco()
	{
		return destinatarioCco;
	}

	/**
	 * Method 'setDestinatarioCco'
	 * 
	 * @param destinatarioCco
	 */
	public void setDestinatarioCco(String destinatarioCco)
	{
		this.destinatarioCco = destinatarioCco;
		this.destinatarioCcoModified = true;
	}

	/** 
	 * Sets the value of destinatarioCcoModified
	 */
	public void setDestinatarioCcoModified(boolean destinatarioCcoModified)
	{
		this.destinatarioCcoModified = destinatarioCcoModified;
	}

	/** 
	 * Gets the value of destinatarioCcoModified
	 */
	public boolean isDestinatarioCcoModified()
	{
		return destinatarioCcoModified;
	}

	/**
	 * Method 'getAsunto'
	 * 
	 * @return String
	 */
	public String getAsunto()
	{
		return asunto;
	}

	/**
	 * Method 'setAsunto'
	 * 
	 * @param asunto
	 */
	public void setAsunto(String asunto)
	{
		this.asunto = asunto;
		this.asuntoModified = true;
	}

	/** 
	 * Sets the value of asuntoModified
	 */
	public void setAsuntoModified(boolean asuntoModified)
	{
		this.asuntoModified = asuntoModified;
	}

	/** 
	 * Gets the value of asuntoModified
	 */
	public boolean isAsuntoModified()
	{
		return asuntoModified;
	}

	/**
	 * Method 'getContenido'
	 * 
	 * @return String
	 */
	public String getContenido()
	{
		return contenido;
	}

	/**
	 * Method 'setContenido'
	 * 
	 * @param contenido
	 */
	public void setContenido(String contenido)
	{
		this.contenido = contenido;
		this.contenidoModified = true;
	}

	/** 
	 * Sets the value of contenidoModified
	 */
	public void setContenidoModified(boolean contenidoModified)
	{
		this.contenidoModified = contenidoModified;
	}

	/** 
	 * Gets the value of contenidoModified
	 */
	public boolean isContenidoModified()
	{
		return contenidoModified;
	}

	/**
	 * Method 'getArchivosAdjuntosId'
	 * 
	 * @return String
	 */
	public String getArchivosAdjuntosId()
	{
		return archivosAdjuntosId;
	}

	/**
	 * Method 'setArchivosAdjuntosId'
	 * 
	 * @param archivosAdjuntosId
	 */
	public void setArchivosAdjuntosId(String archivosAdjuntosId)
	{
		this.archivosAdjuntosId = archivosAdjuntosId;
		this.archivosAdjuntosIdModified = true;
	}

	/** 
	 * Sets the value of archivosAdjuntosIdModified
	 */
	public void setArchivosAdjuntosIdModified(boolean archivosAdjuntosIdModified)
	{
		this.archivosAdjuntosIdModified = archivosAdjuntosIdModified;
	}

	/** 
	 * Gets the value of archivosAdjuntosIdModified
	 */
	public boolean isArchivosAdjuntosIdModified()
	{
		return archivosAdjuntosIdModified;
	}

	/**
	 * Method 'getFechaOriginal'
	 * 
	 * @return Date
	 */
	public Date getFechaOriginal()
	{
		return fechaOriginal;
	}

	/**
	 * Method 'setFechaOriginal'
	 * 
	 * @param fechaOriginal
	 */
	public void setFechaOriginal(Date fechaOriginal)
	{
		this.fechaOriginal = fechaOriginal;
		this.fechaOriginalModified = true;
	}

	/** 
	 * Sets the value of fechaOriginalModified
	 */
	public void setFechaOriginalModified(boolean fechaOriginalModified)
	{
		this.fechaOriginalModified = fechaOriginalModified;
	}

	/** 
	 * Gets the value of fechaOriginalModified
	 */
	public boolean isFechaOriginalModified()
	{
		return fechaOriginalModified;
	}

	/**
	 * Method 'getIsEnviado'
	 * 
	 * @return short
	 */
	public short getIsEnviado()
	{
		return isEnviado;
	}

	/**
	 * Method 'setIsEnviado'
	 * 
	 * @param isEnviado
	 */
	public void setIsEnviado(short isEnviado)
	{
		this.isEnviado = isEnviado;
		this.isEnviadoModified = true;
	}

	/** 
	 * Sets the value of isEnviadoModified
	 */
	public void setIsEnviadoModified(boolean isEnviadoModified)
	{
		this.isEnviadoModified = isEnviadoModified;
	}

	/** 
	 * Gets the value of isEnviadoModified
	 */
	public boolean isIsEnviadoModified()
	{
		return isEnviadoModified;
	}

	/**
	 * Method 'getFechaEnvio'
	 * 
	 * @return Date
	 */
	public Date getFechaEnvio()
	{
		return fechaEnvio;
	}

	/**
	 * Method 'setFechaEnvio'
	 * 
	 * @param fechaEnvio
	 */
	public void setFechaEnvio(Date fechaEnvio)
	{
		this.fechaEnvio = fechaEnvio;
		this.fechaEnvioModified = true;
	}

	/** 
	 * Sets the value of fechaEnvioModified
	 */
	public void setFechaEnvioModified(boolean fechaEnvioModified)
	{
		this.fechaEnvioModified = fechaEnvioModified;
	}

	/** 
	 * Gets the value of fechaEnvioModified
	 */
	public boolean isFechaEnvioModified()
	{
		return fechaEnvioModified;
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
		
		if (!(_other instanceof SgfensCorreoBandejaEnvio)) {
			return false;
		}
		
		final SgfensCorreoBandejaEnvio _cast = (SgfensCorreoBandejaEnvio) _other;
		if (idCorreo != _cast.idCorreo) {
			return false;
		}
		
		if (idCorreoModified != _cast.idCorreoModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (destinatario == null ? _cast.destinatario != destinatario : !destinatario.equals( _cast.destinatario )) {
			return false;
		}
		
		if (destinatarioModified != _cast.destinatarioModified) {
			return false;
		}
		
		if (destinatarioCc == null ? _cast.destinatarioCc != destinatarioCc : !destinatarioCc.equals( _cast.destinatarioCc )) {
			return false;
		}
		
		if (destinatarioCcModified != _cast.destinatarioCcModified) {
			return false;
		}
		
		if (destinatarioCco == null ? _cast.destinatarioCco != destinatarioCco : !destinatarioCco.equals( _cast.destinatarioCco )) {
			return false;
		}
		
		if (destinatarioCcoModified != _cast.destinatarioCcoModified) {
			return false;
		}
		
		if (asunto == null ? _cast.asunto != asunto : !asunto.equals( _cast.asunto )) {
			return false;
		}
		
		if (asuntoModified != _cast.asuntoModified) {
			return false;
		}
		
		if (contenido == null ? _cast.contenido != contenido : !contenido.equals( _cast.contenido )) {
			return false;
		}
		
		if (contenidoModified != _cast.contenidoModified) {
			return false;
		}
		
		if (archivosAdjuntosId == null ? _cast.archivosAdjuntosId != archivosAdjuntosId : !archivosAdjuntosId.equals( _cast.archivosAdjuntosId )) {
			return false;
		}
		
		if (archivosAdjuntosIdModified != _cast.archivosAdjuntosIdModified) {
			return false;
		}
		
		if (fechaOriginal == null ? _cast.fechaOriginal != fechaOriginal : !fechaOriginal.equals( _cast.fechaOriginal )) {
			return false;
		}
		
		if (fechaOriginalModified != _cast.fechaOriginalModified) {
			return false;
		}
		
		if (isEnviado != _cast.isEnviado) {
			return false;
		}
		
		if (isEnviadoModified != _cast.isEnviadoModified) {
			return false;
		}
		
		if (fechaEnvio == null ? _cast.fechaEnvio != fechaEnvio : !fechaEnvio.equals( _cast.fechaEnvio )) {
			return false;
		}
		
		if (fechaEnvioModified != _cast.fechaEnvioModified) {
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
		_hashCode = 29 * _hashCode + idCorreo;
		_hashCode = 29 * _hashCode + (idCorreoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (destinatario != null) {
			_hashCode = 29 * _hashCode + destinatario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (destinatarioModified ? 1 : 0);
		if (destinatarioCc != null) {
			_hashCode = 29 * _hashCode + destinatarioCc.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (destinatarioCcModified ? 1 : 0);
		if (destinatarioCco != null) {
			_hashCode = 29 * _hashCode + destinatarioCco.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (destinatarioCcoModified ? 1 : 0);
		if (asunto != null) {
			_hashCode = 29 * _hashCode + asunto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (asuntoModified ? 1 : 0);
		if (contenido != null) {
			_hashCode = 29 * _hashCode + contenido.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (contenidoModified ? 1 : 0);
		if (archivosAdjuntosId != null) {
			_hashCode = 29 * _hashCode + archivosAdjuntosId.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (archivosAdjuntosIdModified ? 1 : 0);
		if (fechaOriginal != null) {
			_hashCode = 29 * _hashCode + fechaOriginal.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaOriginalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) isEnviado;
		_hashCode = 29 * _hashCode + (isEnviadoModified ? 1 : 0);
		if (fechaEnvio != null) {
			_hashCode = 29 * _hashCode + fechaEnvio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaEnvioModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensCorreoBandejaEnvioPk
	 */
	public SgfensCorreoBandejaEnvioPk createPk()
	{
		return new SgfensCorreoBandejaEnvioPk(idCorreo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensCorreoBandejaEnvio: " );
		ret.append( "idCorreo=" + idCorreo );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", destinatario=" + destinatario );
		ret.append( ", destinatarioCc=" + destinatarioCc );
		ret.append( ", destinatarioCco=" + destinatarioCco );
		ret.append( ", asunto=" + asunto );
		ret.append( ", contenido=" + contenido );
		ret.append( ", archivosAdjuntosId=" + archivosAdjuntosId );
		ret.append( ", fechaOriginal=" + fechaOriginal );
		ret.append( ", isEnviado=" + isEnviado );
		ret.append( ", fechaEnvio=" + fechaEnvio );
		return ret.toString();
	}

}
