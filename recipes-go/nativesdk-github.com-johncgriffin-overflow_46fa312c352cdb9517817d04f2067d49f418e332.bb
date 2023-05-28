SUMMARY = "go.mod: github.com/JohnCGriffin/overflow"
HOMEPAGE = "https://pkg.go.dev/github.com/JohnCGriffin/overflow"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-johncgriffin-overflow-sources.inc

GO_IMPORT = "github.com/JohnCGriffin/overflow"
inherit gosrc
inherit nativesdk
