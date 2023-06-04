SUMMARY = "go.mod: github.com/sirupsen/logrus"
HOMEPAGE = "https://pkg.go.dev/github.com/sirupsen/logrus"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sirupsen-logrus-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-stretchr-testify \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "github.com/sirupsen/logrus"
inherit gosrc
inherit nativesdk
