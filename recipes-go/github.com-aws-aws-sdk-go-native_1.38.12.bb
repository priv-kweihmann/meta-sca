SUMMARY = "go.mod: github.com/aws/aws-sdk-go"
HOMEPAGE = "https://pkg.go.dev/github.com/aws/aws-sdk-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-aws-aws-sdk-go-sources.inc

GO_IMPORT = "github.com/aws/aws-sdk-go"

inherit gosrc
inherit native
