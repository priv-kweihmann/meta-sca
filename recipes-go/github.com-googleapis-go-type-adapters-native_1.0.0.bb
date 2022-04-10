SUMMARY = "go.mod: github.com/googleapis/go-type-adapters"
HOMEPAGE = "https://pkg.go.dev/github.com/googleapis/go-type-adapters"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-googleapis-go-type-adapters-sources.inc

EXTRA_DEPENDS += "\
    google.golang.org-genproto-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/googleapis/go-type-adapters"

inherit gosrc
inherit native
