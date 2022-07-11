package com.utgard.creationalPatterns.factory.sharp;

import com.utgard.creationalPatterns.factory.matcha.Controller;
import com.utgard.creationalPatterns.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
