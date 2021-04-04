SUMMARY = "go.mod: github.com/spf13/viper"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/viper"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-viper-sources.inc

GO_IMPORT = "github.com/spf13/viper"

inherit gosrc
inherit native
