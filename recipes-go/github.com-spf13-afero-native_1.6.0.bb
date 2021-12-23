SUMMARY = "go.mod: github.com/spf13/afero"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/afero"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-afero-sources.inc

EXTRA_DEPENDS += "\
    github.com-pkg-sftp-native \
    golang.org-x-text-native \
"

GO_IMPORT = "github.com/spf13/afero"

inherit gosrc
inherit native
