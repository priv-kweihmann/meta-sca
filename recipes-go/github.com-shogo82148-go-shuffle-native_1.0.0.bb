SUMMARY = "go.mod: github.com/shogo82148/go-shuffle"
HOMEPAGE = "https://pkg.go.dev/github.com/shogo82148/go-shuffle"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shogo82148-go-shuffle-sources.inc

GO_IMPORT = "github.com/shogo82148/go-shuffle"

inherit gosrc
inherit native
