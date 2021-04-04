SUMMARY = "go.mod: github.com/codegangsta/cli"
HOMEPAGE = "https://pkg.go.dev/github.com/codegangsta/cli"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-codegangsta-cli-sources.inc

GO_IMPORT = "github.com/codegangsta/cli"

inherit gosrc
inherit native
