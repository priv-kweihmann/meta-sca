SUMMARY = "go.mod: github.com/kr/pretty"
HOMEPAGE = "https://pkg.go.dev/github.com/kr/pretty"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kr-pretty-sources.inc
require github.com-creack-pty-sources.inc
require github.com-kr-text-sources.inc

GO_IMPORT = "github.com/kr/pretty"

inherit gosrc
inherit native
