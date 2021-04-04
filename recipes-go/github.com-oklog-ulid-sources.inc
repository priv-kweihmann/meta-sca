SRC_URI += "https://proxy.golang.org/github.com/oklog/ulid/@v/v1.3.1.zip;srcoutput=github.com/oklog/ulid;srcinput=github.com/oklog/ulid@v1.3.1;downloadfilename=github-com-oklog-ulid-1.3.1.zip;name=github-com-oklog-ulid"
SRC_URI[github-com-oklog-ulid.sha256sum] = "40e502c064a922d5eb7f2bc2cda9c6a2a929ec0fc76c9aae4db54fb7b6b611ae"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/oklog/ulid/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-oklog-ulid-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pborman-getopt-v2-sources.inc', '', 'github.com-pborman-getopt-v2-sources.inc', d)}
