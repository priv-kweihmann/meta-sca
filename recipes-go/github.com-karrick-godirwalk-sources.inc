SRC_URI += "https://proxy.golang.org/github.com/karrick/godirwalk/@v/v1.17.0.zip;srcoutput=github.com/karrick/godirwalk;srcinput=github.com/karrick/godirwalk@v1.17.0;downloadfilename=github-com-karrick-godirwalk-1.17.0.zip;name=github-com-karrick-godirwalk"
SRC_URI[github-com-karrick-godirwalk.sha256sum] = "8b0c4399d8df96c0d0c358d077fbdd9c190025f8dbc4d945f11aff9333ed8c21"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/karrick/godirwalk/LICENSE;md5=7bea66fc0a31c6329f9392034bee75d2 \
"

GOSRC_INCLUDEGUARD += "github.com-karrick-godirwalk-sources.inc"

