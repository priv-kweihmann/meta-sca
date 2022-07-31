SUMMARY = "go.mod: github.com/akavel/rsrc"
HOMEPAGE = "https://pkg.go.dev/github.com/akavel/rsrc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-akavel-rsrc-sources.inc

GO_IMPORT = "github.com/akavel/rsrc"
inherit gosrc
inherit nativesdk
