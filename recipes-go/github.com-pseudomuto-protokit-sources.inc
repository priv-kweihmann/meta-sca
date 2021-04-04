SRC_URI += "https://proxy.golang.org/github.com/pseudomuto/protokit/@v/v0.2.0.zip;srcoutput=github.com/pseudomuto/protokit;srcinput=github.com/pseudomuto/protokit@v0.2.0;downloadfilename=github-com-pseudomuto-protokit-0.2.0.zip;name=github-com-pseudomuto-protokit"
SRC_URI[github-com-pseudomuto-protokit.sha256sum] = "16d5fe0f6ac5bebbf9f2f05fde72f28bbf05bb18baef045b9ae79c2585f4e127"
export CGO_ENABLED = "1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pseudomuto/protokit/LICENSE;md5=0ca094eca23877a30641a056baafeda5 \
"

GOSRC_INCLUDEGUARD += "github.com-pseudomuto-protokit-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
