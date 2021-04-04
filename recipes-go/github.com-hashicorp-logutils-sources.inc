SRC_URI += "https://proxy.golang.org/github.com/hashicorp/logutils/@v/v1.0.0.zip;srcoutput=github.com/hashicorp/logutils;srcinput=github.com/hashicorp/logutils@v1.0.0;downloadfilename=github-com-hashicorp-logutils-1.0.0.zip;name=github-com-hashicorp-logutils"
SRC_URI[github-com-hashicorp-logutils.sha256sum] = "0e88424578d1d6b7793b63d30c180a353ce8041701d25dc7c3bcd9841c36db5b"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/logutils/LICENSE;md5=b278a92d2c1509760384428817710378 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-logutils-sources.inc"

