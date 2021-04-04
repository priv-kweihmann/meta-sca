SUMMARY = "go.mod: github.com/jessevdk/go-flags"
HOMEPAGE = "https://pkg.go.dev/github.com/jessevdk/go-flags"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jessevdk-go-flags-sources.inc

GO_IMPORT = "github.com/jessevdk/go-flags"

inherit gosrc
inherit native
