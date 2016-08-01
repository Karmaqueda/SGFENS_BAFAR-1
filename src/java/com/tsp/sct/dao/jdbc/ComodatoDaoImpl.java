/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.jdbc;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ComodatoDaoImpl extends AbstractDAO implements ComodatoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT ID_COMODATO, ID_EMPRESA, FECHA_CREACION, NOMBRE, DESCRIPCION, NUMERO_SERIE, MARCA, MODELO, TIPO, CAPACIDAD, ESTADO, ESTATUS, ID_ALMACEN, ID_CLIENTE, FECHA_ASIGNACION_CLIENTE, NOMBRE_RECIBE, DIRECCION_RESGUARDO, ID_USUARIO_VENDEDOR, CONTRATO_NOMBRE_ARCHIVO, FECHA_SUBIDA_CONTRATO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_COMODATO, ID_EMPRESA, FECHA_CREACION, NOMBRE, DESCRIPCION, NUMERO_SERIE, MARCA, MODELO, TIPO, CAPACIDAD, ESTADO, ESTATUS, ID_ALMACEN, ID_CLIENTE, FECHA_ASIGNACION_CLIENTE, NOMBRE_RECIBE, DIRECCION_RESGUARDO, ID_USUARIO_VENDEDOR, CONTRATO_NOMBRE_ARCHIVO, FECHA_SUBIDA_CONTRATO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_COMODATO = ?, ID_EMPRESA = ?, FECHA_CREACION = ?, NOMBRE = ?, DESCRIPCION = ?, NUMERO_SERIE = ?, MARCA = ?, MODELO = ?, TIPO = ?, CAPACIDAD = ?, ESTADO = ?, ESTATUS = ?, ID_ALMACEN = ?, ID_CLIENTE = ?, FECHA_ASIGNACION_CLIENTE = ?, NOMBRE_RECIBE = ?, DIRECCION_RESGUARDO = ?, ID_USUARIO_VENDEDOR = ?, CONTRATO_NOMBRE_ARCHIVO = ?, FECHA_SUBIDA_CONTRATO = ? WHERE ID_COMODATO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_COMODATO = ?";

	/** 
	 * Index of column ID_COMODATO
	 */
	protected static final int COLUMN_ID_COMODATO = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column FECHA_CREACION
	 */
	protected static final int COLUMN_FECHA_CREACION = 3;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 4;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 5;

	/** 
	 * Index of column NUMERO_SERIE
	 */
	protected static final int COLUMN_NUMERO_SERIE = 6;

	/** 
	 * Index of column MARCA
	 */
	protected static final int COLUMN_MARCA = 7;

	/** 
	 * Index of column MODELO
	 */
	protected static final int COLUMN_MODELO = 8;

	/** 
	 * Index of column TIPO
	 */
	protected static final int COLUMN_TIPO = 9;

	/** 
	 * Index of column CAPACIDAD
	 */
	protected static final int COLUMN_CAPACIDAD = 10;

	/** 
	 * Index of column ESTADO
	 */
	protected static final int COLUMN_ESTADO = 11;

	/** 
	 * Index of column ESTATUS
	 */
	protected static final int COLUMN_ESTATUS = 12;

	/** 
	 * Index of column ID_ALMACEN
	 */
	protected static final int COLUMN_ID_ALMACEN = 13;

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 14;

	/** 
	 * Index of column FECHA_ASIGNACION_CLIENTE
	 */
	protected static final int COLUMN_FECHA_ASIGNACION_CLIENTE = 15;

	/** 
	 * Index of column NOMBRE_RECIBE
	 */
	protected static final int COLUMN_NOMBRE_RECIBE = 16;

	/** 
	 * Index of column DIRECCION_RESGUARDO
	 */
	protected static final int COLUMN_DIRECCION_RESGUARDO = 17;

	/** 
	 * Index of column ID_USUARIO_VENDEDOR
	 */
	protected static final int COLUMN_ID_USUARIO_VENDEDOR = 18;

	/** 
	 * Index of column CONTRATO_NOMBRE_ARCHIVO
	 */
	protected static final int COLUMN_CONTRATO_NOMBRE_ARCHIVO = 19;

	/** 
	 * Index of column FECHA_SUBIDA_CONTRATO
	 */
	protected static final int COLUMN_FECHA_SUBIDA_CONTRATO = 20;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 20;

	/** 
	 * Index of primary-key column ID_COMODATO
	 */
	protected static final int PK_COLUMN_ID_COMODATO = 1;

	/** 
	 * Inserts a new row in the comodato table.
	 */
	public ComodatoPk insert(Comodato dto) throws ComodatoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdComodatoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COMODATO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaCreacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_CREACION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DESCRIPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroSerieModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUMERO_SERIE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMarcaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MARCA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isModeloModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MODELO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TIPO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCapacidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CAPACIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEstadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ESTADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdAlmacenModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ALMACEN" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdClienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CLIENTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaAsignacionClienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_ASIGNACION_CLIENTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreRecibeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_RECIBE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDireccionResguardoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIRECCION_RESGUARDO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isContratoNombreArchivoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONTRATO_NOMBRE_ARCHIVO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaSubidaContratoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_SUBIDA_CONTRATO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdComodatoModified()) {
				stmt.setInt( index++, dto.getIdComodato() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isFechaCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaCreacion().getTime() ) );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isNumeroSerieModified()) {
				stmt.setString( index++, dto.getNumeroSerie() );
			}
		
			if (dto.isMarcaModified()) {
				stmt.setString( index++, dto.getMarca() );
			}
		
			if (dto.isModeloModified()) {
				stmt.setString( index++, dto.getModelo() );
			}
		
			if (dto.isTipoModified()) {
				stmt.setString( index++, dto.getTipo() );
			}
		
			if (dto.isCapacidadModified()) {
				stmt.setString( index++, dto.getCapacidad() );
			}
		
			if (dto.isEstadoModified()) {
				if (dto.isEstadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstado() );
				}
		
			}
		
			if (dto.isEstatusModified()) {
				if (dto.isEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstatus() );
				}
		
			}
		
			if (dto.isIdAlmacenModified()) {
				if (dto.isIdAlmacenNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdAlmacen() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			if (dto.isFechaAsignacionClienteModified()) {
				stmt.setTimestamp(index++, dto.getFechaAsignacionCliente()==null ? null : new java.sql.Timestamp( dto.getFechaAsignacionCliente().getTime() ) );
			}
		
			if (dto.isNombreRecibeModified()) {
				stmt.setString( index++, dto.getNombreRecibe() );
			}
		
			if (dto.isDireccionResguardoModified()) {
				stmt.setString( index++, dto.getDireccionResguardo() );
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (dto.isIdUsuarioVendedorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioVendedor() );
				}
		
			}
		
			if (dto.isContratoNombreArchivoModified()) {
				stmt.setString( index++, dto.getContratoNombreArchivo() );
			}
		
			if (dto.isFechaSubidaContratoModified()) {
				stmt.setTimestamp(index++, dto.getFechaSubidaContrato()==null ? null : new java.sql.Timestamp( dto.getFechaSubidaContrato().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdComodato( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the comodato table.
	 */
	public void update(ComodatoPk pk, Comodato dto) throws ComodatoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdComodatoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COMODATO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isFechaCreacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_CREACION=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (dto.isNumeroSerieModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUMERO_SERIE=?" );
				modified=true;
			}
		
			if (dto.isMarcaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MARCA=?" );
				modified=true;
			}
		
			if (dto.isModeloModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MODELO=?" );
				modified=true;
			}
		
			if (dto.isTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TIPO=?" );
				modified=true;
			}
		
			if (dto.isCapacidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CAPACIDAD=?" );
				modified=true;
			}
		
			if (dto.isEstadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ESTADO=?" );
				modified=true;
			}
		
			if (dto.isEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isIdAlmacenModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ALMACEN=?" );
				modified=true;
			}
		
			if (dto.isIdClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLIENTE=?" );
				modified=true;
			}
		
			if (dto.isFechaAsignacionClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_ASIGNACION_CLIENTE=?" );
				modified=true;
			}
		
			if (dto.isNombreRecibeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_RECIBE=?" );
				modified=true;
			}
		
			if (dto.isDireccionResguardoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIRECCION_RESGUARDO=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR=?" );
				modified=true;
			}
		
			if (dto.isContratoNombreArchivoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONTRATO_NOMBRE_ARCHIVO=?" );
				modified=true;
			}
		
			if (dto.isFechaSubidaContratoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_SUBIDA_CONTRATO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_COMODATO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdComodatoModified()) {
				stmt.setInt( index++, dto.getIdComodato() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isFechaCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaCreacion().getTime() ) );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isNumeroSerieModified()) {
				stmt.setString( index++, dto.getNumeroSerie() );
			}
		
			if (dto.isMarcaModified()) {
				stmt.setString( index++, dto.getMarca() );
			}
		
			if (dto.isModeloModified()) {
				stmt.setString( index++, dto.getModelo() );
			}
		
			if (dto.isTipoModified()) {
				stmt.setString( index++, dto.getTipo() );
			}
		
			if (dto.isCapacidadModified()) {
				stmt.setString( index++, dto.getCapacidad() );
			}
		
			if (dto.isEstadoModified()) {
				if (dto.isEstadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstado() );
				}
		
			}
		
			if (dto.isEstatusModified()) {
				if (dto.isEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstatus() );
				}
		
			}
		
			if (dto.isIdAlmacenModified()) {
				if (dto.isIdAlmacenNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdAlmacen() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			if (dto.isFechaAsignacionClienteModified()) {
				stmt.setTimestamp(index++, dto.getFechaAsignacionCliente()==null ? null : new java.sql.Timestamp( dto.getFechaAsignacionCliente().getTime() ) );
			}
		
			if (dto.isNombreRecibeModified()) {
				stmt.setString( index++, dto.getNombreRecibe() );
			}
		
			if (dto.isDireccionResguardoModified()) {
				stmt.setString( index++, dto.getDireccionResguardo() );
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (dto.isIdUsuarioVendedorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuarioVendedor() );
				}
		
			}
		
			if (dto.isContratoNombreArchivoModified()) {
				stmt.setString( index++, dto.getContratoNombreArchivo() );
			}
		
			if (dto.isFechaSubidaContratoModified()) {
				stmt.setTimestamp(index++, dto.getFechaSubidaContrato()==null ? null : new java.sql.Timestamp( dto.getFechaSubidaContrato().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getIdComodato() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the comodato table.
	 */
	public void delete(ComodatoPk pk) throws ComodatoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdComodato() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the comodato table that matches the specified primary-key value.
	 */
	public Comodato findByPrimaryKey(ComodatoPk pk) throws ComodatoDaoException
	{
		return findByPrimaryKey( pk.getIdComodato() );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_COMODATO = :idComodato'.
	 */
	public Comodato findByPrimaryKey(int idComodato) throws ComodatoDaoException
	{
		Comodato ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO = ?", new Object[] {  new Integer(idComodato) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria ''.
	 */
	public Comodato[] findAll() throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_COMODATO", null );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_COMODATO = :idComodato'.
	 */
	public Comodato[] findWhereIdComodatoEquals(int idComodato) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMODATO = ? ORDER BY ID_COMODATO", new Object[] {  new Integer(idComodato) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Comodato[] findWhereIdEmpresaEquals(int idEmpresa) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'FECHA_CREACION = :fechaCreacion'.
	 */
	public Comodato[] findWhereFechaCreacionEquals(Date fechaCreacion) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_CREACION = ? ORDER BY FECHA_CREACION", new Object[] { fechaCreacion==null ? null : new java.sql.Timestamp( fechaCreacion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Comodato[] findWhereNombreEquals(String nombre) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Comodato[] findWhereDescripcionEquals(String descripcion) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'NUMERO_SERIE = :numeroSerie'.
	 */
	public Comodato[] findWhereNumeroSerieEquals(String numeroSerie) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO_SERIE = ? ORDER BY NUMERO_SERIE", new Object[] { numeroSerie } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'MARCA = :marca'.
	 */
	public Comodato[] findWhereMarcaEquals(String marca) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MARCA = ? ORDER BY MARCA", new Object[] { marca } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'MODELO = :modelo'.
	 */
	public Comodato[] findWhereModeloEquals(String modelo) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MODELO = ? ORDER BY MODELO", new Object[] { modelo } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'TIPO = :tipo'.
	 */
	public Comodato[] findWhereTipoEquals(String tipo) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIPO = ? ORDER BY TIPO", new Object[] { tipo } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'CAPACIDAD = :capacidad'.
	 */
	public Comodato[] findWhereCapacidadEquals(String capacidad) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CAPACIDAD = ? ORDER BY CAPACIDAD", new Object[] { capacidad } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ESTADO = :estado'.
	 */
	public Comodato[] findWhereEstadoEquals(int estado) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTADO = ? ORDER BY ESTADO", new Object[] {  new Integer(estado) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ESTATUS = :estatus'.
	 */
	public Comodato[] findWhereEstatusEquals(int estatus) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTATUS = ? ORDER BY ESTATUS", new Object[] {  new Integer(estatus) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_ALMACEN = :idAlmacen'.
	 */
	public Comodato[] findWhereIdAlmacenEquals(int idAlmacen) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ALMACEN = ? ORDER BY ID_ALMACEN", new Object[] {  new Integer(idAlmacen) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public Comodato[] findWhereIdClienteEquals(int idCliente) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'FECHA_ASIGNACION_CLIENTE = :fechaAsignacionCliente'.
	 */
	public Comodato[] findWhereFechaAsignacionClienteEquals(Date fechaAsignacionCliente) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ASIGNACION_CLIENTE = ? ORDER BY FECHA_ASIGNACION_CLIENTE", new Object[] { fechaAsignacionCliente==null ? null : new java.sql.Timestamp( fechaAsignacionCliente.getTime() ) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'NOMBRE_RECIBE = :nombreRecibe'.
	 */
	public Comodato[] findWhereNombreRecibeEquals(String nombreRecibe) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_RECIBE = ? ORDER BY NOMBRE_RECIBE", new Object[] { nombreRecibe } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'DIRECCION_RESGUARDO = :direccionResguardo'.
	 */
	public Comodato[] findWhereDireccionResguardoEquals(String direccionResguardo) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIRECCION_RESGUARDO = ? ORDER BY DIRECCION_RESGUARDO", new Object[] { direccionResguardo } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public Comodato[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_VENDEDOR = ? ORDER BY ID_USUARIO_VENDEDOR", new Object[] {  new Integer(idUsuarioVendedor) } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'CONTRATO_NOMBRE_ARCHIVO = :contratoNombreArchivo'.
	 */
	public Comodato[] findWhereContratoNombreArchivoEquals(String contratoNombreArchivo) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONTRATO_NOMBRE_ARCHIVO = ? ORDER BY CONTRATO_NOMBRE_ARCHIVO", new Object[] { contratoNombreArchivo } );
	}

	/** 
	 * Returns all rows from the comodato table that match the criteria 'FECHA_SUBIDA_CONTRATO = :fechaSubidaContrato'.
	 */
	public Comodato[] findWhereFechaSubidaContratoEquals(Date fechaSubidaContrato) throws ComodatoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_SUBIDA_CONTRATO = ? ORDER BY FECHA_SUBIDA_CONTRATO", new Object[] { fechaSubidaContrato==null ? null : new java.sql.Timestamp( fechaSubidaContrato.getTime() ) } );
	}

	/**
	 * Method 'ComodatoDaoImpl'
	 * 
	 */
	public ComodatoDaoImpl()
	{
	}

	/**
	 * Method 'ComodatoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ComodatoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "comodato";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Comodato fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Comodato dto = new Comodato();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Comodato[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Comodato dto = new Comodato();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Comodato ret[] = new Comodato[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Comodato dto, ResultSet rs) throws SQLException
	{
		dto.setIdComodato( rs.getInt( COLUMN_ID_COMODATO ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setFechaCreacion( rs.getTimestamp(COLUMN_FECHA_CREACION ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setNumeroSerie( rs.getString( COLUMN_NUMERO_SERIE ) );
		dto.setMarca( rs.getString( COLUMN_MARCA ) );
		dto.setModelo( rs.getString( COLUMN_MODELO ) );
		dto.setTipo( rs.getString( COLUMN_TIPO ) );
		dto.setCapacidad( rs.getString( COLUMN_CAPACIDAD ) );
		dto.setEstado( rs.getInt( COLUMN_ESTADO ) );
		if (rs.wasNull()) {
			dto.setEstadoNull( true );
		}
		
		dto.setEstatus( rs.getInt( COLUMN_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setEstatusNull( true );
		}
		
		dto.setIdAlmacen( rs.getInt( COLUMN_ID_ALMACEN ) );
		if (rs.wasNull()) {
			dto.setIdAlmacenNull( true );
		}
		
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		if (rs.wasNull()) {
			dto.setIdClienteNull( true );
		}
		
		dto.setFechaAsignacionCliente( rs.getTimestamp(COLUMN_FECHA_ASIGNACION_CLIENTE ) );
		dto.setNombreRecibe( rs.getString( COLUMN_NOMBRE_RECIBE ) );
		dto.setDireccionResguardo( rs.getString( COLUMN_DIRECCION_RESGUARDO ) );
		dto.setIdUsuarioVendedor( rs.getInt( COLUMN_ID_USUARIO_VENDEDOR ) );
		if (rs.wasNull()) {
			dto.setIdUsuarioVendedorNull( true );
		}
		
		dto.setContratoNombreArchivo( rs.getString( COLUMN_CONTRATO_NOMBRE_ARCHIVO ) );
		dto.setFechaSubidaContrato( rs.getTimestamp(COLUMN_FECHA_SUBIDA_CONTRATO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Comodato dto)
	{
		dto.setIdComodatoModified( false );
		dto.setIdEmpresaModified( false );
		dto.setFechaCreacionModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
		dto.setNumeroSerieModified( false );
		dto.setMarcaModified( false );
		dto.setModeloModified( false );
		dto.setTipoModified( false );
		dto.setCapacidadModified( false );
		dto.setEstadoModified( false );
		dto.setEstatusModified( false );
		dto.setIdAlmacenModified( false );
		dto.setIdClienteModified( false );
		dto.setFechaAsignacionClienteModified( false );
		dto.setNombreRecibeModified( false );
		dto.setDireccionResguardoModified( false );
		dto.setIdUsuarioVendedorModified( false );
		dto.setContratoNombreArchivoModified( false );
		dto.setFechaSubidaContratoModified( false );
	}

	/** 
	 * Returns all rows from the comodato table that match the specified arbitrary SQL statement
	 */
	public Comodato[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComodatoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the comodato table that match the specified arbitrary SQL statement
	 */
	public Comodato[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComodatoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComodatoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
