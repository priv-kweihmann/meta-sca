SUMMARY = "go.mod: github.com/benbjohnson/clock"
HOMEPAGE = "https://pkg.go.dev/github.com/benbjohnson/clock"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-benbjohnson-clock-sources.inc

GO_IMPORT = "github.com/benbjohnson/clock"

inherit gosrc
inherit native
