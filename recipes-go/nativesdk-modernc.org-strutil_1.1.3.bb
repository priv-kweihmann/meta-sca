SUMMARY = "go.mod: modernc.org/strutil"
HOMEPAGE = "https://pkg.go.dev/modernc.org/strutil"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-strutil-sources.inc

GO_IMPORT = "modernc.org/strutil"
inherit gosrc
inherit nativesdk
