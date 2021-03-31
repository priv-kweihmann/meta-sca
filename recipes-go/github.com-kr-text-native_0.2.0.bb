SUMMARY = "go.mod: github.com/kr/text"
HOMEPAGE = "https://pkg.go.dev/github.com/kr/text"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kr-text-sources.inc
require github.com-creack-pty-sources.inc

GO_IMPORT = "github.com/kr/text"

inherit gosrc
inherit native
