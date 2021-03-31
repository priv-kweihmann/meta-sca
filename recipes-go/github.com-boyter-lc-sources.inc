SRC_URI_append = " https://proxy.golang.org/github.com/boyter/lc/@v/v1.3.1.zip;srcoutput=github.com/boyter/lc;srcinput=github.com/boyter/lc@v1.3.1;downloadfilename=github-com-boyter-lc-1.3.1.zip;name=github-com-boyter-lc"
SRC_URI[github-com-boyter-lc.sha256sum] = "fa311055664a5682654d79d0ffe955ecd862a5e104abe8e3f781d4551fcd388c"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/boyter/lc/LICENSE;md5=c80dc78b1efbb79817c0b2699aa1b357 \
"
