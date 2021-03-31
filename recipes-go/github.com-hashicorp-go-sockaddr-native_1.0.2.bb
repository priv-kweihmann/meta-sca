SUMMARY = "go.mod: github.com/hashicorp/go-sockaddr"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-sockaddr"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-sockaddr-sources.inc
require github.com-armon-go-radix-sources.inc
require github.com-bgentry-speakeasy-sources.inc
require github.com-fatih-color-sources.inc
require github.com-hashicorp-errwrap-sources.inc
require github.com-hashicorp-go-multierror-sources.inc
require github.com-masterminds-sprig-sources.inc
require github.com-mattn-go-colorable-sources.inc
require github.com-mattn-go-isatty-sources.inc
require github.com-mitchellh-cli-sources.inc
require github.com-mitchellh-go-wordwrap-sources.inc
require github.com-posener-complete-sources.inc
require github.com-ryanuber-columnize-sources.inc
require golang.org-x-sys-sources.inc

GO_IMPORT = "github.com/hashicorp/go-sockaddr"

inherit gosrc
inherit native
