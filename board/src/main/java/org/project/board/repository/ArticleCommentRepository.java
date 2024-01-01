package org.project.board.repository;

import org.project.board.domain.Article;
import org.project.board.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
    List<ArticleComment> findAllByArticle(Article article);
}
