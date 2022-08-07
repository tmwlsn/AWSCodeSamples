package com.canmage.awscodesamples;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.yworks.util.annotation.Obfuscation;
import lombok.SneakyThrows;

@SuppressWarnings("unused")
@Obfuscation()
public class LambdaExecutor implements RequestHandler<StartRunRequest, StartRunResponse> {

    @SneakyThrows
    @Override
    public StartRunResponse handleRequest(StartRunRequest request, Context context) {

        return StartRunResponse.builder().build();
    }
}
