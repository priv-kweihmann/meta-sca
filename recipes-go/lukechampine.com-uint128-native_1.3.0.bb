SUMMARY = "go.mod: lukechampine.com/uint128"
HOMEPAGE = "https://pkg.go.dev/lukechampine.com/uint128"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require lukechampine.com-uint128-sources.inc

GO_IMPORT = "lukechampine.com/uint128"

inherit gosrc
inherit native
