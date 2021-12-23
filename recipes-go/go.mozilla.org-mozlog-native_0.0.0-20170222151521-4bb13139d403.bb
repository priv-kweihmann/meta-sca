SUMMARY = "go.mod: go.mozilla.org/mozlog"
HOMEPAGE = "https://pkg.go.dev/go.mozilla.org/mozlog"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.mozilla.org-mozlog-sources.inc

GO_IMPORT = "go.mozilla.org/mozlog"

inherit gosrc
inherit native
