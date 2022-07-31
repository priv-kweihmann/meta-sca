SUMMARY = "go.mod: github.com/jolestar/go-commons-pool"
HOMEPAGE = "https://pkg.go.dev/github.com/jolestar/go-commons-pool"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jolestar-go-commons-pool-sources.inc

GO_IMPORT = "github.com/jolestar/go-commons-pool"
inherit gosrc
inherit nativesdk
