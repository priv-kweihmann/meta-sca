SUMMARY = "go.mod: github.com/gin-contrib/sse"
HOMEPAGE = "https://pkg.go.dev/github.com/gin-contrib/sse"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gin-contrib-sse-sources.inc

GO_IMPORT = "github.com/gin-contrib/sse"

inherit gosrc
inherit native
