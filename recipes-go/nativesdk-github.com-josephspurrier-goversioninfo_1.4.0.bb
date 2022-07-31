SUMMARY = "go.mod: github.com/josephspurrier/goversioninfo"
HOMEPAGE = "https://pkg.go.dev/github.com/josephspurrier/goversioninfo"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-josephspurrier-goversioninfo-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-akavel-rsrc"
GO_IMPORT = "github.com/josephspurrier/goversioninfo"
inherit gosrc
inherit nativesdk
