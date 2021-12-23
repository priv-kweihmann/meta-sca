SUMMARY = "go.mod: github.com/quasilyte/go-consistent"
HOMEPAGE = "https://pkg.go.dev/github.com/quasilyte/go-consistent"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-quasilyte-go-consistent-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-toolsmith-astcast-native \
    github.com-go-toolsmith-astequal-native \
    github.com-go-toolsmith-astinfo-native \
    github.com-go-toolsmith-pkgload-native \
    github.com-go-toolsmith-typep-native \
    github.com-kisielk-gotool-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/quasilyte/go-consistent"

inherit gosrc
inherit native
