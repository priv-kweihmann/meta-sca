SRC_URI += "https://proxy.golang.org/github.com/fredbi/uri/@v/v0.0.0-20221002085739-62643c0df0c8.zip;srcoutput=github.com/fredbi/uri;srcinput=github.com/fredbi/uri@v0.0.0-20221002085739-62643c0df0c8;downloadfilename=github-com-fredbi-uri-0.0.0-20221002085739-62643c0df0c8.zip;name=github-com-fredbi-uri"
SRC_URI[github-com-fredbi-uri.sha256sum] = "cafbb80f6fb7cee6b9e279a99e18181d089b5cc974e238c88c5e757b0b0ddc06"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fredbi/uri/LICENSE.md;md5=5332b5648122240556727dbb243b5e11 \
"

GOSRC_INCLUDEGUARD += "github.com-fredbi-uri-sources.inc"

