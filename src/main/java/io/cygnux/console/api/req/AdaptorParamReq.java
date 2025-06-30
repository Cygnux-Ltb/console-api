package io.cygnux.console.api.req;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public final class AdaptorParamReq {

    /**
     * AdaptorId
     */
    private int adaptorId;

    /**
     * ParamGroup
     */
    private String paramGroup;

    /**
     * ParamName
     */
    private String paramName;

    /**
     * ParamValue
     */
    private String paramValue;

    /**
     * Remark
     */
    private String remark;

}
