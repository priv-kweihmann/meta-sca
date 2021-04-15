SUMMARY = "go.mod: github.com/kevinburke/ssh_config"
HOMEPAGE = "https://pkg.go.dev/github.com/kevinburke/ssh_config"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kevinburke-ssh-config-sources.inc

GO_IMPORT = "github.com/kevinburke/ssh_config"

inherit gosrc
inherit native
