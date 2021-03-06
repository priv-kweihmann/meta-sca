SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-msgpack/@v/v1.1.5.zip;srcoutput=github.com/hashicorp/go-msgpack;srcinput=github.com/hashicorp/go-msgpack@v1.1.5;downloadfilename=github-com-hashicorp-go-msgpack-1.1.5.zip;name=github-com-hashicorp-go-msgpack"
SRC_URI[github-com-hashicorp-go-msgpack.sha256sum] = "7bdbe258c6c84bb35b26d6a0e613792c17364ac9d5f141cc304cfb636129a6d4"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-msgpack/LICENSE;md5=a03c0693c900925da5789db4e72da142 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-msgpack-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
