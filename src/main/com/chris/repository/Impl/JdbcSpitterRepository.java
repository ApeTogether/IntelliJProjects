package com.chris.repository.Impl;

import com.chris.entity.Spitter;
import com.chris.repository.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 14:07
 * @Description
 */
public class JdbcSpitterRepository implements SpitterRepository {
	
	private JdbcOperations jdbc;
	
	@Autowired
	public JdbcSpitterRepository(JdbcOperations jdbc)
	{
		this.jdbc = jdbc;
	}
	
	@Override
	public Spitter save(Spitter spitter) {
		jdbc.update("insert into Spitter (username, password, first_name, last_name, email)" + " values (?, ?, ?, ?, ?)",
			spitter.getUsername(),
			spitter.getPassword(),
			spitter.getFirstName(),
			spitter.getLastName(),
			spitter.getEmail());
		return spitter;
	}
	
	@Override
	public Spitter findByUsername(String username) {
		return jdbc.queryForObject("select id, username, null, first_name, last_name, email from Spitter where username=?",
			new SpitterRowMapper(),
			username);
	}
	
	private static class SpitterRowMapper implements RowMapper<Spitter> {
		public Spitter mapRow(ResultSet rs, int rowNum)
			throws SQLException {
			return new Spitter(rs.getLong("id"), rs.getString("username"), null, rs.getString("first_name"), rs.getString("last_name"),
				rs.getString("email"));
		}
	}
}
