package com.chris.repository.Impl;

import com.chris.entity.Spittle;
import com.chris.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcSpittleRepository implements SpittleRepository {
	
	private JdbcOperations jdbc;
	
	@Autowired
	public JdbcSpittleRepository(JdbcOperations jdbc)
	{
		this.jdbc = jdbc;
	}
	
	public List<Spittle> findRecentSpittles() {
		return jdbc.query(
			"select id, message, created_at, latitude, longitude" + " from tmp_Spittle" + " order by created_at desc limit 20",
			new SpittleRowMapper());
	}
	
	public List<Spittle> findSpittles(long max, int count) {
		return jdbc.query("select * from  (select rownum rn, t.* from tmp_spittle t where t.id <= ? order by t.id asc )  r where r.rn <= ?",
			new SpittleRowMapper(),
			max,
			count);
	}
	
	public Spittle findOne(long id) {
		return jdbc.queryForObject("select id, message, created_at, latitude, longitude" + " from tmp_Spittle" + " where id = ?",
			new SpittleRowMapper(),
			id);
	}
	
	public void save(Spittle spittle) {
		jdbc.update("insert into tmp_Spittle (message, created_at, latitude, longitude)"
			+ " values (?, ?, ?, ?)", spittle.getMessage(), spittle.getTime(), spittle.getLatitude(), spittle.getLongitude());
	}
	
	private static class SpittleRowMapper implements RowMapper<Spittle> {
		public Spittle mapRow(ResultSet rs, int rowNum)
			throws SQLException {
			return new Spittle(rs.getLong("id"), rs.getString("message"), rs.getDate("created_at"), rs.getDouble("longitude"),
				rs.getDouble("latitude"));
		}
	}
}
