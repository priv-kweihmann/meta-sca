SRC_URI += "https://proxy.golang.org/github.com/circonus-labs/circonus-gometrics/@v/v2.3.1+incompatible.zip;srcoutput=github.com/circonus-labs/circonus-gometrics;srcinput=github.com/circonus-labs/circonus-gometrics@v2.3.1+incompatible;downloadfilename=github-com-circonus-labs-circonus-gometrics-2.3.1+incompatible.zip;name=github-com-circonus-labs-circonus-gometrics"
SRC_URI[github-com-circonus-labs-circonus-gometrics.sha256sum] = "d8081141497e3cd34844df66af016c7900d58b324fb689e17e57bc053d91c9ba"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/circonus-labs/circonus-gometrics/LICENSE;md5=c9618a5897975a87180ce7ae9ea19a15 \
"

GOSRC_INCLUDEGUARD += "github.com-circonus-labs-circonus-gometrics-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-circonus-labs-circonusllhist-sources.inc', '', 'github.com-circonus-labs-circonusllhist-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-retryablehttp-sources.inc', '', 'github.com-hashicorp-go-retryablehttp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-tv42-httpunix-sources.inc', '', 'github.com-tv42-httpunix-sources.inc', d)}
