SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-plugin/@v/v1.4.2.zip;srcoutput=github.com/hashicorp/go-plugin;srcinput=github.com/hashicorp/go-plugin@v1.4.2;downloadfilename=github-com-hashicorp-go-plugin-1.4.2.zip;name=github-com-hashicorp-go-plugin"
SRC_URI[github-com-hashicorp-go-plugin.sha256sum] = "78c58c09f0d595d82fe929f575b15751f45de1737a0f3f959f49da9695f39fbd"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-plugin/LICENSE;md5=d44fdeb607e2d2614db9464dbedd4094 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-plugin-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-hclog-sources.inc', '', 'github.com-hashicorp-go-hclog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-yamux-sources.inc', '', 'github.com-hashicorp-yamux-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-go-testing-interface-sources.inc', '', 'github.com-mitchellh-go-testing-interface-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-oklog-run-sources.inc', '', 'github.com-oklog-run-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
