SRC_URI += "https://proxy.golang.org/github.com/juju/ratelimit/@v/v1.0.1.zip;srcoutput=github.com/juju/ratelimit;srcinput=github.com/juju/ratelimit@v1.0.1;downloadfilename=github-com-juju-ratelimit-1.0.1.zip;name=github-com-juju-ratelimit"
SRC_URI[github-com-juju-ratelimit.sha256sum] = "c9af5c6719ce3b6912579a029cb2a651707aa25daa1921488f9cae9c4f8ed334"

GOSRC_LICENSE += "\
    LGPL-3.0-linking-exception \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/juju/ratelimit/LICENSE;md5=2d1c30374313ae40df7772dc92ef9fd5 \
"

GOSRC_INCLUDEGUARD += "github.com-juju-ratelimit-sources.inc"

