/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.sql.stored.template.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Root element of Simple Stored Procedure Template AST.
 */
public class Template {

    private String procedureName;
    private final List<InputParameter> inputParameterList = new ArrayList<>();
    private final List<OutParameter> outParameterList = new ArrayList<>();

    public void addParameter(Object parameter) {
        if (parameter instanceof OutParameter) {
            outParameterList.add((OutParameter) parameter);
        } else {
            inputParameterList.add((InputParameter) parameter);
        }
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public List<InputParameter> getInputParameterList() {
        return inputParameterList;
    }

    public List<OutParameter> getOutParameterList() {
        return outParameterList;
    }
}
