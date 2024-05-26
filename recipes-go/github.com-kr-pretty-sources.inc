SRC_URI += "https://proxy.golang.org/github.com/kr/pretty/@v/v0.3.1.zip;srcoutput=github.com/kr/pretty;srcinput=github.com/kr/pretty@v0.3.1;downloadfilename=github-com-kr-pretty-0.3.1.zip;name=github-com-kr-pretty"
SRC_URI[github-com-kr-pretty.sha256sum] = "ecf5a4af24826c3ad758ce06410ca08e2d58e4d95053be3b9dde2e14852c0cdc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/kr/pretty/License;md5=449bfedd81a372635934cf9ce004c0cf \
"

GOSRC_INCLUDEGUARD += "github.com-kr-pretty-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kr-text-sources.inc', '', 'github.com-kr-text-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-go-internal-sources.inc', '', 'github.com-rogpeppe-go-internal-sources.inc', d)}
