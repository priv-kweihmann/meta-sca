SRC_URI += "https://proxy.golang.org/github.com/google/martian/v3/@v/v3.1.0.zip;srcoutput=github.com/google/martian/v3;srcinput=github.com/google/martian/v3@v3.1.0;downloadfilename=github-com-google-martian-v3-3.1.0.zip;name=github-com-google-martian-v3"
SRC_URI[github-com-google-martian-v3.sha256sum] = "b8997565c0ae7efb32e4155b80375971c822c2b0aba6097e9735cc247fda3d72"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/martian/v3/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-martian-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
