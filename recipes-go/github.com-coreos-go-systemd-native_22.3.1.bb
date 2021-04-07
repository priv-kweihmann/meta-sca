SUMMARY = "go.mod: github.com/coreos/go-systemd"
HOMEPAGE = "https://pkg.go.dev/github.com/coreos/go-systemd"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-coreos-go-systemd-sources.inc

GO_IMPORT = "github.com/coreos/go-systemd"

# recipe needs systemd header, which isn't available as a native recipe
do_compile[noexec] = "1"
UPSTREAM_CHECK_IMPORT_SUFFIX = "/v22"

inherit gosrc
inherit native
