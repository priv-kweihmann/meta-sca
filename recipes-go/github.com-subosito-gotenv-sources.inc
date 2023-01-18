SRC_URI += "https://proxy.golang.org/github.com/subosito/gotenv/@v/v1.4.2.zip;srcoutput=github.com/subosito/gotenv;srcinput=github.com/subosito/gotenv@v1.4.2;downloadfilename=github-com-subosito-gotenv-1.4.2.zip;name=github-com-subosito-gotenv"
SRC_URI[github-com-subosito-gotenv.sha256sum] = "5baaaaa7d88a44a5795c7a8ed8e6ffffb8d7fb27fa9c1467eca544c16136b561"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/subosito/gotenv/LICENSE;md5=0873257f40b8747d351ccc4288d06a40 \
"

GOSRC_INCLUDEGUARD += "github.com-subosito-gotenv-sources.inc"

