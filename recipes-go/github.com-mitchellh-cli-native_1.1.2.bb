SUMMARY = "go.mod: github.com/mitchellh/cli"
HOMEPAGE = "https://pkg.go.dev/github.com/mitchellh/cli"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mitchellh-cli-sources.inc

GO_IMPORT = "github.com/mitchellh/cli"

inherit gosrc
inherit native
