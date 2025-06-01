package io.cygnux.console.api.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public final class AccountStatus {

    /**
     * 账户ID
     */
    private int accountId;

    /**
     * 账户状态
     */
    private int status;

}
