SUMMARY = "go.mod: gopkg.in/yaml.v3"
HOMEPAGE = "https://pkg.go.dev/gopkg.in/yaml.v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gopkg.in-yaml.v3-sources.inc

EXTRA_DEPENDS += "\
    gopkg.in-check.v1-native \
"

GO_IMPORT = "gopkg.in/yaml.v3"

inherit gosrc
inherit_defer native
