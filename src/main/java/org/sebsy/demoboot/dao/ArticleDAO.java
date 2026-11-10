package org.sebsy.demoboot.dao;

import org.sebsy.demoboot.domain.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleDAO extends CrudRepository<Article, Long> {
}
