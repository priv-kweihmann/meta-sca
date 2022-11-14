SUMMARY = "go.mod: cloud.google.com/go/compute/metadata"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/compute/metadata"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-compute-metadata-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-compute-native \
"

GO_IMPORT = "cloud.google.com/go/compute/metadata"

inherit gosrc
inherit native
