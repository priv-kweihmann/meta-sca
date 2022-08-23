SRC_URI += "https://proxy.golang.org/github.com/subosito/gotenv/@v/v1.4.1.zip;srcoutput=github.com/subosito/gotenv;srcinput=github.com/subosito/gotenv@v1.4.1;downloadfilename=github-com-subosito-gotenv-1.4.1.zip;name=github-com-subosito-gotenv"
SRC_URI[github-com-subosito-gotenv.sha256sum] = "8a4468ab0e49d730116acd47911ebfa217e8237707bf7662671f10864be24372"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/subosito/gotenv/LICENSE;md5=0873257f40b8747d351ccc4288d06a40 \
"

GOSRC_INCLUDEGUARD += "github.com-subosito-gotenv-sources.inc"

