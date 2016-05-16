package be.maximvdw.spigotsite.api.resource;

/**
 * Spigot resource update
 * 
 * @author Maxim Van de Wynckel
 */
public interface ResourceUpdate {

    String getUpdateID();

    void setUpdateID(String updateID);

    String getTextHeading();

    void setTextHeading(String textHeading);

    String getArticle();

    void setArticle(String article);

    String getMessageMeta();

    void setMessageMeta(String messageMeta);

    String getUpdateLink();

    void setUpdateLink(String updateLink);
}
