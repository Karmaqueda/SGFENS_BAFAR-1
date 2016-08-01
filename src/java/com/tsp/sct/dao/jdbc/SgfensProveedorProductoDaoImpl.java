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

public class SgfensProveedorProductoDaoImpl extends AbstractDAO implements SgfensProveedorProductoDao
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
	protected final String SQL_SELECT = "SELECT ID_PROVEEDOR_PRODUCTO, ID_SGFENS_PRODUCTO_SERVICIO, ID_SGFENS_PRODUCTO_PROVEEDOR, VOLUMEN_DISPONIBLE, CADUCIDAD, FECHA_DISPONIBILIDAD, UNIDAD, PRECIO_MEDIO_MAYOREO, MIN_MEDIO_MAYOREO, MAX_MEDIO_MAYOREO, PRECIO_MENUDEO, MAX_MENUDEO, PRECIO_MAYOREO, MIN_MAYOREO, ID_CATEGORIA, NOMBRE_IMAGEN_PRODUCTO_SERVICIO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_PROVEEDOR_PRODUCTO, ID_SGFENS_PRODUCTO_SERVICIO, ID_SGFENS_PRODUCTO_PROVEEDOR, VOLUMEN_DISPONIBLE, CADUCIDAD, FECHA_DISPONIBILIDAD, UNIDAD, PRECIO_MEDIO_MAYOREO, MIN_MEDIO_MAYOREO, MAX_MEDIO_MAYOREO, PRECIO_MENUDEO, MAX_MENUDEO, PRECIO_MAYOREO, MIN_MAYOREO, ID_CATEGORIA, NOMBRE_IMAGEN_PRODUCTO_SERVICIO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_PROVEEDOR_PRODUCTO = ?, ID_SGFENS_PRODUCTO_SERVICIO = ?, ID_SGFENS_PRODUCTO_PROVEEDOR = ?, VOLUMEN_DISPONIBLE = ?, CADUCIDAD = ?, FECHA_DISPONIBILIDAD = ?, UNIDAD = ?, PRECIO_MEDIO_MAYOREO = ?, MIN_MEDIO_MAYOREO = ?, MAX_MEDIO_MAYOREO = ?, PRECIO_MENUDEO = ?, MAX_MENUDEO = ?, PRECIO_MAYOREO = ?, MIN_MAYOREO = ?, ID_CATEGORIA = ?, NOMBRE_IMAGEN_PRODUCTO_SERVICIO = ? WHERE ID_PROVEEDOR_PRODUCTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_PROVEEDOR_PRODUCTO = ?";

	/** 
	 * Index of column ID_PROVEEDOR_PRODUCTO
	 */
	protected static final int COLUMN_ID_PROVEEDOR_PRODUCTO = 1;

	/** 
	 * Index of column ID_SGFENS_PRODUCTO_SERVICIO
	 */
	protected static final int COLUMN_ID_SGFENS_PRODUCTO_SERVICIO = 2;

	/** 
	 * Index of column ID_SGFENS_PRODUCTO_PROVEEDOR
	 */
	protected static final int COLUMN_ID_SGFENS_PRODUCTO_PROVEEDOR = 3;

	/** 
	 * Index of column VOLUMEN_DISPONIBLE
	 */
	protected static final int COLUMN_VOLUMEN_DISPONIBLE = 4;

	/** 
	 * Index of column CADUCIDAD
	 */
	protected static final int COLUMN_CADUCIDAD = 5;

	/** 
	 * Index of column FECHA_DISPONIBILIDAD
	 */
	protected static final int COLUMN_FECHA_DISPONIBILIDAD = 6;

	/** 
	 * Index of column UNIDAD
	 */
	protected static final int COLUMN_UNIDAD = 7;

	/** 
	 * Index of column PRECIO_MEDIO_MAYOREO
	 */
	protected static final int COLUMN_PRECIO_MEDIO_MAYOREO = 8;

	/** 
	 * Index of column MIN_MEDIO_MAYOREO
	 */
	protected static final int COLUMN_MIN_MEDIO_MAYOREO = 9;

	/** 
	 * Index of column MAX_MEDIO_MAYOREO
	 */
	protected static final int COLUMN_MAX_MEDIO_MAYOREO = 10;

	/** 
	 * Index of column PRECIO_MENUDEO
	 */
	protected static final int COLUMN_PRECIO_MENUDEO = 11;

	/** 
	 * Index of column MAX_MENUDEO
	 */
	protected static final int COLUMN_MAX_MENUDEO = 12;

	/** 
	 * Index of column PRECIO_MAYOREO
	 */
	protected static final int COLUMN_PRECIO_MAYOREO = 13;

	/** 
	 * Index of column MIN_MAYOREO
	 */
	protected static final int COLUMN_MIN_MAYOREO = 14;

	/** 
	 * Index of column ID_CATEGORIA
	 */
	protected static final int COLUMN_ID_CATEGORIA = 15;

	/** 
	 * Index of column NOMBRE_IMAGEN_PRODUCTO_SERVICIO
	 */
	protected static final int COLUMN_NOMBRE_IMAGEN_PRODUCTO_SERVICIO = 16;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 16;

	/** 
	 * Index of primary-key column ID_PROVEEDOR_PRODUCTO
	 */
	protected static final int PK_COLUMN_ID_PROVEEDOR_PRODUCTO = 1;

	/** 
	 * Inserts a new row in the sgfens_proveedor_producto table.
	 */
	public SgfensProveedorProductoPk insert(SgfensProveedorProducto dto) throws SgfensProveedorProductoDaoException
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
			if (dto.isIdProveedorProductoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_PROVEEDOR_PRODUCTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdSgfensProductoServicioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_SGFENS_PRODUCTO_SERVICIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdSgfensProductoProveedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_SGFENS_PRODUCTO_PROVEEDOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isVolumenDisponibleModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "VOLUMEN_DISPONIBLE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCaducidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CADUCIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaDisponibilidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_DISPONIBILIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUnidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "UNIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPrecioMedioMayoreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PRECIO_MEDIO_MAYOREO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMinMedioMayoreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MIN_MEDIO_MAYOREO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMaxMedioMayoreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MAX_MEDIO_MAYOREO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPrecioMenudeoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PRECIO_MENUDEO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMaxMenudeoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MAX_MENUDEO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPrecioMayoreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PRECIO_MAYOREO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMinMayoreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MIN_MAYOREO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdCategoriaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CATEGORIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreImagenProductoServicioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_IMAGEN_PRODUCTO_SERVICIO" );
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
			if (dto.isIdProveedorProductoModified()) {
				stmt.setInt( index++, dto.getIdProveedorProducto() );
			}
		
			if (dto.isIdSgfensProductoServicioModified()) {
				stmt.setInt( index++, dto.getIdSgfensProductoServicio() );
			}
		
			if (dto.isIdSgfensProductoProveedorModified()) {
				stmt.setInt( index++, dto.getIdSgfensProductoProveedor() );
			}
		
			if (dto.isVolumenDisponibleModified()) {
				if (dto.isVolumenDisponibleNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getVolumenDisponible() );
				}
		
			}
		
			if (dto.isCaducidadModified()) {
				stmt.setDate(index++, dto.getCaducidad()==null ? null : new java.sql.Date( dto.getCaducidad().getTime() ) );
			}
		
			if (dto.isFechaDisponibilidadModified()) {
				stmt.setDate(index++, dto.getFechaDisponibilidad()==null ? null : new java.sql.Date( dto.getFechaDisponibilidad().getTime() ) );
			}
		
			if (dto.isUnidadModified()) {
				stmt.setString( index++, dto.getUnidad() );
			}
		
			if (dto.isPrecioMedioMayoreoModified()) {
				if (dto.isPrecioMedioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecioMedioMayoreo() );
				}
		
			}
		
			if (dto.isMinMedioMayoreoModified()) {
				if (dto.isMinMedioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMinMedioMayoreo() );
				}
		
			}
		
			if (dto.isMaxMedioMayoreoModified()) {
				if (dto.isMaxMedioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMaxMedioMayoreo() );
				}
		
			}
		
			if (dto.isPrecioMenudeoModified()) {
				if (dto.isPrecioMenudeoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecioMenudeo() );
				}
		
			}
		
			if (dto.isMaxMenudeoModified()) {
				if (dto.isMaxMenudeoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMaxMenudeo() );
				}
		
			}
		
			if (dto.isPrecioMayoreoModified()) {
				if (dto.isPrecioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecioMayoreo() );
				}
		
			}
		
			if (dto.isMinMayoreoModified()) {
				if (dto.isMinMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMinMayoreo() );
				}
		
			}
		
			if (dto.isIdCategoriaModified()) {
				if (dto.isIdCategoriaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCategoria() );
				}
		
			}
		
			if (dto.isNombreImagenProductoServicioModified()) {
				stmt.setString( index++, dto.getNombreImagenProductoServicio() );
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdProveedorProducto( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			throw new SgfensProveedorProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the sgfens_proveedor_producto table.
	 */
	public void update(SgfensProveedorProductoPk pk, SgfensProveedorProducto dto) throws SgfensProveedorProductoDaoException
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
			if (dto.isIdProveedorProductoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_PROVEEDOR_PRODUCTO=?" );
				modified=true;
			}
		
			if (dto.isIdSgfensProductoServicioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_SGFENS_PRODUCTO_SERVICIO=?" );
				modified=true;
			}
		
			if (dto.isIdSgfensProductoProveedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_SGFENS_PRODUCTO_PROVEEDOR=?" );
				modified=true;
			}
		
			if (dto.isVolumenDisponibleModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "VOLUMEN_DISPONIBLE=?" );
				modified=true;
			}
		
			if (dto.isCaducidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CADUCIDAD=?" );
				modified=true;
			}
		
			if (dto.isFechaDisponibilidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_DISPONIBILIDAD=?" );
				modified=true;
			}
		
			if (dto.isUnidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "UNIDAD=?" );
				modified=true;
			}
		
			if (dto.isPrecioMedioMayoreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRECIO_MEDIO_MAYOREO=?" );
				modified=true;
			}
		
			if (dto.isMinMedioMayoreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MIN_MEDIO_MAYOREO=?" );
				modified=true;
			}
		
			if (dto.isMaxMedioMayoreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MAX_MEDIO_MAYOREO=?" );
				modified=true;
			}
		
			if (dto.isPrecioMenudeoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRECIO_MENUDEO=?" );
				modified=true;
			}
		
			if (dto.isMaxMenudeoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MAX_MENUDEO=?" );
				modified=true;
			}
		
			if (dto.isPrecioMayoreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRECIO_MAYOREO=?" );
				modified=true;
			}
		
			if (dto.isMinMayoreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MIN_MAYOREO=?" );
				modified=true;
			}
		
			if (dto.isIdCategoriaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CATEGORIA=?" );
				modified=true;
			}
		
			if (dto.isNombreImagenProductoServicioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_IMAGEN_PRODUCTO_SERVICIO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_PROVEEDOR_PRODUCTO=?" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdProveedorProductoModified()) {
				stmt.setInt( index++, dto.getIdProveedorProducto() );
			}
		
			if (dto.isIdSgfensProductoServicioModified()) {
				stmt.setInt( index++, dto.getIdSgfensProductoServicio() );
			}
		
			if (dto.isIdSgfensProductoProveedorModified()) {
				stmt.setInt( index++, dto.getIdSgfensProductoProveedor() );
			}
		
			if (dto.isVolumenDisponibleModified()) {
				if (dto.isVolumenDisponibleNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getVolumenDisponible() );
				}
		
			}
		
			if (dto.isCaducidadModified()) {
				stmt.setDate(index++, dto.getCaducidad()==null ? null : new java.sql.Date( dto.getCaducidad().getTime() ) );
			}
		
			if (dto.isFechaDisponibilidadModified()) {
				stmt.setDate(index++, dto.getFechaDisponibilidad()==null ? null : new java.sql.Date( dto.getFechaDisponibilidad().getTime() ) );
			}
		
			if (dto.isUnidadModified()) {
				stmt.setString( index++, dto.getUnidad() );
			}
		
			if (dto.isPrecioMedioMayoreoModified()) {
				if (dto.isPrecioMedioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecioMedioMayoreo() );
				}
		
			}
		
			if (dto.isMinMedioMayoreoModified()) {
				if (dto.isMinMedioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMinMedioMayoreo() );
				}
		
			}
		
			if (dto.isMaxMedioMayoreoModified()) {
				if (dto.isMaxMedioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMaxMedioMayoreo() );
				}
		
			}
		
			if (dto.isPrecioMenudeoModified()) {
				if (dto.isPrecioMenudeoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecioMenudeo() );
				}
		
			}
		
			if (dto.isMaxMenudeoModified()) {
				if (dto.isMaxMenudeoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMaxMenudeo() );
				}
		
			}
		
			if (dto.isPrecioMayoreoModified()) {
				if (dto.isPrecioMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getPrecioMayoreo() );
				}
		
			}
		
			if (dto.isMinMayoreoModified()) {
				if (dto.isMinMayoreoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMinMayoreo() );
				}
		
			}
		
			if (dto.isIdCategoriaModified()) {
				if (dto.isIdCategoriaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCategoria() );
				}
		
			}
		
			if (dto.isNombreImagenProductoServicioModified()) {
				stmt.setString( index++, dto.getNombreImagenProductoServicio() );
			}
		
			stmt.setInt( index++, pk.getIdProveedorProducto() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new SgfensProveedorProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the sgfens_proveedor_producto table.
	 */
	public void delete(SgfensProveedorProductoPk pk) throws SgfensProveedorProductoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdProveedorProducto() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new SgfensProveedorProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the sgfens_proveedor_producto table that matches the specified primary-key value.
	 */
	public SgfensProveedorProducto findByPrimaryKey(SgfensProveedorProductoPk pk) throws SgfensProveedorProductoDaoException
	{
		return findByPrimaryKey( pk.getIdProveedorProducto() );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_PROVEEDOR_PRODUCTO = :idProveedorProducto'.
	 */
	public SgfensProveedorProducto findByPrimaryKey(int idProveedorProducto) throws SgfensProveedorProductoDaoException
	{
		SgfensProveedorProducto ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_PROVEEDOR_PRODUCTO = ?", new Object[] {  new Integer(idProveedorProducto) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria ''.
	 */
	public SgfensProveedorProducto[] findAll() throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_PROVEEDOR_PRODUCTO", null );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_PROVEEDOR_PRODUCTO = :idProveedorProducto'.
	 */
	public SgfensProveedorProducto[] findWhereIdProveedorProductoEquals(int idProveedorProducto) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PROVEEDOR_PRODUCTO = ? ORDER BY ID_PROVEEDOR_PRODUCTO", new Object[] {  new Integer(idProveedorProducto) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_SGFENS_PRODUCTO_SERVICIO = :idSgfensProductoServicio'.
	 */
	public SgfensProveedorProducto[] findWhereIdSgfensProductoServicioEquals(int idSgfensProductoServicio) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_SGFENS_PRODUCTO_SERVICIO = ? ORDER BY ID_SGFENS_PRODUCTO_SERVICIO", new Object[] {  new Integer(idSgfensProductoServicio) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_SGFENS_PRODUCTO_PROVEEDOR = :idSgfensProductoProveedor'.
	 */
	public SgfensProveedorProducto[] findWhereIdSgfensProductoProveedorEquals(int idSgfensProductoProveedor) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_SGFENS_PRODUCTO_PROVEEDOR = ? ORDER BY ID_SGFENS_PRODUCTO_PROVEEDOR", new Object[] {  new Integer(idSgfensProductoProveedor) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'VOLUMEN_DISPONIBLE = :volumenDisponible'.
	 */
	public SgfensProveedorProducto[] findWhereVolumenDisponibleEquals(double volumenDisponible) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VOLUMEN_DISPONIBLE = ? ORDER BY VOLUMEN_DISPONIBLE", new Object[] {  new Double(volumenDisponible) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'CADUCIDAD = :caducidad'.
	 */
	public SgfensProveedorProducto[] findWhereCaducidadEquals(Date caducidad) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CADUCIDAD = ? ORDER BY CADUCIDAD", new Object[] { caducidad==null ? null : new java.sql.Date( caducidad.getTime() ) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'FECHA_DISPONIBILIDAD = :fechaDisponibilidad'.
	 */
	public SgfensProveedorProducto[] findWhereFechaDisponibilidadEquals(Date fechaDisponibilidad) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_DISPONIBILIDAD = ? ORDER BY FECHA_DISPONIBILIDAD", new Object[] { fechaDisponibilidad==null ? null : new java.sql.Date( fechaDisponibilidad.getTime() ) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'UNIDAD = :unidad'.
	 */
	public SgfensProveedorProducto[] findWhereUnidadEquals(String unidad) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE UNIDAD = ? ORDER BY UNIDAD", new Object[] { unidad } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'PRECIO_MEDIO_MAYOREO = :precioMedioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWherePrecioMedioMayoreoEquals(double precioMedioMayoreo) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRECIO_MEDIO_MAYOREO = ? ORDER BY PRECIO_MEDIO_MAYOREO", new Object[] {  new Double(precioMedioMayoreo) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MIN_MEDIO_MAYOREO = :minMedioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWhereMinMedioMayoreoEquals(double minMedioMayoreo) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MIN_MEDIO_MAYOREO = ? ORDER BY MIN_MEDIO_MAYOREO", new Object[] {  new Double(minMedioMayoreo) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MAX_MEDIO_MAYOREO = :maxMedioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWhereMaxMedioMayoreoEquals(double maxMedioMayoreo) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MAX_MEDIO_MAYOREO = ? ORDER BY MAX_MEDIO_MAYOREO", new Object[] {  new Double(maxMedioMayoreo) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'PRECIO_MENUDEO = :precioMenudeo'.
	 */
	public SgfensProveedorProducto[] findWherePrecioMenudeoEquals(double precioMenudeo) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRECIO_MENUDEO = ? ORDER BY PRECIO_MENUDEO", new Object[] {  new Double(precioMenudeo) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MAX_MENUDEO = :maxMenudeo'.
	 */
	public SgfensProveedorProducto[] findWhereMaxMenudeoEquals(double maxMenudeo) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MAX_MENUDEO = ? ORDER BY MAX_MENUDEO", new Object[] {  new Double(maxMenudeo) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'PRECIO_MAYOREO = :precioMayoreo'.
	 */
	public SgfensProveedorProducto[] findWherePrecioMayoreoEquals(double precioMayoreo) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRECIO_MAYOREO = ? ORDER BY PRECIO_MAYOREO", new Object[] {  new Double(precioMayoreo) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'MIN_MAYOREO = :minMayoreo'.
	 */
	public SgfensProveedorProducto[] findWhereMinMayoreoEquals(double minMayoreo) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MIN_MAYOREO = ? ORDER BY MIN_MAYOREO", new Object[] {  new Double(minMayoreo) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'ID_CATEGORIA = :idCategoria'.
	 */
	public SgfensProveedorProducto[] findWhereIdCategoriaEquals(int idCategoria) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CATEGORIA = ? ORDER BY ID_CATEGORIA", new Object[] {  new Integer(idCategoria) } );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the criteria 'NOMBRE_IMAGEN_PRODUCTO_SERVICIO = :nombreImagenProductoServicio'.
	 */
	public SgfensProveedorProducto[] findWhereNombreImagenProductoServicioEquals(String nombreImagenProductoServicio) throws SgfensProveedorProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_IMAGEN_PRODUCTO_SERVICIO = ? ORDER BY NOMBRE_IMAGEN_PRODUCTO_SERVICIO", new Object[] { nombreImagenProductoServicio } );
	}

	/**
	 * Method 'SgfensProveedorProductoDaoImpl'
	 * 
	 */
	public SgfensProveedorProductoDaoImpl()
	{
	}

	/**
	 * Method 'SgfensProveedorProductoDaoImpl'
	 * 
	 * @param userConn
	 */
	public SgfensProveedorProductoDaoImpl(final java.sql.Connection userConn)
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
		return "sgfens_proveedor_producto";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SgfensProveedorProducto fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SgfensProveedorProducto dto = new SgfensProveedorProducto();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SgfensProveedorProducto[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SgfensProveedorProducto dto = new SgfensProveedorProducto();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SgfensProveedorProducto ret[] = new SgfensProveedorProducto[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SgfensProveedorProducto dto, ResultSet rs) throws SQLException
	{
		dto.setIdProveedorProducto( rs.getInt( COLUMN_ID_PROVEEDOR_PRODUCTO ) );
		dto.setIdSgfensProductoServicio( rs.getInt( COLUMN_ID_SGFENS_PRODUCTO_SERVICIO ) );
		dto.setIdSgfensProductoProveedor( rs.getInt( COLUMN_ID_SGFENS_PRODUCTO_PROVEEDOR ) );
		dto.setVolumenDisponible( rs.getDouble( COLUMN_VOLUMEN_DISPONIBLE ) );
		if (rs.wasNull()) {
			dto.setVolumenDisponibleNull( true );
		}
		
		dto.setCaducidad( rs.getDate(COLUMN_CADUCIDAD ) );
		dto.setFechaDisponibilidad( rs.getDate(COLUMN_FECHA_DISPONIBILIDAD ) );
		dto.setUnidad( rs.getString( COLUMN_UNIDAD ) );
		dto.setPrecioMedioMayoreo( rs.getDouble( COLUMN_PRECIO_MEDIO_MAYOREO ) );
		if (rs.wasNull()) {
			dto.setPrecioMedioMayoreoNull( true );
		}
		
		dto.setMinMedioMayoreo( rs.getDouble( COLUMN_MIN_MEDIO_MAYOREO ) );
		if (rs.wasNull()) {
			dto.setMinMedioMayoreoNull( true );
		}
		
		dto.setMaxMedioMayoreo( rs.getDouble( COLUMN_MAX_MEDIO_MAYOREO ) );
		if (rs.wasNull()) {
			dto.setMaxMedioMayoreoNull( true );
		}
		
		dto.setPrecioMenudeo( rs.getDouble( COLUMN_PRECIO_MENUDEO ) );
		if (rs.wasNull()) {
			dto.setPrecioMenudeoNull( true );
		}
		
		dto.setMaxMenudeo( rs.getDouble( COLUMN_MAX_MENUDEO ) );
		if (rs.wasNull()) {
			dto.setMaxMenudeoNull( true );
		}
		
		dto.setPrecioMayoreo( rs.getDouble( COLUMN_PRECIO_MAYOREO ) );
		if (rs.wasNull()) {
			dto.setPrecioMayoreoNull( true );
		}
		
		dto.setMinMayoreo( rs.getDouble( COLUMN_MIN_MAYOREO ) );
		if (rs.wasNull()) {
			dto.setMinMayoreoNull( true );
		}
		
		dto.setIdCategoria( rs.getInt( COLUMN_ID_CATEGORIA ) );
		if (rs.wasNull()) {
			dto.setIdCategoriaNull( true );
		}
		
		dto.setNombreImagenProductoServicio( rs.getString( COLUMN_NOMBRE_IMAGEN_PRODUCTO_SERVICIO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SgfensProveedorProducto dto)
	{
		dto.setIdProveedorProductoModified( false );
		dto.setIdSgfensProductoServicioModified( false );
		dto.setIdSgfensProductoProveedorModified( false );
		dto.setVolumenDisponibleModified( false );
		dto.setCaducidadModified( false );
		dto.setFechaDisponibilidadModified( false );
		dto.setUnidadModified( false );
		dto.setPrecioMedioMayoreoModified( false );
		dto.setMinMedioMayoreoModified( false );
		dto.setMaxMedioMayoreoModified( false );
		dto.setPrecioMenudeoModified( false );
		dto.setMaxMenudeoModified( false );
		dto.setPrecioMayoreoModified( false );
		dto.setMinMayoreoModified( false );
		dto.setIdCategoriaModified( false );
		dto.setNombreImagenProductoServicioModified( false );
	}

	/** 
	 * Returns all rows from the sgfens_proveedor_producto table that match the specified arbitrary SQL statement
	 */
	public SgfensProveedorProducto[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensProveedorProductoDaoException
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
			throw new SgfensProveedorProductoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the sgfens_proveedor_producto table that match the specified arbitrary SQL statement
	 */
	public SgfensProveedorProducto[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensProveedorProductoDaoException
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
			throw new SgfensProveedorProductoDaoException( "Exception: " + _e.getMessage(), _e );
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