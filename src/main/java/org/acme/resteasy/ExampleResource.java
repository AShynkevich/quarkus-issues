package org.acme.resteasy;

import java.io.File;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/upload")
public class ExampleResource {

    @POST
    @Path("/files")
    public void uploadFile(File file) {
        long byteSize = file.length();
        long kiloByteSize = byteSize / 1024 ;
        long megaBytesSize = kiloByteSize / 1024;
        System.out.println("bytes: " + byteSize);
        System.out.println("kilobytes: " + kiloByteSize);
        System.out.println("megabytes: " + megaBytesSize);
        System.out.println(file.getName());
    }
}