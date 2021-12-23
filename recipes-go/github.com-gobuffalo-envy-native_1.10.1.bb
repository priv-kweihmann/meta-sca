SUMMARY = "go.mod: github.com/gobuffalo/envy"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/envy"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-envy-sources.inc

EXTRA_DEPENDS += "\
    github.com-joho-godotenv-native \
    github.com-rogpeppe-go-internal-native \
"

GO_IMPORT = "github.com/gobuffalo/envy"

inherit gosrc
inherit native
