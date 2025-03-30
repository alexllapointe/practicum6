package edu.iu.p466.arithmetic_service.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService implements IArithmeticService {

    @Override
    public int add(int n, int m) {
        return n + m;
    }
}