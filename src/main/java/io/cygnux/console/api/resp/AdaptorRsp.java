package io.cygnux.console.api.resp;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Adaptor参数
 */
@Getter
@Setter
@Accessors(chain = true)
public final class AdaptorRsp {

    private int adaptorId;

    /**
     * Adaptor Name
     */
    private String adaptorName;

    /**
     * Adaptor Type
     */
    private String adaptorType;

    /**
     * Remark
     */
    private String remark;

    /**
     * Enabled
     */
    private boolean enabled;


}