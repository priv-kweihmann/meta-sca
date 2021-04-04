SUMMARY = "go.mod: github.com/afex/hystrix-go"
HOMEPAGE = "https://pkg.go.dev/github.com/afex/hystrix-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-afex-hystrix-go-sources.inc

GO_IMPORT = "github.com/afex/hystrix-go"

# version is somehow broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
