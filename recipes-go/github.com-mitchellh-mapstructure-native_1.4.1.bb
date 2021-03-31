SUMMARY = "go.mod: github.com/mitchellh/mapstructure"
HOMEPAGE = "https://pkg.go.dev/github.com/mitchellh/mapstructure"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mitchellh-mapstructure-sources.inc

GO_IMPORT = "github.com/mitchellh/mapstructure"

inherit gosrc
inherit native
