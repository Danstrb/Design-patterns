package com.utgard.structuralPaterns.decorator.exercise;

public class Editor {
    public void openProject(String path) {
        ArtefactMarker[] artefacts = {
                new ErrorMarker(new MainMarker(new Artefact("Main"))),
                new ErrorMarker(new Artefact("Demo")),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}