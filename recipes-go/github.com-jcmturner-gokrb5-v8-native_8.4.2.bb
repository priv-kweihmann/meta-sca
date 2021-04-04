SUMMARY = "go.mod: github.com/jcmturner/gokrb5/v8"
HOMEPAGE = "https://pkg.go.dev/github.com/jcmturner/gokrb5/v8"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jcmturner-gokrb5-v8-sources.inc

GO_IMPORT = "github.com/jcmturner/gokrb5/v8"

inherit gosrc
inherit native
