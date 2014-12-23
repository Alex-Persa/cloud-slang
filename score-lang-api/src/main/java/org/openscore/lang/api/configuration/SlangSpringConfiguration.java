package org.openscore.lang.api.configuration;
/*
 * Licensed to Hewlett-Packard Development Company, L.P. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/

import org.openscore.lang.api.Slang;
import org.openscore.lang.api.SlangImpl;
import com.hp.score.lang.compiler.configuration.SlangCompilerSpringConfig;
import com.hp.score.lang.runtime.configuration.SlangRuntimeSpringConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * User: stoneo
 * Date: 03/12/2014
 * Time: 10:39
 */
@Import({SlangRuntimeSpringConfig.class, SlangCompilerSpringConfig.class})
public class SlangSpringConfiguration {

    @Bean
    public Slang slang() {
        return new SlangImpl();
    }
}