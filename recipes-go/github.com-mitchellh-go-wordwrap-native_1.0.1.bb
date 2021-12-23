SUMMARY = "go.mod: github.com/mitchellh/go-wordwrap"
HOMEPAGE = "https://pkg.go.dev/github.com/mitchellh/go-wordwrap"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mitchellh-go-wordwrap-sources.inc

GO_IMPORT = "github.com/mitchellh/go-wordwrap"

inherit gosrc
inherit native
