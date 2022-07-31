SUMMARY = "go.mod: github.com/go-kit/log"
HOMEPAGE = "https://pkg.go.dev/github.com/go-kit/log"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-kit-log-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-go-logfmt-logfmt"
GO_IMPORT = "github.com/go-kit/log"
inherit gosrc
inherit nativesdk
