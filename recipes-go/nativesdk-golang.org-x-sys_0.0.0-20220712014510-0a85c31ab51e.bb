SUMMARY = "go.mod: golang.org/x/sys"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/sys"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-sys-sources.inc

GO_IMPORT = "golang.org/x/sys"
inherit gosrc
inherit nativesdk
