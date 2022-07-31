SUMMARY = "go.mod: github.com/Microsoft/go-winio"
HOMEPAGE = "https://pkg.go.dev/github.com/Microsoft/go-winio"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-microsoft-go-winio-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "github.com/Microsoft/go-winio"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"
inherit gosrc
inherit nativesdk
