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

public class ReporteConfigurableDaoImpl extends AbstractDAO implements ReporteConfigurableDao
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
	protected final String SQL_SELECT = "SELECT ID_CONFIGURACION, ID_EMPRESA, ID_ESTATUS, ID_TIPO_REPORTE, ID_DIAS, CORREOS, FILTROS, MAX_TIEMPO_ATRAS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_CONFIGURACION, ID_EMPRESA, ID_ESTATUS, ID_TIPO_REPORTE, ID_DIAS, CORREOS, FILTROS, MAX_TIEMPO_ATRAS ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_CONFIGURACION = ?, ID_EMPRESA = ?, ID_ESTATUS = ?, ID_TIPO_REPORTE = ?, ID_DIAS = ?, CORREOS = ?, FILTROS = ?, MAX_TIEMPO_ATRAS = ? WHERE ID_CONFIGURACION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_CONFIGURACION = ?";

	/** 
	 * Index of column ID_CONFIGURACION
	 */
	protected static final int COLUMN_ID_CONFIGURACION = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 3;

	/** 
	 * Index of column ID_TIPO_REPORTE
	 */
	protected static final int COLUMN_ID_TIPO_REPORTE = 4;

	/** 
	 * Index of column ID_DIAS
	 */
	protected static final int COLUMN_ID_DIAS = 5;

	/** 
	 * Index of column CORREOS
	 */
	protected static final int COLUMN_CORREOS = 6;

	/** 
	 * Index of column FILTROS
	 */
	protected static final int COLUMN_FILTROS = 7;

	/** 
	 * Index of column MAX_TIEMPO_ATRAS
	 */
	protected static final int COLUMN_MAX_TIEMPO_ATRAS = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column ID_CONFIGURACION
	 */
	protected static final int PK_COLUMN_ID_CONFIGURACION = 1;

	/** 
	 * Inserts a new row in the reporte_configurable table.
	 */
	public ReporteConfigurablePk insert(ReporteConfigurable dto) throws ReporteConfigurableDaoException
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
			if (dto.isIdConfiguracionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CONFIGURACION" );
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
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdTipoReporteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_TIPO_REPORTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdDiasModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_DIAS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCorreosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CORREOS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFiltrosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FILTROS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMaxTiempoAtrasModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MAX_TIEMPO_ATRAS" );
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
			if (dto.isIdConfiguracionModified()) {
				stmt.setInt( index++, dto.getIdConfiguracion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdTipoReporteModified()) {
				if (dto.isIdTipoReporteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdTipoReporte() );
				}
		
			}
		
			if (dto.isIdDiasModified()) {
				stmt.setString( index++, dto.getIdDias() );
			}
		
			if (dto.isCorreosModified()) {
				stmt.setString( index++, dto.getCorreos() );
			}
		
			if (dto.isFiltrosModified()) {
				stmt.setString( index++, dto.getFiltros() );
			}
		
			if (dto.isMaxTiempoAtrasModified()) {
				stmt.setString( index++, dto.getMaxTiempoAtras() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdConfiguracion( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ReporteConfigurableDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the reporte_configurable table.
	 */
	public void update(ReporteConfigurablePk pk, ReporteConfigurable dto) throws ReporteConfigurableDaoException
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
			if (dto.isIdConfiguracionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CONFIGURACION=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isIdTipoReporteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_TIPO_REPORTE=?" );
				modified=true;
			}
		
			if (dto.isIdDiasModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_DIAS=?" );
				modified=true;
			}
		
			if (dto.isCorreosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CORREOS=?" );
				modified=true;
			}
		
			if (dto.isFiltrosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FILTROS=?" );
				modified=true;
			}
		
			if (dto.isMaxTiempoAtrasModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MAX_TIEMPO_ATRAS=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_CONFIGURACION=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdConfiguracionModified()) {
				stmt.setInt( index++, dto.getIdConfiguracion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdTipoReporteModified()) {
				if (dto.isIdTipoReporteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdTipoReporte() );
				}
		
			}
		
			if (dto.isIdDiasModified()) {
				stmt.setString( index++, dto.getIdDias() );
			}
		
			if (dto.isCorreosModified()) {
				stmt.setString( index++, dto.getCorreos() );
			}
		
			if (dto.isFiltrosModified()) {
				stmt.setString( index++, dto.getFiltros() );
			}
		
			if (dto.isMaxTiempoAtrasModified()) {
				stmt.setString( index++, dto.getMaxTiempoAtras() );
			}
		
			stmt.setInt( index++, pk.getIdConfiguracion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ReporteConfigurableDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the reporte_configurable table.
	 */
	public void delete(ReporteConfigurablePk pk) throws ReporteConfigurableDaoException
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
			stmt.setInt( 1, pk.getIdConfiguracion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ReporteConfigurableDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the reporte_configurable table that matches the specified primary-key value.
	 */
	public ReporteConfigurable findByPrimaryKey(ReporteConfigurablePk pk) throws ReporteConfigurableDaoException
	{
		return findByPrimaryKey( pk.getIdConfiguracion() );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'ID_CONFIGURACION = :idConfiguracion'.
	 */
	public ReporteConfigurable findByPrimaryKey(int idConfiguracion) throws ReporteConfigurableDaoException
	{
		ReporteConfigurable ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_CONFIGURACION = ?", new Object[] {  new Integer(idConfiguracion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria ''.
	 */
	public ReporteConfigurable[] findAll() throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_CONFIGURACION", null );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'ID_CONFIGURACION = :idConfiguracion'.
	 */
	public ReporteConfigurable[] findWhereIdConfiguracionEquals(int idConfiguracion) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CONFIGURACION = ? ORDER BY ID_CONFIGURACION", new Object[] {  new Integer(idConfiguracion) } );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ReporteConfigurable[] findWhereIdEmpresaEquals(int idEmpresa) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public ReporteConfigurable[] findWhereIdEstatusEquals(int idEstatus) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'ID_TIPO_REPORTE = :idTipoReporte'.
	 */
	public ReporteConfigurable[] findWhereIdTipoReporteEquals(int idTipoReporte) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_REPORTE = ? ORDER BY ID_TIPO_REPORTE", new Object[] {  new Integer(idTipoReporte) } );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'ID_DIAS = :idDias'.
	 */
	public ReporteConfigurable[] findWhereIdDiasEquals(String idDias) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DIAS = ? ORDER BY ID_DIAS", new Object[] { idDias } );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'CORREOS = :correos'.
	 */
	public ReporteConfigurable[] findWhereCorreosEquals(String correos) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CORREOS = ? ORDER BY CORREOS", new Object[] { correos } );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'FILTROS = :filtros'.
	 */
	public ReporteConfigurable[] findWhereFiltrosEquals(String filtros) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FILTROS = ? ORDER BY FILTROS", new Object[] { filtros } );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the criteria 'MAX_TIEMPO_ATRAS = :maxTiempoAtras'.
	 */
	public ReporteConfigurable[] findWhereMaxTiempoAtrasEquals(String maxTiempoAtras) throws ReporteConfigurableDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MAX_TIEMPO_ATRAS = ? ORDER BY MAX_TIEMPO_ATRAS", new Object[] { maxTiempoAtras } );
	}

	/**
	 * Method 'ReporteConfigurableDaoImpl'
	 * 
	 */
	public ReporteConfigurableDaoImpl()
	{
	}

	/**
	 * Method 'ReporteConfigurableDaoImpl'
	 * 
	 * @param userConn
	 */
	public ReporteConfigurableDaoImpl(final java.sql.Connection userConn)
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
		return "reporte_configurable";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ReporteConfigurable fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ReporteConfigurable dto = new ReporteConfigurable();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ReporteConfigurable[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ReporteConfigurable dto = new ReporteConfigurable();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ReporteConfigurable ret[] = new ReporteConfigurable[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ReporteConfigurable dto, ResultSet rs) throws SQLException
	{
		dto.setIdConfiguracion( rs.getInt( COLUMN_ID_CONFIGURACION ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setIdTipoReporte( rs.getInt( COLUMN_ID_TIPO_REPORTE ) );
		if (rs.wasNull()) {
			dto.setIdTipoReporteNull( true );
		}
		
		dto.setIdDias( rs.getString( COLUMN_ID_DIAS ) );
		dto.setCorreos( rs.getString( COLUMN_CORREOS ) );
		dto.setFiltros( rs.getString( COLUMN_FILTROS ) );
		dto.setMaxTiempoAtras( rs.getString( COLUMN_MAX_TIEMPO_ATRAS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ReporteConfigurable dto)
	{
		dto.setIdConfiguracionModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdTipoReporteModified( false );
		dto.setIdDiasModified( false );
		dto.setCorreosModified( false );
		dto.setFiltrosModified( false );
		dto.setMaxTiempoAtrasModified( false );
	}

	/** 
	 * Returns all rows from the reporte_configurable table that match the specified arbitrary SQL statement
	 */
	public ReporteConfigurable[] findByDynamicSelect(String sql, Object[] sqlParams) throws ReporteConfigurableDaoException
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
			throw new ReporteConfigurableDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the reporte_configurable table that match the specified arbitrary SQL statement
	 */
	public ReporteConfigurable[] findByDynamicWhere(String sql, Object[] sqlParams) throws ReporteConfigurableDaoException
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
			throw new ReporteConfigurableDaoException( "Exception: " + _e.getMessage(), _e );
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
