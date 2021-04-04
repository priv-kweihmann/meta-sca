SUMMARY = "go.mod: github.com/karrick/godirwalk"
HOMEPAGE = "https://pkg.go.dev/github.com/karrick/godirwalk"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-karrick-godirwalk-sources.inc

GO_IMPORT = "github.com/karrick/godirwalk"

inherit gosrc
inherit native
