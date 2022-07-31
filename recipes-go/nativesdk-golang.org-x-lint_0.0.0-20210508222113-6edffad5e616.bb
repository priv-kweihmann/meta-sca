SUMMARY = "go.mod: golang.org/x/lint"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/lint"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-lint-sources.inc

EXTRA_DEPENDS += "nativesdk-golang.org-x-tools"
GO_IMPORT = "golang.org/x/lint"
inherit gosrc
inherit nativesdk
