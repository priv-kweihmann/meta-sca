SUMMARY = "go.mod: github.com/go-task/slim-sprig"
HOMEPAGE = "https://pkg.go.dev/github.com/go-task/slim-sprig"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-task-slim-sprig-sources.inc

GO_IMPORT = "github.com/go-task/slim-sprig"

inherit gosrc
inherit native
