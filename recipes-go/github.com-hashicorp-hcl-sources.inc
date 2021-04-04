SRC_URI += "https://proxy.golang.org/github.com/hashicorp/hcl/@v/v1.0.0.zip;srcoutput=github.com/hashicorp/hcl;srcinput=github.com/hashicorp/hcl@v1.0.0;downloadfilename=github-com-hashicorp-hcl-1.0.0.zip;name=github-com-hashicorp-hcl"
SRC_URI[github-com-hashicorp-hcl.sha256sum] = "54149a2e5121b3e81f961c79210e63d6798eb63de28d2599ee59ade1fa76c82b"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/hcl/LICENSE;md5=b278a92d2c1509760384428817710378 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-hcl-sources.inc"

