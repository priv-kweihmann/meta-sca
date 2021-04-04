SRC_URI += "https://proxy.golang.org/github.com/yudai/golcs/@v/v0.0.0-20170316035057-ecda9a501e82.zip;srcoutput=github.com/yudai/golcs;srcinput=github.com/yudai/golcs@v0.0.0-20170316035057-ecda9a501e82;downloadfilename=github-com-yudai-golcs-0.0.0-20170316035057-ecda9a501e82.zip;name=github-com-yudai-golcs"
SRC_URI[github-com-yudai-golcs.sha256sum] = "ab50327aa849e409b14f5373543635fb53476792b65a1914f6f90c46fc64ee44"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yudai/golcs/LICENSE;md5=fcf864790a87498e538b9f7e1707598c \
"

GOSRC_INCLUDEGUARD += "github.com-yudai-golcs-sources.inc"

