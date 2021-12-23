SUMMARY = "go.mod: github.com/kballard/go-shellquote"
HOMEPAGE = "https://pkg.go.dev/github.com/kballard/go-shellquote"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kballard-go-shellquote-sources.inc

GO_IMPORT = "github.com/kballard/go-shellquote"

inherit gosrc
inherit native
