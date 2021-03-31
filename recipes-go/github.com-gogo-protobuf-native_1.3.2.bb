SUMMARY = "go.mod: github.com/gogo/protobuf"
HOMEPAGE = "https://pkg.go.dev/github.com/gogo/protobuf"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gogo-protobuf-sources.inc

GO_IMPORT = "github.com/gogo/protobuf"

inherit gosrc
inherit native
