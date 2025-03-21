SUMMARY = "go.mod: golang.org/x/mod"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/mod"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-mod-sources.inc

GO_IMPORT = "golang.org/x/mod"

inherit gosrc
inherit_defer nativesdk
