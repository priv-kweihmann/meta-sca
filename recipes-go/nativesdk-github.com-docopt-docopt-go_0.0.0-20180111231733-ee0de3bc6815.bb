SUMMARY = "go.mod: github.com/docopt/docopt-go"
HOMEPAGE = "https://pkg.go.dev/github.com/docopt/docopt-go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-docopt-docopt-go-sources.inc

GO_IMPORT = "github.com/docopt/docopt-go"
inherit gosrc
inherit nativesdk
