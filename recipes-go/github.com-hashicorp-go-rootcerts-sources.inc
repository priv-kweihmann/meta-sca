SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-rootcerts/@v/v1.0.2.zip;srcoutput=github.com/hashicorp/go-rootcerts;srcinput=github.com/hashicorp/go-rootcerts@v1.0.2;downloadfilename=github-com-hashicorp-go-rootcerts-1.0.2.zip;name=github-com-hashicorp-go-rootcerts"
SRC_URI[github-com-hashicorp-go-rootcerts.sha256sum] = "864a48e642e87a273fb5ef60bb3575bd74a7090510f93143163fa6700be31948"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-rootcerts/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-rootcerts-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-go-homedir-sources.inc', '', 'github.com-mitchellh-go-homedir-sources.inc', d)}
