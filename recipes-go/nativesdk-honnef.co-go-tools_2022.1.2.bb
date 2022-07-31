SUMMARY = "go.mod: honnef.co/go/tools"
HOMEPAGE = "https://pkg.go.dev/honnef.co/go/tools"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require honnef.co-go-tools-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-burntsushi-toml \
    nativesdk-golang.org-x-exp-typeparams \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "honnef.co/go/tools"
# needs CGO
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
