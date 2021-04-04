SRC_URI += "https://proxy.golang.org/github.com/rogpeppe/fastuuid/@v/v1.2.0.zip;srcoutput=github.com/rogpeppe/fastuuid;srcinput=github.com/rogpeppe/fastuuid@v1.2.0;downloadfilename=github-com-rogpeppe-fastuuid-1.2.0.zip;name=github-com-rogpeppe-fastuuid"
SRC_URI[github-com-rogpeppe-fastuuid.sha256sum] = "f9b8293f5e20270e26fb4214ca7afec864de92c73d03ff62b5ee29d1db4e72a1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rogpeppe/fastuuid/LICENSE;md5=f2ade4e207e03454ad3e610a00c0ef15 \
"

GOSRC_INCLUDEGUARD += "github.com-rogpeppe-fastuuid-sources.inc"

