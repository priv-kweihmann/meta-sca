SRC_URI += "https://proxy.golang.org/github.com/lucor/goinfo/@v/v0.0.0-20210802170112-c078a2b0f08b.zip;srcoutput=github.com/lucor/goinfo;srcinput=github.com/lucor/goinfo@v0.0.0-20210802170112-c078a2b0f08b;downloadfilename=github-com-lucor-goinfo-0.0.0-20210802170112-c078a2b0f08b.zip;name=github-com-lucor-goinfo"
SRC_URI[github-com-lucor-goinfo.sha256sum] = "b7ff071518fbfa133e30f98f7ecd9dbd25609821cc809e762c33f988b3d7b6e7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lucor/goinfo/LICENSE;md5=f4f06bfd0549dc02abef87f46289c271 \
"

GOSRC_INCLUDEGUARD += "github.com-lucor-goinfo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
