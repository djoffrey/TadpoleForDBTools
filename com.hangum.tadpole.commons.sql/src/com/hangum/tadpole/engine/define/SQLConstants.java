/*******************************************************************************
 * Copyright (c) 2012 - 2015 hangum.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution", " and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     hangum - initial API and implementation
 ******************************************************************************/
package com.hangum.tadpole.engine.define;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Define SQL constants
 *
 * @author hangum
 * @version 1.6.1
 * @since 2015. 4. 21.
 *
 */
public abstract class SQLConstants {
	public static final String[] DEFAULT_TABLE_KEYWORDS = {"FROM", "UPDATE", "INTO", "TABLE", "JOIN"};
	public static final String[] DEFAULT_COLUMN_KEYWORDS = {"SELECT", "WHERE", "SET", "ON", "AND", "OR", "BY", "HAVING"};
	public static final List<String> listTableKeywords = Arrays.asList(SQLConstants.DEFAULT_TABLE_KEYWORDS);
	public static final List<String> listColumnKeywords = Arrays.asList(SQLConstants.DEFAULT_COLUMN_KEYWORDS);
	
	/**
	 * 에디터에서 사용할 확장자로 sql을 지정. 
	 */
	private static String EXT_SQL_PREFIX = "ace/mode/";
	
	protected static String EXT_SQLite = EXT_SQL_PREFIX + "sqlite";
	protected static String EXT_MYSQL 	= EXT_SQL_PREFIX + "mysql";
	protected static String EXT_PGSQL 	= EXT_SQL_PREFIX + "pgsql";
	protected static String EXT_MSSQL 	= EXT_SQL_PREFIX + "sqlserver";
	protected static String EXT_DEFAULT = EXT_SQL_PREFIX + "sql";

	
	public abstract String ext();
	public abstract String keyword();
	public abstract String function();
	public abstract String constant();
	public abstract String variable();
	
//	public static final String[] ADVANCED_KEYWORDS = { "PACKAGE", "FUNCTION", "TYPE", "TRIGGER", "MATERIALIZED", "IF", "EACH", "RETURN", "WRAPPED" };
	public static final String[] MYSQL_KEYWORDS = {"TABLE", "SELECT", "OPTION", "DEFAULT", "FULLTEXT", "PACKAGE", "FUNCTION", "TRIGGER", "MATERIALIZED", "IF", "EACH", "RETURN", "KEY"};
	
	public static final String[] MSSQL_KEYWORDS = {"GROUP"};

	public static final String[] SQLITE_KEYWORDS = {
			"AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE",
			"CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS",
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED",
			"DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE",
			"EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "FULL", "GLOB", "GROUP", "HAVING", "IF", "IGNORE",
			"IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO",
			"IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NO", "NOT", "NOTNULL", "NULL",
			"OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "RECURSIVE",
			"REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "RIGHT", "ROLLBACK", "ROW",
			"SAVEPOINT", "SELECT", "SET", "TABLE", "TEMP", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER",
			"UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "WITH",
			"WITHOU" };

}