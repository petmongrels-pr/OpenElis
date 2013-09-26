/*
* The contents of this file are subject to the Mozilla Public License
* Version 1.1 (the "License"); you may not use this file except in
* compliance with the License. You may obtain a copy of the License at
* http://www.mozilla.org/MPL/ 
* 
* Software distributed under the License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
* License for the specific language governing rights and limitations under
* the License.
* 
* The Original Code is OpenELIS code.
* 
* Copyright (C) The Minnesota Department of Health.  All Rights Reserved.
*/

package org.bahmni.feed.openelis.utils;

import org.ict4h.atomfeed.jdbc.JdbcConnectionProvider;
import us.mn.state.health.lims.hibernate.HibernateUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class OpenElisConnectionProvider implements JdbcConnectionProvider {
    @Override
    public Connection getConnection() throws SQLException {
        return HibernateUtil.getSession().connection();
    }

    @Override
    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
