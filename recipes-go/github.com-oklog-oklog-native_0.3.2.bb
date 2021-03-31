SUMMARY = "go.mod: github.com/oklog/oklog"
HOMEPAGE = "https://pkg.go.dev/github.com/oklog/oklog"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-oklog-oklog-sources.inc

GO_IMPORT = "github.com/oklog/oklog"

inherit gosrc
inherit native
