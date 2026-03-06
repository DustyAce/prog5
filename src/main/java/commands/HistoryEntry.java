package commands;

import elements.Route;

public record HistoryEntry(Command command, Route... routes) {}
