SUMMARY = "go.mod: go.mozilla.org/mozlog"
HOMEPAGE = "https://pkg.go.dev/go.mozilla.org/mozlog"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.mozilla.org-mozlog-sources.inc

GO_IMPORT = "go.mozilla.org/mozlog"

inherit gosrc
inherit native
