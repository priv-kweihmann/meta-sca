SUMMARY = "go.mod: github.com/go-playground/universal-translator"
HOMEPAGE = "https://pkg.go.dev/github.com/go-playground/universal-translator"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-playground-universal-translator-sources.inc

GO_IMPORT = "github.com/go-playground/universal-translator"

inherit gosrc
inherit native
