SUMMARY = "go.mod: github.com/chzyer/readline"
HOMEPAGE = "https://pkg.go.dev/github.com/chzyer/readline"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-chzyer-readline-sources.inc

GO_IMPORT = "github.com/chzyer/readline"

inherit gosrc
inherit native
