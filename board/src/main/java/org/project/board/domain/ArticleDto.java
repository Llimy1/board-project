package org.project.board.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Article}
 */
public record ArticleDto(String title,
                         String content,
                         String hashtag,
                         LocalDateTime createAt,
                         String createBy,
                         LocalDateTime modifiedAt,
                         String modifiedBy
) implements Serializable {
}