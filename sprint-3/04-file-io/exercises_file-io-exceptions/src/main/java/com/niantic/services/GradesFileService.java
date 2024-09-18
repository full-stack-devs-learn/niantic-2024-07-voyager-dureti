package com.niantic.services;

import com.niantic.models.Assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GradesFileService implements GradesService
{

    @Override
    public String[] getFileNames() {
        File directory = new File("files");
        String[] files = directory.list();

        if (files != null) {
            return Arrays.stream(files).sorted().toArray(String[]::new);
        }
        else {
            return new String[0];
        }
    }

    @Override
    public List<Assignment> getAssignments(String fileName)
    {
        List<Assignment> assignments = new ArrayList<>();

        return assignments;
    }

    @Override
    public List<Assignment> getAllAssignments(String[] fileNames)
    {
        List<Assignment> allAssignments = new ArrayList<>();

        return allAssignments;
    }
}
