package io.cygnux.console.api.wrap;

import io.mercury.common.codec.Envelope;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum OutboxTitle implements Envelope {

    HEARTBEAT,

    BARS,

    SYS_INFO,

    SYS_STRATEGY,

    STRATEGY,

    STRATEGY_PARAM,

    STRATEGY_SYMBOL,

    STRATEGY_INSTRUMENT_PNL_DAILY,

    SYMBOL_INFO,

    SYMBOL_TRADING_FEE,

    SYMBOL_TRADING_PERIOD,

    TRADABLE_INSTRUMENT,

    INIT_FINISH,

    STRATEGY_SWITCH,

    UPDATE_STRATEGY_PARAMS,

    END_BARS,

    UPDATE_STRATEGY_SIGNALS,

    STRATEGY_SIGNAL,

    SIGNAL,

    SIGNAL_PARAM,

    SIGNAL_SYMBOL,

    INIT_CONFIG,

    ;

    private static final Map<String, OutboxTitle> MAP =
            Stream.of(OutboxTitle.values()).collect(Collectors.toMap(OutboxTitle::name, value -> value));

    public static OutboxTitle checkout(@Nonnull String name) {
        OutboxTitle value;
        if ((value = MAP.get(name)) != null)
            return value;
        throw new IllegalArgumentException("checkout with [" + name + "] is null");
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public int getVersion() {
        return 1;
    }

}
