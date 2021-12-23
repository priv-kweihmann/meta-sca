SUMMARY = "go.mod: github.com/jcmturner/goidentity/v6"
HOMEPAGE = "https://pkg.go.dev/github.com/jcmturner/goidentity/v6"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jcmturner-goidentity-v6-sources.inc

EXTRA_DEPENDS += "\
    github.com-hashicorp-go-uuid-native \
"

GO_IMPORT = "github.com/jcmturner/goidentity/v6"

inherit gosrc
inherit native
