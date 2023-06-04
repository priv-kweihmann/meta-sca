SUMMARY = "go.mod: github.com/hashicorp/go-plugin"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-plugin"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-plugin-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-hashicorp-go-hclog \
    nativesdk-github.com-hashicorp-yamux \
    nativesdk-github.com-mitchellh-go-testing-interface \
    nativesdk-github.com-oklog-run \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "github.com/hashicorp/go-plugin"
inherit gosrc
inherit nativesdk
