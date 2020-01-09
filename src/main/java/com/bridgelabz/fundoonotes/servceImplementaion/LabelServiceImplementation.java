package com.bridgelabz.fundoonotes.servceImplementaion;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bridgelabz.fundoonotes.dto.LabelDto;
import com.bridgelabz.fundoonotes.exception.LabelAlreadyExistException;
import com.bridgelabz.fundoonotes.model.Label;
import com.bridgelabz.fundoonotes.model.Note;
import com.bridgelabz.fundoonotes.model.User;
import com.bridgelabz.fundoonotes.repository.LabelRepository;
import com.bridgelabz.fundoonotes.repository.NoteRepository;
import com.bridgelabz.fundoonotes.repository.UserRepository;
import com.bridgelabz.fundoonotes.service.LabelService;
import com.bridgelabz.fundoonotes.utility.JwtGenerator;

@Service
public  class LabelServiceImplementation implements LabelService {

	@Autowired
	private JwtGenerator jwtGenerator;

	@Autowired
	private UserRepository userRepository;


	@Autowired
	private LabelRepository labelRepository;

	@Autowired
	private NoteRepository noterepository;

	@Override
	public boolean createlabel(LabelDto labelDto, String token) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createOrMapWithNote(LabelDto labelDto, long noteId, String token) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLabels(String token, long noteId, long labelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletepermanently(String token, long labelId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateLabel(String token, long labelId, LabelDto labelDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean addLabels(String token, long noteId, long labelId) {
		// TODO Auto-generated method stub
		return false;
	}


}