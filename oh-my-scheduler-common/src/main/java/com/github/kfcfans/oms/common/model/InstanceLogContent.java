package com.github.kfcfans.oms.common.model;

import com.github.kfcfans.oms.common.OmsSerializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 任务实例日志对象
 *
 * @author tjq
 * @since 2020/4/21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstanceLogContent implements OmsSerializable {

    // 实例ID
    private long instanceId;
    // 日志提交时间
    private long logTime;
    // 日志内容
    private String logContent;
}

