SRC_URI_append = " https://proxy.golang.org/gopkg.in/yaml.v3/@v/v3.0.0-20210107192922-496545a6307b.zip;srcoutput=gopkg.in/yaml.v3;srcinput=gopkg.in/yaml.v3@v3.0.0-20210107192922-496545a6307b;downloadfilename=gopkg-in-yaml-v3-3.0.0-20210107192922-496545a6307b.zip;name=gopkg-in-yaml-v3"
SRC_URI[gopkg-in-yaml-v3.sha256sum] = "5169b5625d3c351f13e8a4ec4802f709072701b441ed92181c6051ece53615a9"

MOD_LICENSE_append = " \
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/gopkg.in/yaml.v3/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c \
"
