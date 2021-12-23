SUMMARY = "go.mod: github.com/go-git/go-git/v5"
HOMEPAGE = "https://pkg.go.dev/github.com/go-git/go-git/v5"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-git-go-git-v5-sources.inc

EXTRA_DEPENDS += "\
    github.com-acomagu-bufpipe-native \
    github.com-emirpasic-gods-native \
    github.com-go-git-gcfg-native \
    github.com-go-git-go-billy-v5-native \
    github.com-go-git-go-git-fixtures-v4-native \
    github.com-imdario-mergo-native \
    github.com-jbenet-go-context-native \
    github.com-jessevdk-go-flags-native \
    github.com-kevinburke-ssh-config-native \
    github.com-mitchellh-go-homedir-native \
    github.com-protonmail-go-crypto-native \
    github.com-sergi-go-diff-native \
    github.com-xanzy-ssh-agent-native \
    golang.org-x-crypto-native \
    golang.org-x-net-native \
    golang.org-x-sys-native \
    gopkg.in-check.v1-native \
"

GO_IMPORT = "github.com/go-git/go-git/v5"

inherit gosrc
inherit native
