SUMMARY = "go.mod: github.com/urfave/cli"
HOMEPAGE = "https://pkg.go.dev/github.com/urfave/cli"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-urfave-cli-sources.inc

GO_IMPORT = "github.com/urfave/cli"

inherit gosrc
inherit native
