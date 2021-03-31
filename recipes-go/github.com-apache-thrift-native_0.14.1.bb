SUMMARY = "go.mod: github.com/apache/thrift"
HOMEPAGE = "https://pkg.go.dev/github.com/apache/thrift"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-apache-thrift-sources.inc

GO_IMPORT = "github.com/apache/thrift"

inherit gosrc
inherit native
