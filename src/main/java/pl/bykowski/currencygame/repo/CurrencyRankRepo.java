package pl.bykowski.currencygame.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.currencygame.entity.CurrencyRank;

@Repository
public interface CurrencyRankRepo extends JpaRepository<CurrencyRank, Long> {
}
