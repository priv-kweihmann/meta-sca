SRC_URI += "https://proxy.golang.org/github.com/jbenet/go-context/@v/v0.0.0-20150711004518-d14ea06fba99.zip;srcoutput=github.com/jbenet/go-context;srcinput=github.com/jbenet/go-context@v0.0.0-20150711004518-d14ea06fba99;downloadfilename=github-com-jbenet-go-context-0.0.0-20150711004518-d14ea06fba99.zip;name=github-com-jbenet-go-context"
SRC_URI[github-com-jbenet-go-context.sha256sum] = "4cd0955abeea43dc4b5a08b8769e696109e0376f2a113a9b8eff13cc90cac1c7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jbenet/go-context/LICENSE;md5=62cacd6ebb7e5424324f85f9c3cc81b2 \
"

GOSRC_INCLUDEGUARD += "github.com-jbenet-go-context-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
