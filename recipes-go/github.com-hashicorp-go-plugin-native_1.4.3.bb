SUMMARY = "go.mod: github.com/hashicorp/go-plugin"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-plugin"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-plugin-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    github.com-hashicorp-go-hclog-native \
    github.com-hashicorp-yamux-native \
    github.com-mitchellh-go-testing-interface-native \
    github.com-oklog-run-native \
    golang.org-x-net-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "github.com/hashicorp/go-plugin"

inherit gosrc
inherit native
