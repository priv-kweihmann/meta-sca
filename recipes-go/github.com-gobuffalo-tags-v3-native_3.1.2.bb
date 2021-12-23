SUMMARY = "go.mod: github.com/gobuffalo/tags/v3"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/tags/v3"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-tags-v3-sources.inc

EXTRA_DEPENDS += "\
    github.com-fatih-structs-native \
    github.com-gobuffalo-flect-native \
    github.com-gobuffalo-validate-v3-native \
    github.com-gofrs-uuid-native \
"

GO_IMPORT = "github.com/gobuffalo/tags/v3"

inherit gosrc
inherit native
