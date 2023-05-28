SRC_URI += "https://proxy.golang.org/modernc.org/strutil/@v/v1.1.3.zip;srcoutput=modernc.org/strutil;srcinput=modernc.org/strutil@v1.1.3;downloadfilename=modernc-org-strutil-1.1.3.zip;name=modernc-org-strutil"
SRC_URI[modernc-org-strutil.sha256sum] = "2e59915393fa6a75021a97a41c60fac71c662bb9d1dc2d06e2c4ed77ea5da8cc"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/strutil/LICENSE;md5=ee09c224519faeee653d3f276fce27d1 \
"

GOSRC_INCLUDEGUARD += "modernc.org-strutil-sources.inc"

