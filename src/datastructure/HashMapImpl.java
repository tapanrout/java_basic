package datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapImpl {
    public static void main(String[] args) {
//        HashMap<String,String> map = new HashMap<>();
//        //map.put(key,value);
//        //map.get(key);
//        //map.containsKey();
//        //map.size();
//        //map.keySet();
//        //map.entrySet();
////        (n - 1) & hash
//        System.out.println(map.put("india","delhi123"));
//        System.out.println(map.put("india","delhi"));
        CustomHashMap<String,String> customHashMap = new CustomHashMap();
        customHashMap.put("india","delhi");
        customHashMap.put("india","delhi1");
        customHashMap.printHashMap();
    }
}
class CustomHashMap<K,V>{
    int bs;
    LinkedList<MapNode> storageBucket[];
    public CustomHashMap(){
        bs=6;
        storageBucket= new LinkedList[bs];
        for(int i=0;i<bs;i++){
            storageBucket[i]= new LinkedList<>();
        }
        
    }
    public K put(K key,V value){
        int indexNumber = hashFunction(key);
        int isPresent = ifKeyPresent(key,value,indexNumber);
        if(isPresent!=-1){
            MapNode mapNode= storageBucket[indexNumber].get(isPresent);
            mapNode.value=value;
            return key;
        }
        MapNode mapNode= new MapNode(key,value);
        storageBucket[indexNumber].add(mapNode);
        return null;
    }
    private int ifKeyPresent(K key, V value, int indexNumber) {
        LinkedList<MapNode> llValue = storageBucket[indexNumber];
        for(int i=0;i<llValue.size();i++){
            MapNode mapNode = llValue.get(i);
            if(mapNode.key== key){
                return i;
            }
        }
        return -1;
    }
    public int hashFunction(K key){
        return (this.bs - 1) & key.hashCode();
    }
    public void printHashMap(){
        for(int i=0;i< storageBucket.length;i++){
            LinkedList<MapNode> n= storageBucket[i];
            for(int k=0;k<n.size();k++){
                MapNode map=n.get(k);
                System.out.println(map.key+"--------"+map.value);
            }
        }
    }
}
class MapNode<K,V>{
    K key;
    V value;
    public MapNode(K key,V value){
        this.key=key;
        this.value=value;
    }
}

