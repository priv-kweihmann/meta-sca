SRC_URI_append = " https://proxy.golang.org/github.com/kr/text/@v/v0.2.0.zip;srcoutput=github.com/kr/text;srcinput=github.com/kr/text@v0.2.0;downloadfilename=github-com-kr-text-0.2.0.zip;name=github-com-kr-text"
SRC_URI[github-com-kr-text.sha256sum] = "368eb318f91a5b67be905c47032ab5c31a1d49a97848b1011a0d0a2122b30ba4"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/kr/text/License;md5=449bfedd81a372635934cf9ce004c0cf \
"
