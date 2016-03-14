/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on 29 Jul, 2013 5:09:57 PM
 * Time to generate: 01:27.288 seconds
 *
 */

package com.huawei.unibi.molap.engine.datastorage;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.unibi.molap.metadata.SliceMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RestructureStoreAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return RestructureStore.class;
    }
    
    public void testConstructor() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        assertEquals("restructureStore.getSliceMetaCacheMap().size()", 0, restructureStore.getSliceMetaCacheMap().size());
        assertEquals("restructureStore.slices.size()", 0, ((Map) getPrivateField(restructureStore, "slices")).size());
    }
    
    public void testEquals() throws Throwable {
        boolean result = new RestructureStore().equals("testString");
        assertFalse("result", result);
    }
    
    public void testEqualsWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        RestructureStore restructureStore2 = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        restructureStore.setFolderName(null);
        restructureStore2.setFolderName(null);
        Mockingbird.enterTestMode(RestructureStore.class);
        boolean result = restructureStore.equals(restructureStore2);
        assertTrue("result", result);
    }
    
    public void testEqualsWithAggressiveMocks1() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        RestructureStore restructureStore2 = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        restructureStore.setFolderName("");
        restructureStore2.setFolderName("");
        Mockingbird.enterTestMode(RestructureStore.class);
        boolean result = restructureStore.equals(restructureStore2);
        assertTrue("result", result);
    }
    
    public void testEqualsWithAggressiveMocks2() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Mockingbird.enterTestMode(RestructureStore.class);
        boolean result = restructureStore.equals(restructureStore);
        assertTrue("result", result);
    }
    
    public void testEqualsWithAggressiveMocks3() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        RestructureStore restructureStore2 = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        restructureStore.setFolderName(null);
        restructureStore2.setFolderName("");
        Mockingbird.enterTestMode(RestructureStore.class);
        boolean result = restructureStore.equals(restructureStore2);
        assertFalse("result", result);
    }
    
    public void testEqualsWithAggressiveMocks4() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        RestructureStore restructureStore2 = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        restructureStore.setFolderName("X");
        restructureStore2.setFolderName("");
        Mockingbird.enterTestMode(RestructureStore.class);
        boolean result = restructureStore.equals(restructureStore2);
        assertFalse("result", result);
    }
    
    public void testGetActiveSliceIds() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        restructureStore.getActiveSliceIds(new ArrayList(100));
        assertEquals("restructureStore.slices.size()", 0, ((Map) getPrivateField(restructureStore, "slices")).size());
    }
    
    public void testGetActiveSliceIdsWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        List list = (List) Mockingbird.getProxyObject(List.class);
        Set set = (Set) Mockingbird.getProxyObject(Set.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Map.Entry entry = (Map.Entry) Mockingbird.getProxyObject(Map.Entry.class);
        List list2 = (List) Mockingbird.getProxyObject(List.class);
        Iterator iterator2 = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Map.Entry entry2 = (Map.Entry) Mockingbird.getProxyObject(Map.Entry.class);
        List list3 = (List) Mockingbird.getProxyObject(List.class);
        Iterator iterator3 = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        InMemoryCube inMemoryCube = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube2 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube3 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube4 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.entrySet(), set);
        setPrivateField(inMemoryCube2, "id", new Long(0L));
        setPrivateField(inMemoryCube3, "id", new Long(0L));
        Mockingbird.setReturnValue(set.iterator(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), entry);
        Mockingbird.setReturnValue(entry.getValue(), list2);
        Mockingbird.setReturnValue(list2.iterator(), iterator2);
        Mockingbird.setReturnValue(iterator2.hasNext(), false);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), entry2);
        Mockingbird.setReturnValue(entry2.getValue(), list3);
        Mockingbird.setReturnValue(list3.iterator(), iterator3);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube);
        Mockingbird.setReturnValue(inMemoryCube.isActive(), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube2);
        Mockingbird.setReturnValue(inMemoryCube2.isActive(), true);
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, list, "add", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube3);
        Mockingbird.setReturnValue(inMemoryCube3.isActive(), true);
        Mockingbird.setReturnValue(false, list, "add", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube4);
        Mockingbird.setReturnValue(inMemoryCube4.isActive(), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), false);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(RestructureStore.class);
        restructureStore.getActiveSliceIds((List) list);
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
    
    public void testGetActiveSlices() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        restructureStore.getActiveSlices(new ArrayList(100));
        assertEquals("restructureStore.slices.size()", 0, ((Map) getPrivateField(restructureStore, "slices")).size());
    }
    
    public void testGetActiveSlicesWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        List list = (List) Mockingbird.getProxyObject(List.class);
        Set set = (Set) Mockingbird.getProxyObject(Set.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Map.Entry entry = (Map.Entry) Mockingbird.getProxyObject(Map.Entry.class);
        List list2 = (List) Mockingbird.getProxyObject(List.class);
        Iterator iterator2 = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Map.Entry entry2 = (Map.Entry) Mockingbird.getProxyObject(Map.Entry.class);
        List list3 = (List) Mockingbird.getProxyObject(List.class);
        Iterator iterator3 = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        InMemoryCube inMemoryCube = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube2 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube3 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube4 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.entrySet(), set);
        Mockingbird.setReturnValue(set.iterator(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), entry);
        Mockingbird.setReturnValue(entry.getValue(), list2);
        Mockingbird.setReturnValue(list2.iterator(), iterator2);
        Mockingbird.setReturnValue(iterator2.hasNext(), false);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), entry2);
        Mockingbird.setReturnValue(entry2.getValue(), list3);
        Mockingbird.setReturnValue(list3.iterator(), iterator3);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube);
        Mockingbird.setReturnValue(inMemoryCube.isActive(), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube2);
        Mockingbird.setReturnValue(inMemoryCube2.isActive(), true);
        Mockingbird.setReturnValue(list.add(inMemoryCube2), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube3);
        Mockingbird.setReturnValue(inMemoryCube3.isActive(), true);
        Mockingbird.setReturnValue(list.add(inMemoryCube3), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube4);
        Mockingbird.setReturnValue(inMemoryCube4.isActive(), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), false);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(RestructureStore.class);
        restructureStore.getActiveSlices(list);
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
    
    public void testGetSliceMetaCacheMap() throws Throwable {
        HashMap result = (HashMap) new RestructureStore().getSliceMetaCacheMap();
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetSliceMetaCacheWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(restructureStore, "sliceMetaCacheMap", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), null);
        Mockingbird.enterTestMode(RestructureStore.class);
        SliceMetaData result = restructureStore.getSliceMetaCache("");
        assertNull("result", result);
        assertNotNull("restructureStore.getSliceMetaCacheMap()", restructureStore.getSliceMetaCacheMap());
    }
    
    public void testGetSlices() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        List result = restructureStore.getSlices("testRestructureStoreTableName");
        assertNull("result", result);
        assertEquals("restructureStore.slices.size()", 0, ((Map) getPrivateField(restructureStore, "slices")).size());
    }
    
    public void testGetSlicesByIds() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        restructureStore.getSlicesByIds(new ArrayList(100), new ArrayList(1000));
        assertEquals("restructureStore.slices.size()", 0, ((Map) getPrivateField(restructureStore, "slices")).size());
    }
    
    public void testGetSlicesByIdsWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        List list = (List) Mockingbird.getProxyObject(List.class);
        List list2 = (List) Mockingbird.getProxyObject(List.class);
        Set set = (Set) Mockingbird.getProxyObject(Set.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Map.Entry entry = (Map.Entry) Mockingbird.getProxyObject(Map.Entry.class);
        List list3 = (List) Mockingbird.getProxyObject(List.class);
        Iterator iterator2 = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Map.Entry entry2 = (Map.Entry) Mockingbird.getProxyObject(Map.Entry.class);
        List list4 = (List) Mockingbird.getProxyObject(List.class);
        Iterator iterator3 = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        InMemoryCube inMemoryCube = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube2 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube3 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube4 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube5 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        InMemoryCube inMemoryCube6 = (InMemoryCube) Mockingbird.getProxyObject(InMemoryCube.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.entrySet(), set);
        setPrivateField(inMemoryCube, "id", new Long(0L));
        setPrivateField(inMemoryCube2, "id", new Long(0L));
        setPrivateField(inMemoryCube3, "id", new Long(0L));
        setPrivateField(inMemoryCube4, "id", new Long(0L));
        setPrivateField(inMemoryCube5, "id", new Long(0L));
        setPrivateField(inMemoryCube6, "id", new Long(0L));
        Mockingbird.setReturnValue(set.iterator(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), entry);
        Mockingbird.setReturnValue(entry.getValue(), list3);
        Mockingbird.setReturnValue(list3.iterator(), iterator2);
        Mockingbird.setReturnValue(iterator2.hasNext(), false);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), entry2);
        Mockingbird.setReturnValue(entry2.getValue(), list4);
        Mockingbird.setReturnValue(list4.iterator(), iterator3);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube);
        Mockingbird.setReturnValue(false, list, "indexOf", "(java.lang.Object)int", new Integer(0), 1);
        Mockingbird.setReturnValue(inMemoryCube.isActive(), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube2);
        Mockingbird.setReturnValue(false, list, "indexOf", "(java.lang.Object)int", new Integer(-1), 1);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube3);
        Mockingbird.setReturnValue(false, list, "indexOf", "(java.lang.Object)int", new Integer(-1), 1);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube4);
        Mockingbird.setReturnValue(false, list, "indexOf", "(java.lang.Object)int", new Integer(0), 1);
        Mockingbird.setReturnValue(inMemoryCube4.isActive(), true);
        Mockingbird.setReturnValue(list2.add(inMemoryCube4), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube5);
        Mockingbird.setReturnValue(false, list, "indexOf", "(java.lang.Object)int", new Integer(0), 1);
        Mockingbird.setReturnValue(inMemoryCube5.isActive(), true);
        Mockingbird.setReturnValue(list2.add(inMemoryCube5), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), true);
        Mockingbird.setReturnValue(iterator3.next(), inMemoryCube6);
        Mockingbird.setReturnValue(false, list, "indexOf", "(java.lang.Object)int", new Integer(0), 1);
        Mockingbird.setReturnValue(inMemoryCube6.isActive(), false);
        Mockingbird.setReturnValue(iterator3.hasNext(), false);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(RestructureStore.class);
        restructureStore.getSlicesByIds((List) list, list2);
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
    
    public void testHashCode() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        restructureStore.setFolderName("testRestructureStoreFolderName");
        int result = restructureStore.hashCode();
        assertEquals("result", -661226133, result);
        assertEquals("restructureStore.getFolderName()", "testRestructureStoreFolderName", restructureStore.getFolderName());
    }
    
    public void testHashCode1() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        int result = restructureStore.hashCode();
        assertEquals("result", 31, result);
        assertNull("restructureStore.getFolderName()", restructureStore.getFolderName());
    }
    
    public void testIsSlicesAvailable() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        boolean result = restructureStore.isSlicesAvailable();
        assertFalse("result", result);
        assertEquals("restructureStore.slices.size()", 0, ((Map) getPrivateField(restructureStore, "slices")).size());
    }
    
    public void testIsSlicesAvailableWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.size(), 1);
        Mockingbird.enterTestMode(RestructureStore.class);
        boolean result = restructureStore.isSlicesAvailable();
        assertTrue("result", result);
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
    
    public void testRemoveSliceWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), null);
        Mockingbird.enterTestMode(RestructureStore.class);
        restructureStore.removeSlice(null, "");
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
    
    public void testRemoveSliceWithAggressiveMocks1() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        List list = (List) Mockingbird.getProxyObject(List.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), list);
        Mockingbird.setReturnValue(list.remove(null), false);
        Mockingbird.enterTestMode(RestructureStore.class);
        restructureStore.removeSlice(null, "");
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
    
    public void testSetFolderName() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        restructureStore.setFolderName("testRestructureStoreFolderName");
        assertEquals("restructureStore.getFolderName()", "testRestructureStoreFolderName", restructureStore.getFolderName());
    }
    
    public void testSetSliceMetaCache() throws Throwable {
        RestructureStore restructureStore = new RestructureStore();
        restructureStore.setSliceMetaCache(new SliceMetaData(), "testRestructureStoreTableName");
        assertEquals("restructureStore.getSliceMetaCacheMap().size()", 1, restructureStore.getSliceMetaCacheMap().size());
    }
    
    public void testSetSliceWithAggressiveMocks() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        List list = (List) Mockingbird.getProxyObject(List.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), list);
        Mockingbird.setReturnValue(list.add((Object) null), false);
        Mockingbird.enterTestMode(RestructureStore.class);
        restructureStore.setSlice(null, "");
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
    
    public void testSetSliceWithAggressiveMocks1() throws Throwable {
        RestructureStore restructureStore = (RestructureStore) Mockingbird.getProxyObject(RestructureStore.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(restructureStore, "slices", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), null);
        ArrayList arrayList = (ArrayList) Mockingbird.getProxyObject(ArrayList.class);
        Mockingbird.replaceObjectForRecording(ArrayList.class, "<init>()", arrayList);
        Mockingbird.setReturnValue(false, map, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(arrayList.add((Object) null), false);
        Mockingbird.enterTestMode(RestructureStore.class);
        restructureStore.setSlice(null, "");
        assertNotNull("restructureStore.slices", getPrivateField(restructureStore, "slices"));
    }
}
