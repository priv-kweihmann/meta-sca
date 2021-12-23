SUMMARY = "go.mod: github.com/ghodss/yaml"
HOMEPAGE = "https://pkg.go.dev/github.com/ghodss/yaml"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ghodss-yaml-sources.inc

EXTRA_DEPENDS += "\
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/ghodss/yaml"

inherit gosrc
inherit native
