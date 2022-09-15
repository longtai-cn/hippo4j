/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.config.service.biz;

import cn.hippo4j.common.model.ThreadPoolParameterInfo;
import cn.hippo4j.config.model.biz.threadpool.ConfigModifySaveReqDTO;

/**
 * config change verify service
 */
public interface ConfigModifyVerifyService {

    /**
     * get type
     * @return
     */
    Integer type();

    /**
     * save config change application
     * @param reqDTO
     */
    void saveConfigModifyApplication(ConfigModifySaveReqDTO reqDTO);

    /**
     * reject config modification
     * @param id
     */
    void rejectModification(Long id, ThreadPoolParameterInfo poolParameterInfo);

    /**
     * accept config modification
     * @param id
     */
    void acceptModification(Long id, ThreadPoolParameterInfo poolParameterInfo);
}