SUMMARY = "go.mod: github.com/golang/protobuf"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/protobuf"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-protobuf-sources.inc

EXTRA_DEPENDS += "\
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/golang/protobuf"

inherit gosrc
inherit native
