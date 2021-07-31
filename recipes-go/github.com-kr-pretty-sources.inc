SRC_URI += "https://proxy.golang.org/github.com/kr/pretty/@v/v0.3.0.zip;srcoutput=github.com/kr/pretty;srcinput=github.com/kr/pretty@v0.3.0;downloadfilename=github-com-kr-pretty-0.3.0.zip;name=github-com-kr-pretty"
SRC_URI[github-com-kr-pretty.sha256sum] = "3ac65e185f956d889d77485173fadcc30e959b6bcfdaa8acafaec5f4dac5cd48"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/kr/pretty/License;md5=449bfedd81a372635934cf9ce004c0cf \
"

GOSRC_INCLUDEGUARD += "github.com-kr-pretty-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kr-text-sources.inc', '', 'github.com-kr-text-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-go-internal-sources.inc', '', 'github.com-rogpeppe-go-internal-sources.inc', d)}
