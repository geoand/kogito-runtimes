package org.drools.lang;
/*
 * Copyright 2005 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import org.antlr.runtime.RecognitionException;

public class GeneralParseException extends RecognitionException {

    private String message;
    
    public GeneralParseException(String message, int line) {
        this.message = message; 
        this.line = line;
    }
    
    public String getMessage() {
        return message;
    }
    
}