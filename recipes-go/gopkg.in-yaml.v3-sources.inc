SRC_URI += "https://proxy.golang.org/gopkg.in/yaml.v3/@v/v3.0.0-20220512140231-539c8e751b99.zip;srcoutput=gopkg.in/yaml.v3;srcinput=gopkg.in/yaml.v3@v3.0.0-20220512140231-539c8e751b99;downloadfilename=gopkg-in-yaml-v3-3.0.0-20220512140231-539c8e751b99.zip;name=gopkg-in-yaml-v3"
SRC_URI[gopkg-in-yaml-v3.sha256sum] = "e5b4e720f85d7ae6f8f4060f4a51a86a814eccd77c4347b2ad51a3dc32212cce"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/yaml.v3/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c \
"

GOSRC_INCLUDEGUARD += "gopkg.in-yaml.v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-check.v1-sources.inc', '', 'gopkg.in-check.v1-sources.inc', d)}
