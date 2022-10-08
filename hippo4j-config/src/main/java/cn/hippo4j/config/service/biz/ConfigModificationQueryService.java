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
import cn.hippo4j.config.model.biz.threadpool.ConfigModificationQueryRespDTO;
import cn.hippo4j.config.model.biz.threadpool.ThreadPoolQueryReqDTO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * config modification application query service
 */
public interface ConfigModificationQueryService {

    /**
     * query config modification application page.
     *
     * @param reqDTO
     * @return
     */
    IPage<ConfigModificationQueryRespDTO> queryApplicationPage(ThreadPoolQueryReqDTO reqDTO);

    /**
     * query config modification detail by application id
     *
     * @param id
     * @return
     */
    ThreadPoolParameterInfo queryApplicationDetail(Long id);
}
