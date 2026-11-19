SRC_URI += "https://proxy.golang.org/go.yaml.in/yaml/v3/@v/v3.0.6.zip;srcoutput=go.yaml.in/yaml/v3;srcinput=go.yaml.in/yaml/v3@v3.0.6;downloadfilename=go-yaml-in-yaml-v3-3.0.6.zip;name=go-yaml-in-yaml-v3"
SRC_URI[go-yaml-in-yaml-v3.sha256sum] = "5ec6b154ced05b5fe8b15aef1287d647a70c9a53f43aa14e42d2bb5aee6cffac"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://go.yaml.in/yaml/v3/LICENSE;md5=3c91c17266710e16afdbb2b6d15c761c \
"

GOSRC_INCLUDEGUARD += "go.yaml.in-yaml-v3-sources.inc"

