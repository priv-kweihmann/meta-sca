SRC_URI += "https://proxy.golang.org/github.com/subosito/gotenv/@v/v1.4.0.zip;srcoutput=github.com/subosito/gotenv;srcinput=github.com/subosito/gotenv@v1.4.0;downloadfilename=github-com-subosito-gotenv-1.4.0.zip;name=github-com-subosito-gotenv"
SRC_URI[github-com-subosito-gotenv.sha256sum] = "e3800909df2f0bc9370449dc02017482cae3a2a1dc98d2f70c8b3a2cfda346dd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/subosito/gotenv/LICENSE;md5=0873257f40b8747d351ccc4288d06a40 \
"

GOSRC_INCLUDEGUARD += "github.com-subosito-gotenv-sources.inc"

