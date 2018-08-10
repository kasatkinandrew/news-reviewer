package kasatkin.andrew.entity;

import java.util.List;
import java.util.Objects;

public class Article {

    private String articleId;
    private String atricleName;
    private String articleBody;
    private List<String> articleLinks;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getAtricleName() {
        return atricleName;
    }

    public void setAtricleName(String atricleName) {
        this.atricleName = atricleName;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }

    public List<String> getArticleLinks() {
        return articleLinks;
    }

    public void setArticleLinks(List<String> articleLinks) {
        this.articleLinks = articleLinks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(articleId, article.articleId) &&
                Objects.equals(atricleName, article.atricleName) &&
                Objects.equals(articleBody, article.articleBody) &&
                Objects.equals(articleLinks, article.articleLinks);
    }


    @Override
    public int hashCode() {

        return Objects.hash(articleId, atricleName, articleBody, articleLinks);
    }


    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", atricleName='" + atricleName + '\'' +
                ", articleBody='" + articleBody + '\'' +
                ", articleLinks=" + articleLinks +
                '}';
    }
}
