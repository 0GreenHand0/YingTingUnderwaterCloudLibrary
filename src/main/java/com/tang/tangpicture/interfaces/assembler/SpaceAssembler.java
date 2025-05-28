package com.tang.tangpicture.interfaces.assembler;

import com.tang.tangpicture.domain.space.entity.Space;
import com.tang.tangpicture.interfaces.dto.space.SpaceAddRequest;
import com.tang.tangpicture.interfaces.dto.space.SpaceEditRequest;
import com.tang.tangpicture.interfaces.dto.space.SpaceUpdateRequest;
import org.springframework.beans.BeanUtils;

public class SpaceAssembler {

    public static Space toSpaceEntity(SpaceAddRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }

    public static Space toSpaceEntity(SpaceUpdateRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }

    public static Space toSpaceEntity(SpaceEditRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }
}
