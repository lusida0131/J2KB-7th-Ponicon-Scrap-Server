package j2kb.ponicon.scrap.category;

import j2kb.ponicon.scrap.domain.Category;
import j2kb.ponicon.scrap.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    private String name;
    private User user;

    public Category toEntity() {
        return Category.builder().id(id).name(name).user(user).build();
    }
}
