SUMMARY = "go.mod: github.com/xanzy/ssh-agent"
HOMEPAGE = "https://pkg.go.dev/github.com/xanzy/ssh-agent"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-xanzy-ssh-agent-sources.inc

EXTRA_DEPENDS += "\
    github.com-microsoft-go-winio-native \
    golang.org-x-crypto-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/xanzy/ssh-agent"

inherit gosrc
inherit native
