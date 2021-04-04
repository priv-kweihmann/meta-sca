SUMMARY = "go.mod: github.com/pkg/sftp"
HOMEPAGE = "https://pkg.go.dev/github.com/pkg/sftp"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pkg-sftp-sources.inc

GO_IMPORT = "github.com/pkg/sftp"

inherit gosrc
inherit native
