SUMMARY = "go.mod: github.com/bufbuild/protocompile"
HOMEPAGE = "https://pkg.go.dev/github.com/bufbuild/protocompile"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-bufbuild-protocompile-sources.inc

EXTRA_DEPENDS += "\
    github.com-google-go-cmp-native \
    github.com-stretchr-testify-native \
    golang.org-x-sync-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/bufbuild/protocompile"

inherit gosrc
inherit native
