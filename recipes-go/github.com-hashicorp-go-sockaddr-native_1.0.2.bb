SUMMARY = "go.mod: github.com/hashicorp/go-sockaddr"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-sockaddr"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-sockaddr-sources.inc

EXTRA_DEPENDS += "\
    github.com-hashicorp-errwrap-native \
    github.com-mitchellh-cli-native \
    github.com-mitchellh-go-wordwrap-native \
    github.com-ryanuber-columnize-native \
"

GO_IMPORT = "github.com/hashicorp/go-sockaddr"

inherit gosrc
inherit native
