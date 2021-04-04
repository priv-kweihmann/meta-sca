SRC_URI += "https://proxy.golang.org/github.com/kr/pretty/@v/v0.2.1.zip;srcoutput=github.com/kr/pretty;srcinput=github.com/kr/pretty@v0.2.1;downloadfilename=github-com-kr-pretty-0.2.1.zip;name=github-com-kr-pretty"
SRC_URI[github-com-kr-pretty.sha256sum] = "80af0452082052d1b3265d7cb8985d464d4be222c27e14658e95632c222761e5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/kr/pretty/License;md5=449bfedd81a372635934cf9ce004c0cf \
"

GOSRC_INCLUDEGUARD += "github.com-kr-pretty-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kr-text-sources.inc', '', 'github.com-kr-text-sources.inc', d)}
