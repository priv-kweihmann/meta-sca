SUMMARY = "go.mod: github.com/pkg/sftp"
HOMEPAGE = "https://pkg.go.dev/github.com/pkg/sftp"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pkg-sftp-sources.inc

EXTRA_DEPENDS += "\
    github.com-kr-fs-native \
    golang.org-x-crypto-native \
"

GO_IMPORT = "github.com/pkg/sftp"

inherit gosrc
inherit native
