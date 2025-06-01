package io.cygnux.console.api;

public final class BeansUtil {

    private BeansUtil() {
    }

    /**
     * @param obj Object
     * @return boolean
     */
    public static boolean isInConsoleBeansPackage(Object obj) {
        return obj != null && obj.getClass().getPackageName().startsWith(BeansUtil.class.getPackageName());
    }

}
