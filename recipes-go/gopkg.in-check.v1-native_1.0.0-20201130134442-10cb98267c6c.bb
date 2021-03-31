SUMMARY = "go.mod: gopkg.in/check.v1"
HOMEPAGE = "https://pkg.go.dev/gopkg.in/check.v1"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gopkg.in-check.v1-sources.inc
require github.com-creack-pty-sources.inc
require github.com-kr-pretty-sources.inc
require github.com-kr-text-sources.inc

GO_IMPORT = "gopkg.in/check.v1"

inherit gosrc
inherit native
