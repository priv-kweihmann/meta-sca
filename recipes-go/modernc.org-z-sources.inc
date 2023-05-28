SRC_URI += "https://proxy.golang.org/modernc.org/z/@v/v1.7.4.zip;srcoutput=modernc.org/z;srcinput=modernc.org/z@v1.7.4;downloadfilename=modernc-org-z-1.7.4.zip;name=modernc-org-z"
SRC_URI[modernc-org-z.sha256sum] = "8d6f1b97bae15437a0a4152ea69c27114179dd248d25f6c60ef9f8404baf700a"
GOSRC_REMOVEDIRS += "modernc.org/z/internal/example_linux_amd64.go"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Zlib \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/z/LICENSE;md5=804147033a3ecebc166f3333c97ed438 \
"

GOSRC_INCLUDEGUARD += "modernc.org-z-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-ccgo-v3-sources.inc', '', 'modernc.org-ccgo-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-libc-sources.inc', '', 'modernc.org-libc-sources.inc', d)}
