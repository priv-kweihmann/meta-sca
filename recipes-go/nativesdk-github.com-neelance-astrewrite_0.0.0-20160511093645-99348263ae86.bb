SUMMARY = "go.mod: github.com/neelance/astrewrite"
HOMEPAGE = "https://pkg.go.dev/github.com/neelance/astrewrite"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-neelance-astrewrite-sources.inc

GO_IMPORT = "github.com/neelance/astrewrite"
inherit gosrc
inherit nativesdk
