SUMMARY = "go.mod: github.com/tomasen/realip"
HOMEPAGE = "https://pkg.go.dev/github.com/tomasen/realip"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-tomasen-realip-sources.inc

GO_IMPORT = "github.com/tomasen/realip"

inherit gosrc
inherit native
