SRC_URI += "https://proxy.golang.org/github.com/lucor/goinfo/@v/v0.0.0-20230226084616-00a3782edfe9.zip;srcoutput=github.com/lucor/goinfo;srcinput=github.com/lucor/goinfo@v0.0.0-20230226084616-00a3782edfe9;downloadfilename=github-com-lucor-goinfo-0.0.0-20230226084616-00a3782edfe9.zip;name=github-com-lucor-goinfo"
SRC_URI[github-com-lucor-goinfo.sha256sum] = "f64387ffd090bb3f3b075c4a1cfa6d66fec3c8a38b3beb4298f019870e4c2c5f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lucor/goinfo/LICENSE;md5=f4f06bfd0549dc02abef87f46289c271 \
"

GOSRC_INCLUDEGUARD += "github.com-lucor-goinfo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
