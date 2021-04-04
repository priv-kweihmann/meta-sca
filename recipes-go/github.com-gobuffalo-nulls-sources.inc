SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/nulls/@v/v0.4.0.zip;srcoutput=github.com/gobuffalo/nulls;srcinput=github.com/gobuffalo/nulls@v0.4.0;downloadfilename=github-com-gobuffalo-nulls-0.4.0.zip;name=github-com-gobuffalo-nulls"
SRC_URI[github-com-gobuffalo-nulls.sha256sum] = "cfd609219d1ae0671016913355de32f170b604695d15521854c2b1529377be39"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/nulls/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-nulls-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gofrs-uuid-sources.inc', '', 'github.com-gofrs-uuid-sources.inc', d)}
