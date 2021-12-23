SUMMARY = "go.mod: github.com/circonus-labs/circonusllhist"
HOMEPAGE = "https://pkg.go.dev/github.com/circonus-labs/circonusllhist"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-circonus-labs-circonusllhist-sources.inc

GO_IMPORT = "github.com/circonus-labs/circonusllhist"

UPSTREAM_CHECK_GITHUB_TAGS = "1"

inherit gosrc
inherit native
