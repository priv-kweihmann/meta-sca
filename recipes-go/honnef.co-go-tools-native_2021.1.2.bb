SUMMARY = "go.mod: honnef.co/go/tools"
HOMEPAGE = "https://pkg.go.dev/honnef.co/go/tools"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require honnef.co-go-tools-sources.inc

EXTRA_DEPENDS += "\
    github.com-burntsushi-toml-native \
    github.com-kisielk-gotool-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "honnef.co/go/tools"

UPSTREAM_CHECK_URI = "https://github.com/dominikh/go-tools/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/(?P<pver>\d+\.\d+\.\d+)"

inherit gosrc
inherit native
