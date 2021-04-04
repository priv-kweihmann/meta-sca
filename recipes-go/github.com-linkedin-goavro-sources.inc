SRC_URI += "https://proxy.golang.org/github.com/linkedin/goavro/@v/v1.0.5.zip;srcoutput=github.com/linkedin/goavro;srcinput=github.com/linkedin/goavro@v1.0.5;downloadfilename=github-com-linkedin-goavro-1.0.5.zip;name=github-com-linkedin-goavro"
SRC_URI[github-com-linkedin-goavro.sha256sum] = "99bd921e22b836e6e6c50b5e78a1f57b8a71dca122ea80a4a8e5b5fe9babde99"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/linkedin/goavro/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-linkedin-goavro-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-snappy-sources.inc', '', 'github.com-golang-snappy-sources.inc', d)}
