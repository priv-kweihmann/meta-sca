SUMMARY = "go.mod: golang.org/x/xerrors"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/xerrors"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-xerrors-sources.inc

GO_IMPORT = "golang.org/x/xerrors"
inherit gosrc
inherit nativesdk
