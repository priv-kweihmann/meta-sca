SUMMARY = "go.mod: github.com/gomodule/redigo"
HOMEPAGE = "https://pkg.go.dev/github.com/gomodule/redigo"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gomodule-redigo-sources.inc

GO_IMPORT = "github.com/gomodule/redigo"

# version is somehow broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
