package com.beertag.repository;

import com.beertag.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Integer> {

   Tag findTagByTagName(String tagName);
}
