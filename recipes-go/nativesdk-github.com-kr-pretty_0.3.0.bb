SUMMARY = "go.mod: github.com/kr/pretty"
HOMEPAGE = "https://pkg.go.dev/github.com/kr/pretty"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kr-pretty-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-kr-text \
    nativesdk-github.com-rogpeppe-go-internal \
"
GO_IMPORT = "github.com/kr/pretty"
inherit gosrc
inherit nativesdk
