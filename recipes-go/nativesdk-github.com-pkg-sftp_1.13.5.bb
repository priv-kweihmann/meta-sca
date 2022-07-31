SUMMARY = "go.mod: github.com/pkg/sftp"
HOMEPAGE = "https://pkg.go.dev/github.com/pkg/sftp"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pkg-sftp-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-kr-fs \
    nativesdk-golang.org-x-crypto \
"
GO_IMPORT = "github.com/pkg/sftp"
inherit gosrc
inherit nativesdk
