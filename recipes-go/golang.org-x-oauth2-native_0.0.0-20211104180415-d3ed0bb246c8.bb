SUMMARY = "go.mod: golang.org/x/oauth2"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/oauth2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-oauth2-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-native \
    golang.org-x-net-native \
    google.golang.org-appengine-native \
"

GO_IMPORT = "golang.org/x/oauth2"

inherit gosrc
inherit native
