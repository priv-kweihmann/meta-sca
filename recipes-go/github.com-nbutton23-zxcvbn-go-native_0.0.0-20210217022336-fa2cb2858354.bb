SUMMARY = "go.mod: github.com/nbutton23/zxcvbn-go"
HOMEPAGE = "https://pkg.go.dev/github.com/nbutton23/zxcvbn-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-nbutton23-zxcvbn-go-sources.inc

GO_IMPORT = "github.com/nbutton23/zxcvbn-go"

inherit gosrc
inherit native
