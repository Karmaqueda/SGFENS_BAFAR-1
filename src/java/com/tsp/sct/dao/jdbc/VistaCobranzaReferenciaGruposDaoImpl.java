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

public class VistaCobranzaReferenciaGruposDaoImpl extends AbstractDAO implements VistaCobranzaReferenciaGruposDao
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
	protected final String SQL_SELECT = "SELECT ID_EMPRESA, ID_USUARIO_VENDEDOR, TOTAL, FECHA_ABONO, REFERENCIA, NUM_PAGOS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 1;

	/** 
	 * Index of column ID_USUARIO_VENDEDOR
	 */
	protected static final int COLUMN_ID_USUARIO_VENDEDOR = 2;

	/** 
	 * Index of column TOTAL
	 */
	protected static final int COLUMN_TOTAL = 3;

	/** 
	 * Index of column FECHA_ABONO
	 */
	protected static final int COLUMN_FECHA_ABONO = 4;

	/** 
	 * Index of column REFERENCIA
	 */
	protected static final int COLUMN_REFERENCIA = 5;

	/** 
	 * Index of column NUM_PAGOS
	 */
	protected static final int COLUMN_NUM_PAGOS = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the criteria ''.
	 */
	public VistaCobranzaReferenciaGrupos[] findAll() throws VistaCobranzaReferenciaGruposDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public VistaCobranzaReferenciaGrupos[] findWhereIdEmpresaEquals(int idEmpresa) throws VistaCobranzaReferenciaGruposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public VistaCobranzaReferenciaGrupos[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws VistaCobranzaReferenciaGruposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_VENDEDOR = ? ORDER BY ID_USUARIO_VENDEDOR", new Object[] {  new Integer(idUsuarioVendedor) } );
	}

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the criteria 'TOTAL = :total'.
	 */
	public VistaCobranzaReferenciaGrupos[] findWhereTotalEquals(double total) throws VistaCobranzaReferenciaGruposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TOTAL = ? ORDER BY TOTAL", new Object[] {  new Double(total) } );
	}

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the criteria 'FECHA_ABONO = :fechaAbono'.
	 */
	public VistaCobranzaReferenciaGrupos[] findWhereFechaAbonoEquals(Date fechaAbono) throws VistaCobranzaReferenciaGruposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ABONO = ? ORDER BY FECHA_ABONO", new Object[] { fechaAbono==null ? null : new java.sql.Timestamp( fechaAbono.getTime() ) } );
	}

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the criteria 'REFERENCIA = :referencia'.
	 */
	public VistaCobranzaReferenciaGrupos[] findWhereReferenciaEquals(String referencia) throws VistaCobranzaReferenciaGruposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REFERENCIA = ? ORDER BY REFERENCIA", new Object[] { referencia } );
	}

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the criteria 'NUM_PAGOS = :numPagos'.
	 */
	public VistaCobranzaReferenciaGrupos[] findWhereNumPagosEquals(long numPagos) throws VistaCobranzaReferenciaGruposDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUM_PAGOS = ? ORDER BY NUM_PAGOS", new Object[] {  new Long(numPagos) } );
	}

	/**
	 * Method 'VistaCobranzaReferenciaGruposDaoImpl'
	 * 
	 */
	public VistaCobranzaReferenciaGruposDaoImpl()
	{
	}

	/**
	 * Method 'VistaCobranzaReferenciaGruposDaoImpl'
	 * 
	 * @param userConn
	 */
	public VistaCobranzaReferenciaGruposDaoImpl(final java.sql.Connection userConn)
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
		return "vista_cobranza_referencia_grupos";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VistaCobranzaReferenciaGrupos fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VistaCobranzaReferenciaGrupos dto = new VistaCobranzaReferenciaGrupos();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VistaCobranzaReferenciaGrupos[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VistaCobranzaReferenciaGrupos dto = new VistaCobranzaReferenciaGrupos();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VistaCobranzaReferenciaGrupos ret[] = new VistaCobranzaReferenciaGrupos[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VistaCobranzaReferenciaGrupos dto, ResultSet rs) throws SQLException
	{
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdUsuarioVendedor( rs.getInt( COLUMN_ID_USUARIO_VENDEDOR ) );
		dto.setTotal( rs.getDouble( COLUMN_TOTAL ) );
		if (rs.wasNull()) {
			dto.setTotalNull( true );
		}
		
		dto.setFechaAbono( rs.getTimestamp(COLUMN_FECHA_ABONO ) );
		dto.setReferencia( rs.getString( COLUMN_REFERENCIA ) );
		dto.setNumPagos( rs.getLong( COLUMN_NUM_PAGOS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VistaCobranzaReferenciaGrupos dto)
	{
		dto.setIdEmpresaModified( false );
		dto.setIdUsuarioVendedorModified( false );
		dto.setTotalModified( false );
		dto.setFechaAbonoModified( false );
		dto.setReferenciaModified( false );
		dto.setNumPagosModified( false );
	}

	/** 
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the specified arbitrary SQL statement
	 */
	public VistaCobranzaReferenciaGrupos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VistaCobranzaReferenciaGruposDaoException
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
			throw new VistaCobranzaReferenciaGruposDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vista_cobranza_referencia_grupos table that match the specified arbitrary SQL statement
	 */
	public VistaCobranzaReferenciaGrupos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VistaCobranzaReferenciaGruposDaoException
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
			throw new VistaCobranzaReferenciaGruposDaoException( "Exception: " + _e.getMessage(), _e );
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