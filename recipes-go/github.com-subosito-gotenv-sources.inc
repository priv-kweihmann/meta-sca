SRC_URI += "https://proxy.golang.org/github.com/subosito/gotenv/@v/v1.2.0.zip;srcoutput=github.com/subosito/gotenv;srcinput=github.com/subosito/gotenv@v1.2.0;downloadfilename=github-com-subosito-gotenv-1.2.0.zip;name=github-com-subosito-gotenv"
SRC_URI[github-com-subosito-gotenv.sha256sum] = "21474df92536f36de6f91dfbf466995289445cc4e5a5900d9c40ae8776b8b0cf"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/subosito/gotenv/LICENSE;md5=0873257f40b8747d351ccc4288d06a40 \
"

GOSRC_INCLUDEGUARD += "github.com-subosito-gotenv-sources.inc"

