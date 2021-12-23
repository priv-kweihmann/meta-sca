SUMMARY = "go.mod: sigs.k8s.io/yaml"
HOMEPAGE = "https://pkg.go.dev/sigs.k8s.io/yaml"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require sigs.k8s.io-yaml-sources.inc

EXTRA_DEPENDS += "\
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "sigs.k8s.io/yaml"

inherit gosrc
inherit native
