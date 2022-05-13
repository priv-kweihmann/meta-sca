SUMMARY = "go.mod: github.com/srwiley/oksvg"
HOMEPAGE = "https://pkg.go.dev/github.com/srwiley/oksvg"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-srwiley-oksvg-sources.inc

EXTRA_DEPENDS += "\
    github.com-srwiley-rasterx-native \
    golang.org-x-image-native \
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/srwiley/oksvg"

inherit gosrc
inherit native
