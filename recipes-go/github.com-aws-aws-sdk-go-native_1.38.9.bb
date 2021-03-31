SUMMARY = "go.mod: github.com/aws/aws-sdk-go"
HOMEPAGE = "https://pkg.go.dev/github.com/aws/aws-sdk-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-aws-aws-sdk-go-sources.inc
require github.com-jmespath-go-jmespath-sources.inc
require github.com-pkg-errors-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc

GO_IMPORT = "github.com/aws/aws-sdk-go"

inherit gosrc
inherit native
