SUMMARY = "go.mod: github.com/armon/circbuf"
HOMEPAGE = "https://pkg.go.dev/github.com/armon/circbuf"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-armon-circbuf-sources.inc

GO_IMPORT = "github.com/armon/circbuf"

inherit gosrc
inherit native
