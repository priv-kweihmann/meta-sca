SUMMARY = "go.mod: go.yaml.in/yaml/v3"
HOMEPAGE = "https://pkg.go.dev/go.yaml.in/yaml/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' AND '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.yaml.in-yaml-v3-sources.inc

GO_IMPORT = "go.yaml.in/yaml/v3"

inherit gosrc
inherit_defer native
