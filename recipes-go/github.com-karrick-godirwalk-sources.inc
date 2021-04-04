SRC_URI += "https://proxy.golang.org/github.com/karrick/godirwalk/@v/v1.16.1.zip;srcoutput=github.com/karrick/godirwalk;srcinput=github.com/karrick/godirwalk@v1.16.1;downloadfilename=github-com-karrick-godirwalk-1.16.1.zip;name=github-com-karrick-godirwalk"
SRC_URI[github-com-karrick-godirwalk.sha256sum] = "b2aa8e2d798891d3b6fda14fc27b8c1090a505b98970fc0903a9722797c20a00"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/karrick/godirwalk/LICENSE;md5=7bea66fc0a31c6329f9392034bee75d2 \
"

GOSRC_INCLUDEGUARD += "github.com-karrick-godirwalk-sources.inc"

