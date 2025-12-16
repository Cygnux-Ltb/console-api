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
public final class AdapterRsp {

    private int adapterId;

    /**
     * Adaptor Name
     */
    private String adapterName;

    /**
     * Adaptor Type
     */
    private String adapterType;

    /**
     * Remark
     */
    private String remark;

    /**
     * Enabled
     */
    private boolean enabled;

}