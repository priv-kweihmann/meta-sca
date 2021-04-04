SUMMARY = "go.mod: github.com/go-kit/kit"
HOMEPAGE = "https://pkg.go.dev/github.com/go-kit/kit"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-kit-kit-sources.inc

GO_IMPORT = "github.com/go-kit/kit"

# version is somehow broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
