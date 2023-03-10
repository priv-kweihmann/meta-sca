SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-plugin/@v/v1.4.9.zip;srcoutput=github.com/hashicorp/go-plugin;srcinput=github.com/hashicorp/go-plugin@v1.4.9;downloadfilename=github-com-hashicorp-go-plugin-1.4.9.zip;name=github-com-hashicorp-go-plugin"
SRC_URI[github-com-hashicorp-go-plugin.sha256sum] = "f9fa61ea3e78a5b6a81d5af51f9e5e76f73d4daf40b39a844a039a3912d23030"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-plugin/LICENSE;md5=385ead67d9cf89227f52640ad36b20a6 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-plugin-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-hclog-sources.inc', '', 'github.com-hashicorp-go-hclog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-yamux-sources.inc', '', 'github.com-hashicorp-yamux-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-go-testing-interface-sources.inc', '', 'github.com-mitchellh-go-testing-interface-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-oklog-run-sources.inc', '', 'github.com-oklog-run-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
