SUMMARY = "go.mod: gonum.org/v1/gonum"
HOMEPAGE = "https://pkg.go.dev/gonum.org/v1/gonum"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gonum.org-v1-gonum-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-exp \
    nativesdk-golang.org-x-tools \
    nativesdk-gonum.org-v1-plot \
"
GO_IMPORT = "gonum.org/v1/gonum"
inherit gosrc
inherit nativesdk
