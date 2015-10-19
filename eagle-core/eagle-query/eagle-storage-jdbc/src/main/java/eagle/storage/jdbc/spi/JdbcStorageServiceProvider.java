/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eagle.storage.jdbc.spi;

import eagle.storage.jdbc.JdbcStorage;
import eagle.storage.spi.DataStorageServiceProvider;

/**
 * @since 3/20/15
 */
@SuppressWarnings("unused")
public class JdbcStorageServiceProvider implements DataStorageServiceProvider<JdbcStorage> {
    private final static String JDBC = "jdbc";

    @Override
    public String getType() {
        return JDBC;
    }

    @Override
    public JdbcStorage getStorage() {
        return new JdbcStorage();
    }
}