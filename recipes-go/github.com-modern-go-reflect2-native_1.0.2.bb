SUMMARY = "go.mod: github.com/modern-go/reflect2"
HOMEPAGE = "https://pkg.go.dev/github.com/modern-go/reflect2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-modern-go-reflect2-sources.inc

GO_IMPORT = "github.com/modern-go/reflect2"

inherit gosrc
inherit native
