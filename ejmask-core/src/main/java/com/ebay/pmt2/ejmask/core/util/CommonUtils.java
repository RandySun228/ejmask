package com.ebay.pmt2.ejmask.core.util;


import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

/**
 * Set of utility methods inspired form apache commons
 *
 * @author prakv
 */
public class CommonUtils {

    /**
     * Null-safe check if the specified collection is empty.
     *
     * @param coll the collection to check, may be null
     * @return true if empty or null
     */
    public static boolean isEmpty(Collection coll) {
        return (coll == null || coll.isEmpty());
    }

    /**
     * Null-safe check if the specified collection is not empty.
     *
     * @param coll the collection to check, may be null
     * @return true if non-null and non-empty
     */
    public static boolean isNotEmpty(Collection coll) {
        return !CommonUtils.isEmpty(coll);
    }

    /**
     * Returns an immutable empty list if the argument is <code>null</code>,
     * or the argument itself otherwise.
     *
     * @param <T> the element type
     * @return an empty list if the argument is <code>null</code>
     */
    public static <T> Collection<T> emptyIfNull(Collection<T> collection) {
        return isEmpty(collection) ? Collections.EMPTY_LIST : collection;
    }

    /**
     * <p>Checks if an array of Objects is not empty or not <code>null</code>.</p>
     *
     * @param array the array to test
     * @return <code>true</code> if the array is not empty or not <code>null</code>
     * @since 2.5
     */
    public static boolean isNotAnEmptyArray(Object array) {
        return getLength(array) > 0;
    }

    /**
     * <p>Checks if an array of Objects is empty or not <code>null</code>.</p>
     *
     * @param array the array to test
     * @return <code>true</code> if the array is empty<code>null</code>
     * @since 2.5
     */
    public static boolean isAnEmptyArray(Object array) {
        return getLength(array) == 0;
    }

    /**
     * <p>Returns the length of the specified array.
     *
     * @param array the array to retrieve the length from, may be null
     * @return The length of the array, or {@code 0} if the array is {@code null}
     */
    private static int getLength(final Object array) {
        return (array == null) ? 0 : Array.getLength(array);
    }

    /**
     * <p>Checks if a CharSequence is not empty (""), not null and not whitespace only.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is
     * not empty and not null and not whitespace only
     */
    public static boolean isNotBlank(final CharSequence cs) {
        return !isBlank(cs);
    }

    /**
     * <p>Checks if a CharSequence is empty (""), null or whitespace only.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace only
     */
    public static boolean isBlank(final CharSequence cs) {
        final int strLen = cs == null ? 0 : cs.length();
        if (strLen != 0) {
            for (int i = 0; i < strLen; i++) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}