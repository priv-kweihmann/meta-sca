SRC_URI += "https://proxy.golang.org/github.com/subosito/gotenv/@v/v1.3.0.zip;srcoutput=github.com/subosito/gotenv;srcinput=github.com/subosito/gotenv@v1.3.0;downloadfilename=github-com-subosito-gotenv-1.3.0.zip;name=github-com-subosito-gotenv"
SRC_URI[github-com-subosito-gotenv.sha256sum] = "c9acd4284aba5c737ae6043df0c3c72f3b3b07c0ad22a3d221e98317092d3fc3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/subosito/gotenv/LICENSE;md5=0873257f40b8747d351ccc4288d06a40 \
"

GOSRC_INCLUDEGUARD += "github.com-subosito-gotenv-sources.inc"

