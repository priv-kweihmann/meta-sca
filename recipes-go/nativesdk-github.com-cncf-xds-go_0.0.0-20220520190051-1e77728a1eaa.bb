SUMMARY = "go.mod: github.com/cncf/xds/go"
HOMEPAGE = "https://pkg.go.dev/github.com/cncf/xds/go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-cncf-xds-go-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-envoyproxy-protoc-gen-validate \
    nativesdk-github.com-golang-protobuf \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/cncf/xds/go"
inherit gosrc
inherit nativesdk
