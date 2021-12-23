SUMMARY = "go.mod: golang.org/x/image"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/image"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-image-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-text-native \
"

GO_IMPORT = "golang.org/x/image"

inherit gosrc
inherit native
