SUMMARY = "go.mod: modernc.org/token"
HOMEPAGE = "https://pkg.go.dev/modernc.org/token"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-token-sources.inc

GO_IMPORT = "modernc.org/token"

inherit gosrc
inherit native
