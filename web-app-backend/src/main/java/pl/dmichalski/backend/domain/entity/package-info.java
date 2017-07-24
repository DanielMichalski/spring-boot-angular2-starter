@GenericGenerator(
        name = EntityConstants.ID_GENERATOR_NAME,
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
                @Parameter(name = "prefer_sequence_per_entity", value = "true"),
        }
)

package pl.dmichalski.backend.domain.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import pl.dmichalski.backend.util.EntityConstants;
