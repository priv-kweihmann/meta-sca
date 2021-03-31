SRC_URI_append = " https://proxy.golang.org/github.com/julienschmidt/httprouter/@v/v1.3.0.zip;srcoutput=github.com/julienschmidt/httprouter;srcinput=github.com/julienschmidt/httprouter@v1.3.0;downloadfilename=github-com-julienschmidt-httprouter-1.3.0.zip;name=github-com-julienschmidt-httprouter"
SRC_URI[github-com-julienschmidt-httprouter.sha256sum] = "e457dccd7015f340664e3b8cfd41997471382da2f4a743ee55be539abc6ca1f9"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/julienschmidt/httprouter/LICENSE;md5=f85688063699957f6fa44fa2caacd4a1 \
"
