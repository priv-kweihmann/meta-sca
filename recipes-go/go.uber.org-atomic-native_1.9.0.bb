SUMMARY = "go.mod: go.uber.org/atomic"
HOMEPAGE = "https://pkg.go.dev/go.uber.org/atomic"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.uber.org-atomic-sources.inc

GO_IMPORT = "go.uber.org/atomic"

inherit gosrc
inherit native
