package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class getZonesOutput {
    @JsonProperty("zoneGuids")
    private List<String> zoneGuids;

}

