SUMMARY = "go.mod: github.com/gobuffalo/logger"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/logger"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-logger-sources.inc

GO_IMPORT = "github.com/gobuffalo/logger"

inherit gosrc
inherit native
