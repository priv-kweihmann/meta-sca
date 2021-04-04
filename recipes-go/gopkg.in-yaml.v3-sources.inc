SRC_URI += "https://proxy.golang.org/gopkg.in/yaml.v3/@v/v3.0.0-20210107192922-496545a6307b.zip;srcoutput=gopkg.in/yaml.v3;srcinput=gopkg.in/yaml.v3@v3.0.0-20210107192922-496545a6307b;downloadfilename=gopkg-in-yaml-v3-3.0.0-20210107192922-496545a6307b.zip;name=gopkg-in-yaml-v3"
SRC_URI[gopkg-in-yaml-v3.sha256sum] = "5169b5625d3c351f13e8a4ec4802f709072701b441ed92181c6051ece53615a9"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/yaml.v3/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c \
"

GOSRC_INCLUDEGUARD += "gopkg.in-yaml.v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-check.v1-sources.inc', '', 'gopkg.in-check.v1-sources.inc', d)}
