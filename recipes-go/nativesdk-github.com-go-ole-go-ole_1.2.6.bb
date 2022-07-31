SUMMARY = "go.mod: github.com/go-ole/go-ole"
HOMEPAGE = "https://pkg.go.dev/github.com/go-ole/go-ole"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-ole-go-ole-sources.inc

EXTRA_DEPENDS += "nativesdk-golang.org-x-sys"
GO_IMPORT = "github.com/go-ole/go-ole"
inherit gosrc
inherit nativesdk
