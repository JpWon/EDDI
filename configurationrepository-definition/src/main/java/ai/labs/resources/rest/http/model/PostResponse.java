package ai.labs.resources.rest.http.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostResponse {
    private PropertySavingInstruction propertySavingInstruction;
    private QuickRepliesBuildingInstruction qrBuildInstruction;
}
