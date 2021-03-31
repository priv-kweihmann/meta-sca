SRC_URI_append = " https://proxy.golang.org/github.com/circonus-labs/circonus-gometrics/@v/v2.3.1+incompatible.zip;srcoutput=github.com/circonus-labs/circonus-gometrics;srcinput=github.com/circonus-labs/circonus-gometrics@v2.3.1+incompatible;downloadfilename=github-com-circonus-labs-circonus-gometrics-2.3.1+incompatible.zip;name=github-com-circonus-labs-circonus-gometrics"
SRC_URI[github-com-circonus-labs-circonus-gometrics.sha256sum] = "d8081141497e3cd34844df66af016c7900d58b324fb689e17e57bc053d91c9ba"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/circonus-labs/circonus-gometrics/LICENSE;md5=c9618a5897975a87180ce7ae9ea19a15 \
"
