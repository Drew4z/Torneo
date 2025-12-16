package com.ccc.torneo.shared.NotificationEmail.application.port.outh;

import com.tournament.tournament.NotificationEmail.domain.model.Tournament;

public interface UpdateTournamentPort {
    void save(Tournament tournament);
}
