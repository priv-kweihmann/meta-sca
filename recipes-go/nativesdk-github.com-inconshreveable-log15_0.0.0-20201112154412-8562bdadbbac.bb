SUMMARY = "go.mod: github.com/inconshreveable/log15"
HOMEPAGE = "https://pkg.go.dev/github.com/inconshreveable/log15"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-inconshreveable-log15-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-go-stack-stack \
    nativesdk-github.com-mattn-go-colorable \
    nativesdk-github.com-mattn-go-isatty \
"
GO_IMPORT = "github.com/inconshreveable/log15"
inherit gosrc
inherit nativesdk
