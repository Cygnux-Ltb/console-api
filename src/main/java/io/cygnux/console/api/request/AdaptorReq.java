package io.cygnux.console.api.request;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public final class AdaptorReq {

    /**
     * Adaptor ID
     */
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

}
