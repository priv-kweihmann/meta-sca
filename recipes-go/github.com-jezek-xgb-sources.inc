SRC_URI += "https://proxy.golang.org/github.com/jezek/xgb/@v/v1.1.0.zip;srcoutput=github.com/jezek/xgb;srcinput=github.com/jezek/xgb@v1.1.0;downloadfilename=github-com-jezek-xgb-1.1.0.zip;name=github-com-jezek-xgb"
SRC_URI[github-com-jezek-xgb.sha256sum] = "60408d792721de68bbfe1b66589c803028c640ed04741e92dad7d6a431b5d434"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    WTFPL \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jezek/xgb/LICENSE;md5=8f2b26c1f75e2d57c4f5c1659bc61619 \
    file://src/github.com/jezek/xgb/xgbgen/COPYING;md5=f312a7c4d02230e8f2b537295d375c69 \
"

GOSRC_INCLUDEGUARD += "github.com-jezek-xgb-sources.inc"

