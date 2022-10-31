SUMMARY = "go.mod: github.com/matttproud/golang_protobuf_extensions"
HOMEPAGE = "https://pkg.go.dev/github.com/matttproud/golang_protobuf_extensions"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-matttproud-golang-protobuf-extensions-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-golang-protobuf"
GO_IMPORT = "github.com/matttproud/golang_protobuf_extensions"
inherit gosrc
inherit nativesdk
