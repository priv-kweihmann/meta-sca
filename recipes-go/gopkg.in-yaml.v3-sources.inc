SRC_URI += "https://proxy.golang.org/gopkg.in/yaml.v3/@v/v3.0.1.zip;srcoutput=gopkg.in/yaml.v3;srcinput=gopkg.in/yaml.v3@v3.0.1;downloadfilename=gopkg-in-yaml-v3-3.0.1.zip;name=gopkg-in-yaml-v3"
SRC_URI[gopkg-in-yaml-v3.sha256sum] = "aab8fbc4e6300ea08e6afe1caea18a21c90c79f489f52c53e2f20431f1a9a015"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://gopkg.in/yaml.v3/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c \
"

GOSRC_INCLUDEGUARD += "gopkg.in-yaml.v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-check.v1-sources.inc', '', 'gopkg.in-check.v1-sources.inc', d)}
