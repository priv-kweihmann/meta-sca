SUMMARY = "go.mod: github.com/gogo/protobuf"
HOMEPAGE = "https://pkg.go.dev/github.com/gogo/protobuf"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gogo-protobuf-sources.inc

GO_IMPORT = "github.com/gogo/protobuf"

inherit gosrc
inherit native
