SRC_URI += "https://proxy.golang.org/github.com/goji/param/@v/v0.0.0-20160927210335-d7f49fd7d1ed.zip;srcoutput=github.com/goji/param;srcinput=github.com/goji/param@v0.0.0-20160927210335-d7f49fd7d1ed;downloadfilename=github-com-goji-param-0.0.0-20160927210335-d7f49fd7d1ed.zip;name=github-com-goji-param"
SRC_URI[github-com-goji-param.sha256sum] = "2312f5c2256eb010a1673587e919e7e71b5348d3470dd5c2f45ec0187acd707b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/goji/param/LICENSE;md5=f8d950abd905e4b7ac90032fe5b14a99 \
"

GOSRC_INCLUDEGUARD += "github.com-goji-param-sources.inc"

