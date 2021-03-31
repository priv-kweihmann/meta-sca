SUMMARY = "go.mod: github.com/matttproud/golang_protobuf_extensions"
HOMEPAGE = "https://pkg.go.dev/github.com/matttproud/golang_protobuf_extensions"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-matttproud-golang-protobuf-extensions-sources.inc

GO_IMPORT = "github.com/matttproud/golang_protobuf_extensions"

inherit gosrc
inherit native
