SUMMARY = "go.mod: github.com/go-git/gcfg"
HOMEPAGE = "https://pkg.go.dev/github.com/go-git/gcfg"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-git-gcfg-sources.inc

GO_IMPORT = "github.com/go-git/gcfg"

inherit gosrc
inherit native
