SRC_URI += "https://proxy.golang.org/github.com/tklauser/go-sysconf/@v/v0.3.10.zip;srcoutput=github.com/tklauser/go-sysconf;srcinput=github.com/tklauser/go-sysconf@v0.3.10;downloadfilename=github-com-tklauser-go-sysconf-0.3.10.zip;name=github-com-tklauser-go-sysconf"
SRC_URI[github-com-tklauser-go-sysconf.sha256sum] = "0eac91ee205589007df1dbc413a34e34521f4b60e2fe5ff07f7653e76e9d2821"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/tklauser/go-sysconf/LICENSE;md5=f90008fcbe3998e741b33ebefaf277c9 \
"

GOSRC_INCLUDEGUARD += "github.com-tklauser-go-sysconf-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-tklauser-numcpus-sources.inc', '', 'github.com-tklauser-numcpus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
