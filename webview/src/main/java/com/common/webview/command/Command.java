package com.common.webview.command;

import java.util.Map;

public interface Command {
    String name();
    void execute(Map param);
}