SUMMARY = "go.mod: github.com/gin-gonic/gin"
HOMEPAGE = "https://pkg.go.dev/github.com/gin-gonic/gin"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gin-gonic-gin-sources.inc

GO_IMPORT = "github.com/gin-gonic/gin"

inherit gosrc
inherit native
