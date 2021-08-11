package com.company.planner.screen.talk;

import io.jmix.ui.screen.*;
import com.company.planner.entity.Talk;

@UiController("Talk.edit")
@UiDescriptor("talk-edit.xml")
@EditedEntityContainer("talkDc")
public class TalkEdit extends StandardEditor<Talk> {
}