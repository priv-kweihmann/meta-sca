SRC_URI += "https://proxy.golang.org/github.com/pseudomuto/protokit/@v/v0.2.1.zip;srcoutput=github.com/pseudomuto/protokit;srcinput=github.com/pseudomuto/protokit@v0.2.1;downloadfilename=github-com-pseudomuto-protokit-0.2.1.zip;name=github-com-pseudomuto-protokit"
SRC_URI[github-com-pseudomuto-protokit.sha256sum] = "5a1d6574a061f3d1e81a9d605b65f643a484af3ceb29f59be0188437a1cefab1"
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
