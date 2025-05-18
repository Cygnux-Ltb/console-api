package io.cygnuxltb.console.beans.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Adaptor参数
 */
@Getter
@Setter
@Accessors(chain = true)
public final class AdaptorParamRsp {

    /**
     * Adaptor类型
     */
    private int adaptorId;

    /**
     * Adaptor显示名
     */
    private String adaptorDisplayName;

    /**
     * 参数组
     */
    private String paramGroup;

    /**
     * 参数名
     */
    private String paramName;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 备注
     */
    private String remark;


}