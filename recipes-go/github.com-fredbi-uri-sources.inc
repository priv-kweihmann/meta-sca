SRC_URI += "https://proxy.golang.org/github.com/fredbi/uri/@v/v0.0.0-20221012073901-fb871453c6d3.zip;srcoutput=github.com/fredbi/uri;srcinput=github.com/fredbi/uri@v0.0.0-20221012073901-fb871453c6d3;downloadfilename=github-com-fredbi-uri-0.0.0-20221012073901-fb871453c6d3.zip;name=github-com-fredbi-uri"
SRC_URI[github-com-fredbi-uri.sha256sum] = "b60e4c217a00705f1d5a52807f6ba84f951737b8ff99f1c0ee970970104cde8b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fredbi/uri/LICENSE.md;md5=5332b5648122240556727dbb243b5e11 \
"

GOSRC_INCLUDEGUARD += "github.com-fredbi-uri-sources.inc"

