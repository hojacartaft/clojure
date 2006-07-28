/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Common Public License 1.0 (http://opensource.org/licenses/cpl.php)
 *   which can be found in the file CPL.TXT at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

package clojure.lang;

/**
 * ArrayMap using identity (==) comparison instead of equals
 */
public class PersistentArrayIdentityMap extends PersistentArrayMap {

public static PersistentArrayIdentityMap EMPTY = new PersistentArrayIdentityMap();


private PersistentArrayIdentityMap() {
}

PersistentArrayMap create(Object... init){
    PersistentArrayIdentityMap ret = new PersistentArrayIdentityMap(init);
    ret._meta = _meta;
    return ret;
}

IPersistentMap createHT(Object[] init){
    PersistentHashtableIdentityMap ret = new PersistentHashtableIdentityMap(init);
    ret._meta = _meta;
    return ret;
}

IPersistentMap empty() {
    if(_meta == null)
        return EMPTY;
    PersistentArrayIdentityMap ret = new PersistentArrayIdentityMap();
    ret._meta = _meta;
    return ret;
}

public PersistentArrayIdentityMap(Object... init) {
    super(init);
}

boolean equalKey(Object k1, Object k2) {
    return k1 == k2;
}
}
