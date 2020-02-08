package com.cloud.eurekaclient.api.v1;

import org.springframework.web.bind.annotation.ResponseBody;

public interface GreetingServiceApi {

	public @ResponseBody String getMessage();
}
