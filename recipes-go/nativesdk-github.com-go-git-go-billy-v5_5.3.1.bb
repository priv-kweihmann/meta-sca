SUMMARY = "go.mod: github.com/go-git/go-billy/v5"
HOMEPAGE = "https://pkg.go.dev/github.com/go-git/go-billy/v5"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-git-go-billy-v5-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-sys \
    nativesdk-gopkg.in-check.v1 \
"
GO_IMPORT = "github.com/go-git/go-billy/v5"
inherit gosrc
inherit nativesdk
