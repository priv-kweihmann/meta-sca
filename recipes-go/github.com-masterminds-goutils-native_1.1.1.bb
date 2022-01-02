SUMMARY = "go.mod: github.com/Masterminds/goutils"
HOMEPAGE = "https://pkg.go.dev/github.com/Masterminds/goutils"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-masterminds-goutils-sources.inc

GO_IMPORT = "github.com/Masterminds/goutils"

UPSTREAM_CHECK_REGEX = "v(?P<pver>\d+\.\d+)"

inherit gosrc
inherit native
