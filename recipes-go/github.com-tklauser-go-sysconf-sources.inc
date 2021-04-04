SRC_URI += "https://proxy.golang.org/github.com/tklauser/go-sysconf/@v/v0.3.5.zip;srcoutput=github.com/tklauser/go-sysconf;srcinput=github.com/tklauser/go-sysconf@v0.3.5;downloadfilename=github-com-tklauser-go-sysconf-0.3.5.zip;name=github-com-tklauser-go-sysconf"
SRC_URI[github-com-tklauser-go-sysconf.sha256sum] = "0500251d7ac3ded5fee2a72704b8bec272c0808b3b8593d4f3c7875cb28e1ae2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/tklauser/go-sysconf/LICENSE;md5=f90008fcbe3998e741b33ebefaf277c9 \
"

GOSRC_INCLUDEGUARD += "github.com-tklauser-go-sysconf-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-tklauser-numcpus-sources.inc', '', 'github.com-tklauser-numcpus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
