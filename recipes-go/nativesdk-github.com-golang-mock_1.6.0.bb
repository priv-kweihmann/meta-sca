SUMMARY = "go.mod: github.com/golang/mock"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/mock"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-mock-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-mod \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/golang/mock"
inherit gosrc
inherit nativesdk
