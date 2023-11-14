package pl.szlify.codingapi.model;

import lombok.Data;
import lombok.experimental.Accessors;
import pl.szlify.codingapi.validator.NotDateInPast;
import pl.szlify.codingapi.validator.NotEmptyFields;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class LessonDto {
    private Long id;

    @NotEmptyFields
    private Long studentId;

    @NotEmptyFields
    private Long teacherId;

    @NotDateInPast
    private LocalDateTime date;
}
