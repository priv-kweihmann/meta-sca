SUMMARY = "go.mod: github.com/microsoft/go-winio"
HOMEPAGE = "https://pkg.go.dev/github.com/microsoft/go-winio"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-microsoft-go-winio-sources.inc

EXTRA_DEPENDS += "\
    github.com-pkg-errors-native \
    github.com-sirupsen-logrus-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/microsoft/go-winio"

# windows only
do_compile[noexec] = "1"
UPSTREAM_CHECK_GITHUB_TAGS = "1"

inherit gosrc
inherit native
