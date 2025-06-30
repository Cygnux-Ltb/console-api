package io.cygnux.console.api;

import io.mercury.common.util.StringSupport;
import org.slf4j.Logger;

import static io.mercury.common.lang.Asserter.atWithinRangeNotThrows;

public final class ValueValidator {

    private ValueValidator() {
    }

    /**
     * @param strategyId int
     * @param log        Logger
     * @return boolean
     */
    public static boolean illegalStrategyId(int strategyId, Logger log) {
        return atWithinRange("strategyId", strategyId,
                ValueLimitation.MIN_STRATEGY_ID, ValueLimitation.MAX_STRATEGY_ID, log);
    }

    /**
     * @param accountId int
     * @param log       Logger
     * @return boolean
     */
    public static boolean illegalAccountId(int accountId, Logger log) {
        return atWithinRange("accountId", accountId,
                ValueLimitation.MIN_ACCOUNT_ID, ValueLimitation.MAX_ACCOUNT_ID, log);
    }

    /**
     * @param subAccountId int
     * @param log          Logger
     * @return boolean
     */
    public static boolean illegalSubAccountId(int subAccountId, Logger log) {
        return atWithinRange("subAccountId", subAccountId,
                ValueLimitation.MIN_SUB_ACCOUNT_ID, ValueLimitation.MAX_SUB_ACCOUNT_ID, log);
    }

    private static boolean atWithinRange(String paramName, int paramValue, int minValue, int maxValue, Logger logger) {
        if (!atWithinRangeNotThrows(paramValue, minValue, maxValue)) {
            logger.error("illegal int param -> {}=={}", paramName, paramValue);
            return true;
        }
        return false;
    }

    /**
     * @param tradingDay int
     * @param log        Logger
     * @return boolean
     */
    public static boolean illegalTradingDay(int tradingDay, Logger log) {
        if (tradingDay < ValueLimitation.MIN_EPOCH_DATE) {
            log.error("illegal param -> tradingDay=={}", tradingDay);
            return true;
        }
        return false;
    }

    /**
     * @param startTradingDay int
     * @param endTradingDay   int
     * @param log             Logger
     * @return boolean
     */
    public static boolean illegalTradingDay(int startTradingDay, int endTradingDay, Logger log) {
        if (startTradingDay < ValueLimitation.MIN_EPOCH_DATE || endTradingDay < startTradingDay) {
            log.error("illegal param -> startTradingDay=={}, endTradingDay=={}",
                    startTradingDay, endTradingDay);
            return true;
        }
        return false;
    }

    /**
     * @param ordSysId long
     * @param log      Logger
     * @return boolean
     */
    public static boolean illegalOrdSysId(long ordSysId, Logger log) {
        if (ordSysId < ValueLimitation.MIN_ORD_SYS_ID) {
            log.error("illegal param -> ordSysId=={}", ordSysId);
            return true;
        }
        return false;
    }

    /**
     * @param strategyName String
     * @param log          Logger
     * @return boolean
     */
    public static boolean illegalStrategyName(String strategyName, Logger log) {
        return illegalStringParam("strategyName", strategyName, log);
    }

    /**
     * @param investorId String
     * @param log        Logger
     * @return boolean
     */
    public static boolean illegalInvestorId(String investorId, Logger log) {
        return illegalStringParam("investorId", investorId, log);
    }

    /**
     * @param instrumentCode String
     * @param log            Logger
     * @return boolean
     */
    public static boolean illegalInstrumentCode(String instrumentCode, Logger log) {
        return illegalStringParam("instrumentCode", instrumentCode, log);
    }

    /**
     * @param brokerId String
     * @param log      Logger
     * @return boolean
     */
    public static boolean illegalBrokerId(String brokerId, Logger log) {
        return illegalStringParam("brokerId", brokerId, log);
    }

    private static boolean illegalStringParam(String paramName, String paramValue, Logger log) {
        if (StringSupport.isNullOrEmpty(paramValue)) {
            log.error("illegal string param -> {}=={}", paramName, paramValue);
            return true;
        }
        return false;
    }

}
