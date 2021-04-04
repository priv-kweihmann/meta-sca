SRC_URI += "https://proxy.golang.org/github.com/go-martini/martini/@v/v0.0.0-20170121215854-22fa46961aab.zip;srcoutput=github.com/go-martini/martini;srcinput=github.com/go-martini/martini@v0.0.0-20170121215854-22fa46961aab;downloadfilename=github-com-go-martini-martini-0.0.0-20170121215854-22fa46961aab.zip;name=github-com-go-martini-martini"
SRC_URI[github-com-go-martini-martini.sha256sum] = "0561a4dadd68dbc1b38c09ed95bbfc5073b0a7708b9a787d38533ebd48040ec2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-martini/martini/LICENSE;md5=5d08fad15bfbbccc1d440ee6f3dcfd37 \
"

GOSRC_INCLUDEGUARD += "github.com-go-martini-martini-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-codegangsta-inject-sources.inc', '', 'github.com-codegangsta-inject-sources.inc', d)}
