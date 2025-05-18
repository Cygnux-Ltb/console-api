package io.cygnuxltb.console.beans;

import io.mercury.common.util.StringSupport;
import org.slf4j.Logger;

import static io.mercury.common.lang.Asserter.atWithinRangeNotThrows;

public final class ValueValidator {

    private ValueValidator() {
    }

    /**
     * @param strategyId int
     * @param logger     Logger
     * @return boolean
     */
    public static boolean illegalStrategyId(int strategyId, Logger logger) {
        return atWithinRange("strategyId", strategyId,
                ValueLimitation.MIN_STRATEGY_ID, ValueLimitation.MAX_STRATEGY_ID, logger);
    }

    /**
     * @param accountId int
     * @param logger    Logger
     * @return boolean
     */
    public static boolean illegalAccountId(int accountId, Logger logger) {
        return atWithinRange("accountId", accountId,
                ValueLimitation.MIN_ACCOUNT_ID, ValueLimitation.MAX_ACCOUNT_ID, logger);
    }

    /**
     * @param subAccountId int
     * @param logger       Logger
     * @return boolean
     */
    public static boolean illegalSubAccountId(int subAccountId, Logger logger) {
        return atWithinRange("subAccountId", subAccountId,
                ValueLimitation.MIN_SUB_ACCOUNT_ID, ValueLimitation.MAX_SUB_ACCOUNT_ID, logger);
    }

    private static boolean atWithinRange(String paramName, int paramValue, int minValue, int maxValue, Logger logger) {
        if (!atWithinRangeNotThrows(paramValue, minValue, maxValue)) {
            logger.error("illegal int param -> {}=={}", paramName, paramValue);
            return true;
        }
        return false;
    }

    public static boolean illegalTradingDay(int tradingDay, Logger logger) {
        if (tradingDay < ValueLimitation.MIN_EPOCH_DATE) {
            logger.error("illegal param -> tradingDay=={}", tradingDay);
            return true;
        }
        return false;
    }

    public static boolean illegalTradingDay(int startTradingDay, int endTradingDay, Logger logger) {
        if (startTradingDay < ValueLimitation.MIN_EPOCH_DATE || endTradingDay < startTradingDay) {
            logger.error("illegal param -> startTradingDay=={}, endTradingDay=={}",
                    startTradingDay, endTradingDay);
            return true;
        }
        return false;
    }

    public static boolean illegalOrdSysId(long ordSysId, Logger logger) {
        if (ordSysId < ValueLimitation.MIN_ORD_SYS_ID) {
            logger.error("illegal param -> ordSysId=={}", ordSysId);
            return true;
        }
        return false;
    }

    public static boolean illegalStrategyName(String strategyName, Logger logger) {
        return illegalStringParam("strategyName", strategyName, logger);
    }

    public static boolean illegalInvestorId(String investorId, Logger logger) {
        return illegalStringParam("investorId", investorId, logger);
    }

    public static boolean illegalInstrumentCode(String instrumentCode, Logger logger) {
        return illegalStringParam("instrumentCode", instrumentCode, logger);
    }

    public static boolean illegalBrokerId(String brokerId, Logger logger) {
        return illegalStringParam("brokerId", brokerId, logger);
    }

    private static boolean illegalStringParam(String paramName, String paramValue, Logger logger) {
        if (StringSupport.isNullOrEmpty(paramValue)) {
            logger.error("illegal string param -> {}=={}", paramName, paramValue);
            return true;
        }
        return false;
    }

}
