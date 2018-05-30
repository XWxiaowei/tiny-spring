package us.codecraft.tinyioc.beans.io;

/**
 * @author xiang.wei
 * @create 2018/5/30 17:16
 */
public interface ResourceLoader {
    /**
     * @param location
     * @return
     */
    public Resource getResource(String location);
}
