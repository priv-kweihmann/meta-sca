SRC_URI += "https://proxy.golang.org/github.com/fredbi/uri/@v/v0.0.0-20181227131451-3dcfdacbaaf3.zip;srcoutput=github.com/fredbi/uri;srcinput=github.com/fredbi/uri@v0.0.0-20181227131451-3dcfdacbaaf3;downloadfilename=github-com-fredbi-uri-0.0.0-20181227131451-3dcfdacbaaf3.zip;name=github-com-fredbi-uri"
SRC_URI[github-com-fredbi-uri.sha256sum] = "f326e507e1617c96f57ea0856d3ea636d2300ec4e5538da72f4cf6bd51c602c6"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fredbi/uri/LICENSE.md;md5=5332b5648122240556727dbb243b5e11 \
"

GOSRC_INCLUDEGUARD += "github.com-fredbi-uri-sources.inc"

