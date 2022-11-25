SRC_URI += "https://proxy.golang.org/github.com/fredbi/uri/@v/v0.0.0-20221118185335-949b11f85901.zip;srcoutput=github.com/fredbi/uri;srcinput=github.com/fredbi/uri@v0.0.0-20221118185335-949b11f85901;downloadfilename=github-com-fredbi-uri-0.0.0-20221118185335-949b11f85901.zip;name=github-com-fredbi-uri"
SRC_URI[github-com-fredbi-uri.sha256sum] = "e28be3e6e2ab5e0397d443f08467cdd7352b3f2aef31554c5e1c9d380de00f19"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fredbi/uri/LICENSE.md;md5=5332b5648122240556727dbb243b5e11 \
"

GOSRC_INCLUDEGUARD += "github.com-fredbi-uri-sources.inc"

