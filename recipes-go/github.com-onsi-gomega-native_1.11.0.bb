SUMMARY = "go.mod: github.com/onsi/gomega"
HOMEPAGE = "https://pkg.go.dev/github.com/onsi/gomega"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-onsi-gomega-sources.inc

GO_IMPORT = "github.com/onsi/gomega"

inherit gosrc
inherit native
