/*-------------------------------------------------------------------------
*
* Copyright (c) 2004, PostgreSQL Global Development Group
*
* IDENTIFICATION
*   $PostgreSQL: pgjdbc/org/postgresql/jdbc3/PSQLSavepoint.java,v 1.3 2004/11/07 22:16:32 jurka Exp $
*
*-------------------------------------------------------------------------
*/
package org.postgresql.jdbc3;

import java.sql.SQLException;
import java.sql.Savepoint;
import org.postgresql.util.PSQLException;
import org.postgresql.util.GT;

public class PSQLSavepoint implements Savepoint {

    private boolean _isValid;
    private boolean _isNamed;
    private int _id;
    private String _name;

    public PSQLSavepoint(int id) {
        _isValid = true;
        _isNamed = false;
        _id = id;
    }

    public PSQLSavepoint(String name) {
        _isValid = true;
        _isNamed = true;
        _name = name;
    }

    public int getSavepointId() throws SQLException {
        if (!_isValid)
            throw new PSQLException(GT.tr("Cannot reference a savepoint after it has been released."));

        if (_isNamed)
            throw new PSQLException(GT.tr("Cannot retrieve the id of a named savepoint."));

        return _id;
    }

    public String getSavepointName() throws SQLException {
        if (!_isValid)
            throw new PSQLException(GT.tr("Cannot reference a savepoint after it has been released."));

        if (!_isNamed)
            throw new PSQLException(GT.tr("Cannot retrieve the name of an unnamed savepoint."));

        return _name;
    }

    public void invalidate() {
        _isValid = false;
    }

    public String getPGName() throws SQLException {
        if (!_isValid)
            throw new PSQLException(GT.tr("Cannot reference a savepoint after it has been released."));

        if (_isNamed)
        {
            // We need to quote and escape the name in case it
            // contains spaces/quotes/backslashes.
            //
            StringBuffer sb = new StringBuffer(_name.length() + 2);
            sb.append("\"");
            for (int i = 0; i < _name.length(); i++)
            {
                char c = _name.charAt(i);
                if (c == '\\' || c == '"')
                    sb.append(c);
                sb.append(c);
            }
            sb.append("\"");
            return sb.toString();
        }

        return "JDBC_SAVEPOINT_" + _id;
    }

}