SRC_URI_append = " https://proxy.golang.org/github.com/russross/blackfriday/v2/@v/v2.1.0.zip;srcoutput=github.com/russross/blackfriday/v2;srcinput=github.com/russross/blackfriday/v2@v2.1.0;downloadfilename=github-com-russross-blackfriday-v2-2.1.0.zip;name=github-com-russross-blackfriday-v2"
SRC_URI[github-com-russross-blackfriday-v2.sha256sum] = "7852750d58a053ce38b01f2c203208817564f552ebf371b2b630081d7004c6ae"

MOD_LICENSE_append = " \
    BSD-2-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/russross/blackfriday/v2/LICENSE.txt;md5=ecf8a8a60560c35a862a4a545f2db1b3 \
"
