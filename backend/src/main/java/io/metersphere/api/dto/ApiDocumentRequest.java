package io.metersphere.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author song.tianyang
 * @Date 2021/2/7 10:32 上午
 * @Description
 */
@Getter
@Setter
public class ApiDocumentRequest {
    private String projectId;
    private List<String> moduleIds;
    private String shareId;
}
