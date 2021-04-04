SUMMARY = "go.mod: github.com/huandu/xstrings"
HOMEPAGE = "https://pkg.go.dev/github.com/huandu/xstrings"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-huandu-xstrings-sources.inc

GO_IMPORT = "github.com/huandu/xstrings"

inherit gosrc
inherit native
